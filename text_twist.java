//  import libraries
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class text_twist extends JFrame implements ActionListener {
        //  global variables
        //  object variables
        JLabel [] three_letter_word, four_letter_word, six_letter_word, score_and_time, label_one, label_two;
        JLabel label_three, label_four, label_five, label_six, label_seven;
        JButton [] option;
        ImageIcon [] icon;

        public static void main (String [] args) {
                new text_twist ();
        }

        public text_twist () {
                //  layout
                this.setLayout(null);

                //  images
                icon = new ImageIcon [8];
                icon[0] = new ImageIcon ("Logo.png");
                icon[1] = new ImageIcon ("B.png");
                icon[2] = new ImageIcon ("O.png");
                icon[3] = new ImageIcon ("D.png");
                icon[4] = new ImageIcon ("E.png");
                icon[5] = new ImageIcon ("ball.png");
                icon[6] = new ImageIcon ("H.png");
                icon[7] = new ImageIcon ("T.png");

                //  initilizing object arrays
                three_letter_word = new JLabel [36];
                four_letter_word = new JLabel [24];
                six_letter_word = new JLabel [6];
                score_and_time = new JLabel [4];
                option = new JButton [4];
                label_one = new JLabel [6];
                label_two = new JLabel [6];

                //  three letter words
                for (int y = 0; y < 12; y++) {
                        for (int x = 0;x < 3;x ++) {
                                three_letter_word [(x * y)] = new JLabel ("");
                                three_letter_word [(x * y)].setBounds (14 + (15 * x), 29 + (18 * y), 13, 16);
                                three_letter_word [(x * y)].setBackground (new Color (255, 255, 255));
                                three_letter_word [(x * y)].setBorder (BorderFactory.createMatteBorder (1, 1, 1, 1, (new Color (133, 160, 169))));
                                three_letter_word [(x * y)].setOpaque (true);
                                this.add (three_letter_word [(x * y)]);
                        }
                }

                //  four letter words
                for (int y = 0;y < 6;y++) {
                        for (int x=0; x<4; x++) {
                                four_letter_word [(x * y)]= new JLabel ("");
                                four_letter_word [(x * y)].setBounds (14 + (15 * x), 246 + (18 * y), 13, 16);
                                four_letter_word [(x * y)].setBackground (new Color (255, 255, 255));
                                four_letter_word [(x * y)].setBorder (BorderFactory.createMatteBorder (1, 1, 1, 1, (new Color (133, 160, 169))));
                                four_letter_word [(x * y)].setOpaque (true);
                                this.add(four_letter_word [(x * y)]);
                        }
                }

                //  six letter words
                for (int x = 0;x < 6;x++) {
                        six_letter_word [x] = new JLabel ("");
                        six_letter_word [x].setBounds (14 + (15 * x), 354, 13, 16);
                        six_letter_word [x].setBackground (new Color(255, 255, 255));
                        six_letter_word [x].setBorder (BorderFactory.createMatteBorder (1, 1, 1, 1, (new Color (133, 160, 169))));
                        six_letter_word [x].setOpaque (true);
                        this.add (six_letter_word [x]);
                }

                //  option options
                for (int x = 0;x < 4;x++) {
                        option [x] = new JButton ("");
                        option [x].setBounds (171 + (82 * x), 241, 72, 25);
                        option [x].setBackground (new Color (248, 210, 71));
                        option [x].setForeground (new Color (231, 255, 255));
                        option [x].setFont (new Font ("Comic Sans MS", Font.PLAIN, 10));
                        this.add (option [x]);
                }
                option [2].setFont (new Font ("Arial", Font.PLAIN, 6));
                option [0].setText ("TWIST");
                option [1].setText ("ENTER");
                option [2].setText ("LAST WORD");
                option [3].setText ("CLEAR");

                //  score and time
                for (int x = 0;x < 4;x++) {
                        score_and_time [x]=new JLabel ("");
                        score_and_time [x].setBounds (167, 282 + (28 * x), 140, 22);
                        score_and_time [x].setBackground (new Color (90, 191, 235));
                        score_and_time [x].setForeground (new Color(255, 255, 255));
                        score_and_time [x].setFont (new Font ("Jokerman", Font.PLAIN, 20));
                        score_and_time [x].setOpaque (true);
                        this.add(score_and_time [x]);
                }
                score_and_time [0].setText ("SCORE");
                score_and_time [1].setText (" 680");
                score_and_time [2].setText ("TIME");
                score_and_time [3].setText ("  1:01");

                for (int x = 0;x < 6;x++) {
                        label_one [x] = new JLabel ("");
                        label_one [x].setBounds (167 + (56 * x), 92, 54, 53);
                        label_one [x].setBackground (new Color (90, 191, 235));
                        label_one [x].setForeground (new Color(255, 255, 255));
                        label_one [x].setFont (new Font ("Jokerman", Font.PLAIN, 20));
                        label_one [x].setBorder (BorderFactory.createMatteBorder (2, 2, 2, 2, (new Color (255, 255, 255))));
                        this.add (label_one [x]);
                        label_one [x].setOpaque (true);
                        if (x < 4){
                                label_one [x].setIcon (icon [x + 1]);
                        }
                }

                label_three = new JLabel ("");
                label_three.setIcon (icon [0]);
                label_three.setBounds (287, 21, 210, 61);
                label_three.setBackground (new Color (90, 191, 235));
                this.add (label_three);
                label_three.setOpaque (true);

                label_four = new JLabel ("");
                label_four.setBounds(0, 0, 600, 4);
                label_four.setBackground (new Color (225, 248, 77));
                this.add (label_four);
                label_four.setOpaque (true);

                label_five = new JLabel ("");
                label_five.setBounds(513, 0, 4, 600);
                label_five.setBackground (new Color(225, 248, 77));
                this.add (label_five);
                label_five.setOpaque(true);

                label_six = new JLabel ("");
                label_six.setBounds(0, 0, 4, 600);
                label_six.setBackground (new Color (225, 248, 77));
                this.add (label_six);
                label_six.setOpaque (true);

                label_seven = new JLabel ("");
                label_seven.setBounds (0, 392, 600, 4);
                label_seven.setBackground (new Color(225, 248, 77));
                this.add (label_seven);
                label_seven.setOpaque (true);

                for (int x = 0;x < 6;x++) {
                        if (x < 4) {
                                label_two [x] = new JLabel ("");
                                label_two [x].setIcon (icon[5]);
                                label_two [x].setBounds (181 + (52 * x), 190, 30, 30);
                                label_two [x].setBackground (new Color (90, 191, 235));
                                this.add (label_two[x]);
                                label_two [x].setOpaque (true);
                        }
                        else {
                                label_two [x] = new JLabel ("");
                                label_two [x].setIcon (icon[x + 2]);
                                label_two [x].setBounds(166+(54*x),180,47,47);
                                label_two [x].setBackground(new Color(90,191,235));
                                this.add (label_two[x]);
                                label_two [x].setOpaque(true);
                        }
                }

                //  frame properties
                this.getContentPane ().setBackground (new Color (90, 191, 235));
                this.getRootPane ().setBorder(BorderFactory.createMatteBorder (8, 11, 8, 11, (new Color (0, 0, 0))));
                this.setSize (555,450);
                this.setVisible (true);

        }

        public void actionPerformed(ActionEvent e) {

        }
}
