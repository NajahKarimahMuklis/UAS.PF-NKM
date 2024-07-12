import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class OddEven { private JTextField tfInput;
    private JButton prosesButton;
    private JTextField tfLoop;
    private JTextField tfGanjil;
    private JTextField tfGenap;
    private JTextField tfrataRata;
    private JButton resetButton;
    private JButton keluarButton;
    private JPanel Panel2;

    public OddEven() {
        prosesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int input = Integer.parseInt(tfInput.getText());
                List<Integer> list = new ArrayList<Integer>();
                for (int i = 1; i <= input; i++) {
                    list.add(i);
                    tfLoop.setText(String.valueOf(list));
                }
            }
        });

        prosesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int input = Integer.parseInt(tfInput.getText());
                List<Integer> list = new ArrayList<Integer>();
                for (int i = 1; i <= input; i++) {
                    if (i % 2 != 0) {list.add(i);}
                    tfGanjil.setText(String.valueOf(list));
                }
            }
        });

        prosesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int input = Integer.parseInt(tfInput.getText());
                List<Integer> list = new ArrayList<Integer>();
                for (int i = 1; i <= input; i++) {
                    if (i % 2 == 0) {list.add(i);}
                    tfGenap.setText(String.valueOf(list));
                }
            }
        });

        prosesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int input = Integer.parseInt(tfInput.getText());
                int total = 0;
                double rerata;
                for (int i = 1; i <= input; i++) {
                    total += i;
                }
                rerata = total / input;
                    tfrataRata.setText(String.valueOf(rerata));
            }
        });
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfInput.setText("");
                tfLoop.setText("");
                tfGanjil.setText("");
                tfGenap.setText("");
                tfrataRata.setText("");
            }
        });
        keluarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Program");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new OddEven().Panel2);
         frame.pack();
         frame.setVisible(true);
    }
}






