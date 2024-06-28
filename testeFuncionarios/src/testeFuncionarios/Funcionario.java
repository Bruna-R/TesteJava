package testeFuncionarios;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Funcionario extends Pessoa{
	ArrayList<Funcionario> funcionarios;
	public BigDecimal salario;
	public String funcao;
	
	public Funcionario(String nome, String dataNascimento, String salario, String funcao) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.salario = new BigDecimal(salario);
		this.funcao = funcao;
	}

	public BigDecimal getSalario() {
		return salario;
	}
	
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	
	public String getFuncao() {
		return funcao;
	}
	
	public void setfuncao(String funcao) {
		this.funcao = funcao;
	}
}
