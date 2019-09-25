import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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

        JPanel panelResult = new JPanel();
        JLabel lbResult = new JLabel("Result");

        cb1. setSelected(true);
        rb0.setSelected(true); //초기값 체크가 되어서 시작된다.
        tf0.setText("전화번호를 입력하세요");
        tf0.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                tf0.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (tf0.getText().equals("")) //text에 정보를 집어넣었을 경우 다른 곳에 포커스를 맞추어도 정보가 없어지면 안되는 경우를 대비함
                tf0.setText("전화번호를 입력하세요");
            }
        });
        bt0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = "";
                result += lb0.getText();
                result += bt0.getText();
                result += cb0.isSelected();
                result += cb1.isSelected();
                result += rb0.isSelected();
                result += rb1.isSelected();
                result += tf0.getText();
                result += ta0.getText();
                result += cbox0.getSelectedIndex();
                result += cbox0.getSelectedItem();
                lbResult.setText(result);
            }
        });

        ItemListener il = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getSource() == cb0) {
                    System.out.println("JCheckBox0 : " + cb0.isSelected());
                }
                else if(e.getSource() == cb1) {
                    System.out.println("JCheckBox1 : " + cb1.isSelected());
                }
                else if(e.getSource() == rb0) {
                    System.out.println("JCheckBox1 : " + rb0.isSelected());
                }
                else if(e.getSource() == rb1) {
                    System.out.println("JCheckBox1 : " + rb1.isSelected());
                }
                else if(e.getSource() == cbox0) {
                    System.out.println(cbox0.getSelectedItem());
                }
            }
        };

        cb0.addItemListener(il);
        cb1.addItemListener(il);
        rb0.addItemListener(il);
        rb1.addItemListener(il);
        cbox0.addItemListener(il);

        panel.add(lb0);
        panel.add(bt0);
        panel.add(cb0);
        panel.add(cb1);
        panel.add(rb0);
        panel.add(rb1);
        panel.add(tf0);
        panel.add(ta0);
        panel.add(cbox0);
        panel.add(lbResult);

        frame.add(panel);

        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
