
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFirstForm extends JFrame {
    JLabel message;
    JPanel panel = new JPanel();

    public MyFirstForm() {
        super("Titulo do Frame");

        message = new JLabel("Meu primeiro formulário!");
        panel.setLayout(new FlowLayout());
        panel.add(message);
        add(panel);

        setSize(400, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyFirstForm form = new MyFirstForm();
    }
}
