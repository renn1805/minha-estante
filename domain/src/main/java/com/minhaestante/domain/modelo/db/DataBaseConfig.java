package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConfig {
    private static final String URL_BANCO = "jdbc:sqlite:minha_estante.db";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL_BANCO);
    }

    public static void iniciarBanco(){
        String sql = "CREATE TABLE IF NOT EXISTS livros("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "titulo TEXT NOT NULL, "
                + "autor TEXT NOT NULL, "
                + "isbn TEXT"
                +");";

        try (Connection conn = getConnection();
        Statement stmt = conn.createStatement()){
            stmt.execute(sql);
        }catch (SQLException e) {
            System.err.println("Erro ao inicializar a tabela no banco: " + e.getMessage());
        }
    }
}
