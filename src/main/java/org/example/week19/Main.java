package org.example.week19;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try {
            getDataFromCities(MySQLConnection.getMyConnection());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    static void getDataFromCities(Connection con) throws SQLException {
        Statement st = con.createStatement();

        String sql = "SELECT * FROM city LIMIT 15";

        ResultSet result = st.executeQuery(sql);

        while (result.next()) {
            StringBuilder sb = new StringBuilder();
            sb.append("City Name: ")
                    .append(result.getString("Name"))
                    .append(" Country-code: ")
                    .append(result.getString("CountryCode"))
                    .append(" Population of: ")
                    .append(result.getInt("Population"));

            System.out.println(sb);
        }

        result.close();
        st.close();
        con.close();
    }
}
