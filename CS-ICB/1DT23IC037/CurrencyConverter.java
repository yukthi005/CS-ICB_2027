import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverter extends JFrame {

    private JTextField amountField;
    private JComboBox<String> fromCurrencyComboBox;
    private JComboBox<String> toCurrencyComboBox;
    private JTextField resultField;

    private final double[] EXCHANGE_RATES = {
        1.0, // USD
        0.88, // EUR
        0.76, // GBP
        109.45, // JPY
        1.31 // CAD
    };

    public CurrencyConverter() {
        super("Currency Converter");
        setLayout(new BorderLayout());

        // Create panels
        JPanel inputPanel = new JPanel();
        JPanel conversionPanel = new JPanel();
        JPanel outputPanel = new JPanel();

        // Input panel
        inputPanel.add(new JLabel("Amount:"));
        amountField = new JTextField(10);
        inputPanel.add(amountField);

        // Conversion panel
        String[] currencies = {"USD", "EUR", "GBP", "JPY", "CAD"};
        fromCurrencyComboBox = new JComboBox<>(currencies);
        toCurrencyComboBox = new JComboBox<>(currencies);
        conversionPanel.add(new JLabel("From:"));
        conversionPanel.add(fromCurrencyComboBox);
        conversionPanel.add(new JLabel("To:"));
        conversionPanel.add(toCurrencyComboBox);

        JButton convertButton = new JButton("Convert");
        convertButton.addActionListener(new ConvertButtonListener());
        conversionPanel.add(convertButton);

        // Output panel
        outputPanel.add(new JLabel("Result:"));
        resultField = new JTextField(10);
        resultField.setEditable(false);
        outputPanel.add(resultField);

        // Add panels to frame
        add(inputPanel, BorderLayout.NORTH);
        add(conversionPanel, BorderLayout.CENTER);
        add(outputPanel, BorderLayout.SOUTH);

        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class ConvertButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double amount = Double.parseDouble(amountField.getText());
                int fromIndex = fromCurrencyComboBox.getSelectedIndex();
                int toIndex = toCurrencyComboBox.getSelectedIndex();

                double result = convertCurrency(amount, fromIndex, toIndex);
                resultField.setText(String.format("%.2f", result));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(CurrencyConverter.this, "Invalid amount", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        private double convertCurrency(double amount, int fromIndex, int toIndex) {
            // Convert to base currency (USD) first
            double baseAmount = amount / EXCHANGE_RATES[fromIndex];
            // Then convert to target currency
            return baseAmount * EXCHANGE_RATES[toIndex];
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CurrencyConverter::new);
    }
}
