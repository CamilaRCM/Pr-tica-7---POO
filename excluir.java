import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


    public class excluir {

        private static final String DELETE_LIVRO = "delete from users where id = ?;";

        private final String url = "jdbc:postgresql://localhost/BDlivrariaUniversitaria";
        private final String user = "postgres";
        private final String password = "123456";

        public static void main(String[] argv) throws SQLException {
            excluir deleteStatementExample = new excluir();
            deleteStatementExample.deleteRecord();
        }

        public void deleteRecord() throws SQLException {
            System.out.println(DELETE_LIVRO);


            try (Connection connection = DriverManager.getConnection(url, user, password);


                 PreparedStatement preparedStatement = connection.prepareStatement(DELETE_LIVRO);) {
                preparedStatement.setInt(1, 1);


                int result = preparedStatement.executeUpdate();

            } catch (SQLException e) {


                printSQLException(e);
            }

        }

        public static void printSQLException(SQLException ex) {
            for (Throwable e: ex) {
                if (e instanceof SQLException) {
                    e.printStackTrace(System.err);
                    System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                    System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                    System.err.println("Message: " + e.getMessage());
                    Throwable t = ex.getCause();
                    while (t != null) {
                        System.out.println("Cause: " + t);
                        t = t.getCause();
                    }
                }
            }
        }
    }



