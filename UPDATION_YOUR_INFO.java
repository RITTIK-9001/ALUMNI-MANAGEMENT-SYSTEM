import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class UPDATION_YOUR_INFO   extends JFrame implements ActionListener {
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;
    JLabel l5;
    JTextField t1;
    JTextField t2;
    JTextField t3;
    JTextField t4;
    JButton b1;
    JButton b2;
    GridBagLayout gridBagLayout;
    GridBagConstraints gridBagConstraints;
    Font font1;
    Font font2;


    public UPDATION_YOUR_INFO  ()
    {
        super("ALUMNI INFORMATION  UPDATION FORUM");
        setSize(600,600);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);


        font1 = new Font("TimesNewRoman",Font.BOLD,50);
        font2 = new Font("TimesNewRoman",Font.BOLD,15);

        gridBagLayout = new GridBagLayout();

        gridBagConstraints = new GridBagConstraints();
        l1 = new JLabel(" UPDATE ALUMNI ENTRY");
        l2 = new JLabel(" Name: ");
        l3 = new JLabel(" Email-Id: ");
        l4 = new JLabel(" Job profile: ");
        l5 = new JLabel(" Country: ");

        l1.setFont(font1);
        l2.setFont(font2);
        l3.setFont(font2);
        l4.setFont(font2);
        l5.setFont(font2);
        l1.setForeground(Color.black);
        l2.setForeground(Color.black);
        l3.setForeground(Color.black);
        l4.setForeground(Color.black);
        l5.setForeground(Color.black);

        t1 = new JTextField(50);
        t2 = new JTextField(50);
        t3 = new JTextField(50);
        t4 = new JTextField(50);

        b1 = new JButton(" UPDATE ");
        b2 = new JButton(" CANCEL ");

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
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagLayout.setConstraints(l4,gridBagConstraints);
        add(l4);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 20;
        gridBagLayout.setConstraints(l5,gridBagConstraints);
        add(l5);
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagLayout.setConstraints(t1,gridBagConstraints);
        add(t1);
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 10;
        gridBagLayout.setConstraints(t2,gridBagConstraints);
        add(t2);
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 15;
        gridBagLayout.setConstraints(t3,gridBagConstraints);
        add(t3);
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 20;
        gridBagLayout.setConstraints(t4,gridBagConstraints);
        add(t4);
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 35;
        gridBagLayout.setConstraints(b1,gridBagConstraints);
        add(b1);
        b1.setBackground(Color.black);
        b1.setForeground(Color.WHITE);
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 45;
        gridBagLayout.setConstraints(b2,gridBagConstraints);
        b2.setBackground(Color.black);
        b2.setForeground(Color.WHITE);
        add(b2);
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 15;

        setLayout(gridBagLayout);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumni","root","6290");
                Statement s = con.createStatement();

                String Name = t1.getText();
                String EMAIL = t2.getText();
                String PROFILE = t3.getText();
                String COUNTRY = t4.getText();

                String str1="UPDATE `alumni`.`civil` SET `E-mail Id` = '"+EMAIL+"', `Job Profile` = '"+PROFILE+"', `COUNTRY` = '"+COUNTRY+"' WHERE (`NAME` = '"+Name+"')";

                s.executeUpdate(str1);
                JOptionPane.showMessageDialog(null, "Record Updated!!!!!");
                con.close();

            } catch (SQLException throwables) {
                throwables.printStackTrace();
                System.out.println(throwables);
            } catch (ClassNotFoundException e) {
                System.out.println(e);
                e.printStackTrace();
            }

        }
        if (ae.getSource() == b2) {
            System.exit(0);
        }
    }

    public static void main() {
        UPDATION_YOUR_INFO   E = new UPDATION_YOUR_INFO ();
    }}


