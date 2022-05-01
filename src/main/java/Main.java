import javax.swing.*;
import java.awt.*;
import java.util.function.Supplier;

public class Main extends BasicWindow {

    private PanelMainScreen mainScreen;

    public static void main(String[] args) {
        Main start = new Main();

    }

    public Main() {
        super(Constants.MAIN_WINDOW_W,Constants.MAIN_WINDOW_H);
        init();
    }

    public void init(){
        this.mainScreen=new PanelMainScreen();
        this.add(mainScreen);
        myBottoms();
        mainBottomsOption(mainScreen.buttonX(), 450, 150, 100, mainScreen.buttonS(),
                Color.orange, Color.BLACK, PanelMainScreen::new);

        this.setVisible(true);
    }



    public void myBottoms() {
       int y = Constants.BUTTON1_Y;
       int x;
       for (int i = 0; i < 8; i++){
           if (i == 6){
               x = Constants.BUTTON1_X + Constants.BUTTON_W;
           } else if (i==7){
               x = Constants.BUTTON1_X + 3*Constants.BUTTON_W/2;
           } else {
               x = Constants.BUTTON1_X;
           }
           for (int j = 0; j < 6; j++){
               this.mainBottomsOption(x, y, Constants.BUTTON_W, Constants.BUTTON_H, "$", Color.BLACK,
                       Color.orange, null);
               x += Constants.BUTTON_W;
               if ((i==6&&j==3) || (i==7&&j==2)){
                   break;
               }
           }
           y += Constants.BUTTON_H;
       }
    }



    public void mainBottomsOption(int x, int y, int w, int h, String s, Color foregroundColor,
                                  Color backgroundColor, Supplier<JPanel> supplier) {
        Button button = new Button();
        button.setLabel(s);
        button.setFont(Constants.FONT1);
        button.setBounds(x, y, w, h);
        button.setForeground(foregroundColor);
        button.setBackground(backgroundColor);
        button.addActionListener(e -> {
            JPanel panel = supplier.get();
            panel.setVisible(true);
            this.setVisible(false);
        });
        this.mainScreen.add(button);
    }


}
