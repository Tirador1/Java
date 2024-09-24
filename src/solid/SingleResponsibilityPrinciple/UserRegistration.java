package solid.SingleResponsibilityPrinciple;

import static solid.SingleResponsibilityPrinciple.UserValidator.validatePassword;
import static solid.SingleResponsibilityPrinciple.UserValidator.validateUsername;

public class UserRegistration {
  public static boolean registerUser(String username, String password) {
    return validateUsername(username) && validatePassword(password);
  }
}