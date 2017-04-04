package tetris.view;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.border.Border;

/**
 * Created by Ruber Cuellar on 3/29/2017.
 */
public class Fondo implements Border {

  private static final ImageIcon image = new ImageIcon("C:\\codewars\\Tetris\\Images\\Main.png");

  public Fondo() {
    super();
  }

  @Override
  public void paintBorder(Component component,
                          Graphics graphics, int xx, int yy, int width, int height) {
    graphics.drawImage(image.getImage(), 0, 0, component.getWidth(),
        component.getHeight(), component);

  }

  @Override
  public Insets getBorderInsets(Component component) {
    return new Insets(0, 0, 0, 0);
  }

  @Override
  public boolean isBorderOpaque() {
    return false;
  }


}
