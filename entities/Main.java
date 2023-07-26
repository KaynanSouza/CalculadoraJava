package entities;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Calculo cl;

        String repetirPrograma, repetirOeracao;
        double n1, n2;

        System.out.println("Calculadora do Kaynan");
        System.out.println(linha());
        do {
            System.out.println("Digite um numero de 1 a 5 para escolher a operação");
            System.out.println("1.Adição 2.Subtração\n3.Divisão 4.Multiplicação\n5.Porcentagem 6.Exponenciação\n7.Radiciação");
            System.out.print("Operação: ");
            int operacao = sc.nextInt();

            System.out.println(linha());
            do {
                switch(operacao) {
                    case 1:
                        System.out.print("Digite o primeiro número:");
                        n1 = sc.nextDouble();
                        System.out.print("Digite o segundo número:");
                        n2 = sc.nextDouble();

                        cl = new Calculo(n1, n2);

                        System.out.printf("Resposta: %.1f\n",cl.soma());
                        break;
                    case 2:
                        System.out.print("Digite o primeiro número:");
                        n1 = sc.nextDouble();
                        System.out.print("Digite o segundo número:");
                        n2 = sc.nextDouble();

                        cl = new Calculo(n1, n2);
                        System.out.printf("Resposta: %.1f\n",cl.subtracao());
                        break;
                    case 3:
                        System.out.print("Digite o dividendo:");
                        n1 = sc.nextDouble();
                        System.out.print("Digite o divisor:");
                        n2 = sc.nextDouble();

                        cl = new Calculo(n1, n2);

                        System.out.printf("Resposta: %.1f\n", cl.divisao());
                        break;
                    case 4:
                        System.out.print("Digite o primeiro número:");
                        n1 = sc.nextDouble();
                        System.out.print("Digite o segundo número:");
                        n2 = sc.nextDouble();

                        cl = new Calculo(n1, n2);

                        System.out.printf("Resposta: %.1f\n", cl.multiplicacao());
                        break;
                    case 5:
                        System.out.print("Digite o total:");
                        n1 = sc.nextDouble();
                        System.out.print("Digite a porcentage:");
                        n2 = sc.nextDouble();

                        cl = new Calculo(n1, n2);

                        System.out.printf("Resposta: %.1f\n", cl.porcentagem());
                        break;
                    case 6:
                        System.out.print("Digite a base:");
                        n1 = sc.nextDouble();
                        System.out.print("Digite o expoente:");
                        n2 = sc.nextDouble();

                        cl = new Calculo(n1, n2);

                        System.out.printf("Resposta: %.1f\n", cl.exponenciacao());
                        break;
                    case 7:
                        System.out.print("Digite o índice:");
                        n1 = sc.nextDouble();
                        System.out.print("Digite o radicando:");
                        n2 = sc.nextDouble();

                        cl = new Calculo(n1, n2);

                        System.out.printf("Resposta: %.1f\n", cl.radiciacao());
                        break;
                }
                System.out.println(linha());

                System.out.print("Deseja repetir a operação?");
                repetirOeracao = sc.next();
                repetirOeracao.toLowerCase(Locale.ROOT);
                System.out.println(linha());

            }while(repetirOeracao.equals("sim") || repetirOeracao.equals("s"));

            System.out.print("Deseja fazer outra operação?");
            repetirPrograma = sc.next();
            repetirPrograma.toLowerCase(Locale.ROOT);
            System.out.println(linha());

        }while(repetirPrograma.equals("sim") || repetirPrograma.equals("s"));
        sc.close();
    }
    public static String linha(){
        return "**********************************";
    }
}