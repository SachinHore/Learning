package ui;

import model.User;
import service.UserService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserLoginWindow {
    JFrame jFrame;
    JLabel message;
    UserService userService = new UserService();
    public UserLoginWindow(){
        jFrame = new JFrame("User Management System : User Login Window");

        /*InputVerifier inputVerifier = new InputVerifier() {
            @Override
            public boolean verify(JComponent input) {
                return false;
            }
        };*/
        message = new JLabel();
        message.setText("Welcome in User Management System");
        message.setBounds(100,30,300,30);
        jFrame.add(message);

        JLabel jLabelUserName = new JLabel("Enter User Name :");
        jLabelUserName.setBounds(50,100,200,30);
        jFrame.add(jLabelUserName);
        JTextField jTextFieldUserName = new JTextField();
        jTextFieldUserName.setBounds(170,100,200,30);
        jFrame.add(jTextFieldUserName);

        JLabel jLabelUserPassword = new JLabel("Enter Password :");
        jLabelUserPassword.setBounds(50,200,200,30);
        jFrame.add(jLabelUserPassword);
        JPasswordField jPasswordFieldUserPassword = new JPasswordField();
        jPasswordFieldUserPassword.setBounds(170,200,200,30);
        jFrame.add(jPasswordFieldUserPassword);

        JButton jButton=new JButton("Login");
        jButton.setBounds(200,300,95,30);
        jFrame.add(jButton);
        jButton.addActionListener ( new ActionListener()
        {
            public void actionPerformed( ActionEvent e )
            {
                String userName = jTextFieldUserName.getText();
                String userPassword = jPasswordFieldUserPassword.getText();
                User user = userService.validateUser(userName,userPassword);
                if(user != null){
                    if(user.getIsAdmin()){
                        new AdminDashboard(user);
                    }
                    else {
                        new UserDashboard(user);
                    }
                    jFrame.setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(jFrame,"please enter valid details");
                }
            }
        });

        jFrame.setBounds(750,250,500,500);
        jFrame.setLayout(null);
        jFrame.setVisible(true);

    }
}
