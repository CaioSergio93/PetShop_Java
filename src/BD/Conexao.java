package BD;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.sqlite.SQLiteException;

import java.sql.Connection;

public class Conexao {

    public static Connection createConnection() throws SQLException {
        try {
        	String url = "jdbc:sqlite:C:/Users/caios/Documents/Java/SISTEMA PETSHOP/src/BD/.open.db";
            java.sql.Connection conexao = DriverManager.getConnection(url);
            System.out.println("Conexão Realizada");
            return conexao;
        } catch (SQLiteException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
}
