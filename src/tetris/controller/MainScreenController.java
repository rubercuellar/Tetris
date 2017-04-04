package tetris.controller;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import tetris.view.MainWindow;
import tetris.view.StartGame;

/**
 * Created by Ruber Cuellar on 4/3/2017.
 */
public class MainScreenController {

  /**
   * Constructor.
   */
  private MainScreenController() {
  }

  public static void btnPlayGameActionPerformed(ActionEvent event) {
    MainWindow.getInstance().setContent(new StartGame());
  }

  /**
   * Button to exit.
   */
  public static void btnExitGameActionPerformed() {
    int dialogButton = JOptionPane.YES_NO_OPTION;
    int dialogResult = JOptionPane.showConfirmDialog(null,
        "Would you like to close the window?","Confirmation", dialogButton);
    if (dialogResult == 0) {
      System.exit(0);
    } else {
      System.out.println("No Option");
    }
  }
}
