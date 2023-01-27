// import package QUIZZ.com;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Rules extends JFrame implements ActionListener {

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to Quizz");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
            "<html>"+ 
                "1. You are going to be programmer and not a comedian, so answer it seriously." + "<br><br>" +
                "2. Do not unnecessarily smile I may be looking at you." + "<br><br>" +
                "3. You may have lot of options in life but sorry here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed after seeing question but please do it quietly." + "<br><br>" +
                "5. Dont try to cheat, Otherwise in hell you will be fried in oil. " + "<br><br>" +
                "6. Dont do Jai Mata Di on questions, Luck don't help unlucky peoples. " + "<br><br>" +
                "7. Stay Strong, these question are not for the faint hearted" + "<br><br>" +
                "8. Answer everyquestion question in just 1 minute, I can't wait for you. "+
                "8. " + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Ganpati Bappa Morya");
        start.setBounds(400, 500, 300, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}