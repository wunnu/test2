package test3;

import java.sql.*;
public class Jdbc {
public static void main(String args[]) {
try {
Class.forName("com.mysql.jdbc.Driver");//加载MYSQL JDBC驱动程序   
//Class.forName("org.gjt.mm.mysql.Driver");
System.out.println("Success loading Mysql Driver!");
}
catch (Exception e) {
System.out.print("Error loading Mysql Driver!");
e.printStackTrace();
}
try {
Connection connect = DriverManager.getConnection(
"jdbc:mysql://localhost:3306/test","root","1234abcd");//java这个空填写的是你自己设的密码

System.out.println("Success connect Mysql server!");
Statement stmt = connect.createStatement();
ResultSet rs = stmt.executeQuery("select * from ff");
//user 为你表的名称，可以在MySQL命令行用show tables；显示
while (rs.next()) {
System.out.println(rs.getString("name"));
}
}
catch (Exception e) {
System.out.print("get data error!");
e.printStackTrace();
}
}
}
