module com.fipp.factoringtrab {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.fipp.factoringtrab to javafx.fxml;
    exports com.fipp.factoringtrab;
}