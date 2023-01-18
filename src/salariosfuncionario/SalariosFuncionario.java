
package salariosfuncionario;

import java.util.Scanner;


public class SalariosFuncionario {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Entre com quantidade de funcionários:");
    int qtdFunciionarios = input.nextInt();
    
    int codFuncionaro = 1;
    double salarioTotal = 0.0;
    
    
    while (codFuncionaro <= qtdFunciionarios) {     
      System.out.printf("Entre com o salário do empregado: %d%n", codFuncionaro);
      double salario = input.nextDouble();
      salarioTotal += salario;
      codFuncionaro++;
    }
    double mediaSalarial = salarioTotal / qtdFunciionarios;
    
    System.out.printf("O valor total de salários gasto pela empresa é de: R$%.2f%n", salarioTotal);
    System.out.printf("A média salarial da empresa é de: R$%.2f%n", mediaSalarial);
  }
}
