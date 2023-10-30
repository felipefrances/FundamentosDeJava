//Questão 10: Crie uma aplicação que possua as seguintes operações:
//        2
//        (a) Capte dados de um usuário (contexto livre)
//        (b) Armazene esses dados em uma arquivo
//        (c) A aplicação deve ser capaz de manipular os dados do arquivo: escrita - leitura - apagar arquivo
//       OK (d) Faça um menu para que o usuário possa escolher qual operação ele poderá realizar!


import java.io.File;
import java.util.Scanner;

public class Questao10 {

    public static void menu () {
        System.out.println(" --- Menu --- ");
        System.out.println("1 - Cadastrar Usuario ");
        System.out.println("2 - Mostrar Usuarios ");
        System.out.println("3 - Deletar Arquivo ");
        System.out.println("4 - Sair ");
        System.out.println(" Escolha a opção desejada: ");
    }

    public static void cadastro(File arquivo){

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        menu();
        int comando = scan.nextInt();

        if (comando == 1){
//            chamar função cadastro
        }
        else if(comando == 2){
//            chamar função mostrar arquivos
        }
        else if(comando ==3){
//            chamar função deletar arquivos
        }
        else if(comando == 4){
            System.out.println("Obrigado e até logo!");
//            encerrar programa.
        }
        else {
            System.out.println("Comando inválido");
        }
    }
}
