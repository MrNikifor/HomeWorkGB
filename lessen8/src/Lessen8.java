import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lessen8 extends JFrame {
    public static void main(String[] args) {
        new Lessen8();
    }
    private int counter = 0;

    public Lessen8(){
        setBounds(500,200,640,200);
        setTitle("HomeWork8");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Font font = new Font("Arial",Font.BOLD, 20);

        JLabel counterView = new JLabel(String.valueOf(counter));  // компонент который отображает текст
        counterView.setBounds(304,27,20,20);
//        counterView.setFont(font);
        add(counterView);

        setLayout(null);

        JButton incrementButton = new JButton(">");
        incrementButton.setBounds(380, 20, 80, 32);
        add(incrementButton);
        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                refreshCounterView(counterView);
            }
        });

        JButton decrementButton = new JButton("<");
        decrementButton.setBounds(160, 20, 80, 32);
        add(decrementButton);
        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter--;
                refreshCounterView(counterView);
            }
        });

        JButton incrementButtonTen = new JButton("+10");
        incrementButtonTen.setBounds(480, 20, 120, 32);
        add(incrementButtonTen);
        incrementButtonTen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter += 10;
                refreshCounterView(counterView);
            }
        });

        JButton decrementButtonTen = new JButton("-10");
        decrementButtonTen.setBounds(20, 20, 120, 32);
        add(decrementButtonTen);
        decrementButtonTen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter -= 10;
                refreshCounterView(counterView);
            }
        });

        JButton resetButton = new JButton("RESET");
        resetButton.setBounds(250, 80, 120, 32);
        add(resetButton);
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter = 0;
                refreshCounterView(counterView);
            }
        });

        setVisible(true); // визуализация
    }
    private void refreshCounterView(JLabel counterView){
        counterView.setText(String.valueOf(counter));
    }


}
