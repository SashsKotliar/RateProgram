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
        this.setVisible(true);

    }


    public void myBottoms() {
        this.mainBottomsOption(Constants.BUTTON1_X, Constants.BUTTON1_Y, Constants.BUTTON_W, Constants.BUTTON_H,
                "EUR/USD");
        this.mainBottomsOption(Constants.BUTTON1_X, Constants.BUTTON2_Y, Constants.BUTTON_W, Constants.BUTTON_H,
                "GBP/USD");
        this.mainBottomsOption(Constants.BUTTON1_X, Constants.BUTTON3_Y, Constants.BUTTON_W, Constants.BUTTON_H,
                "USD/RUB");
        this.mainBottomsOption(Constants.BUTTON4_X, Constants.BUTTON1_Y, Constants.BUTTON_W, Constants.BUTTON_H,
                "USD/PLN");
        this.mainBottomsOption(Constants.BUTTON4_X, Constants.BUTTON2_Y, Constants.BUTTON_W, Constants.BUTTON_H,
                "USD/ILS");
        this.mainBottomsOption(Constants.BUTTON4_X, Constants.BUTTON3_Y, Constants.BUTTON_W, Constants.BUTTON_H,
                "EUR/JPY");
    }



    public void mainBottomsOption(int x, int y, int w, int h, String titleOn/*, Supplier<JFrame> supplier*/) {
        Button button = new Button(titleOn);
        button.setFont(Constants.FONT);
        button.setBounds(x, y, w, h);
        button.setForeground(Color.cyan.darker());
        button.setBackground(Color.cyan);
        button.addActionListener(e -> {
           // JFrame frame = supplier.get();
            //frame.setVisible(true);
            this.setVisible(false);
        });
        this.mainScreen.add(button);
    }

}
