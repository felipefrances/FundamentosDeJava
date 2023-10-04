import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.*;

public class ExemploGridLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid Layout Example");
        JPanel panel = new JPanel();
        JButton btnFIRST = new JButton("FIRST");
        JButton btnSECOND = new JButton("SECOND");
        JButton btnTHIRD = new JButton("THIRD");
        JButton btnFOURTH = new JButton("FOURTH");
        JButton btnFIFTH = new JButton("FIFTH");
        JButton btnSIXTH = new JButton("SIXTH");
        JButton btnSEVENTH = new JButton("SEVENTH");
        JButton btnEIGHTH = new JButton("EIGHT");
        JButton btnNINTH = new JButton("NINTH");
        panel.setLayout(new GridLayout(3, 3));
        panel.add(btnFIRST);
        panel.add(btnSECOND);
        panel.add(btnTHIRD);
        panel.add(btnFOURTH);
        panel.add(btnFIFTH);
        panel.add(btnSIXTH);
        panel.add(btnSEVENTH);
        panel.add(btnEIGHTH);
        panel.add(btnNINTH);
        frame.getContentPane().add(panel);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });
frame.setSize(400,400);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);

    }
}