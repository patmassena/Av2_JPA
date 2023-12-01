package orm.modelo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "aluno")
public class Aluno {
	@Id
	private String id;
	@Column
	private String nome;
	@Column
	private String email;
	@Column
	private String CPF;
	@Column
	private String nascimento;
	@Column
	private String naturalidade;
	@Column
	private String endereco;
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}



@Override
public String toString() {
    return "Aluno{" + "id=" + id + ", nome='" + nome + '\'' + ", CPF='" + CPF + '\'' + ", email='" + email + '\'' + ", endereco='" + endereco + '\'' + ", nascimento=" + nascimento + ", naturalidade='" + naturalidade + '\'' +'}';
}

}



