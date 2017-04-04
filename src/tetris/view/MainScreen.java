package tetris.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import tetris.controller.MainScreenController;

/**
 * Created by Ruber Cuellar on 3/29/2017.
 */
public class MainScreen extends JPanel {

  /**
   * Constructor.
   */
  MainScreen() {
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
      public void actionPerformed(ActionEvent event) {
        MainScreenController.btnExitGameActionPerformed();
      }
    });

    btnPlayGame.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent event) {
        MainScreenController.btnPlayGameActionPerformed(event);
      }
    });

    btnPlayGame.setBounds((WIDTH - ((WIDTH / 2) - (playgame.getIconWidth()))),
        390, playgame.getIconWidth(), playgame.getIconHeight());
    btnExitGame.setBounds((WIDTH - ((WIDTH / 2) - (exitgame.getIconWidth()))) + 15,
        390 + playgame.getIconHeight(), exitgame.getIconWidth(), exitgame.getIconHeight());
    add(btnPlayGame);
    add(btnExitGame);

  }




}
