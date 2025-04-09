import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class ScientificCalculator extends JFrame {
    private JTextField display;

    public ScientificCalculator() {
        setTitle("ANTIKYTHERA MECHANISM");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(22, 22));

        // Main panel to hold all components
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Display field
        display = new JTextField();
        display.setFont(new Font("Roboto", Font.BOLD, 32)); // Increased font size slightly
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setEditable(true);
        display.setBackground(Color.WHITE);
        mainPanel.add(display, BorderLayout.NORTH);

        // Buttons panel
        JPanel buttonPanel = new JPanel(new GridLayout(6, 4, 5, 5));

        // Button labels
        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "sin", "cos", "tan", "ln",
                "sqrt", "x^2", "d/dx", "∫"
        };

        // Adding buttons
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Roboto", Font.PLAIN, 16)); // Decreased font size slightly
            button.setFocusPainted(false);

            // Customize button colors
            if ("/".equals(text) || "*".equals(text) || "-".equals(text) || "+".equals(text) || "=".equals(text)) {
                button.setBackground(new Color(255, 255, 255));
            } else if ("sin".equals(text) || "cos".equals(text) || "tan".equals(text) || "ln".equals(text)
                    || "sqrt".equals(text) || "x^2".equals(text) || "d/dx".equals(text) || "∫".equals(text)) {
                button.setBackground(new Color(255, 255, 255));
            } else {
                button.setBackground(Color.WHITE);
            }

            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        // Clear button
        JButton clearButton = new JButton("C");
        clearButton.setFont(new Font("Roboto", Font.PLAIN, 16)); // Decreased font size slightly
        clearButton.setBackground(Color.white);
        clearButton.setFocusPainted(false);
        clearButton.addActionListener(e -> display.setText(""));
        mainPanel.add(clearButton, BorderLayout.SOUTH);

        add(mainPanel);
        setVisible(true);
    }

    // Button click handler
    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = ((JButton) e.getSource()).getText();
            try {
                switch (command) {
                    case "=":
                        evaluateExpression();
                        break;
                    case "sin":
                        display.setText(
                                String.valueOf(Math.sin(Math.toRadians(Double.parseDouble(display.getText())))));
                        break;
                    case "cos":
                        display.setText(
                                String.valueOf(Math.cos(Math.toRadians(Double.parseDouble(display.getText())))));
                        break;
                    case "tan":
                        display.setText(
                                String.valueOf(Math.tan(Math.toRadians(Double.parseDouble(display.getText())))));
                        break;
                    case "ln":
                        display.setText(String.valueOf(Math.log(Double.parseDouble(display.getText()))));
                        break;
                    case "sqrt":
                        display.setText(String.valueOf(Math.sqrt(Double.parseDouble(display.getText()))));
                        break;
                    case "x^2":
                        display.setText(String.valueOf(Math.pow(Double.parseDouble(display.getText()), 2)));
                        break;
                    case "d/dx":
                        numericalDerivative();
                        break;
                    case "∫":
                        numericalIntegration();
                        break;
                    default:
                        display.setText(display.getText() + command);
                }
            } catch (Exception ex) {
                display.setText("Error");
            }
        }
    }

    // Evaluate basic math expressions
    private void evaluateExpression() {
        try {
            ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
            display.setText(String.valueOf(engine.eval(display.getText())));
        } catch (Exception e) {
            display.setText("Error");
        }
    }

    // Numerical derivative
    private void numericalDerivative() {
        try {
            double x = Double.parseDouble(display.getText());
            double h = 1e-5; // Small step
            double derivative = (Math.sin(x + h) - Math.sin(x - h)) / (2 * h); // Example: sin(x)
            display.setText(String.valueOf(derivative));
        } catch (Exception e) {
            display.setText("Error");
        }
    }

    // Numerical integration using Trapezoidal Rule
    private void numericalIntegration() {
        try {
            double a = 0; // Start of interval
            double b = Double.parseDouble(display.getText()); // End of interval
            int n = 1000; // Number of intervals
            double h = (b - a) / n;
            double sum = 0.5 * (Math.sin(a) + Math.sin(b)); // Example: sin(x)
            for (int i = 1; i < n; i++) {
                sum += Math.sin(a + i * h);
            }
            double integral = sum * h;
            display.setText(String.valueOf(integral));
        } catch (Exception e) {
            display.setText("Error");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ScientificCalculator::new);
    }
}
