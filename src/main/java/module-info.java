module com.doodle.jp_helper {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.doodle.jp_helper to javafx.fxml;
    exports com.doodle.jp_helper;
    requires com.google.gson;
    opens com.doodle.jp_helper.datatypes.JMDict to com.google.gson;
    opens com.doodle.jp_helper.datatypes.JMDict.xrefs to com.google.gson;
    requires com.google.common;
}
