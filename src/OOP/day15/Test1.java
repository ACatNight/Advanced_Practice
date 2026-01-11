package OOP.day15;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Test1 extends JFrame  {
    static void main() {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("事件练习");
        jFrame.setDefaultCloseOperation(3);
        jFrame.setLayout(null);
        jFrame.setSize(300,300);
         //创建一个按钮对象
        JButton jtb = new JButton("点我");
        //设置位置和宽高
        jtb.setBounds(0,0,50,50);
        //jtb组件对象 表示你要给哪个组件添加事件
        //addActionListener 表示我要给组件添加哪个事件监听
        //参数 表示事件被触发之后要执行的代码
        jtb.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("执行了指令");
            }
        });
        jFrame.getContentPane().add(jtb);


        jFrame.setVisible(true);


    }
}
