package testeFuncionarios;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Principal {
public void Listar(List<Funcionario> funcionarios){
		
		for (Funcionario funcionario : funcionarios) {
				System.out.println(funcionario.getNome());
				System.out.println(funcionario.getDataNascimento());
				System.out.println(funcionario.getSalario());
				System.out.println(funcionario.getFuncao());
				}
		 return;
	};
	
	public void Excluir(List<Funcionario> funcionarios, String nome){
		
		for (Funcionario funcionario : funcionarios) {
			if (funcionario.nome == nome) {
				funcionarios.remove(funcionario);
				System.out.println("Funcionário " + nome + " excluido");
				Listar(funcionarios);
				return;
			
			}
		}
		
	}
	
	public void Aumento(List<Funcionario> funcionarios, int porcentagem){
		
		for (Funcionario funcionario : funcionarios) {
			BigDecimal salario = funcionario.salario;
			BigDecimal aumento = salario.add(funcionario.salario.multiply((new BigDecimal(porcentagem).divide(new BigDecimal("100")))));
			funcionario.setSalario(aumento);
		}
		Listar(funcionarios);
		return;
	}
	
	public void Aumento(List<Funcionario> funcionarios, int porcentagem, String nome){
		
		for (Funcionario funcionario : funcionarios) {
			if(funcionario.nome == nome) {
			BigDecimal salario = funcionario.salario;
			BigDecimal aumento = salario.add(funcionario.salario.multiply((new BigDecimal(porcentagem).divide(new BigDecimal("100")))));
			funcionario.setSalario(aumento);
			
			return;
			}
		}
		
	}
	
	public BigDecimal TotalSalario(List<Funcionario> funcionarios) {
		BigDecimal totalSalario = null;
		for (Funcionario funcionario : funcionarios) {
			if(totalSalario == null) {
			totalSalario = funcionario.salario;
		}else {
			totalSalario = totalSalario.add((funcionario.getSalario()));
			}
		}
		return totalSalario;
	}
	public void QtdSalarioMin(List<Funcionario> funcionarios) {
		for (Funcionario funcionario : funcionarios) {
			BigDecimal salarioMin = new BigDecimal("1212.00");
			BigDecimal salarioFuncionario = funcionario.salario;
			BigDecimal resultado = salarioFuncionario.divide(salarioMin, 2, RoundingMode.HALF_UP);
			
			System.out.println(funcionario.nome + " recebe " + resultado.toString() + " salarios mínimos");
		}
	}
}
