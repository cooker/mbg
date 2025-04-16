module hellofx {
    requires javafx.controls;
    requires javafx.fxml;
    requires mybatis.generator.core; // 如果有模块名
    requires slf4j.api;
    requires java.sql;
    requires fastjson;
    requires commons.lang3;
    requires commons.io;

    exports com.cooker.mybatis.generator;
}