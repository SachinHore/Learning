package ui;

import model.User;
import service.UserService;
import javax.swing.*;
import java.util.ArrayList;

class AdminDashboard {
    private UserService userService = new UserService();
    private JFrame jFrame;
    private JPanel jPanel=new JPanel();
    private JTable table;
    private ArrayList<User> al;
    private JButton jButtonAllUsers;

    AdminDashboard(User user){
        jFrame = new JFrame("User Management System : Admin Dashboard Window");
        jFrame.setBounds(500,100,1000,800);
        jFrame.setLayout(null);

        JButton jButtonBack=new JButton("Logout");
        jButtonBack.setBounds(880,0,100,30);
        jFrame.add(jButtonBack);
        jButtonBack.addActionListener (e -> {
            new UserLoginWindow();
            jFrame.setVisible(false);
        });

        jButtonAllUsers=new JButton("Users List");
        jButtonAllUsers.setBounds(0,0,100,30);
        jFrame.add(jButtonAllUsers);
        jButtonAllUsers.addActionListener (e -> {
            newPanel();
            JPanel jPanel1 = new JPanel();
            jPanel1.setVisible(false);
            jPanel1.setBounds(250,30,500,450);
            jPanel.add(jPanel1);

            String column[]={"ID","FName","LName","UserName","isAdmin"};
            al = userService.getAllUsers();
            Object data[][]=new Object[al.size()][5];
            for(int i=0; i<al.size(); i++){
                data[i][0] = al.get(i).getId();
                data[i][1] = al.get(i).getfName();
                data[i][2] = al.get(i).getlName();
                data[i][3] = al.get(i).getUserName();
                data[i][4] = al.get(i).getIsAdmin();
            }
            table=new JTable(data,column);
            JScrollPane jScrollPane = new JScrollPane(table);
            jPanel1.add(jScrollPane);

            JButton jButtonDeleteUser=new JButton("Delete selected User");
            jButtonDeleteUser.setBounds(400,500,200,30);
            jPanel.add(jButtonDeleteUser);
            jButtonDeleteUser.addActionListener (e12 -> {
                if(al!=null) {
                    int[] a = table.getSelectedRows();
                    for (int i = 0; i < a.length; i++) {
                        userService.deleteUserById(al.get(a[i]).getId());
                    }
                    jButtonAllUsers.doClick();
                }
            });

            jPanel.setLayout(null);
            jPanel1.setVisible(true);
            jPanel.setVisible(true);
        });

        JButton jButtonAddUser=new JButton("Add User");
        jButtonAddUser.setBounds(100,0,100,30);
        jFrame.add(jButtonAddUser);
        jButtonAddUser.addActionListener (e -> {
            newPanel();
            JLabel jLabelFirstName = new JLabel("Enter First Name :");
            jLabelFirstName.setBounds(50,50,200,30);
            jPanel.add(jLabelFirstName);
            JTextField jTextFieldFirstName = new JTextField();
            jTextFieldFirstName.setBounds(170,50,200,30);
            jPanel.add(jTextFieldFirstName);

            JLabel jLabelLastName = new JLabel("Enter Last Name :");
            jLabelLastName.setBounds(50,100,200,30);
            jPanel.add(jLabelLastName);
            JTextField jTextFieldLastName = new JTextField();
            jTextFieldLastName.setBounds(170,100,200,30);
            jPanel.add(jTextFieldLastName);

            JLabel jLabelUserName = new JLabel("Enter User Name :");
            jLabelUserName.setBounds(50,150,200,30);
            jPanel.add(jLabelUserName);
            JTextField jTextFieldUserName = new JTextField();
            jTextFieldUserName.setBounds(170,150,200,30);
            jPanel.add(jTextFieldUserName);

            JLabel jLabelUserpass1 = new JLabel("Enter password :");
            jLabelUserpass1.setBounds(50, 200, 200, 30);
            jPanel.add(jLabelUserpass1);
            JPasswordField jPassFieldUserpass1 = new JPasswordField();
            jPassFieldUserpass1.setBounds(170, 200, 200, 30);
            jPanel.add(jPassFieldUserpass1);

            JLabel jLabelUserpass2 = new JLabel("Confirm password :");
            jLabelUserpass2.setBounds(50, 250, 200, 30);
            jPanel.add(jLabelUserpass2);
            JPasswordField jPassFieldUserpass2 = new JPasswordField();
            jPassFieldUserpass2.setBounds(170, 250, 200, 30);
            jPanel.add(jPassFieldUserpass2);

            JLabel jLabelisAdmin = new JLabel("Enter User isAdmin :");
            jLabelisAdmin.setBounds(50,300,200,30);
            jPanel.add(jLabelisAdmin);
            JRadioButton r1=new JRadioButton("true");
            JRadioButton r2=new JRadioButton("false");
            r1.setBounds(200,300,100,30);
            r2.setBounds(300,300,100,30);
            ButtonGroup bg=new ButtonGroup();
            r2.doClick();
            bg.add(r1);bg.add(r2);
            jPanel.add(r1);
            jPanel.add(r2);

            JButton jButton=new JButton("Add User");
            jButton.setBounds(200,350,95,30);
            jPanel.add(jButton);
            jButton.addActionListener (e13 -> {
                String userName = jTextFieldUserName.getText();
                String userPassword =jPassFieldUserpass1.getText();
                String fName = jTextFieldFirstName.getText();
                String lName = jTextFieldLastName.getText();

                if(userName.equals("") || userPassword.equals("") || fName.equals("") || lName.equals("")){
                    newMessageWindow("Please fill all the fields");
                }
                else {
                    if(userPassword.equals(jPassFieldUserpass2.getText())){
                        boolean isAdmin=false;
                        if(r1.isSelected()){
                            isAdmin=true;
                        }
                        if(userService.isUserNameExist(userName)){
                            newMessageWindow("Username = '"+userName+"' already exist");
                        }
                        else{
                            userService.addUser(new User(fName,lName,userName,userPassword,isAdmin));
                            jButton.doClick();
                            newMessageWindow("User Added");
                        }
                    }
                    else {
                        newMessageWindow("Password does not match");
                    }
                }


            });

            jPanel.setLayout(null);
            jPanel.setVisible(true);
        });

        JButton jButtonUpdateUser=new JButton("Update User");
        jButtonUpdateUser.setBounds(200,0,110,30);
        jFrame.add(jButtonUpdateUser);
        jButtonUpdateUser.addActionListener (e -> {
            newPanel();
            JLabel jLabelUserId = new JLabel("Enter User Id :");
            jLabelUserId.setBounds(50,50,200,30);
            jPanel.add(jLabelUserId);
            JTextField jTextFieldUserId = new JTextField();
            jTextFieldUserId.setBounds(170,50,200,30);
            jPanel.add(jTextFieldUserId);

            JButton jButton=new JButton("Get User");
            jButton.setBounds(200,100,100,30);
            jPanel.add(jButton);
            jButton.addActionListener (e14 -> {
                try{
                    Long id = Long.valueOf(jTextFieldUserId.getText());
                    User user1 = userService.getUserbyId(id);

                    if (user1 != null) {
                        newPanel();
                        JLabel jLabelFirstName = new JLabel("Enter First Name :");
                        jLabelFirstName.setBounds(50, 50, 200, 30);
                        jPanel.add(jLabelFirstName);
                        JTextField jTextFieldFirstName = new JTextField(user1.getfName());
                        jTextFieldFirstName.setBounds(170, 50, 200, 30);
                        jPanel.add(jTextFieldFirstName);

                        JLabel jLabelLastName = new JLabel("Enter Last Name :");
                        jLabelLastName.setBounds(50, 100, 200, 30);
                        jPanel.add(jLabelLastName);
                        JTextField jTextFieldLastName = new JTextField(user1.getlName());
                        jTextFieldLastName.setBounds(170, 100, 200, 30);
                        jPanel.add(jTextFieldLastName);

                        JLabel jLabelUserpass1 = new JLabel("Enter password :");
                        jLabelUserpass1.setBounds(50, 150, 200, 30);
                        jPanel.add(jLabelUserpass1);
                        JPasswordField jPassFieldUserpass1 = new JPasswordField(user1.getUserPassword());
                        jPassFieldUserpass1.setBounds(170, 150, 200, 30);
                        jPanel.add(jPassFieldUserpass1);

                        JLabel jLabelUserpass2 = new JLabel("Confirm password :");
                        jLabelUserpass2.setBounds(50, 200, 200, 30);
                        jPanel.add(jLabelUserpass2);
                        JPasswordField jPassFieldUserpass2 = new JPasswordField(user1.getUserPassword());
                        jPassFieldUserpass2.setBounds(170, 200, 200, 30);
                        jPanel.add(jPassFieldUserpass2);

                        JLabel jLabelisAdmin = new JLabel("Enter User isAdmin :");
                        jLabelisAdmin.setBounds(50, 250, 200, 30);
                        jPanel.add(jLabelisAdmin);
                        JRadioButton r1 = new JRadioButton("true");
                        JRadioButton r2 = new JRadioButton("false");
                        r1.setBounds(200, 250, 100, 30);
                        r2.setBounds(300, 250, 100, 30);
                        ButtonGroup bg = new ButtonGroup();
                        if (user1.getIsAdmin() == true) r1.doClick();
                        else r2.doClick();
                        bg.add(r1);
                        bg.add(r2);
                        jPanel.add(r1);
                        jPanel.add(r2);

                        JButton jButton1 = new JButton("Update User");
                        jButton1.setBounds(200, 350, 150, 30);
                        jPanel.add(jButton1);
                        jButton1.addActionListener(e141 -> {
                            if (jPassFieldUserpass1.getText().equals(jPassFieldUserpass2.getText())) {
                                user1.setfName(jTextFieldFirstName.getText());
                                user1.setlName(jTextFieldLastName.getText());
                                user1.setIsAdmin(false);
                                if (r1.isSelected()) {
                                    user1.setIsAdmin(true);
                                }
                                user1.setUserPassword(jPassFieldUserpass1.getText());
                                userService.updateUser(user1);
                                jButtonUpdateUser.doClick();
                                newMessageWindow("User Updated");
                            } else {
                                newMessageWindow("Password does not match");
                            }


                        });
                        jPanel.setLayout(null);
                        jPanel.setVisible(true);
                    } else {
                        newMessageWindow("User does not exist");
                    }

                }catch (NumberFormatException e1){
                    newMessageWindow("Enter valid id");
                }

            });

            jPanel.setLayout(null);
            jPanel.setVisible(true);
        });
        jButtonAllUsers.doClick();
        jFrame.setVisible(true);
    }

    private void newPanel(){
        jPanel.setVisible(false);
        jPanel = new JPanel();
        jPanel.setBounds(0,30,1000,770);
        jPanel.setSize(1000,770);
        jFrame.add(jPanel);
        jFrame.setSize(1000,770);
    }

    private void newMessageWindow(String msg){
        JOptionPane.showMessageDialog(jFrame,msg);
    }

}
