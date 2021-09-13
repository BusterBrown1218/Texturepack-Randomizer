import javax.swing.*;

public class GUI {
    public GUI() {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        label.setText("Operation done!");
        panel.add(label);
        frame.setSize(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
    }
}
