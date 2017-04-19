package CredentialsManager;

public class Task2_CredentialsManager_main {

    public static void main(String[] args) {
        Credentials x = new Credentials("Lyubo", "1234");
        x.changePassword("5678", "1234");
        //x.changePassword("1234", "5678");
        x.changePassword("5678", "5678");
        x.changePassword(null, "5678");
    }

}
