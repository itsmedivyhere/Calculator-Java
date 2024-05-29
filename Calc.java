import java.awt.*;
public class Calc extends Frame{
    public Calc(){
        
        setSize(250,200);
        setVisible(true);
        setLayout(null);
        
        TextField t = new TextField();
        t.setBounds(10,40,230,50);
        add(t);
        
        Button b1= new Button("C");
        b1.setBounds(0,100,50,20);
        add(b1);
        
        Button b2= new Button("1");
        b2.setBounds(50,100,50,20);
        add(b2);
        
        Button b3= new Button("2");
        b3.setBounds(100,100,50,20);
        add(b3);
        
        Button b4= new Button("3");
        b4.setBounds(150,100,50,20);
        add(b4);
        
        Button b11= new Button("0");
        b11.setBounds(0,120,50,60);
        add(b11);
        
        Button b5= new Button("4");
        b5.setBounds(50,120,50,20);
        add(b5);
        
        Button b6= new Button("5");
        b6.setBounds(100,120,50,20);
        add(b6);
        
        Button b7= new Button("6");
        b7.setBounds(150,120,50,20);
        add(b7);
        
        Button b8= new Button("7");
        b8.setBounds(50,140,50,20);
        add(b8);
        
        Button b9= new Button("8");
        b9.setBounds(100,140,50,20);
        add(b9);
        
        Button b10= new Button("9");
        b10.setBounds(150,140,50,20);
        add(b10);
        
        Button b12= new Button("X");
        b12.setBounds(50,160,50,20);
        add(b12);
        
        Button b13= new Button("/");
        b13.setBounds(100,160,50,20);
        add(b13);
        
        Button b14= new Button("-");
        b14.setBounds(150,160,50,20);
        add(b14);
        
        Button b15= new Button("+");
        b15.setBounds(200,100,40,80);
        add(b15);
        }

        public static void main(String[] args) {
            new Calc();
        }
    }
