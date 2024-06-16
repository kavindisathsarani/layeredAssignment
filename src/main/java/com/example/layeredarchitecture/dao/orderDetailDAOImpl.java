package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class orderDetailDAOImpl implements OrderDetailDAO {

   public boolean saveOrderDetail(String orderId,OrderDetailDTO dto) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getDbConnection().getConnection();

        PreparedStatement stm = connection.prepareStatement("INSERT INTO OrderDetails (oid, itemCode, unitPrice, qty) VALUES (?,?,?,?)");


            stm.setString(1, orderId);
            stm.setString(2, dto.getItemCode());
            stm.setBigDecimal(3, dto.getUnitPrice());
            stm.setInt(4, dto.getQty());

            if (stm.executeUpdate() != 1) {
                connection.rollback();
                connection.setAutoCommit(true);
                return false;
            }
            return true;
        }


}
