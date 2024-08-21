package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/javaDemo";
        Connection conn = null;
        int rollno = 2;
        String name = "Circle";
        int age = 20;
        String sql = "insert into student(rollno, name, age) " + "values(" + rollno + ",'" + name + "'," + age + ")";
        try {
            conn = DriverManager.getConnection(url, "postgres", "5656");

            Statement st = conn.createStatement();
            int m = st.executeUpdate(sql);
            if (m == 1) {
                System.out.println("Inserted successfully" + sql);
            } else {
                System.out.println("Insertion failed");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                conn.close();
            }

        }
    }
}
