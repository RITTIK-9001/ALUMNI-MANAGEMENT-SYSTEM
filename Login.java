import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
public class Login extends JFrame implements ActionListener {
    JLabel k1;
    JButton p1;
    JButton p2;
    JButton p3;
    GridBagLayout gridBagLayout;
    GridBagConstraints gridBagConstraints;
    Font font1;
    Font font2;

    public Login() {
        super("LOGIN PAGE");
        setSize(600, 600);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
        font1 = new Font("TimesNewRoman", Font.BOLD, 50);
        font2 = new Font("TimesNewRoman", Font.BOLD, 15);


        gridBagLayout = new GridBagLayout();
        gridBagConstraints = new GridBagConstraints();
        k1 = new JLabel(" LOGIN ");
        p1 = new JButton(" ADMIN ");
        p2 = new JButton(" STUDENT ");
        p3 = new JButton(" ALUMNI ");
        k1.setFont(font1);
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagLayout.setConstraints(k1,gridBagConstraints);
        add(k1);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagLayout.setConstraints(p1, gridBagConstraints);
        add(p1);
        p1.setBackground(Color.black);
        p1.setForeground(Color.WHITE);
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 15;
        gridBagLayout.setConstraints(p2, gridBagConstraints);
        p2.setBackground(Color.black);
        p2.setForeground(Color.WHITE);
        add(p2);
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 15;
        gridBagLayout.setConstraints(p3, gridBagConstraints);
        p3.setBackground(Color.black);
        p3.setForeground(Color.WHITE);
        add(p3);
        setLayout(gridBagLayout);
        p1.addActionListener(this);
        p2.addActionListener(this);
        p3.addActionListener(this);
    }
        public void actionPerformed(ActionEvent ap)
        {
            if (ap.getSource() == p1) {
                new Admin_LoginPage();
            }

            if (ap.getSource() == p2) {
                new Student_Login();
            }

            if (ap.getSource() == p3) {
                new Alumni_Login();
            }
        }
    public static void main(String[] args) {
        Login loginPage = new Login();
    }

}