public class Main {
    public static void main(String[] args) {

        String personalCode = "1971024045366";
        String dateOfBirth = "1997/10/24";

        if ( personalCode.length() != 13) {
            System.out.println("CNP isn`t available");
        }

        if ( personalCode.charAt(0) % 2 == 0) {
            System.out.println("Sex: female");
        } else {
            System.out.println("Sex: male");
        }




    }
}