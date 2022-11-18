import java.sql.*;

public class InserirRegistros {

    private final String url = "jdbc:postgresql://localhost/BDlivrariaUniversitaria";
    private final String user = "postgres";
    private final String password = "123456";

    Connection conn = null;


    private static final String INSERT_REGISTROS_SQL = "INSERT INTO lIVROS" +
            "  (id_isbn, id_categoria, id_editora ,nm_titulo, dt_publicacao, nu_edicao,nu_volume, vl_preco numeric) VALUES " +
            " (?, ?, ?, ?, ?, ?, ?, ?)";


    public void InserirLivros() {

        try (Connection connection = DriverManager.getConnection(url, user, password);

             Statement statement = connection.createStatement();) {

            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_REGISTROS_SQL);
            preparedStatement.setString(1, "123");
            preparedStatement.setInt(2, 1);
            preparedStatement.setInt(3, 3);
            preparedStatement.setString(4, "US");
            preparedStatement.setString(5, "secret");
            preparedStatement.setInt(6, 6);
            preparedStatement.setInt(7, 7);
            preparedStatement.setDouble(8, 8);

            System.out.println(preparedStatement);


            preparedStatement.executeUpdate();
        } catch (SQLException e) {

        }

                }
            }
