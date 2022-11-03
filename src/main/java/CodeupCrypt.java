import java.util.Scanner;

public class CodeupCrypt {
    public static double version;

    public static String hashPassword(String password){
      String hash = "";
      for (char character : password.toCharArray()) {
          switch (character) {
              case 'a':
              case 'A':
                  hash += 4;
                  break;
              case 'e':
              case 'E':
                  hash += 3;
                  break;
              case 'i':
              case 'I':
                  hash += 1;
                  break;
              case 'o':
              case 'O':
                  hash += 0;
                  break;
              case 'u':
              case 'U':
                  hash += 9;
                  break;
              default:
                hash += character;


          }
      }
      return hash;

      }


public static  boolean checkPassword(String pass, String hash){
        return hash.equals(hashPassword(pass));
}


    public static void main(String[] args) {
        System.out.println(hashPassword("AardvarkianAstronauts"));
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter a password: ");



        String usersInput = scanner.nextLine();
        String usersPassWord = hashPassword(usersInput);
        System.out.printf("The password of %s has been hashed to: %s%nResult: %b", usersInput, usersPassWord, checkPassword(usersInput, usersPassWord));
    }





}//End of CodeupCrypt Class

