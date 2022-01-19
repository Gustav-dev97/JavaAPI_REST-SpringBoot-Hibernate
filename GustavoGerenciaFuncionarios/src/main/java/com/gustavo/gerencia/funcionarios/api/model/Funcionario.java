/**
 * 
 */
package com.gustavo.gerencia.funcionarios.api.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Gustavo.Batista
 * 
 * @Entity Informa a entidade para o JPA estabelecer a conexao com tabela de
 *         mesmo nome no banco de dados
 * @Table Permite especificar os detalhes da tabela que sera usada para
 *        persistir a entidade no banco de dados
 * @Id Annotation obrigatoria, utilizada para informar ao JPA qual
 *     campo/atributo de uma entidade estará relacionado à chave primária da
 *     respectiva tabela no banco de dados.
 * @GeneratedValue Annotation obrigatoria, utilizada para informar que o valor
 *                 do ID da entidade será gerenciada pelo DAO
 * @Column Especifica a coluna mapeada para o DAO, se nenhuma coluna for
 *         especificada os valores DEFAULT sao aplicados
 *
 */

@Entity
@Table(name = "tbl_funcionario")
public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String nome;
	@Column
	private String genero;
	@Column
	private String departamento;
	@Column
	private Date nascimento;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", genero=" + genero + ", departamento=" + departamento
				+ ", nascimento=" + nascimento + "]";
	}

}
