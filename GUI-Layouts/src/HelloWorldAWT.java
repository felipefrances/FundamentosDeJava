import java.awt.*;
public class HelloWorldAWT {
    public static void main(String[] args) {
        Frame frame = new Frame("Olá Mundo");
        Label msg = new Label("Minha Primeira GUI com AWT");
        frame.add(msg);
        msg.setBounds(30, 50, 200, 30);
        frame.setSize(300, 150);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}