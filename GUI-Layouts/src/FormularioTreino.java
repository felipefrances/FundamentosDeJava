import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioTreino {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulario");

        JLabel labelNome = new JLabel("Nome");
        JLabel labelSobrenome = new JLabel("Sobrenome");
        JLabel labelIdade = new JLabel("Idade");

        JTextField textNome = new JTextField();
        JTextField textSobrenome = new JTextField();
        JTextField textIdade = new JTextField();

        JButton buttonEnviar = new JButton("Enviar");
        JButton buttonLimpar = new JButton("Limpar");

        frame.setLayout(new GridLayout(4, 4));

        frame.getContentPane().add(labelNome);
        frame.add(textNome);
        frame.add(labelSobrenome);
        frame.add(textSobrenome);
        frame.add(labelIdade);
        frame.add(textIdade);
        frame.add(buttonEnviar);
        frame.add(buttonLimpar);

        buttonEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = textNome.getText();
                String sobrenome = textSobrenome.getText();
                int idade = Integer.parseInt(textIdade.getText());

                System.out.println("Nome: " + nome);
                System.out.println("Sobrenome: " + sobrenome);
                System.out.println("Idade: " + idade);

            }
        });

        buttonLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textNome.setText("");
                textSobrenome.setText("");
                textIdade.setText("");

            }
        });

        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
