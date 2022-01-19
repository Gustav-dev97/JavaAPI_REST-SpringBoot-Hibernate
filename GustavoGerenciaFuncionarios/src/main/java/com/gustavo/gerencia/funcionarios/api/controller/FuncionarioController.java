/**
 * 
 */
package com.gustavo.gerencia.funcionarios.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gustavo.gerencia.funcionarios.api.model.Funcionario;
import com.gustavo.gerencia.funcionarios.api.servico.FuncionarioServico;

/**
 * Esta classe realiza a comunicacao com o banco de dados e requests JSON
 * 
 * @author Gustavo.Batista
 *
 */

@RestController
@RequestMapping ("/api")
public class FuncionarioController {
	
	@Autowired
	private FuncionarioServico funcionarioServico;

	/**
	 * Retorna todos os funcionarios do banco de dados
	 * 
	 * @return lista de funcionarios do banco de dados 
	 */
	@RequestMapping ("/funcionario")
	public List<Funcionario> get(){
		return funcionarioServico.get();
	}
	
	/**
	 * Salva o funcionario no banco de dados atraves do POST
	 * EX: localhost:8080/api/funcionario
	 * 
	 * @param funcionarioObj
	 * @return Objeto Funcionario salvo
	 */
	@PostMapping ("/funcionario")
	public Funcionario save(@RequestBody Funcionario funcionarioObj) {
		funcionarioServico.salvar(funcionarioObj);
		return funcionarioObj;
	}
	
	/**
	 * Retorna um unico usuario no banco de dados pelo ID atraves do GET
	 * EX: GET-localhost:8080/api/funcionario/1
	 * 
	 * @param id
	 * @return Objeto Funcionario
	 */
	@GetMapping("/funcionario/{id}")
	public Funcionario get(@PathVariable int id){
		Funcionario funcionarioObj = funcionarioServico.get(id);
		if(funcionarioObj == null) {
			throw new RuntimeException("Funcionario com o ID:" + " " + id + " " + "não foi encontrado!");
		}
		return funcionarioObj;
	}
	
	/**
	 * Deleta um funcionario do banco de dados atraves do DELETE
	 * EX: DELETE-localhost:8080/api/funcionario
	 * 
	 * @param id
	 * @return Objeto Funcionario deletado
	 */
	@DeleteMapping("/funcionario/{id}")
	public String delete(@PathVariable int id) {
		funcionarioServico.deletar(id);
		return "Funcionario com o ID:" + " " + id + " " + "foi deletado com sucesso!";
	}
	
	/**
	 * Atualiza um funcionario no banco de dados pelo ID atraves do PUT
	 * EX: PUT-localhost:8080/api/funcionario/1
	 * 
	 * @param funcionarioObj
	 * @return Objeto Funcionario atualizado
	 */
	@PutMapping("/funcionario")
	public Funcionario atualizar(@RequestBody Funcionario funcionarioObj) {
		funcionarioServico.salvar(funcionarioObj);
		return funcionarioObj;
	}
}
