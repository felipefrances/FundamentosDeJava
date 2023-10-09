import javax.swing.*;
public class HelloWorldGUI_Swing {
    public static void main(String[] args) {
        JFrame screen = new JFrame("Olá Mundo!");
        JLabel msg = new JLabel("Essa é minha primeira GUI");
        screen.setLayout(null);
        screen.getContentPane().add(msg);
        msg.setBounds(30, 20, 200, 20);
        screen.setSize(300, 100);
        screen.setVisible(true);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}