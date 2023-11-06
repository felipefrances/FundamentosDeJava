//O que são Exceções?
//        ● É uma indicação de um problema que ocorre durante a execução de um programa
//        ● O tratamento de exceções é um mecanismo poderoso que torna o código legível e robusto a falhas durante o
//        fluxo da execução
//        ● Dá-se o nome de “exceção” pois houve alguma condição anormal ao longo da execução
//
//        Existem basicamente dois tipos de exceções no Java:
//        ○ Checked (Verificada)
//        As classes herdam diretamente da classe Throwable (exceto o RuntimeExpection e Error)
//        ○ Unchecked (Não Verificada)
//        As classes que herdam de RuntimeExpection
//        ● Um erro é considerado uma exceção não verificada
//        (Unchecked)
//        Errors - Irrecuperáveis.
//
//        Razões comuns para ocorrer exceções
//        ○ Pelo usuário
//            ■ Divisão por zero (ArithmeticException)
//            ■ Caracteres inválidos
//        ○ Pelo código
//            ■ Senha de acesso ao banco de dados errado
//            ■ Tentar abrir um arquivo inexistente
//            ■ Manipulação de variável com valor nulo (sem referência) (NullPointerException)
//
//        Palavras-chaves das Exceções do Java
//        ● try: especifica um bloco onde deve-se colocar um código de exceção. O try não pode ser usado sozinho!
//        Deve ser acompanhado por catch ou finally
//        ● catch: usado para tratar a exceção. Deve ser precedido pelo try, ou seja, não é possível usá-lo isoladamente!
//        Pode ser precedido por finally
//        ● finally: é usado para executar o código necessário do programa. É executado independente de uma exceção ser
//        tratada ou não
//        ● throw: é usado para lançar uma exceção
//        ● throws: é usado para declarar exceções. Específica que pode ocorrer uma exceção no método. Não lança a exceção.
//        É usado na assinatura do método.
//


//
//
//
//
//
//        /public class TratamentodeExecoesTeoria {
//}
