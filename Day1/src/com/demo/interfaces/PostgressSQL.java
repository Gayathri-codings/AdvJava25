package com.demo.interfaces;

public class PostgressSQL implements MyDriver2{
    @Override
    public String getConnection() {
        return "PostgressSQL DB";
    }

    @Override
    public String getDbVersion() {
        return "PostgressSQL DB 2.8";
    }

    @Override
    public boolean isClusterSupported() {
        return false;
    }
}
