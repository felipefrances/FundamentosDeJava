//SUB-ROTINAS
//
// Vantagens das Sub-rotinas
//        ● Facilita a estruturação e reutilização do código
//        ○ Programação estruturada: programas extensos e complexos podem ser divididos em pequenos blocos (modularização)
//        ○ Reutilização: as sub-rotinas evitam a cópia desnecessária de trechos de códigos que realizam a mesma tarefa
//        ○ Menos erros: as sub-rotinas lidam com um problema específico, o que diminui a chance de ocorrência de erros
//Ao executar uma sub-rotina, o programa que a chamou é pausado até que a sub-rotina termine a sua execução
//Uma sub-rotina em Java pode ser interna ou externa:
//        ○ Interna: quando faz parte dos recursos internos do compilador (estão dentro dos pacotes)
//        ○ Externa: quando é desenvolvido e implementado pelos usuários da linguagem (programadores),
//        em que pode ser associado diretamente ou indiretamente no programa
//
//Escopo
//        ○ Variáveis locais são aqueles que só tem validade dentro do bloco no qual são declaradas
//
//        Parâmetros formais são declarados como sendo as entradas de uma sub-rotina
//        ○ Os parâmetros formais são variáveis locais da sub-rotina
//
//        Variáveis globais são declaradas fora as todas as sub-rotinas do programa
//                ○ Estas variáveis são conhecidas e podem ser alteradas por todas as sub-rotinas do programa
//                    ■ Quando uma sub-rotina tem um variável local com o mesmo nome de uma variável global,
//                a sub-rotina dará preferência a variável local

//Normalmente evita-se realizar operações de leitura e
//        escrita dentro das sub-rotinas:
//        ○ Uma sub-rotina é construída com o intuito de realizar uma
//        tarefa específica e bem-definida
//        ○ As operações de entrada e saída de dados devem ser
//        feitas em quem chamou a função
//        ○ Assim a sub-rotina pode ser genérica o suficiente para
//        ser utilizadas em diversos outras aplicações
//
//PACOTES
//
//        Pacotes são um conjunto de recursos predefinidos existentes
//        em um local para serem utilizados pelos
//        programadores/desenvolvedores
//        ● Estes recursos podem ser usados a partir do comando import
//        e o nome do pacote
//
//public class SubRotinas {
//}
