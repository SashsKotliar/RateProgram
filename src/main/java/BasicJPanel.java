import javax.swing.*;
import java.awt.*;

public class BasicJPanel extends JPanel {
    int counter = 0;

    public BasicJPanel(int x, int y, int w, int h, Color color){
        this.setBounds(x,y,w,h);
        this.setBackground(color);
        System.out.println(counter);
        setCounter();
        System.out.println(counter);
        init();
    }
    public void init(){
        this.setLayout(null);
        this.setDoubleBuffered(true);
        this.setVisible(true);
    }


    public void setCounter() {
        this.counter++;
    }
}
