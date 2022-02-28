import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class INSERT_EVENT extends JFrame implements ActionListener{
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


    public INSERT_EVENT()
    {
        super("NEW EVENT ORGANISATION");
        setSize(600,600);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);


        font1 = new Font("TimesNewRoman",Font.BOLD,50);
        font2 = new Font("TimesNewRoman",Font.BOLD,15);

        gridBagLayout = new GridBagLayout();

        gridBagConstraints = new GridBagConstraints();
        l1 = new JLabel(" NEW EVENT ");
        l2 = new JLabel(" DATE: ");
        l3 = new JLabel(" EVENT DETAILS: ");
        l4 = new JLabel(" PLACE: ");
        l5 = new JLabel(" DEPARTMENT: ");

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

        t1 = new JTextField(70);
        t2 = new JTextField(70);
        t3 = new JTextField(70);
        t4 = new JTextField(70);

        b1 = new JButton(" SUBMIT ");
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

                String Date = t1.getText();
                String Details = t2.getText();
                String Place = t3.getText();
                String Branch = t4.getText();

                String str ="insert into event values('"+Date+"','"+Details+"','"+Place+"','"+Branch+"')";
                s.executeUpdate(str);
                JOptionPane.showMessageDialog(null, "Record Updated!!!!!");
                con.close();
            }
            catch (Exception e) {


            }
        if (ae.getSource() == b2) {
            System.exit(0);
        }
    }}
    public static void main() {
        INSERT_EVENT E = new INSERT_EVENT();
    }}


