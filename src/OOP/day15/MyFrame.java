package OOP.day15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyFrame extends JFrame implements ActionListener {
    JButton jtb1 = new JButton("点击我");
    JButton jtb2 = new JButton("点击我");
    public void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(500,500);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(2);
        jFrame.setTitle("事件练习");
        jFrame.setAlwaysOnTop(true);

        jtb1.setBounds(0,0,70,70);
        jtb1.setBackground(Color.red);
        jtb1.addActionListener(this);

        jtb2.setBounds(100,0,70,70);
        jtb2.setBackground(Color.blue);
        jtb2.addActionListener(this);

        jFrame.getContentPane().add(jtb1);
        jFrame.getContentPane().add(jtb2);





        jFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //对当前按钮进行判断
        Object score = e.getSource();

        if (score == jtb1 ){
            jtb1.setSize(100,100);
        }else if(score == jtb2){
            Random r = new Random();
            jtb2.setLocation(r.nextInt(500),r.nextInt(500));
        }

    }
}
