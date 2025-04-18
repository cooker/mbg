package com.cooker.mybatis.generator.model;

/**
 * Created by Owen on 6/14/16.
 */
public enum DbType {

    MySQL("com.mysql.jdbc.Driver", "jdbc:mysql://%s:%s/%s?useUnicode=true&useSSL=false&characterEncoding=%s", "mysql-connector-java-5.1.38.jar"),
    Oracle("oracle.jdbc.driver.OracleDriver", "jdbc:oracle:thin:@%s:%s:%s", "ojdbc14.jar"),
    PostgreSQL("org.postgresql.Driver", "jdbc:postgresql://%s:%s/%s", "postgresql-9.4.1209.jar"),
	SQL_Server("com.microsoft.sqlserver.jdbc.SQLServerDriver", "jdbc:sqlserver://%s:%s;databaseName=%s", "sqljdbc4-4.0.jar");

    private final String driverClass;
    private final String connectionUrlPattern;
    private final String connectorJarFile;

    DbType(String driverClass, String connectionUrlPattern, String connectorJarFile) {
        this.driverClass = driverClass;
        this.connectionUrlPattern = connectionUrlPattern;
        this.connectorJarFile = connectorJarFile;
    }

    public String getDriverClass() {
        return driverClass;
    }

    public String getConnectionUrlPattern() {
        return connectionUrlPattern;
    }

    public String getConnectorJarFile() {
        return connectorJarFile;
    }
}