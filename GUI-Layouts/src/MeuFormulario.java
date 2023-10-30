import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeuFormulario {
    public static void main(String[] args) {
        // Cria um JFrame
        JFrame frame = new JFrame("Formulário");

        // Define o layout para um GridLayout de 4 linhas e 2 colunas
        frame.setLayout(new GridLayout(4, 2, 10, 10)); // 3 linhas, 2 colunas, espaçamento horizontal e vertical de 10 pixels

        // Cria um JLabel para nome
        JLabel labelNome = new JLabel("Nome:");

        // Cria um JTextField para o nome
        JTextField campoNome = new JTextField(20);

        // Cria um JLabel para sobrenome
        JLabel labelSobrenome = new JLabel("Sobrenome:");

        // Cria um JTextField para o sobrenome
        JTextField campoSobrenome = new JTextField(20);

        // Cria um JLabel para idade
        JLabel labelIdade = new JLabel("Idade:");

        // Cria um JTextField para a idade
        JTextField campoIdade = new JTextField(5);

        // Adiciona os componentes ao conteúdo do JFrame
        frame.add(labelNome);
        frame.add(campoNome);
        frame.add(labelSobrenome);
        frame.add(campoSobrenome);
        frame.add(labelIdade);
        frame.add(campoIdade);

        // Cria um JPanel para os botões e define o layout como GridLayout de 1 linha e 2 colunas
        JPanel panelBotoes = new JPanel(new GridLayout(1, 2, 10, 10)); // 1 linha, 2 colunas, espaçamento horizontal e vertical de 10 pixels

        // Cria um JButton para enviar
        JButton botaoEnviar = new JButton("Enviar Formulário");

        // Adiciona um ActionListener para responder ao clique do botão enviar
        botaoEnviar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = campoNome.getText();
                String sobrenome = campoSobrenome.getText();
                int idade = Integer.parseInt(campoIdade.getText());

                // Aqui você pode fazer algo com os dados, como imprimir na tela
                System.out.println("Nome: " + nome);
                System.out.println("Sobrenome: " + sobrenome);
                System.out.println("Idade: " + idade);
            }
        });

        // Cria um JButton para limpar
        JButton botaoLimpar = new JButton("Limpar");

        // Adiciona um ActionListener para responder ao clique do botão limpar
        botaoLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                campoNome.setText(""); // Limpa o campo de texto do nome
                campoSobrenome.setText(""); // Limpa o campo de texto do sobrenome
                campoIdade.setText(""); // Limpa o campo de texto da idade
            }
        });

        // Adiciona os botões ao painel
        panelBotoes.add(botaoEnviar);
        panelBotoes.add(botaoLimpar);

        // Adiciona o painel com os botões ao JFrame
        frame.add(panelBotoes);

        // Configura o tamanho e o comportamento de fechamento
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Torna a janela visível
        frame.setVisible(true);
    }
}
