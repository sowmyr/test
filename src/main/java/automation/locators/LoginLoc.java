package automation.locators;

import org.openqa.selenium.By;

public interface LoginLoc {

public static By UserName = By.cssSelector("input#j_username"); 
public static By Password = By.cssSelector("input#j_password");
public static By LoginBtn = By.cssSelector("#loginForm>button");

public static By InvalidLoginAlertMsg = By.cssSelector("div.alert-message p");

public static By PreBookUsername = By.cssSelector(".form-group input#j_username");
public static By PreBookPassword = By.cssSelector(".form-group input#j_password");
public static By PreBookLoginBtn = By.cssSelector(".btn.btn-primary.btn-block");
}
