package test;

import dominio.Atributes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Atributes things = new Atributes();
        things.setNomeDaPessoa("Pedrin");
        things.getNomeDaPessoa();
        // questionario //
        System.out.println("Qual o seu nome ?");
        things.nome = read.nextLine();
        System.out.println("Qual o sua idade ?");
        things.idade = read.nextByte();
        System.out.println("Qual o seu salario01 ?");
        things.salario01 = read.nextDouble();
        System.out.println("Qual o seu salario02 ?");
        things.salario02 = read.nextDouble();
        System.out.println("Qual o seu salario03 ?");
        things.salario03 = read.nextDouble();
        // methods
        System.out.println("-------------------------------");
        System.out.println("Esses são seus atribuitos até agora!! ");
        things.imprimir();

        // method media salarial

        System.out.println("Agora vamos ver a média do seus 3 salários!! ");
        things.mediaSalariao(things.salario01, things.salario02, things.salario03);


    }
}
