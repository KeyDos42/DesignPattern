package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.Serial;
import java.util.Objects;
import java.util.Random;

public class Morpion extends JFrame {
    @Serial
    private static final long serialVersionUID = 1L;
    private static final int LARGEUR = 500;
    private static final int HAUTEUR = 700;
    public static final int STATUS = 0;

    public Morpion() {
        super("Jeu du morpion");

        ImageIcon x = new ImageIcon("C:\\Users\\Thoma\\IdeaProjects\\DesignPattern\\src\\swing\\picture\\croix.png");
        ImageIcon o = new ImageIcon("C:\\Users\\Thoma\\IdeaProjects\\DesignPattern\\src\\swing\\picture\\rond.png");
        ImageIcon xResizeIcon = new ImageIcon(x.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH));
        ImageIcon oResizeIcon = new ImageIcon(o.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH));

        JPanel north = new JPanel();
        JPanel center = new JPanel();
        JPanel south = new JPanel();
        JLabel label;

        north.setLayout (new GridLayout(1, 3 ));
        center.setLayout(new GridLayout(1, 3));
        south.setLayout(new GridLayout(1, 3));

        Random r = new Random();
        int low = 1;
        int high = 3;
        int result;

        for (int i=0; i<9; i++) {
            result = r.nextInt(high-low) + low;

            if (Objects.equals(result, 1)) {
                label = new JLabel(xResizeIcon);
            } else {
                label = new JLabel(oResizeIcon);
            }

            if (i < 3) {
                north.add(label);
            } else if (i < 6) {
                center.add(label);
            } else {
                south.add(label);
            }
        }

        getContentPane().add(north,
                BorderLayout.NORTH);
        getContentPane().add(center,
                BorderLayout.CENTER);
        getContentPane().add(south,
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

    public static void main(String[] args) {
        new Morpion();
    }
}
