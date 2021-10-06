package part1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {
    public static void main(String[] args) throws SQLException {

        String urlConnection = "jdbc:mysql://localhost/digital_innovation_one";


        try(Connection com = DriverManager.getConnection(urlConnection, "Gabriel", "hardtw1995566");){
            System.out.println("SUCESSSO");
        }catch(Exception e){
            System.out.println("FALHA!");
            e.printStackTrace();
        }
    }
//===================================================================================================
    //OUTRO JEITO DE FAZER:

    //2 - Definir parâmetro para se conectar ao banco de dados Mysql.

    String driver = "mysql";
    String dataHostAaddress = "localhost";
    String databaseName = "digital_innovation_one";
    String user = "Gabriel";
    String password = "hardtw1995566";

    //3 - Construçã da String de conexão.

    StringBuilder sb = new StringBuilder("jdbc:")
            .append(driver).append("://")
            .append(dataHostAaddress).append("/")
            .append(databaseName);

    String connectionUrl = sb.toString();
}
