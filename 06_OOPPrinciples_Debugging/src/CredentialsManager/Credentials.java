package CredentialsManager;

public class Credentials {

    private String username;
    private String password;
    private String[] oldPasswords;
    private int idx;

    Credentials(String username, String password) {
        this.username = username;
        this.password = password;
        this.oldPasswords = new String[100];
        this.idx = -1;

    }

    void changePassword(String newPassword, String currentPassword) {
        if (currentPassword.equals(this.password)) {
            for (int i = 0; i <= idx; i++) {
                if (oldPasswords[i].equals(newPassword)) {
                    return;
                }
            }
            if (this.password.equals(newPassword)) {
                return;
            }
            idx++;
            this.oldPasswords[idx] = this.password;
            this.password = newPassword;
            System.out.println("562");
        }
    }

    boolean chekPassword(String guess) {
        if (guess.equals(this.password)) {
            return true;
        }
        return false;
    }

}
