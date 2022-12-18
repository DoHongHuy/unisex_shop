package com.og.service;

import com.og.dto.OrderTableDTO;
import com.og.model.OrderTable;
import com.og.utils.MySQLConnUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static com.og.utils.MySQLConnUtils.getConnection;

public class OrderTableServiceImpl implements OrderTableService{
    private static String UPDATE_USER_BY_ID = ""+
            "UPDATE users AS u " +
            "SET " +
            "u.full_name = ?, " +
            "u.phone = ?, " +
            "u.address = ? " +
            "WHERE u.id = ?;";



    private String INSERT_ORDER_TABLE = " "+
            " INSERT INTO case_study.order_tables(  " +
            " VALUES (?, ?, ?, ?, ?,?,?)";

    private String SELECT_ALL_ORDERTABLE ="" +
           " SELECT "+
                "u.table," +
                "a.name," +
                "a.price,"+
                "u.quantity,"+
                "u.total,"+
                "u.information,"+
                "u.dob,"+
                "u.createBy "+
            "FROM case_study.order_tables as u " +
            "JOIN case_study.products as a " +
            "WHERE a.id = u.nameId;";
    @Override
    public List<OrderTableDTO> findAllOrderTableDTO() {

            List<OrderTableDTO> orderList = new ArrayList<>();

            try {
                Connection connection = getConnection();
                PreparedStatement statement = connection.prepareCall(SELECT_ALL_ORDERTABLE);
                ResultSet rs = statement.executeQuery();
                while (rs.next()) {
                    int table = rs.getInt("table");
                    String name = rs.getString("name");
                    Double price = rs.getDouble("price");
                    int quantity = rs.getInt("quantity");
                    Double total = rs.getDouble("total");
                    String information = rs.getString("information");
                    String dob = rs.getString("dob");
                    String createBy = rs.getString("createBy");
                    orderList.add(new OrderTableDTO(table, name, price,quantity,total,information,dob,createBy));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return orderList  ;
        }

    @Override
    public List<OrderTable> findAll() {
        return null;
    }

    @Override
    public boolean create(OrderTable OrderTable) {
        boolean success = false;
        try {
            Connection connection = getConnection();
            PreparedStatement statement = connection.prepareCall(INSERT_ORDER_TABLE);
            statement.setInt(1, OrderTable.getTable());
            statement.setString(2, OrderTable.getName());
            statement.setDouble(3,OrderTable.getQuantity());
            statement.setDouble(4, OrderTable.getTotal());
            statement.setString(5, OrderTable.getInformation());
            statement.setString(6, OrderTable.getDob());
            statement.setString(7, OrderTable.getCreateBy());
            System.out.println(statement);
            statement.execute();
            success = true;
        } catch (SQLException e) {
            MySQLConnUtils.printSQLException(e);
        }
        return success;
    }
    @Override
    public boolean update(OrderTable order) {
        boolean success = false;

        return success;



    }

    @Override
    public boolean remove(int id) {
        return false;
    }
}
