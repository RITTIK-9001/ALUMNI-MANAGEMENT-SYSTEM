import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Vector;
public class   ALUMNI_OF_MECHANICAL_ENGINEERING extends JFrame implements ActionListener  {
    JLabel l, l1, l2, l3, l4, l5;
    JButton b;
    JTextField tf1, tf2, tf3,tf4;
    JComboBox bx;
    String str;

    public  ALUMNI_OF_MECHANICAL_ENGINEERING() {
        setVisible(true);
        setSize(700, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("AMITY ALUMNI ASSOCIATION OF MECHANICAL ENGINEERING");
        l = new JLabel("Select Name:");
        b = new JButton("Submit");

        tf1 = new JTextField();

        tf2 = new JTextField();

        tf3 = new JTextField();

        tf4 = new JTextField();



        l.setBounds(20, 20, 200, 20);

        b.setBounds(50, 50, 150, 30);



        add(l);

        add(b);



        tf1.setEditable(false);

        tf2.setEditable(false);

        tf3.setEditable(false);
        tf4.setEditable(false);


        b.addActionListener(this);


        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/alumni","root","6290");

            PreparedStatement ps = con.prepareStatement("select NAME from mech");

            ResultSet rs = ps.executeQuery();

            Vector v = new Vector();

            while (rs.next()) {

                String s = rs.getString(1);



                v.add(s);

            }

            bx = new JComboBox(v);

            bx.setBounds(240, 20, 200, 20);

            add(bx);



        } catch (Exception ex) {

            System.out.println(ex);
        }

    }

    public void actionPerformed(ActionEvent e) {

        showData();

    }



    public void showData() {

        JFrame f1 = new JFrame();

        f1.setVisible(true);

        f1.setSize(500, 500);

        f1.setLayout(null);

        f1.setTitle("AMITY ALUMNI ASSOCIATION OF MECHANICAL ENGINEERING");



        l5 = new JLabel("Displaying Alumni Data:");

        l5.setForeground(Color.red);

        l5.setFont(new Font("Serif", Font.BOLD, 20));

        l1 = new JLabel("Alumni Name:");

        l2 = new JLabel("Alumni Email:");

        l3 = new JLabel(" Alumni job profile:");

        l4 = new JLabel(" Current Country:");


        l5.setBounds(100, 50, 300, 30);

        l1.setBounds(20, 110, 200, 20);

        l2.setBounds(20, 140, 200, 20);

        l3.setBounds(20, 170, 200, 20);

        l4.setBounds(20, 200, 200, 20);



        tf1.setBounds(240, 110, 200, 20);

        tf2.setBounds(240, 140, 200, 20);

        tf3.setBounds(240, 170, 200, 20);

        tf4.setBounds(240, 200, 200, 20);



        f1.add(l5);

        f1.add(l1);

        f1.add(tf1);

        f1.add(l2);

        f1.add(tf2);

        f1.add(l3);

        f1.add(tf3);

        f1.add(tf4);

        f1.add(l4);





        str = (String) bx.getSelectedItem();

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumni","root","6290");

            PreparedStatement ps = con.prepareStatement("select * from mech where NAME=?");

            ps.setString(1, str);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {



                tf1.setText(rs.getString(2));

                tf2.setText(rs.getString(3));

                tf3.setText(rs.getString(4));
                tf4.setText(rs.getString(5));


            }

        } catch (Exception ex) {

            System.out.println(ex);

        }

    }



    public static void main() {

        new   ALUMNI_OF_MECHANICAL_ENGINEERING();

    }

}

