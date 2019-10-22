import javax.swing.*;
import java.awt.*;

public class GUI8_ImageIcon {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        ImageIcon iiPng = new ImageIcon(GUI8_ImageIcon.class.getResource("img/youtube.png"));
        ImageIcon iiPng_edit = new ImageIcon
                (iiPng.getImage().getScaledInstance
                        (iiPng.getIconWidth()/10, iiPng.getIconHeight()/10, Image.SCALE_DEFAULT));
        JLabel lbII = new JLabel(iiPng_edit);

        panel.add(lbII);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
    }
}
