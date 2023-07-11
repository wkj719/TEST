//This is vulerability test code about Java Language
class GrantAccess {
  public static void displayAccountStatus() {
    System.out.println("Account details for admin: XX");
  }
}
 
class GrantUserAccess extends GrantAccess {
  public static void displayAccountStatus() {
    System.out.println("Account details for user: XX");
  }
}
 
public class StatMethod {
  public static void choose(String username) {
    GrantAccess admin = new GrantAccess();
    GrantAccess user = new GrantUserAccess();
    if (username.equals("admin")) {
      admin.displayAccountStatus();
    } else {
      user.displayAccountStatus();
    }
  }
 
  public static void main(String[] args) {
    choose("user");
  }
}
