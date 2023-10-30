import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinhaInterfaceGrafica {
    public static void main(String[] args) {
        // Cria um JFrame
        JFrame frame = new JFrame("Minha Interface Gráfica");

        // Cria um JLabel
        JLabel label = new JLabel("Olá, Mundo!");

        // Adiciona o rótulo ao conteúdo do JFrame
        frame.getContentPane().add(label);

        // Cria um JTextField
        JTextField textField = new JTextField(10); // O "10" define o tamanho inicial do campo de texto

        // Adiciona o campo de texto ao conteúdo do JFrame
        frame.getContentPane().add(textField);

        // Cria um JButton
        JButton button = new JButton("Clique Aqui");

        // Adiciona um ActionListener para responder ao clique do botão
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String textoDigitado = textField.getText(); // Obtém o texto do campo de texto
                JOptionPane.showMessageDialog(null, "Você digitou: " + textoDigitado);
            }
        });

        // Adiciona o botão ao conteúdo do JFrame
        frame.getContentPane().add(button);

        // Configura o tamanho e o comportamento de fechamento
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Configura o layout para organizar os componentes
        frame.setLayout(new java.awt.FlowLayout());

        // Torna a janela visível
        frame.setVisible(true);
    }
}
