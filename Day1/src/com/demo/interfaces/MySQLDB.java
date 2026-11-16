package com.demo.interfaces;

public class MySQLDB implements MyDriver2{
    @Override
    public String getConnection() {
        return "MySQL  DB";
    }

    @Override
    public String getDbVersion() {
        return "MySql DB version 5.6.7";
    }
    @Override
    public boolean isClusterSupported() {
        return false;
    }
}
