import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Alumni_Login extends JFrame implements ActionListener {


    JLabel l1;
    JLabel l2;
    JLabel l3;
    JTextField t1;
    JTextField t2;
    JButton b1;
    JButton b2;
    JButton b3;
    GridBagLayout gridBagLayout;
    GridBagConstraints gridBagConstraints;
    Font font1;
    Font font2;


    public Alumni_Login()
    {
        super("LOGIN PAGE");
        setSize(600,600);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);


        font1 = new Font("TimesNewRoman",Font.BOLD,50);
        font2 = new Font("TimesNewRoman",Font.BOLD,15);

        gridBagLayout = new GridBagLayout();

        gridBagConstraints = new GridBagConstraints();
        l1 = new JLabel(" ALUMNI LOGIN ");
        l2 = new JLabel(" USERNAME: ");
        l3 = new JLabel(" PASSWORD: ");
        l1.setFont(font1);
        l2.setFont(font2);
        l3.setFont(font2);
        l1.setForeground(Color.black);
        l2.setForeground(Color.black);
        l3.setForeground(Color.black);

        t1 = new JTextField(20);
        t2 = new JPasswordField(20);
        b1 = new JButton(" RESET ");
        b2 = new JButton(" SUBMIT ");
        b3 = new JButton(" CANCEL ");

        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagLayout.setConstraints(l1,gridBagConstraints);
        add(l1);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagLayout.setConstraints(l2,gridBagConstraints);
        add(l2);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagLayout.setConstraints(l3,gridBagConstraints);
        add(l3);
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagLayout.setConstraints(t1,gridBagConstraints);
        add(t1);
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 10;
        gridBagLayout.setConstraints(t2,gridBagConstraints);
        add(t2);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagLayout.setConstraints(b1,gridBagConstraints);
        add(b1);
        b1.setBackground(Color.black);
        b1.setForeground(Color.WHITE);
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 15;
        gridBagLayout.setConstraints(b2,gridBagConstraints);
        b2.setBackground(Color.black);
        b2.setForeground(Color.WHITE);
        add(b2);
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 15;
        gridBagLayout.setConstraints(b3,gridBagConstraints);
        b3.setBackground(Color.black);
        b3.setForeground(Color.WHITE);
        add(b3);
        setLayout(gridBagLayout);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == b1)
        {
            t1.setText("");
            t2.setText("");
        }
        if(ae.getSource() == b2)
        {
            String username = t1.getText();
            String password = t2.getText();

            connection dc = new connection();
            try {
                ResultSet rs = dc.st.executeQuery("select * from civil where Username = '" + username + "' and Password = '" + password + "'");
                if(rs.next())
                {
                    ALUMNI_MAINFRAME.main();
                    setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Wrong Username or Password. Please try again");
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }

        }
        if(ae.getSource() == b3)
        {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Alumni_Login loginPage = new Alumni_Login();
    }

}
