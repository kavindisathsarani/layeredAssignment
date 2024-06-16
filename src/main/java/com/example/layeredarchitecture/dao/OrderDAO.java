package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;

import java.sql.*;
import java.time.LocalDate;

public interface OrderDAO {
    public String generateNewOrderId() throws SQLException, ClassNotFoundException ;

    public void selectOrderId(String orderId) throws SQLException, ClassNotFoundException ;

    public boolean saveOrder(String orderId, LocalDate orderDate, String customerId) throws SQLException, ClassNotFoundException;


}
