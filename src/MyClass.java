public class MyClass {
    public static void main(String[] args) {
        String firstName = "Junior";
        String lastName = "Silva";

        String fullName = fullName(firstName, lastName);
        System.out.print(fullName);
    }

    public static String fullName (String firstName, String lastName) {
        return "Your name is " + firstName.concat(" ").concat(lastName);
    }

}
