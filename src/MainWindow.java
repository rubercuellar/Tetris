
import javax.swing.*;
import java.awt.*;

/**
 * Created by YVayneR on 3/27/2017.
 */
public class MainWindow {
    public static JFrame jframe;
    private static final String WINDOWS_TITLE = "Tetris Battle";
    private static final int WIDTH = 1204;
    private static final int HEIGHT = 768;
    private static JPanel pan;

    public MainWindow(){
        jframe = new JFrame();
        jframe.setTitle(WINDOWS_TITLE);
        jframe.setSize(WIDTH, HEIGHT);

        MainScreen aux = new MainScreen();
        jframe.setContentPane(aux);
        jframe.setVisible(true);
        jframe.setResizable(false);
    }

    public static void setContent(StartGame panel) {
        jframe.setContentPane(panel);
        jframe.repaint();
    }

}


