package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        CalcGUI calcGUI = new CalcGUI();
        calcGUI.setCalculator(c);

    }
}