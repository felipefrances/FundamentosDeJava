//Elementos de uma GUI
//        ● Componentes
//            ○ Elementos desenhados na tela.
//            ○ Ex: botão, label, etc.
//        ● Containers
//            ○ Elementos que servem como agrupadores lógicos para componentes.
//            ○ Ex: Panel.
//        ● Container de alto nível
//            ○ Telas de primeira classe, que efetivamente ocupam um espaço no desktop.
//            ○ Ex: Frame, DialogBox.
//
//        AWT e Swing
//        ● Abstract Windowing Toolkit
//            ○ Cria um conjunto de classes e métodos que possam ser usados para escrever uma GUI multiplataforma
//            ○ Biblioteca limitada
//        ● Swing
//            ○ Biblioteca que permite utilizar componentes mais flexíveis.
//            ○ Possui compatibilidade retroativa com o AWT
//            ○ Pode ser enviado com as aplicações e não é dependente da máquina
//
//        Classe Frame da AWT
//        ● Container que herda a classe java.awt.Frame
//        ● Funciona como uma janela principal em que os componentes (rótulos, botões, labels, etc)
//        são adicionados para criar a GUI
//        ● O JFrame possui a opção de ocultar ou fechar a janela por meio do método:
//        ○ setDefaultCloseOperation(int);
//
//        Classe JLabel do Swing
//        ● É um componente para inserir texto em um determinado container
//        ● Exibe uma única linha de texto como leitura
//        ● É possível alterar o texto (por meio do método setText)
//        ○ O usuário não pode editá-lo diretamente
//
//        Containers
//        ● Descendentes da classe java.awt.Container
//        ● Componentes que podem conter outros componentes
//        ● Utiliza-se um layout manager para posicionar e definir o tamanho dos componentes contidos neles
//        ● Componentes são adicionados a um container usando as várias formas do método add
//
//        Containers Top-level
//        ● Todo programa que usa uma GUI Swing tem pelo menos um container de alto nível (top-level)
//        ● Um container top-level provê o suporte que os componentes swing necessitam para realizar o desenho da tela e
//        o tratamento de eventos.
//        ● O Swing fornece três containers top-level
//        ○ JFrame (Janela principal)
//        ○ JDialog (Janela secundária)
//        ○ JApplet (Um applet mostra uma área desenhada dentro de um navegador internet)
//
//        Para aparecer na tela, todo componente GUI deve ser parte de uma hierarquia de contenção, cuja raiz é um
//        container top-level.
//        ● Todo container top-level tem um contentpane que contém todos os componentes visíveis dentro da interface
//daquele container top-level.
//
//        Content Pane
//        ● Todo container top-level contém indiretamente um container intermediário denominado content pane
//        ● Este contentpane contém todos os componentes visíveis na GUI da janela
//        ● Os containers são adicionados ao contentpane usando um dos vários tipos de métodos add
//        ● Exemplo
//        frame = new JFrame(...);
//        label = new JLabel(...);
//        frame.getContentPane().add(label, BorderLayout.CENTER);
//
//        JFrame do Swing
//        ● Um frame, implementado como uma instância da classe JFrame, é uma janela que tem acessórios tais como borda,
//        título e botões para fechar e minimizá-la
//        ● Estes acessórios são totalmente dependentes de plataforma
//        ● As aplicações com uma GUI tipicamente usam ao menos um frame
//
//        Layout Manager
//        ○ Gerencia todas as características dos componentes
//        ○ Utilizam designs padronizados
//        ○ É possível utilizar diversos designs combinados para realizar qualquer tela que desejamos
//        ○ Mais utilizados pela plataforma Java:
//            ■ BorderLayout
//            ■ BoxLayout
//            ■ FlowLayout
//            ■ GridLayout
//
//        Gerenciando Layouts
//        ● Quando utiliza-se o método add para acrescentar um componente em um container
//        ○ Chamadas possíveis
//            ■ Usando a posição relativa (BorderLayout)
//            ■ Ordem de adição (BoxLayout, GridLayout, ...)
//            container.add(componente, BorderLayout.CENTER);
//            container.add(componente);
//
//        Classe JPanel do Swing
//        ● O JPanel é um container genérico e visual, podendo ser utilizado em cooperação com o controle de layouts
//        ● O construtor padrão cria um objeto JPanel com FlowLayout, entretanto, os diferentes layouts podem
//        ser especificados durante a construção ou por meio do método setLayout()
//
//        BorderLayout
//        ● Contêiner é dividido em 5 regiões:
//            ○ NORTH – SOUTH – EAST – WEST – CENTER
//        ● NORTH e SOUTH
//            ○ Expandem para toda largura e tem uma altura padrão
//        ● WEST e EAST
//            ○ Expandem para preencher a região vertical e usam uma largura padrão
//        ● CENTER
//            ○ Utiliza espaço que não foi ocupado pelos demais
//
//        FlowLayout
//        ● Trata o contêiner como uma “página” ou um “parágrafo” da esquerda para a direita e de cima para baixo
//        ● Os componentes são posicionados com base na ordem em que foram adicionados
//        ● Se a linha for muito grande, os componentes vão para linha de baixo
//
//        BoxLayout
//        ● Alinha os componentes no contêiner em uma única linha ou coluna
//        ● Melhor maneira de utilizar o BoxLayout
//            ○ Box.createHorizontalBox();
//            ○ Box.createVerticalBox();
//
//
//        Classe JTextField
//        ● JTextField: É um componente de texto que permite a edição de um texto em uma única linha
//        ● Pode-se passar um string como argumento em sua instância para iniciar com um texto específico
//        JTextField BOX = new JTextField(“Example”);
//
//        Classe JButton
//        ● JButton: cria um objeto botão
//        ● Irá disparar um evento pelo clique por meio do método addActionListener()
//        ● O new ActionListener() define uma nova ação toda vez que o botão é acionado
//        ● O método actionPerformed(ActionEvent e) captura a ação do botão e efetua a execução código associado ao botão
//
//
//        Formulário
//        ○ Parte principal de uma interface gráfica
//        ○ É definido a partir do JFrame
//        ○ Para isso, a classe herda da classe JFrame
//
//        Caixa de Seleção
//        ● Este componente utiliza o método JCheckButton()
//        ● A finalidade é definir um conjunto de opções em que uma ou mais caixas podem ser selecionadas simultaneamentE
//
//        ● Primeiro deve-se definir as variáveis do tipo JCheckBox()
//
//                JCheckBox arCond; //ar condicionado
//                JCheckBox dirhidr; //direcao hidraulica
//                JCheckBox pinMet; //pintura metalica
//                JCheckBox sistMid; //sistema de midia
//                JCheckBox autom; //cambio automatico
//                JCheckBox camera; //camera de re
//
//
//                ● É estabelecido os preços de cada opção:
//                long total = 0;
//                long varc = 1500;
//                long vdir = 520;
//                long vpin = 900;
//                long vsismid = 1200;
//                long vautom = 2000;
//                long vcam = 700;
//
//
//
//                Classe JPasswordField
//                ● Componente especializado para entrada de dados de senha
//                ● Permite edição em uma única linha
//                ● Omite o valor de entrada digitada pelo usuário
//
//
//                Classe JComboBox
//                ● É utilizado para apresentar um popup de opções
//                ● A escolha do usuário aparece no topo do menu
//                ● O argumento consiste em um array de elementos
//
//                Classe JTextArea
//                ● É uma região de diversas linhas que exibe o texto e é
//                utilizado para edição de texto de múltiplas linhas
//                ● Pode-se ser passado como argumento uma string para
//                apresentar o tela inicial
//
//public class AAATeoriaGUILayouts {
//}
