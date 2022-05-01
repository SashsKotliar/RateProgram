import javax.swing.*;
import java.awt.*;



public class PanelMainScreen extends BasicJPanel {

    public PanelMainScreen() {
        super(0, 0, Constants.MAIN_WINDOW_W, Constants.MAIN_WINDOW_H, null);
        myTitle();
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
    public void myTitle() {
        JLabel title = new JLabel("Exchange options: ", SwingConstants.CENTER);
        title.setFont(new Font("ariel", Font.BOLD, 35));
        title.setForeground(Color.BLACK);
        title.setBounds(0, Constants.TITLE_Y, Constants.MAIN_WINDOW_W, Constants.TITLE_H);
        this.add(title);
    }
}