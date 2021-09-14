/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


/**
 *
 * @author rc333
 */
public class FXMLDocumentController implements Initializable {
    float data = 0f;
    int operation = -1;
    float ans ;
    @FXML
    private TextField display;
    
    @FXML
    private Label label;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button clear;

    @FXML
    private Button zero;

    @FXML
    private Button equal;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button substraction;

    @FXML
    private Button one;

    @FXML
    private Button addition;

    @FXML
    private Button multiplication;

    @FXML
    private Button six;

    @FXML
    private Button division;

    @FXML
    private Button five;

    @FXML
    private Button four;

    @FXML
    void handleButtonAction(ActionEvent event) {
        if(event.getSource() == one)
        {
            display.setText(display.getText() + "1");
        }else if(event.getSource() == two)
        {
            display.setText(display.getText() + "2");
        }else if(event.getSource() == three)
        {
            display.setText(display.getText() + "3");
        }else if(event.getSource() == four)
        {
            display.setText(display.getText() + "4");
        }else if(event.getSource() == five)
        {
            display.setText(display.getText() + "5");
        }else if(event.getSource() == six)
        {
            display.setText(display.getText() + "6");
        }else if(event.getSource() == seven)
        {
            display.setText(display.getText() + "7");
        }else if(event.getSource() == eight)
        {
            display.setText(display.getText() + "8");
        }else if(event.getSource() == nine)
        {
            display.setText(display.getText() + "9");
        }else if(event.getSource() == zero)
        {
            display.setText(display.getText() + "0");
        }else if(event.getSource() == clear)
        {
            display.setText("");
        }else if(event.getSource() == addition)
        {
            data = Float.parseFloat(display.getText());
            operation = 1;//addition
            display.setText("");
        }else if(event.getSource() == division)
        {
            data = Float.parseFloat(display.getText());
            operation = 2; //division
            display.setText("");
        }else if(event.getSource() == substraction)
        {
            data = Float.parseFloat(display.getText());
            operation = 3; //subtract
            display.setText("");
        }else if(event.getSource() == multiplication)
        {
            data = Float.parseFloat(display.getText());
            operation = 4; //multiplication
            display.setText("");
        }else if(event.getSource() == equal)
        {
            Float data2 = Float.parseFloat(display.getText());
            switch(operation)
            {
                case 1:
                    ans = data + data2;
                    display.setText(String.valueOf(ans));
                    break;
                case 2:
                    try{
                    ans = data / data2;}
                    catch(Exception e){
                        display.setText("error");
                    }
                    display.setText(String.valueOf(ans));
                    break;
                   case 3:
                    ans = data - data2;
                    display.setText(String.valueOf(ans));
                    break;
                    case 4:
                    ans = data * data2;
                    display.setText(String.valueOf(ans));
                    break;
            }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
