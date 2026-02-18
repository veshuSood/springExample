package Coupling;

public class UserDatabaseProvider implements UserDataProvider{
    @Override
    public String getUserDetails() {
        //directly access database here
        return "User details from database: ";
    }
}
