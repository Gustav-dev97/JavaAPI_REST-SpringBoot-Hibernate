/**
 * 
 */
package com.gustavo.gerencia.funcionarios.api.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gustavo.gerencia.funcionarios.api.model.Funcionario;

/**
 * Realiza funcoes CRUD
 * 
 * @author Gustavo.Batista
 * 
 * @Repository Anota classes na camada de persistência, que atuará como um repositório de banco de dados
 * 
 */

@Repository
public class FuncionarioDAOImplementacao implements FuncionarioDAO{

	@Autowired
	private EntityManager gerenciadorEntidade;
	//Autowired necessario, caso contrario variavel retorna NULL
	
	/**
	 * Retorna a lista de funcionarios no banco de dados 
	 * 
	 */ 
	@Override
	public List<Funcionario> get() {
		Session sessaoAtual = gerenciadorEntidade.unwrap(Session.class);
		Query<Funcionario> query = sessaoAtual.createQuery("from Funcionario", Funcionario.class);
		List<Funcionario> lista = query.getResultList();
		return lista;
	}

	/**
	 * Busca um unico funcinario no banco de dados
	 */
	@Override
	public Funcionario get(int id) {
		Session sessaoAtual = gerenciadorEntidade.unwrap(Session.class);
		Funcionario funcionarioObj = sessaoAtual.get(Funcionario.class, id);
		return funcionarioObj;
	}

	/**
	 * Salva o funcionario no banco de dados
	 */
	@Override
	public void salvar(Funcionario funcionario) {
		Session sessaoAtual = gerenciadorEntidade.unwrap(Session.class);
		sessaoAtual.saveOrUpdate(funcionario);
	}

	/**
	 * Deleta o Funcionario do banco de dados
	 */
	@Override
	public void deletar(int id) {
		Session sessaoAtual = gerenciadorEntidade.unwrap(Session.class);
		Funcionario funcionarioObj = sessaoAtual.get(Funcionario.class, id);
		sessaoAtual.delete(funcionarioObj);
	}

}
