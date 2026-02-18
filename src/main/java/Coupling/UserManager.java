package Coupling;

public class UserManager {
    private UserDataProvider userDataProvider;
    public UserManager(UserDataProvider userDataProvider){
        this.userDataProvider=userDataProvider;
    }
    //private UserDatabaseProvider userDatabase=new UserDatabaseProvider();
    public String getUserInfo(){
        return userDataProvider.getUserDetails();
    }
}
