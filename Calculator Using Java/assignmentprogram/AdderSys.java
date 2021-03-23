package assignmentProgram;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdderSys extends Frame implements ActionListener{
    Label lb1, lb2, lb3;
    TextField tf1, tf2, tf3;
    Button bt;
    Checkbox ch1, ch2, ch3, ch4;

    public AdderSys(){
        super("Adder System");
        super.setBackground(Color.lightGray);
        lb1 = new Label("1st number");
        lb1.setBounds(20,50,80,30);
        lb1.setFont(new Font("Serif", Font.PLAIN, 17));
        lb2 = new Label("2nd number");
        lb2.setBounds(20,90,80,30);
        lb2.setFont(new Font("Serif", Font.PLAIN, 17));
        lb3 = new Label("Result");
        lb3.setBounds(20,130,60,30);
        lb3.setFont(new Font("Serif", Font.PLAIN, 17));
        // textField1 is used to get first number form user
        tf1 = new TextField();
        tf1.setBounds(105,50,150,25);
        tf1.setFont(new Font("Serif", Font.PLAIN, 20));
        // textField2 is used to get second number form user
        tf2 = new TextField();
        tf2.setBounds(105,90,150,25);
        tf2.setFont(new Font("Serif", Font.PLAIN, 20));
        // textField3 is used to show result
        tf3 = new TextField();
        tf3.setBounds(105,130,150,25);
        tf3.setEditable(false);
        tf3.setFont(new Font("Serif", Font.PLAIN, 20));
        // Button is used to calculate result
        bt = new Button("Submit");
        bt.setFont(new Font("Serif", Font.BOLD, 28));
        bt.addActionListener(this);
        bt.setBounds(275,50,100,105);
        bt.setBackground(Color.GREEN);

        CheckboxGroup cg1 = new CheckboxGroup();
        ch1 = new Checkbox("Addition",cg1,true);
        ch1.setBounds(25,160,60,50);
        ch2 = new Checkbox("Subtraction",cg1,false);
        ch2.setBounds(100,160,80,50);
        ch3 = new Checkbox("Multiplication",cg1,false);
        ch3.setBounds(215,160,80,50);
        ch4 = new Checkbox("Division",cg1,false);
        ch4.setBounds(320,160,60,50);

        add(ch1);
        add(ch2);
        add(ch3);
        add(ch4);

        add(lb1);
        add(lb2);
        add(lb3);

        add(tf1);
        add(tf2);
        add(tf3);
        add(bt);

        setSize(400,300);
        super.setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (tf1.getText().equals("") && tf2.getText().equals("") ){
            JOptionPane.showMessageDialog(this,"Please enter 1st and 2nd number");
        }
        else if (tf1.getText().equals("") ){
            JOptionPane.showMessageDialog(this,"Please enter 1st number");
        }
        else if (tf2.getText().equals("") ){
            JOptionPane.showMessageDialog(this,"Please enter 2nd number");
        }
        else {
            if (ch1.getState() == true){
                int x = Integer.parseInt(tf1.getText());
                int y = Integer.parseInt(tf2.getText());
                int z = x + y;
                String string = String.valueOf(z);
                tf3.setText(string);
            }
            else if (ch2.getState() == true){
                int x = Integer.parseInt(tf1.getText());
                int y = Integer.parseInt(tf2.getText());
                int z = x - y;
                String string = String.valueOf(z);
                tf3.setText(string);
            }
            else if (ch3.getState() == true){
                int x = Integer.parseInt(tf1.getText());
                int y = Integer.parseInt(tf2.getText());
                int z = x * y;
                String string = String.valueOf(z);
                tf3.setText(string);
            }
            else if (ch4.getState() == true){
                int x = Integer.parseInt(tf1.getText());
                int y = Integer.parseInt(tf2.getText());
                double z = (double)x / (double)y;
                String string = String.valueOf(z);
                tf3.setText(string);
            }
        }
    }
}
