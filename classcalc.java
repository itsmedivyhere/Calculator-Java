import java.awt.event.*;
import javax.swing.*;

public class classcalc extends JFrame implements ActionListener {
    JTextField t1, t2, t3, t4;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bc, be, ba, bs, bm, bd;
    double num1, num2, oprand;
    double rs;

    classcalc() {
        t1 = new JTextField();
        t1.setBounds(10, 10, 60, 30);
        add(t1);

        t2 = new JTextField();
        t2.setBounds(120, 10, 60, 30);
        add(t2);

        t3 = new JTextField();
        t3.setBounds(10, 45, 170, 30);
        add(t3);

        t4 = new JTextField();
        t4.setBounds(85, 15, 20, 20);
        add(t4);

        ba = new JButton("+");
        ba.setBounds(10, 80, 50, 20);
        add(ba);
        ba.addActionListener(this);

        bs = new JButton("-");
        bs.setBounds(60, 80, 40, 20);
        add(bs);
        bs.addActionListener(this);

        bm = new JButton("*");
        bm.setBounds(100, 80, 40, 20);
        add(bm);
        bm.addActionListener(this);

        bd = new JButton("/");
        bd.setBounds(140, 80, 40, 20);
        add(bd);
        bd.addActionListener(this);

        b0 = new JButton("0");
        b0.setBounds(10, 100, 50, 20);
        add(b0);
        b0.addActionListener(this);

        b1 = new JButton("1");
        b1.setBounds(60, 100, 40, 20);
        add(b1);
        b1.addActionListener(this);

        b2 = new JButton("2");
        b2.setBounds(100, 100, 40, 20);
        add(b2);
        b2.addActionListener(this);

        b3 = new JButton("3");
        b3.setBounds(140, 100, 40, 20);
        add(b3);
        b3.addActionListener(this);

        bc = new JButton("c");
        bc.setBounds(10, 120, 50, 20);
        add(bc);
        bc.addActionListener(this);

        b4 = new JButton("4");
        b4.setBounds(60, 120, 40, 20);
        add(b4);
        b4.addActionListener(this);

        b5 = new JButton("5");
        b5.setBounds(100, 120, 40, 20);
        add(b5);
        b5.addActionListener(this);

        b6 = new JButton("6");
        b6.setBounds(140, 120, 40, 20);
        add(b6);
        b6.addActionListener(this);

        be = new JButton("=");
        be.setBounds(10, 140, 50, 20);
        add(be);
        be.addActionListener(this);

        b7 = new JButton("7");
        b7.setBounds(60, 140, 40, 20);
        add(b7);
        b7.addActionListener(this);

        b8 = new JButton("8");
        b8.setBounds(100, 140, 40, 20);
        add(b8);
        b8.addActionListener(this);

        b9 = new JButton("9");
        b9.setBounds(140, 140, 40, 20);
        add(b9);
        b9.addActionListener(this);

        setSize(210, 220);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String z, zt;

        // Operators Button
        if (e.getSource() == ba) {
            t4.setText(" +");
        }
        if (e.getSource() == bs) {
            t4.setText(" -");
        }
        if (e.getSource() == bm) {
            t4.setText(" *");
        }
        if (e.getSource() == bd) {
            t4.setText(" /");
        }

        // NUMBER BUTTON
        if (e.getSource() == b1) {
            zt = t1.getText();
            z = zt + "1";
            t1.setText(z);
        }
        if (e.getSource() == b2) {
            zt = t1.getText();
            z = zt + "2";
            t1.setText(z);
        }
        if (e.getSource() == b3) {
            zt = t1.getText();
            z = zt + "3";
            t1.setText(z);
        }
        if (e.getSource() == b4) {
            zt = t1.getText();
            z = zt + "4";
            t1.setText(z);
        }
        if (e.getSource() == b5) {
            zt = t1.getText();
            z = zt + "5";
            t1.setText(z);
        }
        if (e.getSource() == b6) {
            zt = t1.getText();
            z = zt + "6";
            t1.setText(z);
        }
        if (e.getSource() == b7) {
            zt = t1.getText();
            z = zt + "7";
            t1.setText(z);
        }
        if (e.getSource() == b8) {
            zt = t1.getText();
            z = zt + "8";
            t1.setText(z);
        }
        if (e.getSource() == b9) {
            zt = t1.getText();
            z = zt + "9";
            t1.setText(z);
        }
        if (e.getSource() == b0) {
            zt = t2.getText();
            z = zt + "0";
            t2.setText(z);
        }

        if (e.getSource() == bc) { // FOR BACKSPACE
            zt = t1.getText();
            try {
                z = zt.substring(0, zt.length() - 1);
            }
            catch (StringIndexOutOfBoundsException f) {
                return;
            }
            t3.setText(z);
        }

        // ARITHMETIC BUTTON
        if (e.getSource() == ba) { // FOR ADDITION
            num1 = Double.parseDouble(t1.getText());
            z = "";
            t3.setText(z);
            oprand = 1;
        }
        if (e.getSource() == bs) { // FOR SUBTRACTIOM
            num1 = Double.parseDouble(t1.getText());
            z = "";
            t3.setText(z);
            oprand = 2;
        }
        if (e.getSource() == bm) { // FOR MULTIPLICATION
            num1 = Double.parseDouble(t1.getText());
            z = "";
            t3.setText(z);
            oprand = 3;
        }
        if (e.getSource() == bd) { // FOR DIVISION
            num1 = Double.parseDouble(t1.getText());
            z = "";
            t3.setText(z);
            oprand = 4;
        }

        // RESULT BUTTON
        if (e.getSource() == be) {
            num2 = Double.parseDouble(t2.getText());// use keyboard to enter value
            if (oprand == 1)
                rs = num1 + num2;
            if (oprand == 2)
                rs = num1 - num2;
            if (oprand == 3)
                rs = num1 * num2;
            if (oprand == 4)
                rs = num1 / num2;
            t3.setText(String.valueOf(rs));
        }
        // FOR CLEARING THE LABEL and Memory
        if (e.getSource() == bc) {
            num1 = 0;
            num2 = 0;
            oprand = 0;
            rs = 0;
            z = "";
            t3.setText(z);
        }
    }

    public static void main(String[] args) {
        new classcalc();
    }
}
