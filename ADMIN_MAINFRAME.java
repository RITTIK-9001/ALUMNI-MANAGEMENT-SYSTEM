import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ADMIN_MAINFRAME extends JFrame {
    public static void main() {
        new ADMIN_MAINFRAME().setVisible(true);
    }

    public ADMIN_MAINFRAME() {
        super("AMITY ALUMNI ASSOCIATION");
        initialize();
}

    private void initialize() {

        setForeground(Color.CYAN);
        setLayout(null);

        JLabel NewLabel = new JLabel("");
        NewLabel.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/HOME.jpg")));
        NewLabel.setBounds(50, 10, 2420, 790);
        add(NewLabel);



        JLabel AlumniManagementSystem = new JLabel("AMITY ALUMNI ASSOCIATION ADMIN FORUM");
        AlumniManagementSystem.setForeground(Color.BLUE);
        AlumniManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 36));
        AlumniManagementSystem.setBounds(350, 60, 1500, 35);
        NewLabel.add(AlumniManagementSystem);
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu AlumniSystem = new JMenu("UPDATE DATA");
        AlumniSystem.setForeground(Color.BLUE);
        menuBar.add(AlumniSystem);


        JMenuItem INSE = new JMenuItem(" INSERT NEW EVENT INFORMATION ");
        AlumniSystem.add(INSE);

        JMenuItem STD = new JMenuItem("UPDATE STUDENT INFO ");
        AlumniSystem.add(STD);


        JMenuItem INS = new JMenuItem(" INSERT NEW STUDENT INFORMATION ");
        AlumniSystem.add(INS);

        JMenu VA = new JMenu("VIEW AS");
        VA.setForeground(Color.RED);
        menuBar.add(VA);

        JMenuItem PUB = new JMenuItem("VIEW AS PUBLIC ");
        VA.add(PUB);


        INSE.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
            INSERT_EVENT.main();
            }
        });

        STD.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
            UPDATE_ST_INFO.main();
            }
        });

        INS.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
            INSERT_STUDENT.main();
            }
        });

        PUB.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                VIEW.main();
            }
        });

    }
}