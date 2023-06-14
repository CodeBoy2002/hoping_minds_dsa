import java.util.Scanner;

class DuckNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        boolean isDuckNumber = isDuck(number);
        
        if (isDuckNumber) {
            System.out.println(number + " is a duck number.");
        } else {
            System.out.println(number + " is not a duck number.");
        }
    }
    
    public static boolean isDuck(int number) {
        String numberString = String.valueOf(number);
        for (int i = 1; i < numberString.length(); i++) {
            if (numberString.charAt(i) == '0') {
                return true;
            }
        }
        
        return false;
    }
}
