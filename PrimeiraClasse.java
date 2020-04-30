import javafx.scene.input.KeyCode;

import javax.jnlp.IntegrationService;
import java.util.Scanner;

public class PrimeiraClasse {
    public static void main(String[] args) {
        /*System.out.println("Hello World!");
        variaveis();
        contador();
        exercicio1();
        exercicio2();
        exercicio3();
        exercicio4();
        exercicio5();
        fibonacci();*/
        System.out.println(bhaskara(1, 4, -12));
        //fibonacci2(144L);
        System.out.println(startSmoking(0,1));
    }

    public static int startSmoking(int bars,int boxes){
        float a = (((bars * 10) + boxes) * 18);
        a += a == 0 ? 0 : (a / 4) - 0.5;
        return  (int)a;
    }


        public static void variaveis () {
            int i = 15;
            double d = 256.9;
            String s = "Gustavo Abreu";
            char c;
            c = 'm';
            boolean b = (1 > 5);
            System.out.println("valor da variavel inteira: " + i);
            System.out.println("valor da variavel double: " + d);
            System.out.println("valor da variavel String: " + s);
            System.out.println("valor da variavel char: " + c);
            System.out.println("valor da variavel booleana: " + b);
        }

        public static void contador () {
            int i = 0;
            while (i <= 100) {
                switch (i) {
                    case 100:
                        System.out.println(i + ".");
                        break;
                    case 25:
                    case 50:
                    case 75:
                        System.out.println(i + ", ");
                        break;
                    default:
                        System.out.print(i + ", ");
                        break;
                }
                i++;
            }/*
        for (int l = 0; l <= 100; l++) {
            if (l == 100){
                System.out.println(l+".");
            } else if (l == 25 || l == 50 || l == 75){
                System.out.println(l+", ");
            } else {
                System.out.print(l + ", ");
            }
        }*/
        }

        public static void exercicio1 () {
        /*
            *********************************************************************************
            Tendo como dados de entrada a distância total (em km) percorrida por um automóvel
            e a quantidade de combustível (em litros) consumida para percorrê-la,
            calcule e imprima o consumo médio de combustível.
            *********************************************************************************
        */
            Scanner teclado = new Scanner(System.in);
            System.out.println("Digite a distância total (em km) percorrida: ");
            double dist = teclado.nextDouble();
            System.out.println("Digite a quantidade de combustível (em litros) consumida: ");
            double lit = teclado.nextDouble();
            System.out.println("A média foi de " + (dist / lit) + " km/l.");
        }

        public static void exercicio2 () {
        /*
            *********************************************************************************
            Leia dois valores inteiros e apresente a diferença do maior pelo menor.
            Ex: A = 2  A = 5
                B = 3  B = 1
            *********************************************************************************
        */
            Scanner teclado = new Scanner(System.in);
            System.out.println("Digite um valor inteiro:");
            int a = teclado.nextInt();
            System.out.println("Digite mais um valor inteiro:");
            int b = teclado.nextInt();
            if (a > b) {
                System.out.println("A diferença do maior número digitado pelo o menor é " + (a - b) + ".");
            } else {
                System.out.println("A diferença do maior número digitado pelo o menor é " + (b - a) + ".");
            }

        }

        public static void exercicio3 () {
        /*
            *********************************************************************************
            O sistema de nota de uma instituição atribui notas aos alunos através de conceito.
            Sabendo das faixas associadas a cada conceito, faça um fluxograma que leia 3 notas
            de um aluno, calcule a média e informe a qual conceito a média está relacionada.
            Nota Conceito:
            >= 9.0 A
            >= 7.5 e < 9.0 B
            >= 6.0 e < 7.5 C
            >= 4.0 e < 6.0 D
            < 4.0 E
            *********************************************************************************
        */
            Scanner teclado = new Scanner(System.in);
            int i = 0;
            double nota = 0;
            while (i < 3) {
                i++;
                System.out.println("Digite a " + i + "ª nota: ");
                nota += teclado.nextDouble();
            }
            nota /= i;

            if (nota < 4.0) {
                System.out.println("Nota: E");
            } else if (nota < 6) {
                System.out.println("Nota: D");
            } else if (nota < 7.5) {
                System.out.println("Nota: C");
            } else if (nota < 9) {
                System.out.println("Nota: B");
            } else {
                System.out.println("Nota: A");
            }
        }

        public static void exercicio4 () {
        /*
            *********************************************************************************
            Escreva um programa que escreva na tela todos os inteiros ímpares na
            faixa de 0 a 50. Para testar se um número N é ímpar faça a divisão inteira
            de N por 2. Se o resto for 1 então o número é ímpar
            Favor verificar se o numero realmente é impar.
            *********************************************************************************
        */
            for (int i = 0; i < 50; i++) {
                if ((i % 2) > 0) {
                    System.out.print(i + " ");
                }
            }
        }

        public static void exercicio5 () {
        /*
            *********************************************************************************
            Elaborar um programa que leia 10 valores numéricos reais e apresente
            no final o somatório e a média dos valores lidos.
            *********************************************************************************
        */
            Scanner teclado = new Scanner(System.in);
            int i = 0;
            double nota = 0;
            while (i < 10) {
                i++;
                System.out.println("Digite o " + i + "º valor: ");
                nota += teclado.nextDouble();
            }
            System.out.println("A soma dos valores digitado foi de " + nota + ", e a média de valor digitado foi " + (nota / i) + ".");
        }

        public static String bhaskara ( double a, double b, double c){
            double delta = ((b * b) - (4 * a * c));
            if (delta < 0) {
                return "Essa equação não tem ressultado";
            } else if (delta == 0) {
                delta = Math.sqrt(delta);
                return "O valor da equação é " + ((-b + (delta)) / (2 * a)) + ".";
            } else {
                delta = Math.sqrt(delta);
                return "O valor da equação é " + ((-b + delta) / (2 * a)) + " e " + ((-b - delta) / (2 * a)) + ".";
            }
        }

        public static void fibonacci () {
            /* proximo = atual + anterior  */
            int proximo = 1, atual = 0, anterior = 0;

            System.out.println(proximo);
            for (int i = 0; i < 11; i++) {
                anterior = atual;
                atual = proximo;
                proximo = atual + anterior;
                System.out.println(proximo);
            }
        }

        public static Long fibonacci2 (Long a){
            if (a < 2) {
                return a;
            } else {
                return (fibonacci2(a - 1) + fibonacci2(a - 2));
            }
        }
    }
