import javax.swing.*;
import java.awt.*;

public class BasicJPanel extends JPanel {

    public BasicJPanel(int x, int y, int w, int h, Color color){
        this.setBounds(x,y,w,h);
        this.setBackground(color);
        init();
    }
    public void init(){
        this.setLayout(null);
        this.setDoubleBuffered(true);
        this.setVisible(true);
    }
}
