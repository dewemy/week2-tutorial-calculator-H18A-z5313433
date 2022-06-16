/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package au.edu.unsw.infs2605.calculator;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController {
    
    @FXML
    private Label solution;
    
    @FXML
    private TextField number1;
    
    @FXML
    private TextField number2;
    
    @FXML
    private void plus() throws IOException {
        double num1 = Double.parseDouble(number1.getText());
        double num2 = Double.parseDouble(number2.getText());
        double x = num1 + num2;
        solution.setText(String.valueOf(x));
        solution.setVisible(true);
    }
    @FXML
    private void minus() throws IOException {
        double num1 = Double.parseDouble(number1.getText());
        double num2 = Double.parseDouble(number2.getText());
        double x = num1 - num2;
        solution.setText(String.valueOf(x));
        solution.setVisible(true);
    }
   
    @FXML
    private void divide() throws IOException {
        double num1 = Double.parseDouble(number1.getText());
        double num2 = Double.parseDouble(number2.getText());
        double x = num1 / num2;
        solution.setText(String.valueOf(x));
        solution.setVisible(true);
    }
    
    @FXML
    private void times() throws IOException {
        double num1 = Double.parseDouble(number1.getText());
        double num2 = Double.parseDouble(number2.getText());
        double x = num1 * num2;
        solution.setText(String.valueOf(x));
        solution.setVisible(true);
    }
    
    @FXML
    private void initialize() {
        solution.setVisible(false);
    }
}
