package website;

import javax.swing.*;
import java.awt.*;
import java.lang.*;

class ACADEMICS extends JFrame {
    JPanel panel;

    ImageIcon img,picture;
    JButton B1;

    ;
    public ACADEMICS() {
        super("ACADEMICS");
        this.setSize(1080, 680);
        this.setLocation(100, 60);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("website/back.png"));
        Image i2 = i1.getImage().getScaledInstance(1080,680,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        add(img);

         panel = new JPanel();
         panel.setLayout(null);
        B1 = new JButton("ACADEMICS");
        B1.setBounds(900, 20, 100, 50);
        B1.setBackground(Color.CYAN);
        B1.setFocusable(false);

        JMenuBar mb = new JMenuBar();
        // new information
        JMenu newinfo = new JMenu("ACADEMICS");
         newinfo.setBackground(Color.BLACK);
         mb.add(newinfo);

         JMenuItem info1 = new JMenuItem("Academic calender");
         info1.setBackground(Color.white);
          newinfo.add(info1);

        JMenuItem info2 = new JMenuItem("Academic Regulations ");
        info2.setBackground(Color.white);
        newinfo.add(info2);

        JMenuItem info3 = new JMenuItem("Course catalog ");
        info3.setBackground(Color.white);
        newinfo.add(info3);

        JMenuItem info4 = new JMenuItem("Tution Fee");
        info4.setBackground(Color.white);
        newinfo.add(info4);

        JMenuItem info5 = new JMenuItem("Academic Regulations ");
        info5.setBackground(Color.white);
        newinfo.add(info5);

         setJMenuBar(mb);

        panel.add(B1);

    }
    public static void main(String[] args) {
        ACADEMICS c1 = new ACADEMICS();
        c1.setVisible(true);

    }
}


