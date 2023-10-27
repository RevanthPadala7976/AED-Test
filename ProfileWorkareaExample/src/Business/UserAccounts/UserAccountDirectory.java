/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccounts;

import Business.Person.Person;
import Business.Profiles.Profile;

import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author kal bugrara
 */
public class UserAccountDirectory{
    
      ArrayList<UserAccount> useraccountlist ;
    
      public UserAccountDirectory (){
          
       useraccountlist = new ArrayList();

    }

    public UserAccount newUserAccount(Profile p, String un, String pw, boolean isEnabled) {

        UserAccount ua = new UserAccount (p,  un,  pw, isEnabled);
        useraccountlist.add(ua);
        return ua;
    }

    public UserAccount findUserAccount(String id) {

        for (UserAccount ua : useraccountlist) {

            if (ua.isMatch(id)) {
                return ua;
            }
        }
            return null; //not found after going through the whole list
         }
     public UserAccount AuthenticateUser(String un, String pw) {

        for (UserAccount ua : useraccountlist) {

            if (ua.IsValidUser(un, pw)) {
                return ua;
            }
        }
            return null; //not found after going through the whole list
         }   
     public ArrayList<UserAccount> getUserAccountList()
     {
         return useraccountlist;
     }
     
     
    //TO VALIDATE USERNAME
    public boolean checkUserName(String userName){
         for(UserAccount ua : useraccountlist){
             
            if (ua.getUserLoginName().equalsIgnoreCase(userName)) {
                return true;
            }
        }
         return false;
    }
    
    
    //Validating Password
    public boolean PasswordChecker(String password, String confirmPassword){
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[^a-zA-Z\\d]).{8,}$";
        //this will return true or false
        return password.matches(regex) && password.equals(confirmPassword);   
    }
    
    
    //UseraccoutDirectoryOutput
    public void UseraccountDirectoryOutput(){
        int i = 0;
        
        for (UserAccount user : useraccountlist){
            
            Profile profile = user.getAssociatedPersonProfile();
            Person p = profile.getPerson();
            
            System.out.println(i + ". [Firstname: " + p.getFirstName() + ", Lastname: " + p.getLastName()
            + ", EmailID: " + p.getEmailID() + ", Role: "+profile.getRole() + "]");
            
            i++;
 
        }
    }
}
