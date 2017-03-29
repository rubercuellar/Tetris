import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by Ruber Cuellar on 3/29/2017.
 */
public class Fondo implements Border {
    ImageIcon i;
            public Fondo() {
                super();
                i = new ImageIcon("C:\\codewars\\Tetris\\Images\\Main.png");
            }
    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawImage(i.getImage(), 0, 0, c.getWidth(), c.getHeight(), c);

    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(0, 0, 0, 0);
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }


}
