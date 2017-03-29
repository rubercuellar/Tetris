import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Ruber Cuellar on 3/29/2017.
 */
public class MainScreen extends JPanel {


    public MainScreen() {
        super();
        initComponents();

    }

    private void initComponents() {
        Fondo bg = new Fondo();
        setLayout(null);
        setBorder(bg);
        ImageIcon playgame = new ImageIcon("C:\\codewars\\Tetris\\Images\\playgame.jpg");
        ImageIcon exitgame = new ImageIcon("C:\\codewars\\Tetris\\Images\\exitgame.jpg");
        JButton btnPlayGame = new JButton(playgame);
        final JButton btnExitGame = new JButton(exitgame);
        btnExitGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnExitGameActionPerformed(e);
            }
        });

        btnPlayGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnPlayGameActionPerformed(e);
            }
        });

        btnPlayGame.setBounds(400, 390, playgame.getIconWidth(), playgame.getIconHeight());
        btnExitGame.setBounds(405, 390 + playgame.getIconHeight(), exitgame.getIconWidth(), exitgame.getIconHeight());
        add(btnPlayGame);
        add(btnExitGame);

    }

    private void btnPlayGameActionPerformed(ActionEvent e) {


    }


    private void btnExitGameActionPerformed(ActionEvent e) {
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Would you like to close the window?","Confirmation", dialogButton);
        if(dialogResult == 0) {
            System.exit(0);
        } else {
            System.out.println("No Option");
        }

    }


}
