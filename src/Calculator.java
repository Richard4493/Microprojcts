import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class Calculator implements ActionListener {
    JFrame jf;
    JLabel display;
    JButton seven;
    JButton eight;
    JButton nine;
    JButton four;
    JButton five;
    JButton six;
    JButton one;
    JButton two;
    JButton three;
    JButton dot;
    JButton zero;
    JButton equal;
    JButton add;
    JButton div;
    JButton mul;
    JButton diff;
    JButton clear;
    String num1;
    boolean OperatorClicked=false;
    boolean addop=false;
    boolean divop=false;
    boolean mulop=false;
    boolean diffop=false;
    public Calculator(){
        jf=new JFrame("Calculator");
        jf.setBounds(550,150,500,600);
        jf.setBackground(Color.black);
        jf.setLayout(null);
        display=new JLabel();
        display.setBounds(30,50,400,50);
        display.setBackground(Color.gray);
        display.setOpaque(true);
        display.setForeground(Color.white);
        display.setFont(new Font("Arial", Font.PLAIN, 25));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        jf.add(display);

        seven=new JButton("7");
        seven.setBounds(30,130,80,80);
        seven.setFont(new Font("Arial", Font.PLAIN, 30));
        seven.addActionListener(this::actionPerformed);
        jf.add(seven);

        eight=new JButton("8");
        eight.setBounds(130,130,80,80);
        eight.setFont(new Font("Arial", Font.PLAIN, 30));
        eight.addActionListener(this::actionPerformed);
        jf.add(eight);

        nine=new JButton("9");
        nine.setBounds(230,130,80,80);
        nine.setFont(new Font("Arial", Font.PLAIN, 30));
        nine.addActionListener(this::actionPerformed);
        jf.add(nine);

        four=new JButton("4");
        four.setBounds(30,230,80,80);
        four.setFont(new Font("Arial", Font.PLAIN, 30));
        four.addActionListener(this::actionPerformed);
        jf.add(four);

        five=new JButton("5");
        five.setBounds(130,230,80,80);
        five.setFont(new Font("Arial", Font.PLAIN, 30));
        five.addActionListener(this::actionPerformed);
        jf.add(five);

        six=new JButton("6");
        six.setBounds(230,230,80,80);
        six.setFont(new Font("Arial", Font.PLAIN, 30));
        six.addActionListener(this::actionPerformed);
        jf.add(six);

        one=new JButton("1");
        one.setBounds(30,330,80,80);
        one.setFont(new Font("Arial", Font.PLAIN, 30));
        one.addActionListener(this::actionPerformed);
        jf.add(one);

        two=new JButton("2");
        two.setBounds(130,330,80,80);
        two.setFont(new Font("Arial", Font.PLAIN, 30));
        two.addActionListener(this::actionPerformed);
        jf.add(two);

        three=new JButton("3");
        three.setBounds(230,330,80,80);
        three.setFont(new Font("Arial", Font.PLAIN, 30));
        three.addActionListener(this::actionPerformed);
        jf.add(three);

        dot=new JButton(".");
        dot.setBounds(30,430,80,80);
        dot.setFont(new Font("Arial", Font.PLAIN, 30));
        dot.addActionListener(this::actionPerformed);
        jf.add(dot);

        zero=new JButton("0");
        zero.setBounds(130,430,80,80);
        zero.setFont(new Font("Arial", Font.PLAIN, 30));
        zero.addActionListener(this::actionPerformed);
        jf.add(zero);

        equal=new JButton("=");
        equal.setBounds(230,430,80,80);
        equal.setFont(new Font("Arial", Font.PLAIN, 30));
        equal.addActionListener(this::actionPerformed);
        jf.add(equal);

        div=new JButton("/");
        div.setBounds(330,130,80,80);
        div.setFont(new Font("Arial", Font.PLAIN, 30));
        div.addActionListener(this::actionPerformed);
        jf.add(div);

        mul=new JButton("*");
        mul.setBounds(330,230,80,80);
        mul.setFont(new Font("Arial", Font.PLAIN, 30));
        mul.addActionListener(this::actionPerformed);
        jf.add(mul);

        diff=new JButton("-");
        diff.setBounds(330,330,80,80);
        diff.setFont(new Font("Arial", Font.PLAIN, 30));
        diff.addActionListener(this::actionPerformed);
        jf.add(diff);

        add=new JButton("+");
        add.setBounds(330,430,80,80);
        add.setFont(new Font("Arial", Font.PLAIN, 30));
        add.addActionListener(this::actionPerformed);
        jf.add(add);

        clear=new JButton("C");
        clear.setBounds(430,130,50,380);
        clear.setFont(new Font("Arial", Font.PLAIN, 20));
        clear.setVerticalAlignment(SwingConstants.CENTER);
        clear.addActionListener(this::actionPerformed);
        jf.add(clear);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //to stop program working//
    }
    public static void main(String args[]){
        Calculator c=new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==seven){
            if(OperatorClicked){
                display.setText("7");
                OperatorClicked=false;
            }
            else {
                display.setText(display.getText() + "7");
            }
        }
        else if(e.getSource()==eight){
            if(OperatorClicked){
                display.setText("8");
                OperatorClicked=false;
            }
            else {
                display.setText(display.getText() + "8");
            }
        }
        else if(e.getSource()==nine){
            if(OperatorClicked){
                display.setText("9");
                OperatorClicked=false;
            }
            else {
                display.setText(display.getText() + "9");
            }
        }
        else if(e.getSource()==four){
            if(OperatorClicked){
                display.setText("4");
                OperatorClicked=false;
            }
            else {
                display.setText(display.getText() + "4");
            }
        }
        else if(e.getSource()==five){
            if(OperatorClicked){
                display.setText("5");
                OperatorClicked=false;
            }
            else {
                display.setText(display.getText() + "5");
            }
        }
        else if(e.getSource()==six){
            if(OperatorClicked){
                display.setText("6");
                OperatorClicked=false;
            }
            else {
                display.setText(display.getText() + "6");
            }
        }
        else if(e.getSource()==one){
            if(OperatorClicked){
                display.setText("1");
                OperatorClicked=false;
            }
            else {
                display.setText(display.getText() + "1");
            }
        }
        else if(e.getSource()==two){
            if(OperatorClicked){
                display.setText("2");
                OperatorClicked=false;
            }
            else {
                display.setText(display.getText() + "2");
            }
        }
        else if(e.getSource()==three){
            if(OperatorClicked){
                display.setText("3");
                OperatorClicked=false;
            }
            else {
                display.setText(display.getText() + "3");
            }
        }
        else if(e.getSource()==dot){
            if(OperatorClicked){
                display.setText(".");
                OperatorClicked=false;
            }
            else {
                display.setText(display.getText() + ".");
            }
        }
        else if(e.getSource()==zero){
            if(OperatorClicked){
                display.setText("0");
                OperatorClicked=false;
            }
            else {
                display.setText(display.getText() + "0");
            }
        }

        else if(e.getSource()==clear){
            display.setText("");
        }
        else if(e.getSource()==add){
            addop=true;
            OperatorClicked=true;
            num1=display.getText();
            display.setText("");
            }
        else if(e.getSource()==mul){
            mulop=true;
            OperatorClicked=true;
            num1=display.getText();
            display.setText("");
        }
        else if(e.getSource()==diff){
            diffop=true;
            OperatorClicked=true;
            num1=display.getText();
            display.setText("");
        }
        else if(e.getSource()==div){
            divop=true;
            OperatorClicked=true;
            num1=display.getText();
            display.setText("");
        }
        else if(e.getSource()==equal){
            float val1=Float.parseFloat(num1);
            float val2 = Float.parseFloat(display.getText());
            if(addop) {
                float result = val1 + val2;
                display.setText(String.valueOf(result));
                addop=false;
            }
            else if(mulop) {
                float result = val1 * val2;
                display.setText(String.valueOf(result));
                mulop=false;
            }
            else if(diffop) {
                float result = val1 - val2;
                display.setText(String.valueOf(result));
                diffop=false;
            }
            else if(divop) {
                float result = val1 / val2;
                display.setText(String.valueOf(result));
                divop=false;
            }
        }





    }
}
