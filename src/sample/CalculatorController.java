package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController implements Display {
    @FXML
    TextField display;
    private Calculator calculator;

    public CalculatorController() {
        calculator = new Calculator(this);

    }

    @Override
    public String getDisplayNumber() {
        return display.getText();
    }

    @Override
    public void setDisplayNumber(String displayNumber) {
        this.display.setText(displayNumber);
    }

    public void backspaceClick(ActionEvent actionEvent) {
        System.out.println("backspace click!");
    }

    public void buttonDigitClick(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();
        String digit = button.getText();
        calculator.digit(digit);
    }

    public void buttonClear(ActionEvent actionEvent) {
        calculator.clear();
    }

    public void buttonCommaClick(ActionEvent actionEvent) {
        calculator.comma();
    }

    public void buttonNegate(ActionEvent actionEvent) {
        calculator.negate();
    }

    public void buttonSqrt(ActionEvent actionEvent) {
        calculator.sqrt();
    }
}
