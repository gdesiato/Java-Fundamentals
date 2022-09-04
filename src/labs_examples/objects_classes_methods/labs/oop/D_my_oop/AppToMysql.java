package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.sql.*;

class AppToMySql {

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;


        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            String connectionString = "jdbc:mysql://localhost:3306/SummitApp?"
                    + "user=<USER>&password=<PASSWORD>"
                    + "&useSSL=false&allowPublicKeyRetrieval=true";

            // Setup the connection with the DB
            connection = DriverManager.getConnection(connectionString);

            // Statements allow to issue SQL queries to the database
            statement = connection.createStatement();

            /*
            String sql = passenger.createPassenger("car", "mor", "marmor@mail.com");
            statement.executeUpdate(sql);
             */

           /*
            String sql2 = passenger.deletePassenger(22);
            statement.executeUpdate(sql2);
            System.out.println("passenger deleted");

            */


            /*
            String sql = "INSERT INTO AirTravel.passengers (first_name, last_name, email) VALUES ('mic', 'col', 'miccol@mail.com')";
            statement.executeUpdate(sql);

            String sql1 = "INSERT INTO AirTravel.passengers (first_name, last_name, email) VALUES ('san', 'pul', 'sanpul@mail.com')";
            statement.executeUpdate(sql1);
            */

            // String sql2 = flight.createFlight("lufthansa");
            // statement.executeUpdate(sql2);

            // Result set get the result of the SQL query
            resultSet = statement.executeQuery("select * from SummitApp.trails");

            // loop through the result set while there are more records
            while (resultSet.next()) {

                // get the id, names fields from the result set and assign them to local variables
                int trail_id = resultSet.getInt("trail_id");
                String trail_name = resultSet.getString("trail_name");
                int trail_miles = resultSet.getInt("trail_miles");
                String trail_difficulty = resultSet.getString("trail_difficulty");

                // print out the result
                System.out.println("Trail " + trail_id + ": " + trail_name + " -- " + trail_miles + " miles -- " + trail_difficulty);
            }

        } catch (SQLException exc) {
            System.out.println("Exception occurred");
            exc.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Exception occured - driver not found on classpath");
            e.printStackTrace();
        } finally {
            try {
                // close all JDBC elements
                statement.close();
                resultSet.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
