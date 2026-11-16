package com.demo.interfaces;

public class DriverMain {
    static void main() {
        MyDriver driver1;
        driver1= new MySQLDB();
        System.out.println(driver1.getConnection());
        System.out.println(driver1.getDbVersion());

       driver1 = new MyOracleDB();
        System.out.println(driver1.getConnection());
        System.out.println(driver1.getDbVersion());
    }
}
