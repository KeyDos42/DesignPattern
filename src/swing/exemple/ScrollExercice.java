package swing.exemple;

import javax.swing.*;
import java.awt.*;
import java.io.Serial;

public class ScrollExercice extends JFrame {
    @Serial
    private static final long serialVersionUID = 1L;

    public ScrollExercice() {
        super("Scroll exercice");

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
