package loosecouplingIoc;

public class UserWebServiceDataProvider implements UserDataProvider {

    public String getUserDetails(){
        return "Fetch data from Web Service";
    }

}
