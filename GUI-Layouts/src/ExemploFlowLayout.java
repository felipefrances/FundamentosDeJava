
    import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
    public class ExemploFlowLayout {
        public static void main(String[] args) {
            JFrame frame = new JFrame("Flow Layout Example");
            JPanel panel = new JPanel();

            JLabel lname = new JLabel("Nome: ");
            JTextField tfname = new JTextField(20);
            JLabel lage = new JLabel("Idade: ");
            JTextField tfage = new JTextField(20);
            JButton btnMessage = new JButton("Clique Aqui");
            JLabel output = new JLabel();

            panel.setLayout(new FlowLayout());
            panel.add(lname);
            panel.add(tfname);
            panel.add(lage);
            panel.add(tfage);
            panel.add(btnMessage);
            panel.add(output);
            frame.getContentPane().add(panel);

            btnMessage.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (Double.parseDouble(tfage.getText()) >= 18) {
                        output.setText(tfname.getText() + ", você é maior de idade");
                    } else {
                        output.setText(tfname.getText() + ", você é menor de idade");
                    }
                }
            });

            frame.setSize(300, 300);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
