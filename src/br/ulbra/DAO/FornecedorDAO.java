
package br.ulbra.DAO;

import static br.ulbra.DAO.AbstractDAO.getConnection;
import br.ulbra.model.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class FornecedorDAO {
     public List<Fornecedor> listar() throws SQLException {
        List<Fornecedor> lista = new ArrayList<>();
        String sql = "SELECT idfor, nomerazao, nomefantasia, telefone, email FROM fornecedor";

        try (Connection con = getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Fornecedor f = new Fornecedor(
                    rs.getInt("idfor"),
                    rs.getString("nomerazao"),
                    rs.getString("nomefantasia"),
                    rs.getString("telefone"),
                    rs.getString("email")
                );
                lista.add(f);
            }
        }
        return lista;
    }

    public Fornecedor buscarPorId(int id) throws SQLException {
        String sql = "SELECT idfor, nomerazao, nomefantasia, telefone, email FROM fornecedor WHERE idfor = ?";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Fornecedor(
                        rs.getInt("idfor"),
                        rs.getString("nomerazao"),
                        rs.getString("nomefantasia"),
                        rs.getString("telefone"),
                        rs.getString("email")
                    );
                }
            }
        }
        return null;
    }

    public void inserir(Fornecedor f) throws SQLException {
        String sql = "INSERT INTO fornecedor (nomerazao, nomefantasia, telefone, email) VALUES (?, ?, ?, ?)";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, f.getNomeRazao());
            ps.setString(2, f.getNomeFantasia());
            ps.setString(3, f.getTelefone());
            ps.setString(4, f.getEmail());

            ps.executeUpdate();

            try (ResultSet keys = ps.getGeneratedKeys()) {
                if (keys.next()) {
                    f.setIdFor(keys.getInt(1));
                }
            }
        }
    }

    public void atualizar(Fornecedor f) throws SQLException {
        String sql = "UPDATE fornecedor SET nomerazao = ?, nomeFantasia = ?, telefone = ?, email = ? WHERE idfor = ?";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, f.getNomeRazao());
            ps.setString(2, f.getNomeFantasia());
            ps.setString(3, f.getTelefone());
            ps.setString(4, f.getEmail());
            ps.setInt(5, f.getIdFor());

            ps.executeUpdate();
        }
    }

    public void excluir(int idFor) throws SQLException {
        String sql = "DELETE FROM fornecedor WHERE idfor = ?";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idFor);
            ps.executeUpdate();
        }
    }
}
