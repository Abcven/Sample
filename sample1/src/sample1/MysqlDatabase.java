package sample1;

public class MysqlDatabase {
	public void makeJDBCConnection() throws ClassNotFoundException {
static 
        try {
               database = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazonRekognition", "root", "bObthebuilder92");
               if (database != null) {
                     System.out.println("Connection Successful!");
               } else {
                     System.out.println("Failed to make connection!");
               }
        } catch (SQLException e) {
               System.out.println("MySQL Connection Failed!");
               e.printStackTrace();
               return;
        }
        try {
                      Class.forName("com.mysql.jdbc.Driver");
               } catch (ClassNotFoundException e) {
                     e.printStackTrace();
               }
  }

}
