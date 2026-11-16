package com.demo.interfaces;

public class MySQLDB implements MyDriver{
    @Override
    public String getConnection() {
        return "MySQL  DB";
    }

    @Override
    public String getDbVersion() {
        return "MySql DB version 5.6.7";
    }
}
