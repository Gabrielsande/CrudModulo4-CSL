
package br.ulbra.controller;

import br.ulbra.DAO.FornecedorDAO;
import br.ulbra.model.Fornecedor;
import java.sql.SQLException;
import java.util.List;


public class FornecedorController {
    
  private final FornecedorDAO dao;

    public FornecedorController() {
        this.dao = new FornecedorDAO();
    }

    // Cria/insere um novo fornecedor
    public void salvar(Fornecedor f) throws SQLException {
        // Delegar para o DAO inserir (que retorna com o id atualizado)
        dao.inserir(f);
    }

    // Busca por id
    public Fornecedor buscarPorId(int id) throws SQLException {
        return dao.buscarPorId(id);
    }

    // Lista todos
    public List<Fornecedor> listar() throws SQLException {
        return dao.listar();
    }

    // Atualiza fornecedor existente
    public void atualizar(Fornecedor f) throws SQLException {
        dao.atualizar(f);
    }

    // Excluir por id
    public void excluir(int id) throws SQLException {
        dao.excluir(id);
    }
}
