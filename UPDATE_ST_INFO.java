import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Vector;
public class UPDATE_ST_INFO extends JFrame implements ActionListener{
    JLabel l, l1, l2, l3, l4, l5;
    JButton b;
    JTextField tf1, tf2, tf3,tf4;
    JComboBox bx;
    String str;

    public UPDATE_ST_INFO () {
        setVisible(true);
        setSize(700, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("STUDENT INFORMATION UPDATE");
        l = new JLabel("Select Id:");
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

            PreparedStatement ps = con.prepareStatement("select Id from studentlogin");

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

        updateData();

    }

    private void updateData() {
    UPDATION_STUDENT.main();

    }




    public static void main() {

        new UPDATE_ST_INFO();

    }

}