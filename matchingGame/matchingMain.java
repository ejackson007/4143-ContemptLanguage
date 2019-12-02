package matchingGame;

import javax.swing.*;

import java.awt.event.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.awt.Component;
import java.awt.FlowLayout;

public class matchingMain {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Matching Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550, 550);
        // create buttons
        JButton about = new JButton("INFO");
        JButton button1 = new JButton("Reveal");
        JButton button2 = new JButton("Reveal");
        JButton button3 = new JButton("Reveal");
        JButton button4 = new JButton("Reveal");
        JButton button5 = new JButton("Reveal");
        JButton button6 = new JButton("Reveal");
        // create checks for if the button has been revealed
        boolean[] pressed1 = { false };
        boolean[] pressed2 = { false };
        boolean[] pressed3 = { false };
        boolean[] pressed4 = { false };
        boolean[] pressed5 = { false };
        boolean[] pressed6 = { false };
        // create array for values to put in
        Integer[] values = {0,1,2,0,1,2};
        List<Integer> intList = Arrays.asList(values);
        //randomize value positions
        Collections.shuffle(intList);
        intList.toArray(values);
        // create array to store currently overturned array, so that you can check if
        // they are even
        int pair[] = new int[2];
        // create panels to put buttons into
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        JPanel panel6 = new JPanel();
        // name and set border
        panel1.setBorder(BorderFactory.createTitledBorder("Card 1"));
        panel2.setBorder(BorderFactory.createTitledBorder("Card 2"));
        panel3.setBorder(BorderFactory.createTitledBorder("Card 3"));
        panel4.setBorder(BorderFactory.createTitledBorder("Card 4"));
        panel5.setBorder(BorderFactory.createTitledBorder("Card 5"));
        panel6.setBorder(BorderFactory.createTitledBorder("Card 6"));
        // add layout into panel
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
        // add buttons into panels
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
        //create Label for output
        JLabel output = new JLabel("Guess cards and try to make all the pairs!");
        // add panels into frame
        frame.setLayout(new FlowLayout());
        frame.add(about);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.add(panel5);
        frame.add(panel6);
        frame.add(output);

        frame.pack();
        frame.setVisible(true);
        //count must be an arr so that it is in scope
        int count[] = new int[1];
        count[0] = 0;

        // create button clicks
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                //check if its already pressed
                if (pressed1[0] == false) {
                    pressed1[0] = true;
                    if(count[0] != 2){
                        pair[count[0]] = 0;
                        //update how many have been pressed
                        count[0] += 1;
                    }
                    //once a pair is made
                    if(count[0] == 2){
                        if(values[pair[0]] == values[pair[1]]){ //if a match
                            switch(pair[0]){
                                case 0:
                                    button1.setLabel(Integer.toString(values[pair[0]]));
                                    break;
                                case 1:
                                    button2.setLabel(Integer.toString(values[pair[0]]));
                                    break;
                                case 2:
                                    button3.setLabel(Integer.toString(values[pair[0]]));
                                    break;
                                case 3:
                                    button4.setLabel(Integer.toString(values[pair[0]]));
                                    break;
                                case 4:
                                    button5.setLabel(Integer.toString(values[pair[0]]));
                                    break;
                                case 5:
                                    button6.setLabel(Integer.toString(values[pair[0]]));
                                    break;
                            }
                            button1.setLabel(Integer.toString(values[pair[1]]));
                            count[0] = 0;
                        } else{ //if not a match
                            output.setText(Integer.toString(values[pair[0]]) + "-" + Integer.toString(values[pair[1]]));
                            count[0] = 0;
                            //set current and other pair to unclicked since match was not made
                            pressed1[0] = false;
                            switch(pair[0]){
                                case 0:
                                    pressed1[0] = false;
                                    break;
                                case 1:
                                    pressed2[0] = false;
                                    break;
                                case 2:
                                    pressed3[0] = false;
                                    break;
                                case 3:
                                    pressed4[0] = false;
                                    break;
                                case 4:
                                    pressed5[0] = false;
                                    break;
                                case 5:
                                    pressed6[0] = false;
                                    break;
                        }
                    }
                    button1.setVisible(true);
                }
            }
        }
       });
       button2.addActionListener(new ActionListener()
       {
            public void actionPerformed(ActionEvent b)
           {
                if (pressed2[0] == false) {
                    pressed2[0] = true;
                    if(count[0] != 2){
                        pair[count[0]] = 1;
                        count[0] += 1;
                    }
                    if(count[0] == 2){
                        if(values[pair[0]] == values[pair[1]]){
                            switch(pair[0]){
                                case 0:
                                    button1.setLabel(Integer.toString(values[pair[0]]));
                                    break;
                                case 1:
                                    button2.setLabel(Integer.toString(values[pair[0]]));
                                    break;
                                case 2:
                                    button3.setLabel(Integer.toString(values[pair[0]]));
                                    break;
                                case 3:
                                    button4.setLabel(Integer.toString(values[pair[0]]));
                                    break;
                                case 4:
                                    button5.setLabel(Integer.toString(values[pair[0]]));
                                    break;
                                case 5:
                                    button6.setLabel(Integer.toString(values[pair[0]]));
                                    break;
                            }
                            button2.setLabel(Integer.toString(values[pair[1]]));
                            count[0] = 0;
                        } else {                        
                        output.setText(Integer.toString(values[pair[0]]) + "-" + Integer.toString(values[pair[1]]));
                        count[0] = 0;
                        pressed2[0] = false;
                        switch(pair[0]){
                            case 0:
                                pressed1[0] = false;
                                break;
                            case 1:
                                pressed2[0] = false;
                                break;
                            case 2:
                                pressed3[0] = false;
                                break;
                            case 3:
                                pressed4[0] = false;
                                break;
                            case 4:
                                pressed5[0] = false;
                                break;
                            case 5:
                                pressed6[0] = false;
                                break;
                        }   
                        }
                    }
               button2.setVisible(true);
                }
           }
       });
       button3.addActionListener(new ActionListener()
       {
            public void actionPerformed(ActionEvent c)
           {
                if (pressed3[0] == false) {
                    pressed3[0] = true;
                    if(count[0] != 2){
                        pair[count[0]] = 2;
                        count[0] += 1;
                    }
                    if(count[0] == 2){
                        if(values[pair[0]] == values[pair[1]]){
                            switch(pair[0]){
                                case 0:
                                    button1.setLabel(Integer.toString(values[pair[0]]));
                                    break;
                                case 1:
                                    button2.setLabel(Integer.toString(values[pair[0]]));
                                    break;
                                case 2:
                                    button3.setLabel(Integer.toString(values[pair[0]]));
                                    break;
                                case 3:
                                    button4.setLabel(Integer.toString(values[pair[0]]));
                                    break;
                                case 4:
                                    button5.setLabel(Integer.toString(values[pair[0]]));
                                    break;
                                case 5:
                                    button6.setLabel(Integer.toString(values[pair[0]]));
                                    break;
                            }
                            button3.setLabel(Integer.toString(values[pair[1]]));
                            count[0] = 0;
                        } else{
                        output.setText(Integer.toString(values[pair[0]]) + "-" + Integer.toString(values[pair[1]]));
                        count[0] = 0;
                        pressed3[0] = false;
                        switch(pair[0]){
                            case 0:
                                pressed1[0] = false;
                                break;
                            case 1:
                                pressed2[0] = false;
                                break;
                            case 2:
                                pressed3[0] = false;
                                break;
                            case 3:
                                pressed4[0] = false;
                                break;
                            case 4:
                                pressed5[0] = false;
                                break;
                            case 5:
                                pressed6[0] = false;
                                break;
                        }
                        }
                    }
               button3.setVisible(true);
                }
           }
       });
       button4.addActionListener(new ActionListener()
       {
            public void actionPerformed(ActionEvent d)
           {
                if (pressed4[0] == false) {
                    pressed4[0] = true;
                    if(count[0] != 2){
                        pair[count[0]] = 3;
                        count[0] += 1;
                    }
                    if(count[0] == 2){
                        if(values[pair[0]] == values[pair[1]]){
                            switch(pair[0]){
                                case 0:
                                    button1.setLabel(Integer.toString(values[pair[0]]));
                                    break;
                                case 1:
                                    button2.setLabel(Integer.toString(values[pair[0]]));
                                    break;
                                case 2:
                                    button3.setLabel(Integer.toString(values[pair[0]]));
                                    break;
                                case 3:
                                    button4.setLabel(Integer.toString(values[pair[0]]));
                                    break;
                                case 4:
                                    button5.setLabel(Integer.toString(values[pair[0]]));
                                    break;
                                case 5:
                                    button6.setLabel(Integer.toString(values[pair[0]]));
                                    break;
                            }
                            button4.setLabel(Integer.toString(values[pair[1]]));
                            count[0] = 0;
                        } else {
                        output.setText(Integer.toString(values[pair[0]]) + "-" + Integer.toString(values[pair[1]]));
                        count[0] = 0;
                        pressed4[0] = false;
                        switch(pair[0]){
                            case 0:
                                pressed1[0] = false;
                                break;
                            case 1:
                                pressed2[0] = false;
                                break;
                            case 2:
                                pressed3[0] = false;
                                break;
                            case 3:
                                pressed4[0] = false;
                                break;
                            case 4:
                                pressed5[0] = false;
                                break;
                            case 5:
                                pressed6[0] = false;
                                break;
                        }
                        }
                    }
                }
               button4.setVisible(true);
           }
       });
       button5.addActionListener(new ActionListener()
       {
            public void actionPerformed(ActionEvent e)
           {
                if (pressed5[0] == false) {
                    pressed5[0] = true;
                    if(count[0] != 2){
                        pair[count[0]] = 4;
                        count[0] += 1;
                    }
                    if(count[0] == 2){
                        if(values[pair[0]] == values[pair[1]]){
                            switch(pair[0]){
                                case 0:
                                    button1.setLabel(Integer.toString(values[pair[0]]));
                                    break;
                                case 1:
                                    button2.setLabel(Integer.toString(values[pair[0]]));
                                    break;
                                case 2:
                                    button3.setLabel(Integer.toString(values[pair[0]]));
                                    break;
                                case 3:
                                    button4.setLabel(Integer.toString(values[pair[0]]));
                                    break;
                                case 4:
                                    button5.setLabel(Integer.toString(values[pair[0]]));
                                    break;
                                case 5:
                                    button6.setLabel(Integer.toString(values[pair[0]]));
                                    break;
                            }
                            button5.setLabel(Integer.toString(values[pair[1]]));
                            count[0] = 0;
                        } else{
                        output.setText(Integer.toString(values[pair[0]]) + "-" + Integer.toString(values[pair[1]]));
                        count[0] = 0;
                        pressed5[0] = false;
                        switch(pair[0]){
                            case 0:
                                pressed1[0] = false;
                                break;
                            case 1:
                                pressed2[0] = false;
                                break;
                            case 2:
                                pressed3[0] = false;
                                break;
                            case 3:
                                pressed4[0] = false;
                                break;
                            case 4:
                                pressed5[0] = false;
                                break;
                            case 5:
                                pressed6[0] = false;
                                break;
                        }
                        }  
                    }
                }
               button5.setVisible(true);
           }
       });
       button6.addActionListener(new ActionListener()
       {
            public void actionPerformed(ActionEvent f)
           {
                if (pressed6[0] == false) {
                    pressed6[0] = true;
                    if(count[0] != 2){
                        pair[count[0]] = 5;
                        count[0] += 1;
                    }
                    if(count[0] == 2){
                        if(values[pair[0]] == values[pair[1]]){
                            switch(pair[0]){
                                case 0:
                                    button1.setLabel(Integer.toString(values[pair[0]]));
                                    break;
                                case 1:
                                    button2.setLabel(Integer.toString(values[pair[0]]));
                                    break;
                                case 2:
                                    button3.setLabel(Integer.toString(values[pair[0]]));
                                    break;
                                case 3:
                                    button4.setLabel(Integer.toString(values[pair[0]]));
                                    break;
                                case 4:
                                    button5.setLabel(Integer.toString(values[pair[0]]));
                                    break;
                                case 5:
                                    button6.setLabel(Integer.toString(values[pair[0]]));
                                    break;
                            }
                            button6.setLabel(Integer.toString(values[pair[1]]));
                            count[0] = 0;
                        } else{
                        output.setText(Integer.toString(values[pair[0]]) + "-" + Integer.toString(values[pair[1]]));
                        count[0] = 0;
                        pressed6[0] = false;
                        switch(pair[0]){
                            case 0:
                                pressed1[0] = false;
                                break;
                            case 1:
                                pressed2[0] = false;
                                break;
                            case 2:
                                pressed3[0] = false;
                                break;
                            case 3:
                                pressed4[0] = false;
                                break;
                            case 4:
                                pressed5[0] = false;
                                break;
                            case 5:
                                pressed6[0] = false;
                                break;
                        }
                        }
                    }
                }
               button6.setVisible(true);
           }
       });
       //output about message
       about.addActionListener(new ActionListener()
       {
            public void actionPerformed(ActionEvent g)
           {
               output.setText("Game Created by: Evan Jackson");
           }
       });
     }
}
