import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class calcAI implements ActionListener {

    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[9];
    JButton addButton, subButton, mulButton, divButton;
    JButton decimalButton, equalButton, deleteButton, clearButton;
    JPanel panel;
    
    double num1 = 0, num2 = 0, result = 0;
    char operator;
    
    calcAI() {
        frame = new JFrame("calcAI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);
        frame.setVisible(true);

        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(new Font("Arial", Font.BOLD, 30));
        textField.setEditable(false);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decimalButton = new JButton(".");
        equalButton = new JButton("=");
        deleteButton = new JButton("Delete");
        clearButton = new JButton("Clear");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decimalButton;
        functionButtons[5] = equalButton;
        functionButtons[6] = deleteButton;
        functionButtons[7] = clearButton;
        
        for (int i = 0; i < 8; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[2] = mulButton;
            functionButtons[i].setFont(new Font("Arial", Font.BOLD, 20));
            // functionButtons[i].setFocusable(false);
        }

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(new Font("Arial", Font.BOLD, 20));
            // numberButtons[i].setFocusable(false);
        }

        deleteButton.setBounds(50, 430, 145, 50);
        clearButton.setBounds(205, 430, 145, 50);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(numberButtons[0]);
        
        panel.add(addButton);
        panel.add(subButton);
        panel.add(mulButton);
        panel.add(decimalButton);
        panel.add(equalButton);
        panel.add(divButton);
        frame.add(deleteButton);
        frame.add(clearButton);
        frame.add(textField);
        frame.add(panel);
    }

    public static void main(String[] args) {
        new calcAI();
    }

    // @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }

        // if (e.getSource() == decimalButton){
            
        // }
    }
}
