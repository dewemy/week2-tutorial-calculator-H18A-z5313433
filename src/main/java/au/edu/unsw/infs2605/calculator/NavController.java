/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package au.edu.unsw.infs2605.calculator;

import java.io.IOException;
import javafx.fxml.FXML;
/**
 *
 * @author jeremywang
 */
public class NavController {
        
    @FXML
    private void switchToCalculator() throws IOException {
        App.setRoot("calculator");
    }
    
}