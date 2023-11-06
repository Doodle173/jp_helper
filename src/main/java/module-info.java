module com.doodle.jp_helper {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.doodle.jp_helper to javafx.fxml;
    exports com.doodle.jp_helper;
}
