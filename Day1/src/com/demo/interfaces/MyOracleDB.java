package com.demo.interfaces;

public class MyOracleDB implements MyDriver2{
    @Override
    public String getConnection() {
        return "Oracle  DB";
    }

    @Override
    public String getDbVersion() {
        return "Oracle DB version 19c";
    }

    @Override
    public boolean isClusterSupported() {
        return true;
    }
}
