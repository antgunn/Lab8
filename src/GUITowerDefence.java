import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.*;

public class GUITowerDefence extends JFrame {

  private TowerDefenceLevel level;

  private final Timer timer;
  private static final int SPEED = 1000;
  private static final int PAUSE = 3000;
  private static final int POSITION_SIZE = 100; // The size of each position panel

  private final Map<Position, JPanel> positionPanels = new HashMap<>(); // A map that assigns a panel to each position in the game

  public GUITowerDefence(TowerDefenceLevel level) {
    this.setTitle("Tower Defence");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.level = level;
    int levelHeight = level.getHeight();
    int levelWidth = level.getWidth();

    this.setSize(levelWidth*POSITION_SIZE, levelHeight*POSITION_SIZE);
    this.setResizable(false);

    // A 'main panel' that contains all other components of the GUI
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new GridLayout(levelHeight, levelWidth));
    this.add(mainPanel);

    for (int row = 0; row < levelHeight; row++) {
      for (int col = 0; col < levelWidth; col++) {
        JPanel positionPanel = new JPanel();
        positionPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        mainPanel.add(positionPanel);

        // Add the panel to the 'positionPanels' map so we can access it
        // later (with positionPanels.get(position)).
        Position position = level.getPosition(row, col);
        positionPanels.put(position, positionPanel);
      }
    }

    // Start the timer and set it to call the event loop each second
    EventLoop loop = new EventLoop();
    timer = new Timer(SPEED, loop);
    timer.setInitialDelay(PAUSE);
    timer.start();

  }

  // ---------- Event handling --------------------

  class EventLoop implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {

      // Here you can implement the logic to advance the game by one step
      // and update the GUI.






      boolean gameOver = false; // TODO

      if (gameOver) {
        setTitle("Game over!");
        timer.stop();
      }
      revalidate();
      repaint();
    }
  }

  // ----------- Helper methods ---------------------

  // Helper method to construct a JLabel with a given image
  private JLabel getIconLabel(String fileName) {
    URL url = this.getClass().getResource(fileName);
    ImageIcon ii = new ImageIcon(url);
    return new JLabel(ii);
  }

  // Just some examples, you can change them however you like.
  private JLabel buildTowerLabel() {
    return getIconLabel("icons/tower-icon.png");
  }

  private JPanel buildMonsterPanel(int monsterHealth) {
    JPanel panel = new JPanel();
    panel.setBackground(Color.WHITE);
    panel.setLayout(new BorderLayout());

    JLabel monsterIcon = getIconLabel("icons/monster10.gif");
    panel.add(monsterIcon, BorderLayout.CENTER);

    JLabel healthLabel = new JLabel(Integer.toString(monsterHealth));
    healthLabel.setFont(new Font("Serif", Font.BOLD, 10));
    panel.add(healthLabel, BorderLayout.SOUTH);

    return panel;
  }

  public static void main(String[] args) {

    // Change this to try out different levels
    TowerDefenceLevel level = TowerDefenceLevel.buildSimpleLevel();

    // Create the GUI and set it to be visible
    GUITowerDefence gui = new GUITowerDefence(level);
    gui.setVisible(true);

  }

}
