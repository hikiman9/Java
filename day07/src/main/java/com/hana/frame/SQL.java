package com.hana.frame;

public class SQL {
    public static String insertCust = "INSERT INTO db_cust VALUES(?,?,?)";
    public static String deleteCust = "DELETE FROM db_cust WHERE id = ?";
    public static String updateCust = "UPDATE db_cust SET name = ? WHERE id = ?";
    public static String selectCust = "SELECT * FROM db_cust WHERE id = ?";
    public static String selectAllCust = "SELECT * FROM db_cust";


}
