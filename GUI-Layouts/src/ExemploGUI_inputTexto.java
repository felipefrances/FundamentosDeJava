import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

public class ExemploGUI_inputTexto {
    public static void main(String[] args) {
        JFrame screen = new JFrame("Border Layout");
        JPanel panel = new JPanel();

        JLabel lname = new JLabel("Nome: ");
        JTextField tfname = new JTextField();
        JLabel outputmsg = new JLabel();

        panel.setLayout(new BorderLayout());
        panel.add(lname, BorderLayout.NORTH);
        panel.add(tfname, BorderLayout.CENTER);
        panel.add(outputmsg, BorderLayout.SOUTH);

        tfname.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputmsg.setText("Olá Sr. " + tfname.getText());
            }
        });
        screen.getContentPane().add(panel);
        screen.setSize(300, 300);
        screen.setVisible(true);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}