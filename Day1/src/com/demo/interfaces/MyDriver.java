package com.demo.interfaces;

public interface MyDriver {
    // all the methods are implicitly public even no access specifier mentioned.
    String getConnection();
    String getDbVersion();

    //can define variables but those are static and final and public. So we need to assign the value as well.
    String releaseno="1.0";
}
