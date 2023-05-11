package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.Serial;

public class ScrollExercice extends JFrame {
    @Serial
    private static final long serialVersionUID = 1L;
    private static final int LARGEUR = 500;
    private static final int HAUTEUR = 700;
    public static final int STATUS = 0;

    public ScrollExercice() {
        super("Scroll");

        final JFrame frame = new JFrame("JScrollbar Demo");

        JScrollBar scrollBarH = new JScrollBar(JScrollBar.HORIZONTAL, 30, 20, 0, 500);
        JScrollBar scrollBarV = new JScrollBar(JScrollBar.VERTICAL, 30, 40, 0, 500);

        frame.setSize(300,200);
        frame.getContentPane().add(scrollBarH, BorderLayout.SOUTH);
        frame.getContentPane().add(scrollBarV, BorderLayout.EAST);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ScrollExercice();
    }
}
