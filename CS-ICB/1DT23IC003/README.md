# ANTIKYTHERA MECHANISM - Scientific Calculator

A modern, Swing-based scientific calculator written in Java. This GUI application supports basic arithmetic, trigonometric functions, square roots, logarithms, square powers, and even symbolic operations like derivatives and integration (numerically).

## ✨ Features

- Basic operations: `+`, `-`, `*`, `/`
- Trigonometric functions: `sin`, `cos`, `tan` (in degrees)
- Logarithmic function: `ln`
- Square root: `√`
- Square: `x²`
- Numerical Derivative (`d/dx`) for sin(x)
- Numerical Integration (`∫`) for sin(x)
- Clean UI using Java Swing
- Expression evaluation using JavaScript engine

---

## 📸 Screenshot

![screenshot](#) *(Insert screenshot here if available)*

---

## 🛠️ How It Works

- UI built with Java Swing
- Math parsing done via JavaScript engine (`ScriptEngine`)
- Numerical derivative and integration are hardcoded for `sin(x)` for demonstration purposes

---

## 🚀 How to Run

### Prerequisites

- JDK 8 or higher installed

### Steps

1. Clone or download this repository.
2. Navigate to the project directory.
3. Compile the code:
   ```bash
   javac ScientificCalculator.java
