package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO {
    public ArrayList<ItemDTO> loadAllItems() throws SQLException, ClassNotFoundException ;

    public ArrayList<ItemDTO> loadAllItemCodes() throws SQLException, ClassNotFoundException;

    public ItemDTO searchItemCode(String newItemCode) throws SQLException, ClassNotFoundException ;

    public boolean update(String description, BigDecimal unitPrice, int qtyOnHand, String code) throws SQLException, ClassNotFoundException ;

    public void deleteItem(String code) throws SQLException, ClassNotFoundException ;

    public void saveItem(String code, String description, BigDecimal unitPrice, int qtyOnHand) throws SQLException, ClassNotFoundException ;


    public void updateItem(String description, BigDecimal unitPrice, int qtyOnHand, String code) throws SQLException, ClassNotFoundException;


    public boolean existItem(String code) throws SQLException, ClassNotFoundException;


    public String generateNewId() throws SQLException, ClassNotFoundException ;

    public ItemDTO findItem(String code) throws SQLException, ClassNotFoundException ;
}
