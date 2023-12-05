module IHM {
	requires javafx.controls;
	requires javafx.graphics;
	requires java.desktop;
	requires java.xml;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
}
