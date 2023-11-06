import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AFormularioTreino {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulario");

        JLabel labelNome = new JLabel("Nome");
        JLabel labelSobrenome = new JLabel("Sobrenome");
        JLabel labelIdade = new JLabel("Idade");
        JLabel labelSexo = new JLabel("Sexo");
        JLabel labelSenha = new JLabel("Senha");

        JTextField textNome = new JTextField();
        JTextField textSobrenome = new JTextField();
        JTextField textIdade = new JTextField();

        String[] opcoesSexo = {"masculino", "feminino"};
        JComboBox<String> comboBoxSexo = new JComboBox<>(opcoesSexo);

        JPasswordField campoSenha = new JPasswordField();

        JButton buttonEnviar = new JButton("Enviar");
        JButton buttonLimpar = new JButton("Limpar");

        // JLabel para exibir a mensagem
        JLabel labelMensagem = new JLabel("Usuário criado com sucesso");
        labelMensagem.setForeground(Color.GREEN); // Define a cor do texto para verde
        labelMensagem.setVisible(false); // Inicialmente invisível

        frame.setLayout(new GridLayout(7, 2)); // Agora com 7 linhas para incluir o JLabel

        frame.getContentPane().add(labelNome);
        frame.add(textNome);
        frame.add(labelSobrenome);
        frame.add(textSobrenome);
        frame.add(labelIdade);
        frame.add(textIdade);
        frame.add(labelSexo);
        frame.add(comboBoxSexo);
        frame.add(labelSenha);
        frame.add(campoSenha);
        frame.add(buttonEnviar);
        frame.add(buttonLimpar);
        frame.add(labelMensagem); // Adiciona o JLabel para exibir a mensagem

        buttonEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = textNome.getText();
                String sobrenome = textSobrenome.getText();
                int idade = Integer.parseInt(textIdade.getText());
                String sexo = (String) comboBoxSexo.getSelectedItem();
                char[] senha = campoSenha.getPassword();
                String senhaString = new String(senha);

                System.out.println("Nome: " + nome);
                System.out.println("Sobrenome: " + sobrenome);
                System.out.println("Idade: " + idade);
                System.out.println("Sexo: " + sexo);
                System.out.println("Senha: " + senhaString);

                // Exibe a mensagem de sucesso
                labelMensagem.setVisible(true);
            }
        });

        buttonLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textNome.setText("");
                textSobrenome.setText("");
                textIdade.setText("");
                comboBoxSexo.setSelectedIndex(0);
                campoSenha.setText("");
                labelMensagem.setVisible(false); // Oculta a mensagem ao limpar os campos
            }
        });

        frame.setSize(250, 350); // Aumentei a altura para acomodar o JLabel
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
