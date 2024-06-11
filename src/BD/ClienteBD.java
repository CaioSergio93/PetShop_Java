package BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteBD {

    private String sql = "";
    private Connection conexao;

    private PreparedStatement selectCliente;
    private PreparedStatement insertCliente;
    private PreparedStatement updateCliente;
    private PreparedStatement deleteCliente;

    public ClienteBD() throws SQLException {
        try {
            conexao = (Connection) Conexao.createConnection();
            setSql("SELECT * FROM Cliente");

            setSelectCliente(conexao.prepareStatement("SELECT * FROM Cliente"));
            setInsertCliente(conexao.prepareStatement("INSERT INTO Cliente (Nome, endereco, telefone, pet) VALUES (?, ?, ?, ?)"));
            updateCliente = conexao.prepareStatement("UPDATE Cliente SET telefone = ? WHERE endereco = ?");
            deleteCliente = conexao.prepareStatement("DELETE FROM Cliente WHERE id = ?");
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public int atualizarCliente(String endereco, double telefone) {
        int result = 0;
        try {
            updateCliente.setDouble(1, telefone);
            updateCliente.setString(2, endereco);
            result = updateCliente.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public int removerCliente(int clienteId) {
        int result = 0;
        try {
            deleteCliente.setInt(1, clienteId);
            result = deleteCliente.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void close() {
        try {
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public PreparedStatement getSelectCliente() {
		return selectCliente;
	}

	public void setSelectCliente(PreparedStatement selectCliente) {
		this.selectCliente = selectCliente;
	}

	public PreparedStatement getInsertCliente() {
		return insertCliente;
	}

	public void setInsertCliente(PreparedStatement insertCliente) {
		this.insertCliente = insertCliente;
	}
}
