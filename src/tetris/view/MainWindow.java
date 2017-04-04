package tetris.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Created by YVayneR on 3/27/2017.
 */
public class MainWindow extends JFrame {
  public static MainWindow jframe;
  private static final String WINDOWS_TITLE = "Tetris Battle";
  public static final int WIDTH = 1204;
  public static final int HEIGHT = 768;
  private static JPanel pan;
  public MainScreen fondo;
  public static MainWindow instance;

  /**
   * Constructor.
   */
  public MainWindow() {
    super();
    setTitle(WINDOWS_TITLE);
    setSize(WIDTH, HEIGHT);
    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

    fondo = new MainScreen();
    setContentPane(fondo);
    setResizable(false);
    setVisible(true);
  }

  public void setContent(StartGame panel) {
    setContentPane(panel);
    repaint();
  }

  public void setInstance(MainWindow instance) {
    this.instance = instance;
  }

  /**
   * To get instance.
   * @return MainWindow
   */
  public static MainWindow getInstance() {
    if (jframe == null) {
      jframe = new MainWindow();
    }
    return jframe;

  }
}


