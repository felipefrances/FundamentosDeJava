import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class questao06 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulario");

        JTextField textTexto = new JTextField();
        JButton buttonEnviar = new JButton("Enviar");

        JLabel labelTexto = new JLabel("Digite o seu texto");
        JLabel labelMensagem = new JLabel();
        labelMensagem.setVisible(false);

        frame.setLayout(new GridLayout(4, 1));

        frame.getContentPane().add(labelTexto);
        frame.add(textTexto);
        frame.add(buttonEnviar);
        frame.add(labelMensagem);

        buttonEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                   labelMensagem.setText(textTexto.getText());
                labelMensagem.setVisible(true);
                }
            });

        frame.setSize(250, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
