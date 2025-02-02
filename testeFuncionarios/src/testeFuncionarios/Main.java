package testeFuncionarios;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		BigDecimal total = null;
		
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		Principal principal = new Principal();
		
		funcionarios.add(new Funcionario("Maria", "18/10/2000", "2009.44", "Operador"));
		funcionarios.add(new Funcionario("João", "12/05/1990", "2284.38", "Operador"));
		funcionarios.add(new Funcionario("Caio", "02/05/1961", "9836.14", "Coordenador"));
		funcionarios.add(new Funcionario("Miguel", "14/10/1988", "19119.88", "Diretor"));
		funcionarios.add(new Funcionario("Alice", "05/01/1995", "2234.68", "Recepcionista"));
		funcionarios.add(new Funcionario("Heitor", "19/11/1999", "1584.72", "Operador"));
		funcionarios.add(new Funcionario("Arthur", "31/03/1993", "4071.84", "Contador"));
		funcionarios.add(new Funcionario("Laura", "08/07/1994", "3017.45", "Gerente"));
		funcionarios.add(new Funcionario("Heloísa", "24/05/2003", "1606.85", "Eletricista"));
		funcionarios.add(new Funcionario("Helena", "02/09/1996", "2799.93", "Gerente"));
		
		System.out.println("Funcionarios:");
		principal.Listar(funcionarios);
		principal.Excluir(funcionarios, "João");
		principal.Aumento(funcionarios, 10);
		total = principal.TotalSalario(funcionarios);
		System.out.println("A soma dos salários é de: " + total);
		principal.QtdSalarioMin(funcionarios);

	}

}
