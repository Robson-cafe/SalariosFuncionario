
package salariosfuncionario;

import java.util.Scanner;


public class SalariosFuncionario {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Entre com quantidade de funcionários:");
    int qtdFuncionarios = input.nextInt();
     while (qtdFuncionarios <= 0) {
       System.out.println("Quantidade de funcionários não pode ser menor ou igual a zero!");
       System.out.println("Entre com quantidade de funcionários:");
       qtdFuncionarios = input.nextInt();
     }
    int codFuncionario = 1;
    double salarioTotal = 0.0;
    
    
    while (codFuncionario <= qtdFuncionarios) {     
      System.out.printf("Entre com o salário do empregado: %d%n", codFuncionario);
      double salario = input.nextDouble();
      salarioTotal += salario;
      codFuncionario++;
    }
    double mediaSalarial = salarioTotal / qtdFuncionarios;
    
    System.out.printf("O valor total de salários gasto pela empresa é de: R$%.2f%n", salarioTotal);
    System.out.printf("A média salarial da empresa é de: R$%.2f%n", mediaSalarial);
  }
}
