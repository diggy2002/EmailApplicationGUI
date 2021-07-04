import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;


public class EmailAppMain implements ActionListener {
    private static JLabel label;
    private static JLabel label1;
    private static JTextField companybox;
    private static JLabel label2;
    private static JLabel lastnamelabel;
    private static JLabel depylabel;
    private static JButton conbutton;
    private static JLabel success;
    private static JTextField lastnamebox;
    private static JTextField namebox;
    public static void main(String[] args) {

        //Instances of other classes
        firstname first = new firstname();
        lastname last = new lastname();
        department dep = new department();
        company comp = new company();
        passwordgen rando = new passwordgen();
        option opt = new option();

        JFrame frame = new JFrame();
        JPanel jPanel = new JPanel();
        JButton button = new JButton();
        JFrame frame2 = new JFrame();
        JPanel panel2 = new JPanel();



        frame.setSize(500,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(jPanel);

        jPanel.setLayout(null);

        //Label on screen
        label = new JLabel("~~~GNA LOGIN~~~");
        label.setBounds(230,20,250,25);
        jPanel.add(label);

        //Companyname
        label1 = new JLabel("Company name : ");
        label1.setBounds(10,50,150,25);
        jPanel.add(label1);
        //Company text box
        companybox = new JFormattedTextField();
        companybox.setBounds(130, 50,150,20);
        jPanel.add(companybox);

        //Name box
        label2 = new JLabel("First name : ");
        label2.setBounds(10 ,80,80,25);
        jPanel.add(label2);
        //Name text box
        namebox = new JFormattedTextField();
        namebox.setBounds(130, 80,150,20);
        jPanel.add(namebox);

        //Last name
        lastnamelabel = new JLabel("Last name : ");
        lastnamelabel.setBounds(10, 110,80,25);
        jPanel.add(lastnamelabel);
        //LASTnamebox
        lastnamebox = new JTextField();
        lastnamebox.setBounds(130,110,150,20);
        jPanel.add(lastnamebox);

        //Department
        depylabel = new JLabel("Department : ");
        depylabel.setBounds(10, 140,80,25);
        jPanel.add(depylabel);
        //Dapartmentbox
        JTextField deptbox= new JTextField();
        deptbox.setBounds(130,140,150,20);
        jPanel.add(deptbox);

        //Confirm buttom
        conbutton = new JButton("CONFIRM");
        conbutton.addActionListener(new EmailAppMain());
        conbutton.setBounds(230,190,100,20);
        jPanel.add(conbutton);

        //Success text
        success = new JLabel("");
        success.setBounds(230,230,130,20);
        jPanel.add(success);




//        //Scanner for user input to the terminal
//        Scanner scnr = new Scanner(System.in);
//
//        System.out.print("Welcome to IONOS business email creator please enter your company name : ");
//
//        String company =scnr.nextLine();
//        comp.setComp(company);
//        System.out.println();
//
//        System.out.print("Please enter your first name : ");
//
//        String name =scnr.nextLine();
//        first.setName(name);
//
//        System.out.println();
//        System.out.print("Now enter you last name :");
//
//        String name2 = scnr.nextLine();
//        last.setLstname(name2);
//
//        System.out.println();
//        System.out.print("What department do you work in? : ");
//        String department = scnr.nextLine();
//        dep.setDep(department);
//
//        System.out.println();
//        System.out.println("Congratulations your new email is created!");
//        System.out.println();
//        String email =(first.getName() + last.getLstname() + "@" + dep.getDep() + "." + comp.getComp() + ".com");
//        System.out.println(email);
//
//        System.out.println();
//        System.out.print("Generating password........ : ");
//        String alphabet = "*&^1234567890ABCDEFGHIJKLMNOP";
//        int length = 6;
//
//        Random rand = new Random();
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < length; i++) {
//            int index = rand.nextInt(alphabet.length());
//            char randomcharacter = alphabet.charAt(index);
//            sb.append(randomcharacter);
//        }
//        String randoms = sb.toString();
//        System.out.println(randoms);
//
//        System.out.println("Would you like to change this password? Select 'Y' or 'N'");
//        String passchange = scnr.nextLine();
//         if(passchange.equals("Y")){
//             System.out.println("Create you new password : ");
//             String passchange2 = scnr.nextLine();
//             rando.setPassword_create(passchange2);
//             System.out.println("Your new password is" + rando.getPassword_create());
//         }
//         if(passchange.equals("N")){
//             System.out.println("Password saved as " + randoms);
//         }
//
//         String option = " ";
//         while(option != "4"){
//             System.out.println("Please select an option below by it's number" + "\n" + "1) Show email address" + "\n"
//                     + "2) Send email" + "\n" + "3) Check inbox" + "\n" + "4) QUIT");
//             String myoption =scnr.nextLine();
//             if(myoption.equals("1")){
//                 System.out.println(email);
//             }
//             if(myoption.equals("2")) {
//                 System.out.println("Enter the email you would like to send a message to: ");
//                 String emailadd = scnr.nextLine();
//                 System.out.println("Enter your message: ");
//                 String message = scnr.nextLine();
//                 System.out.println("Press 'Y' to confirm the message");
//                 String confirm = scnr.nextLine();
//                 if (confirm.equals("Y")){
//                     System.out.println("Message sent to: " + emailadd + "\n" + "Message: " + message + "\n");
//                 }
//                 else{
//                     System.out.println("---Message deleted---");
//                 }
//             }
//
//             String[] inbox = {"Welcome to " + company + " we look forward to our partnership!" + "\n" + "- Joe Smith"};
//
//             if (myoption.equals("3")){
//                 System.out.println(inbox);
//             }
//             if (myoption.equals("4")){
//                 System.out.println("Exiting program.....");
//                 break;
//             }
//         }
//
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user1 =namebox.getText();
        String last1 = lastnamebox.getText();
        //System.out.println(user1 +" "+ last1);
        if (user1.equals("Diego") && last1.equals("McDaniel")){
            success.setText("Successful Login!");
        }
        else{
            success.setText(" LOGIN ERROR RETRY");
        }

    }
}
