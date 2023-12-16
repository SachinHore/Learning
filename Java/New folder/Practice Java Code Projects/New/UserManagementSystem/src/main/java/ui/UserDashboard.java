package ui;

import model.User;
import service.UserService;

import javax.swing.*;

class UserDashboard {
    private UserService userService = new UserService();
    private JFrame jFrame;
    private User user;
    private JPanel jPanel;

    UserDashboard(User user1){
        user = user1;
        jFrame = new JFrame("User Management System : User Dashboard Window");
        jFrame.setBounds(500,100,1000,800);
        jFrame.setLayout(null);

        JButton jButtonBack=new JButton("Logout");
        jButtonBack.setBounds(880,0,100,30);
        jFrame.add(jButtonBack);
        jButtonBack.addActionListener (e -> {
            new UserLoginWindow();
            jFrame.setVisible(false);
        });

        jPanel=new JPanel();
        jPanel.setBounds(250,50,500,500);
        jPanel.setLayout(null);
        jFrame.add(jPanel);

        JLabel message = new JLabel();
        message.setText("Welcome "+user.getfName()+" "+user.getlName());
        message.setBounds(100,10,200,30);
        jPanel.add(message);


        JLabel jLabelFirstName = new JLabel("Enter First Name :");
        jLabelFirstName.setBounds(50, 50, 200, 30);
        jPanel.add(jLabelFirstName);
        JTextField jTextFieldFirstName = new JTextField(user.getfName());
        jTextFieldFirstName.setBounds(170, 50, 200, 30);
        jPanel.add(jTextFieldFirstName);

        JLabel jLabelLastName = new JLabel("Enter Last Name :");
        jLabelLastName.setBounds(50, 100, 200, 30);
        jPanel.add(jLabelLastName);
        JTextField jTextFieldLastName = new JTextField(user.getlName());
        jTextFieldLastName.setBounds(170, 100, 200, 30);
        jPanel.add(jTextFieldLastName);

        JLabel jLabelUserpass1 = new JLabel("Enter password :");
        jLabelUserpass1.setBounds(50, 150, 200, 30);
        jPanel.add(jLabelUserpass1);
        JPasswordField jPassFieldUserpass1 = new JPasswordField(user.getUserPassword());
        jPassFieldUserpass1.setBounds(170, 150, 200, 30);
        jPanel.add(jPassFieldUserpass1);

        JLabel jLabelUserpass2 = new JLabel("Confirm password :");
        jLabelUserpass2.setBounds(50, 200, 200, 30);
        jPanel.add(jLabelUserpass2);
        JPasswordField jPassFieldUserpass2 = new JPasswordField(user.getUserPassword());
        jPassFieldUserpass2.setBounds(170, 200, 200, 30);
        jPanel.add(jPassFieldUserpass2);


        JButton jButton1 = new JButton("Update User");
        jButton1.setBounds(200, 250, 150, 30);
        jPanel.add(jButton1);
        jButton1.addActionListener(e -> {
            if (jPassFieldUserpass1.getText().equals(jPassFieldUserpass2.getText())) {
                user.setfName(jTextFieldFirstName.getText());
                user.setlName(jTextFieldLastName.getText());
                user.setUserPassword(jPassFieldUserpass1.getText());
                userService.updateUser(user);
                newMessageWindow("User Updated");
            } else {
                newMessageWindow("Password does not match");
            }
        });

        jPanel.setVisible(true);
        jFrame.setVisible(true);
    }

    private void newMessageWindow(String msg){
        JOptionPane.showMessageDialog(jFrame,msg);
    }
}
