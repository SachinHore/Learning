package service;

import DAO.UserDAO;
import model.User;

import java.util.ArrayList;

public class UserService {
    UserDAO userDAO = new UserDAO();

    public User validateUser(String userName, String userPassword){

        return userDAO.getUser(userName,userPassword);
    }

    public ArrayList<User> getAllUsers(){
        return userDAO.getAllUsers();
    }

    public void deleteUserById(Long id){
        userDAO.deleteUser(id);
    }

    public void addUser(User user){
        userDAO.saveUser(user);
    }

    public User getUserbyId(Long id){
        return userDAO.getUserbyId(id);
    }

    public void updateUser(User user){
        userDAO.updateUser(user);
    }

    public boolean isUserNameExist(String userName)
    {
        if(userDAO.getUserbyUserName(userName)!=null) return true;
        else return false;
    }
}
