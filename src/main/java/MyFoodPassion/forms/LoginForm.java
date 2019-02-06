package MyFoodPassion.forms;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginForm {

    @Size(min=2, max=30, message="Username size should be in the range [2...30]")
    private static String userName;

    @NotNull
    @Size(min=1, max=50)
    private static String password;

    public static String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public static String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
