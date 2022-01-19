/**
 * 
 */
package com.gustavo.gerencia.funcionarios.api.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gustavo.gerencia.funcionarios.api.dao.FuncionarioDAO;
import com.gustavo.gerencia.funcionarios.api.model.Funcionario;

/**
 * @author Gustavo.Batista
 * 
 * @Service Faz anotações de classes na camada de serviço
 * @Autowired 
 * @Transactional Demarca transacoes como salvar, deletar, alterar e garante que eles sejam executados dentro um contexto transacional e seja feito rollback em caso de erro
 */


@Service
public class FuncionarioServicoImplementacao implements FuncionarioServico {
	 
	@Autowired
	private FuncionarioDAO funcionarioDAO; 

	@Transactional
	@Override
	public List<Funcionario> get() {
		return funcionarioDAO.get();
	}

	@Transactional
	@Override
	public Funcionario get(int id) {
		return funcionarioDAO.get(id);
	}

	@Transactional
	@Override
	public void salvar(Funcionario funcionario) {
		funcionarioDAO.salvar(funcionario);	
	}

	@Transactional
	@Override
	public void deletar(int id) {
		funcionarioDAO.deletar(id);
	}

}
