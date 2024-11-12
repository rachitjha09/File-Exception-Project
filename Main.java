import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private Scanner scan;
    public void openFile() throws FileNotFoundException, Exception{
        File f=new File("input.txt");
        scan=new Scanner(f);
    }
    public void run(){
        try {
            openFile();
        } catch(FileNotFoundException f){
            System.out.println("File not found");
            System.exit(1);
        } catch(Exception e){
            System.out.println("Error occurred");
            System.exit(2);
        }
        try {
            File f = new File("input.txt");
            scan = new Scanner(f);
        } catch (FileNotFoundException fnf) {
            System.out.println("file cannot be found, Exiting.");
            System.exit(1);
        } catch (Exception e) {
            System.out.println("Unknown error, Exiting.");
            System.exit(2);
        }

        //read the file and print the contents
        try {
            String line = scan.nextLine();
            int integerInput = Integer.parseInt(line);
            System.out.println(integerInput);

            line = scan.nextLine();
            double doulbeInput = Double.parseDouble(line);
            System.out.println(doulbeInput);

            line = scan.nextLine();
            System.out.println(line);
        } catch (NumberFormatException nfe) {
            System.out.println("Integer or Decimal not found, Exiting");
            System.exit(3);
        } catch (Exception e) {
            System.out.println("Unknown error, Exiting");
            System.exit(4);
        }
    }
    public static void main(String[] args) {

    }
}

