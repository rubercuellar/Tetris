
import javax.swing.*;
import java.awt.*;

/**
 * Created by YVayneR on 3/27/2017.
 */
public class MainWindow extends JFrame {
    private static final String WINDOWS_TITLE = "Tetris Battle";
    private static final int WIDTH = 1204;
    private static final int HEIGHT = 768;
    private JPanel pan;

    public MainWindow(){
        super.setTitle(WINDOWS_TITLE);
        super.setSize(WIDTH, HEIGHT);

        MainScreen aux = new MainScreen();
        super.setContentPane(aux);
        super.setVisible(true);
        super.setResizable(false);

    }

    public JPanel getPanel() {
        return pan;
    }

    public void setPanel(JPanel panel) {
        this.pan = panel;
    }


    public static void loadGame() {

    }



}


