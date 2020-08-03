module javaFxCalculator.javaFxCalculator {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.base;

    opens javaFxCalculator.javaFxCalculator to javafx.fxml;
    exports javaFxCalculator.javaFxCalculator;
}