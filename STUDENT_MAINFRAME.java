import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class STUDENT_MAINFRAME extends JFrame {
    public static void main() {
        new STUDENT_MAINFRAME().setVisible(true);
    }

    public STUDENT_MAINFRAME() {
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



        JLabel AlumniManagementSystem = new JLabel("AMITY ALUMNI ASSOCIATION  WELCOMES YOU");
        AlumniManagementSystem.setForeground(Color.BLUE);
        AlumniManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 36));
        AlumniManagementSystem.setBounds(350, 60, 1500, 35);
        NewLabel.add(AlumniManagementSystem);
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu AlumniSystem = new JMenu("ALUMNI TRACKING");
        AlumniSystem.setForeground(Color.BLUE);
        menuBar.add(AlumniSystem);

        JMenuItem CIVIL = new JMenuItem(" ALUMNI_OF_CIVIL_ENGINEERING_CIVIL_ENGINEERING   ");
        AlumniSystem.add(CIVIL);

        JMenuItem CSE = new JMenuItem("ALUMNI_OF_COMPUTER_SCIENCE_ENGINEERING ");
        AlumniSystem.add(CSE);

        JMenuItem IT = new JMenuItem("ALUMNI_OF_INFORMATION_TECHNOLOGY_DEPARTMENT");
        AlumniSystem.add(IT);

        JMenuItem MECHANICAL = new JMenuItem("ALUMNI_OF_MECHANICAL_ENGINEERING ");
        AlumniSystem.add(MECHANICAL);

        JMenuItem ECE = new JMenuItem("ALUMNI_OF_ELECTRONICS_COMMUNICATION_ENGINEERING ");
        AlumniSystem.add(ECE);

        JMenu EVENT = new JMenu("EVENTS");
        EVENT.setForeground(Color.RED);
        menuBar.add(EVENT);

        JMenuItem EVENTS = new JMenuItem("EVENT INFORMATION ");
        EVENT.add(EVENTS);

        JMenu CONTACT = new JMenu("CONTACT US");
        CONTACT.setForeground(Color.BLUE);
        menuBar.add(CONTACT);

        JMenuItem CONT = new JMenuItem("CONTACT INFORMATION");
        CONTACT.add(CONT);

        JMenu Misc = new JMenu("ACHIEVERS");
        Misc.setForeground(Color.RED);
        menuBar.add(Misc);

        JMenuItem ACHIV = new JMenuItem("ACHIEVERS INFORMATION");
        Misc.add(ACHIV);

        CIVIL.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                ALUMNI_OF_CIVIL_ENGINEERING.main();
            }
        });
        CSE.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                ALUMNI_OF_COMPUTER_SCIENCE_ENGINEERING.main();
            }
        });
        IT.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                ALUMNI_OF_INFORMATION_TECHNOLOGY.main();
            }
        });
        MECHANICAL.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                ALUMNI_OF_MECHANICAL_ENGINEERING.main();
            }
        });
        ECE.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                ALUMNI_OF_ELECTRONICS_COMMUNICATION_ENGINEERING.main();
            }
        });
        EVENTS.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                EVENT_INFORMATION.main();
            }
        });
        CONT.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                CONTACT_US.main();
            }
        });
        ACHIV.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                ACHIEVERS.main();
            }
        });
    }
}

