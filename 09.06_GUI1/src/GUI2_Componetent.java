import javax.swing.*;
import java.awt.*;

public class GUI2_Componetent {

    public static void main(String args[]) {

        JFrame frame = new JFrame("Components");
        JPanel panel = new JPanel();
        JLabel lb0 = new JLabel("JLabel");
        JButton bt0 = new JButton("JButton");
        JCheckBox cb0 = new JCheckBox("JCheckBox");
        JCheckBox cb1 = new JCheckBox("JCheckBox1") ;
        JRadioButton rb0 = new JRadioButton("청포도");
        JRadioButton rb1 = new JRadioButton("딸기");
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb0);
        bg.add(rb1);
        String fruit[] = {"청포도", "딸기", "오렌지", "바나나", "라임", "망고"};
        JComboBox cbox0 = new JComboBox(fruit);
        cbox0.addItem("블루베리");
        cbox0.addItem("앵두");

        JTextField tf0 = new JTextField("JTextField");
        JTextArea ta0 = new JTextArea(2, 10);

        panel.add(lb0);
        panel.add(bt0);
        panel.add(cb0);
        panel.add(cb1);
        panel.add(rb0);
        panel.add(rb1);
        panel.add(tf0);
        panel.add(ta0);
        panel.add(cbox0);

        frame.add(panel);

        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
