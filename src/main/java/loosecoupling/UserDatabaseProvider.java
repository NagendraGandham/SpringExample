package loosecoupling;

public class UserDatabaseProvider implements UserDataProvider{
    @Override
    public String getUserDetails(){
        //Directly access database here
        return "user Details From Database";
    }
}
