package jdbc;

import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

import static jdbc.JDBCUtil.*;                     ///imported
public class JDBCPractice1 {

    @Test
    public void jdbcTest(){
        //print out all the names from employees table that are starting with 'S'
     establishConnection();
     //will be in hook class or before methode
     List<Map<String, Object>> namesS = executeQuery("select FIRST_NAME from EMPLOYEES where FIRST_NAME like 'S%'");
     for (int i = 0; i< namesS.size(); i++){
         System.out.println(namesS.get(i).get("FIRST_NAME"));
     }
closeConnection();
        //it will be in hook class after methode
    }
}
//i create 4 object to connect


