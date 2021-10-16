package com.example.nationservletjsp.dao;

import com.example.nationservletjsp.model.Region;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBUtil {
    static MySQLConnect mysqlConnec = new MySQLConnect();
    private static String SELECT_REGION = "SELECT * FROM regions;";
    private static String SELECT_BY_NAME = "SELECT * FROM ? WHERE name = ?;";
    private static String INSERT_REGION = "INSERT INTO region (region_id, name, continent_id) VALUES(?, ?, ?);";
    private static String DELETE_REGION = "DELETE FROM Region WHERE Id = ?;";

    public DBUtil() {
    }

    public void insertRegion(Region region){
        Connection connection = mysqlConnec.getConnection();
        try (PreparedStatement preparedStatement1 = connection.prepareStatement(INSERT_REGION)) {
          preparedStatement1.setString(1, String.valueOf(region.getRegionID()));
          preparedStatement1.setString(2, region.getName());
          preparedStatement1.setString(3, String.valueOf(region.getContinentID()));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public List<Region> selectAll(){
        Region reigon = new Region();
        List<Region> regions = new ArrayList<>();
        Connection connection = mysqlConnec.getConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(SELECT_REGION)) {
            ResultSet resultSet = preparedStatement.executeQuery();
          while(resultSet.next()){
              reigon.setRegionID(resultSet.getInt(1));
              reigon.setName(resultSet.getString(2));
              reigon.setContinentID(resultSet.getInt(3));
              regions.add(reigon);
          }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return regions;
    }

}
