import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Person person1 = new Person();
        System.out.println("Write name: ");
        person1.firsName= scanner.nextLine();
        System.out.println("Write surname:");
        person1.lastName=scanner.nextLine();
        System.out.println("Write email: ");
        person1 .email=scanner.nextLine();

        System.out.println("Name: "+ person1.firsName+" \nlastName: " );
        System.out.println("Novyi commit");



        }
    }
