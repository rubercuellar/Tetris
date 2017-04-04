package tetris.controller;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import tetris.view.MainScreen;
import tetris.view.MainWindow;

/**
 * Created by Ruber Cuellar on 4/3/2017.
 */
public class MainWindowController {
  MainWindow mainWin;

  /**
   * Constructor.
   */
  public MainWindowController() {
    mainWin = MainWindow.getInstance();
    mainWin.addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent event) {
        MainScreenController.btnExitGameActionPerformed();
      }
    });
  }
}
