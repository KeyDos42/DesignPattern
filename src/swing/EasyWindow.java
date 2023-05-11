package swing;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.Serial;
import javax.swing.*;

public class EasyWindow extends JFrame {
    @Serial
    private static final long serialVersionUID = 1L;
    private static final int LARGEUR = 500;
    private static final int HAUTEUR = 700;
    public static final int STATUS = 0;

    public EasyWindow() {
        super("Facile");

        JButton one = new JButton("One");
        JButton two = new JButton("Two");
        JButton three = new JButton("Three");
        JButton four = new JButton("Four");
        JButton five = new JButton("Five");
        one.setPreferredSize(new Dimension(50, 50));
        two.setPreferredSize(new Dimension(115, 33));
        three.setPreferredSize(new Dimension(115, 33));
        four.setPreferredSize(new Dimension(115, 33));
        five.setPreferredSize(new Dimension(50, 50));


        getContentPane().add(one,
                BorderLayout.NORTH);
        getContentPane().add(two,
                BorderLayout.WEST);
        getContentPane().add(three,
                BorderLayout.CENTER);
        getContentPane().add(four,
                BorderLayout.EAST);
        getContentPane().add(five,
                BorderLayout.SOUTH);

        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(STATUS);
            }
        };
        addWindowListener(l);
        setSize(LARGEUR,HAUTEUR);
        setVisible(true);
    }
    public static void main(String [] args){
        new EasyWindow();
    }
}