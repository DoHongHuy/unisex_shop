package com.og.service;

import com.og.model.Product;
import com.og.utils.MySQLConnUtils;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static com.og.utils.MySQLConnUtils.getConnection;

public class productServiceImpl implements productService{
    public static String SEARCH_BY_KEY = "" +
            "SELECT * " +
            "FROM case_study.products " +
            "WHERE `id` LIKE ? OR name LIKE ? OR price LIKE ? OR information LIKE ? OR createdAT LIKE ? OR updatedAT LIKE ?;";
    private static final String DELETE_PRODUCT_SQL = "DELETE FROM case_study.products WHERE id = ?;";
    private static String UPDATE_PRODUCT_BY_ID = ""+
            "UPDATE case_study.products AS u " +
            "SET " +
            "u.name = ?, " +
            "u.price = ?, " +
            "u.information = ?, " +
            "u.updatedAt = ? " +
            "WHERE u.id = ?;";


    private static String SELECT_PRODUCT_BY_ID = "" +
            "SELECT " +
            "u.id, " +
            "u.name, " +
            "u.price, " +
            "u.information " +
            "FROM case_study.products AS u " +
            "WHERE u.id = ?;";
    private static String INSERT_PRODUCT = "" +
            "INSERT INTO case_study.products(name,price, information,createdAT)" +
            "VALUES (?, ?, ?, ? );";

        private static String SELECT_ALL_PRODUCT = "" +
                "SELECT " +
                "u.id, " +
                "u.name, " +
                "u.price, " +
                "u.information, " +
                "u.createdAt, " +
                "u.updatedAt " +
                " FROM case_study.products AS u";
    @Override
    public List<Product> findAll() {

        List<Product> productList = new ArrayList<>();

        try {
            Connection connection = getConnection();
            PreparedStatement statement = connection.prepareCall(SELECT_ALL_PRODUCT);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                Double price = rs.getDouble("price");
                String information = rs.getString("information");
                LocalDate createdAt = LocalDate.parse(rs.getString("createdAt"));
                LocalDate updatedAt = LocalDate.parse(rs.getString("updatedAt"));

                productList.add(new Product(id, name, price,information,createdAt,updatedAt));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return productList;
    }



    public boolean create(Product product) {
        boolean success = false;

        try {
            Connection connection = getConnection();

            PreparedStatement statement = connection.prepareCall(INSERT_PRODUCT);
            statement.setString(1, product.getName());
            statement.setDouble(2, product.getPrice());
            statement.setString(3,product.getInformation());
            statement.setString(4, product.getCreatedAt().toString());
//            statement.setString(5, product.getCreatedAt().toString());
            statement.execute();

            success = true;
        } catch (SQLException e) {
            MySQLConnUtils.printSQLException(e);
        }
        return success;

    }
    @Override
    public Product findById(int id) {

        Product product = null;
        try {
            Connection connection = getConnection();
            connection.setAutoCommit(false);

            PreparedStatement statement = connection.prepareCall(SELECT_PRODUCT_BY_ID);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
//                int id = rs.getInt("id");
                String name = rs.getString("name");
                Double price = rs.getDouble("price");
                String information = rs.getString("information");

                product = new Product(id, name, price, information);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return product;
    }

    @Override
    public boolean existByid(int id) {
        return false;
    }

    @Override
    public List<Product> searchByKey(String key) {
        List<Product> productList = new ArrayList<>();
        try {
            Connection connection = MySQLConnUtils.getConnection();
            CallableStatement statement = connection.prepareCall(SEARCH_BY_KEY);
            statement.setString(1, '%' + key + '%');
            statement.setString(2, '%' + key + '%');
            statement.setString(3, '%' + key + '%');
            statement.setString(4, '%' + key + '%');
            statement.setString(5, '%' + key + '%');
            statement.setString(6, '%' + key + '%');
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                int productId = rs.getInt("id");
                String nameProduct = rs.getString("name");
                Double priceProduct = rs.getDouble("price");
                String informationProduct = rs.getString("information");
                LocalDate createdAt = LocalDate.parse(rs.getString("createdAt"));
                LocalDate updatedAT = LocalDate.parse(rs.getString("updatedAT"));
                productList.add(new Product(productId ,nameProduct,priceProduct,informationProduct , createdAt , updatedAT ));
            }
        }
        catch (SQLException e) {
            MySQLConnUtils.printSQLException(e);
        }
        return productList;
    }

    @Override
    public boolean update(Product product) {
        boolean success = false;
        try {
            Connection connection = getConnection();
            PreparedStatement statement = connection.prepareCall(UPDATE_PRODUCT_BY_ID);
            statement.setString(1, product.getName());
            statement.setDouble(2, product.getPrice());
            statement.setString(3, product.getInformation());
            statement.setString(4, product.getUpdatedAt().toString());
            statement.setInt(5, product.getId());
            statement.execute();

            success = true;
        } catch (SQLException e) {
            MySQLConnUtils.printSQLException(e);
        }

        return success;
    }

    @Override
    public boolean remove(int id) {
        boolean rowDeleted = false;
        try (Connection connection = MySQLConnUtils.getConnection();
             PreparedStatement statement = connection.prepareStatement(DELETE_PRODUCT_SQL);) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDeleted;
    }


}
