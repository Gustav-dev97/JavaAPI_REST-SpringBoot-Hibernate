/**
 * 
 */
package com.gustavo.gerencia.funcionarios.api.servico;

import java.util.List;

import com.gustavo.gerencia.funcionarios.api.model.Funcionario;

/**
 * @author Gustavo.Batista
 *
 */
public interface FuncionarioServico {

	List<Funcionario> get();
	
	Funcionario get(int id);
	
	void salvar(Funcionario funcionario);
	
	void deletar(int id);
}
