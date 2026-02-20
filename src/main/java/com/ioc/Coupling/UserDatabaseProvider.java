package com.ioc.Coupling;

public class UserDatabaseProvider implements UserDataProvider {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getUserDetails() {
        //directly access database here
        return "User details from database: ";
    }
}
