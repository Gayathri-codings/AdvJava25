package com.demo.interfaces;

public class DriverMain {
    static void main() {
        MyDriver2 driver1;
        driver1= new MySQLDB();
        System.out.println(driver1.getConnection());
        System.out.println(driver1.getDbVersion());
        System.out.println(driver1.isClusterSupported());

        driver1 = new MyOracleDB();
        System.out.println(driver1.getConnection());
        System.out.println(driver1.getDbVersion());
        System.out.println(driver1.isClusterSupported());

        driver1 = new PostgressSQL();
        System.out.println(driver1.getConnection());
        System.out.println(driver1.getDbVersion());
        System.out.println(driver1.isClusterSupported());
    }
}
