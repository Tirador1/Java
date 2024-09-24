package solid.SingleResponsibilityPrinciple;

import static solid.SingleResponsibilityPrinciple.UserValidator.validatePassword;
import static solid.SingleResponsibilityPrinciple.UserValidator.validateUsername;

public class UserAuthenticator {
  public static boolean authenticateUser(String username, String password) {
    return validateUsername(username) && validatePassword(password);
  }
}