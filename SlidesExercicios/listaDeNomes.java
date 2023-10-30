//Elaborar um programa que solicite a quantidade de nomes de pessoas a entrar
//e receba a quantidade indicada.
//Ao final,o programa deve apresentar todos os nomes fornecidos.

package javafundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listaDeNomes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtdeParticipantes;
        List<String> nomes = new ArrayList<>();
        System.out.print("Digite a quantidade de participantes: ");
        qtdeParticipantes = scan.nextInt();

        for (int i = 0; i < qtdeParticipantes; i++) {
            System.out.print("Digite o nome: ");
            nomes.add(scan.next());

        }
        //uso do forEach para o output dos nomes
        for(String n: nomes){
            System.out.println(n.toUpperCase());


        }
    }

}
