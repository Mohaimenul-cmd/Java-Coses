/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LooL;

/**
 *
 * @author mahad
 */

    
    
    import java.awt.EventQueue;
import java.awt.Font;


import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.JTextComponent;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Calculators{


private JFrame frame;
private JTextField txtDisplay;

double first;
double scnd;
double rslt;
String yo;
String Xo;
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Calculators window = new Calculators();
window.frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

/**
* Create the application.
*/
public Calculators() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame();
frame.getContentPane().setForeground(Color.BLACK);
frame.setBounds(100, 100, 220, 369);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
txtDisplay = new JTextField();
txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
txtDisplay.setFont(new Font("Tahoma",Font.BOLD,20));
txtDisplay.setBounds(0, 0, 202, 78);
frame.getContentPane().add(txtDisplay);
txtDisplay.setColumns(10);

JButton btnNewButton = new JButton("7");
btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
btnNewButton.setBounds(0, 143, 50, 50);
btnNewButton.setForeground(Color.BLACK);
btnNewButton.setBackground(Color.GRAY);
btnNewButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
String Enternumber= txtDisplay.getText() + btnNewButton.getText();

txtDisplay.setText(Enternumber);
}

});
frame.getContentPane().setLayout(null);
frame.getContentPane().add(btnNewButton);
JButton btn8 = new JButton("8");
btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
btn8.setBounds(49, 143, 50, 50);
btn8.setForeground(Color.BLACK);
btn8.setBackground(Color.GRAY);
btn8.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
String Enternumber= txtDisplay.getText() + btn8.getText();

txtDisplay.setText(Enternumber);
}
});
frame.getContentPane().add(btn8);
JButton btn9 = new JButton("9");
btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
btn9.setBounds(98, 143, 50, 50);
btn9.setForeground(Color.BLACK);
btn9.setBackground(Color.GRAY);
btn9.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {

String Enternumber= txtDisplay.getText() + btn9.getText();

txtDisplay.setText(Enternumber);
}
});
frame.getContentPane().add(btn9);
JButton btn6 = new JButton("6");
btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
btn6.setBounds(0, 209, 50, 50);
btn6.setForeground(new Color(0, 0, 0));
btn6.setBackground(Color.GRAY);
btn6.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
String Enternumber= txtDisplay.getText() + btn6.getText();

txtDisplay.setText(Enternumber);

}
});
frame.getContentPane().add(btn6);
JButton btn5 = new JButton("5");
btn5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
btn5.setBounds(49, 209, 50, 50);
btn5.setForeground(Color.BLACK);
btn5.setBackground(Color.GRAY);
btn5.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
String Enternumber= txtDisplay.getText() + btn5.getText();

txtDisplay.setText(Enternumber);

}
});
frame.getContentPane().add(btn5);
JButton btn4 = new JButton("4");
btn4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
btn4.setBounds(98, 209, 50, 50);
btn4.setForeground(Color.BLACK);
btn4.setBackground(Color.GRAY);
btn4.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
String Enternumber= txtDisplay.getText() + btn4.getText();

txtDisplay.setText(Enternumber);

}
});
frame.getContentPane().add(btn4);

JButton btn3 = new JButton("3");
btn3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
btn3.setBounds(98, 272, 50, 50);
btn3.setForeground(Color.BLACK);
btn3.setBackground(Color.GRAY);
btn3.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
String Enternumber= txtDisplay.getText() + btn3.getText();

txtDisplay.setText(Enternumber);

}
});
frame.getContentPane().setLayout(null);
frame.getContentPane().add(btn3);
JButton btn2 = new JButton("2");
btn2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
btn2.setBounds(49, 272, 50, 50);
btn2.setForeground(Color.BLACK);
btn2.setBackground(Color.GRAY);
btn2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
String Enternumber= txtDisplay.getText() + btn2.getText();

txtDisplay.setText(Enternumber);

}
});
frame.getContentPane().add(btn2);
JButton btn1 = new JButton("1");
btn1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
btn1.setBounds(0, 272, 50, 50);
btn1.setForeground(Color.BLACK);
btn1.setBackground(Color.GRAY);
btn1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
String Enternumber= txtDisplay.getText() + btn1.getText();

txtDisplay.setText(Enternumber);

}

});
frame.getContentPane().add(btn1);

JButton btnpls = new JButton("+");
btnpls.setFont(new Font("Tahoma", Font.BOLD, 18));
btnpls.setBounds(0, 80, 50, 50);
btnpls.setForeground(Color.BLACK);
btnpls.setBackground(Color.GRAY);
btnpls.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
first = Double.parseDouble(txtDisplay.getText());

txtDisplay.setText("");
yo = "+";

}

});
frame.getContentPane().add(btnpls);


JButton btnms = new JButton("-");
btnms.setFont(new Font("Tahoma", Font.BOLD, 18));
btnms.setBounds(49, 80, 50, 50);
btnms.setForeground(Color.BLACK);
btnms.setBackground(Color.GRAY);
btnms.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {

first = Double.parseDouble(txtDisplay.getText());

txtDisplay.setText("");
yo = "-";

}

});
frame.getContentPane().add(btnms);


JButton btnmt = new JButton("*");
btnmt.setFont(new Font("Tahoma", Font.BOLD, 18));
btnmt.setBounds(152, 80, 50, 50);
btnmt.setForeground(Color.BLACK);
btnmt.setBackground(Color.GRAY);
btnmt.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
first = Double.parseDouble(txtDisplay.getText());

txtDisplay.setText("");
yo = "*";

}

});
frame.getContentPane().add(btnmt);
JButton btndvd = new JButton("/");
btndvd.setFont(new Font("Tahoma", Font.BOLD, 18));
btndvd.setBounds(98, 80, 50, 50);
btndvd.setForeground(Color.BLACK);
btndvd.setBackground(Color.GRAY);
btndvd.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
first = Double.parseDouble(txtDisplay.getText());

txtDisplay.setText("");
yo = "/";

}

});
frame.getContentPane().add(btndvd);
JButton btnpm = new JButton("+-");
btnpm.setFont(new Font("Tahoma", Font.BOLD, 13));
btnpm.setBounds(152, 130, 50, 50);
btnpm.setForeground(Color.BLACK);
btnpm.setBackground(new Color(128, 128, 128));
btnpm.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
ops= ops* (-1);
txtDisplay.setText(String.valueOf(ops));
}
});
frame.getContentPane().add(btnpm);
JButton btndt = new JButton(".");
btndt.setFont(new Font("Tahoma", Font.BOLD, 18));
btndt.setBounds(152, 179, 50, 50);
btndt.setForeground(Color.BLACK);
btndt.setBackground(Color.GRAY);
btndt.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
String Enternumber= txtDisplay.getText() + btndt.getText();

txtDisplay.setText(Enternumber);

}
});
frame.getContentPane().add(btndt);
JButton btn0 = new JButton("0");
btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
btn0.setBounds(152, 229, 50, 50);
btn0.setForeground(Color.BLACK);
btn0.setBackground(Color.LIGHT_GRAY);
btn0.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
String Enternumber= txtDisplay.getText() + btn0.getText();

txtDisplay.setText(Enternumber);

}

});
frame.getContentPane().add(btn0);

JButton btneql = new JButton("=");
btneql.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
btneql.setBounds(152, 272, 50, 50);
btneql.setForeground(Color.BLACK);
btneql.setBackground(Color.GRAY);
btneql.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String ans;
scnd = Double.parseDouble(txtDisplay.getText());
if (yo== "+") {
rslt = first + scnd;
ans= String.format("%.2f",rslt);
txtDisplay.setText(ans);
}

else if (yo== "-") {
rslt = first - scnd;
ans= String.format("%.2f",rslt);
txtDisplay.setText(ans);
}
else if (yo== "*") {
rslt = first * scnd;
ans= String.format("%.2f",rslt);
txtDisplay.setText(ans);
}
}

});
frame.getContentPane().add(btneql);


}
}



