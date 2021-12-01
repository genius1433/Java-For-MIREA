package com.company;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MatchScores extends JFrame
{
    int [] mass = {0,0};
    JButton ACMilanBtn = new JButton("AC Milan");
    JButton RealMadridBtn = new JButton("Real Madrid");
    JButton FinishBtn = new JButton("End match");
    JLabel result = new JLabel("Result 0 X 0");
    JLabel last_scorer = new JLabel("Last Scorer: N/A");
    JLabel winner = new JLabel("Winner: DRAW");
    Font fnt = new Font("Times new roman", Font.BOLD, 20);
    MatchScores()
    {
        super("Match score");
        Container cont1 = getContentPane();
        cont1.setLayout(null);
        ACMilanBtn.setBounds(40, 20, 120, 40);
        cont1.add(ACMilanBtn);
        RealMadridBtn.setBounds(200, 20, 120, 40);
        cont1.add(RealMadridBtn);
        FinishBtn.setBounds(120, 80, 120, 40);
        cont1.add(FinishBtn);
        result.setBounds(145, 130, 110,40);
        cont1.add(result);
        last_scorer.setBounds(135, 170, 200,40);
        cont1.add(last_scorer);
        winner.setBounds(140, 210, 200,40);
        cont1.add(winner);
        setSize(360, 300);
        setVisible(true);
        ACMilanBtn.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                mass[0] ++;
                result.setText("Result: " + mass[0] + " X " + mass[1]);
                last_scorer.setText("Last Scorer: AC Milan");
            }
        });
        RealMadridBtn.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                mass[1] ++;
                result.setText("Result: " + mass[0] + " X " + mass[1]);
                last_scorer.setText("Last Scorer: Real Madrid");
            }
        });
        FinishBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(mass[0] > mass[1])
                {
                    winner.setText("Winner: AC Milan");
                }
                else if(mass[1] > mass[0])
                {
                    winner.setText("Winner: Real Madrid");
                }
                else
                {
                    winner.setText("Winner: Tie");
                }
            }
        });
    }

    public static void main(String[] args) {
        new MatchScores();
    }
}
