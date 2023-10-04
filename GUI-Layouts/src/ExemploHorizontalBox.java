import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.Box;
import javax.swing.BoxLayout;

public class ExemploHorizontalBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo GridLayout");
        Box horizontalBox = Box.createHorizontalBox();
        Container contentpane = frame.getContentPane();
        JButton btnFIRST = new JButton("FIRST");
        JButton btnSECOND = new JButton("SECOND");
        JButton btnTHIRD = new JButton("THIRD");
        JButton btnFOURTH = new JButton("FOURTH");
        JButton btnFIFTH = new JButton("FIFTH");
        JButton btnSIXTH = new JButton("SIXTH");
        horizontalBox.add(btnFIRST);
        horizontalBox.add(btnSECOND);
        horizontalBox.add(btnTHIRD);
        horizontalBox.add(btnFOURTH);
        horizontalBox.add(btnFIFTH);
        horizontalBox.add(btnSIXTH);
        contentpane.add(horizontalBox, BorderLayout.NORTH);
        frame.setLayout(new BoxLayout(contentpane, BoxLayout.PAGE_AXIS));
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
