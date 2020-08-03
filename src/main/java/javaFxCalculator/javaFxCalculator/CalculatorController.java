package javaFxCalculator.javaFxCalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CalculatorController {
	
	@FXML
	private Label result;
	private long number_1 =0;
	private String operator ="";
	private boolean start = true;
	private Model model = new Model();

	@FXML
	public void processNumbers(ActionEvent event) {
		if(start) {
			result.setText("");
			start = false;
		}
		String value = ((Button)event.getSource()).getText();
		result.setText(result.getText()+value);
	}

	@FXML
	public void processOperators(ActionEvent event) {
		String value = ((Button)event.getSource()).getText();
		if(!value.equals("=")) {
			if(!operator.isEmpty())
				return;
			operator = value;
			number_1 = Long.parseLong(result.getText());
			result.setText("");
		} else {
			if(operator.isEmpty())
				return;
			long number_2 = Long.parseLong(result.getText());
			float output = model.calculate(number_1, number_2, operator);
			result.setText(String.valueOf(output));
			operator = "";
			start = true;
		}

	}
}
