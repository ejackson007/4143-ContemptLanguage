package matchingGame;

import javax.swing.*;
import java.awt.event.*;

import java.awt.Component;
import java.awt.FlowLayout;

public class matchingMain {
    public static void main(String args[]){
        JFrame frame = new JFrame("Matching Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550,550);

       JButton button1 = new JButton("Reveal");
       JButton button2 = new JButton("Reveal");
       JButton button3 = new JButton("Reveal");
       JButton button4 = new JButton("Reveal");
       JButton button5 = new JButton("Reveal");
       JButton button6 = new JButton("Reveal");
       //create checks for if the button has been revealed
       boolean[] pressed1 = {false};
       boolean[] pressed2 = {false};
       boolean[] pressed3 = {false};
       boolean[] pressed4 = {false};
       boolean[] pressed5 = {false};
       boolean[] pressed6 = {false};

       JPanel panel1 = new JPanel();
       JPanel panel2 = new JPanel();
       JPanel panel3 = new JPanel();
       JPanel panel4 = new JPanel();
       JPanel panel5 = new JPanel();
       JPanel panel6 = new JPanel();

       panel1.setBorder(BorderFactory.createTitledBorder("Card 1"));
       panel2.setBorder(BorderFactory.createTitledBorder("Card 2"));
       panel3.setBorder(BorderFactory.createTitledBorder("Card 3"));
       panel4.setBorder(BorderFactory.createTitledBorder("Card 4"));
       panel5.setBorder(BorderFactory.createTitledBorder("Card 5"));
       panel6.setBorder(BorderFactory.createTitledBorder("Card 6"));

       BoxLayout layout1 = new BoxLayout(panel1, BoxLayout.Y_AXIS);
       BoxLayout layout2 = new BoxLayout(panel2, BoxLayout.Y_AXIS);
       BoxLayout layout3 = new BoxLayout(panel3, BoxLayout.Y_AXIS);
       BoxLayout layout4 = new BoxLayout(panel4, BoxLayout.Y_AXIS);
       BoxLayout layout5 = new BoxLayout(panel5, BoxLayout.Y_AXIS);
       BoxLayout layout6 = new BoxLayout(panel6, BoxLayout.Y_AXIS);
       panel1.setLayout(layout1);
       panel2.setLayout(layout2);
       panel3.setLayout(layout3);
       panel4.setLayout(layout4);
       panel5.setLayout(layout5);
       panel6.setLayout(layout6);

       button1.setAlignmentX(Component.LEFT_ALIGNMENT);
       panel1.add(button1);
       button2.setAlignmentX(Component.LEFT_ALIGNMENT);
       panel2.add(button2);
       button3.setAlignmentX(Component.LEFT_ALIGNMENT);
       panel3.add(button3);
       button4.setAlignmentX(Component.LEFT_ALIGNMENT);
       panel4.add(button4);
       button5.setAlignmentX(Component.LEFT_ALIGNMENT);
       panel5.add(button5);
       button6.setAlignmentX(Component.LEFT_ALIGNMENT);
       panel6.add(button6);


       frame.setLayout(new FlowLayout());
       frame.add(panel1);
       frame.add(panel2);
       frame.add(panel3);
       frame.add(panel4);
       frame.add(panel5);
       frame.add(panel6);

       frame.pack();
       frame.setVisible(true);

       button1.addActionListener(new ActionListener()
       {
            public void actionPerformed(ActionEvent e)
           {
                if (pressed1[0] == false) {
                    button1.setLabel("test");
                    pressed1[0] = true;
                } else {
                    button1.setLabel("Reveal");
                    pressed1[0] = false;
               }
               button1.setVisible(true);
           }
       });
       button2.addActionListener(new ActionListener()
       {
            public void actionPerformed(ActionEvent e)
           {
                if (pressed2[0] == false) {
                    button2.setLabel("test");
                    pressed2[0] = true;
                } else {
                    button2.setLabel("Reveal");
                    pressed2[0] = false;
               }
               button2.setVisible(true);
           }
       });
       button3.addActionListener(new ActionListener()
       {
            public void actionPerformed(ActionEvent e)
           {
                if (pressed3[0] == false) {
                    button3.setLabel("test");
                    pressed3[0] = true;
                } else {
                    button3.setLabel("Reveal");
                    pressed3[0] = false;
               }
               button3.setVisible(true);
           }
       });
       button4.addActionListener(new ActionListener()
       {
            public void actionPerformed(ActionEvent e)
           {
                if (pressed4[0] == false) {
                    button4.setLabel("test");
                    pressed4[0] = true;
                } else {
                    button4.setLabel("Reveal");
                    pressed4[0] = false;
               }
               button4.setVisible(true);
           }
       });
       button5.addActionListener(new ActionListener()
       {
            public void actionPerformed(ActionEvent e)
           {
                if (pressed5[0] == false) {
                    button5.setLabel("test");
                    pressed5[0] = true;
                } else {
                    button5.setLabel("Reveal");
                    pressed5[0] = false;
               }
               button5.setVisible(true);
           }
       });
       button6.addActionListener(new ActionListener()
       {
            public void actionPerformed(ActionEvent e)
           {
                if (pressed6[0] == false) {
                    button6.setLabel("test");
                    pressed6[0] = true;
                } else {
                    button6.setLabel("Reveal");
                    pressed6[0] = false;
               }
               button6.setVisible(true);
           }
       });
     }
}
