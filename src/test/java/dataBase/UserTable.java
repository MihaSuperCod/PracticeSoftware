package dataBase;

import models.RequestUserModel;

import java.sql.PreparedStatement;

public class UserTable {
   private DataBaseConnection dataBaseConnection;

    public UserTable() {
        dataBaseConnection = new DataBaseConnection();
    }

    public void insertUserintoTable(RequestUserModel requestBody){
        String sql = "insert into user(email, password) values(?, ?);";

        try {
             PreparedStatement stmt = dataBaseConnection. getConnection().prepareStatement(sql);

            stmt.setString(1, requestBody.getEmail());
            stmt.setString(2, requestBody.getPassword());

            int rowsInserted = stmt.executeUpdate();
            System.out.println("Rows inserted: " + rowsInserted);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

