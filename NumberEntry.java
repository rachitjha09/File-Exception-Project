import java.util.Scanner;
public class NumberEntry {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        try {
            System.out.println("Enter a number 1-10:");
            String line = s.nextLine();
            int integerInput = Integer.parseInt(line);

            if(integerInput<1 || integerInput>10){
                NumberFormatException nfe=new NumberFormatException();
                throw nfe;
            }
            System.out.println("You entered a: " + integerInput);

        } catch(NumberFormatException e){
            System.out.println("NumberFormatException occurred");
            System.exit(1);
        } catch(Exception e){
            System.out.println("Exception occurred");
            System.exit(2);
        }
        s.close();
    }
}
