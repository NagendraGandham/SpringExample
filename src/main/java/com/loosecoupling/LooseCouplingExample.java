package com.loosecoupling;


public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider databaseProvider=new UserDatabaseProvider();
        UserManager userManagerWithDB=new UserManager(databaseProvider);
        System.out.println(userManagerWithDB.getUserinfo());

        UserDataProvider webServiceProvider=new UserWebServiceDataProvider();
        UserManager userManagerWithWS=new UserManager(webServiceProvider);
        System.out.println(userManagerWithWS.getUserinfo());
    }

}
