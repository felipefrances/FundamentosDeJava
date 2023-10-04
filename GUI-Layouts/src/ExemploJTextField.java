import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploJTextField {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo JText Field");
        JPanel panel = new JPanel();
        JPanel buttonpanel = new JPanel();

        JLabel primeiroNome = new JLabel("Primeiro Nome: ");
        JLabel sobrenome = new JLabel("Sobrenome: ");
        JLabel idade = new JLabel("Idade: ");
        JLabel resultado = new JLabel();

        JTextField primeiroNomeTf = new JTextField();
        JTextField sobrenomeTf = new JTextField();
        JTextField idadeTf = new JTextField();


        JButton limpar = new JButton("Limpar");
        JButton enviar = new JButton("Enviar");

        buttonpanel.add(limpar);
        buttonpanel.add(enviar);


        buttonpanel.setLayout(new GridLayout(1, 2));
        panel.setLayout(new GridLayout(8, 1));

        panel.add(primeiroNome);
        panel.add(primeiroNomeTf);
        panel.add(sobrenome);
        panel.add(sobrenomeTf);
        panel.add(idade);
        panel.add(idadeTf);
        panel.add(buttonpanel);
        panel.add(resultado);

        frame.add(panel);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        limpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                primeiroNomeTf.setText("");
                sobrenomeTf.setText("");
                idadeTf.setText("");
            }
        });

        enviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setText(primeiroNomeTf.getText() + " " + sobrenomeTf.getText() + " " + idadeTf.getText());
            }
        });



    }
}
