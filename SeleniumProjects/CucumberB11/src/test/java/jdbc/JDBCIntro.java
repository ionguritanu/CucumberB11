package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCIntro {
    /*
    _Connection -> it will connect to database and allow us to enter our credentials
    _Statement  -> we define our condition to get data/results from database
    _ResultSet  -> we store data from db to java object
    Three of the above are interfaces in java witch comes from jdbc dependency
     */
    /*
    ResultSet object is related  with my rows if I use resultSet.next() it will look at the next
    row next() methode will return if there is a next row otherwise it will return false
     */


    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:oracle:thin:@techtorialaws.cednotluxcqu.us-east-2.rds.amazonaws.com:1521/ORCL",
                "studentAWS",
                "studentB11");

        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery("select * from employees");
        resultSet.next();
        System.out.println(resultSet.getString("first_name"));
        System.out.println(resultSet.getRow());

        resultSet.next();//will return true if there is a next row otherwise it will return false.
//it will take us to the next row
        System.out.println(resultSet.getString("first_name"));
//using get string we can get our column value from row we are in
        System.out.println(resultSet.getRow());
        resultSet.next();
        System.out.println(resultSet.getRow());
//if you want to go to the last row we could use reslutSet.last() method
        resultSet.last();
        System.out.println(resultSet.getString("first_name"));
        //  resultSet.deleteRow(); //If  we want to delete the row

        //MetaData
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        //you want to see count of columns of your table
        System.out.println(resultSetMetaData.getColumnCount());
        System.out.println(resultSetMetaData.getColumnName(1));

// how can I print all the column names from employees table?
        for (int i = 1; i <= resultSetMetaData.getColumnCount(); i++) {
            System.out.println(resultSetMetaData.getColumnName(i));
        }

        //Creating a map for one row
        Map<String, Object> oneRow = new HashMap();
        for (int i = 1; i <= resultSetMetaData.getColumnCount(); i++) {
            oneRow.put(resultSetMetaData.getColumnName(i), resultSet.getObject(i));

            // 'i' is the number for column and our row number is defined by resultSet next method
            // to bea ble to get columnNmae we will use resultSetMeta data object with index number of column
            // to be able to get column's value we will use resultSet.getObject methode with index number of column

        }
        System.out.println(oneRow);

        List<Map<String, Object>> allTable = new ArrayList<>();
        while (resultSet.next()) {
            Map<String, Object> currentRow = new HashMap();
            for (int i = 1; i <= resultSetMetaData.getColumnCount(); i++) {
                oneRow.put(resultSetMetaData.getColumnName(i), resultSet.getObject(i));
                allTable.add(currentRow);
            }
        }
        System.out.println(allTable);

    }
}

//ResultSetMetaData object is related with my result columns
//I will have some info and methods available for my results
//for my result table  getColumnCount() -> Will give us count of all the columns and last column number in the table
//getColumnName() -> this methode will take column number as parameter and
