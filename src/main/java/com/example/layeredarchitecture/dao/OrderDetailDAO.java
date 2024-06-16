package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;

public interface OrderDetailDAO {
    public boolean saveOrderDetail(String orderId, OrderDetailDTO dto) throws SQLException, ClassNotFoundException ;
}
