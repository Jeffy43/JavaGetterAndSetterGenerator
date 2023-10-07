import java.util.Scanner;
public class Generator {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Welcome to the AP Java getter and setter code generator!\nEnter your instance variable name:");
        String name = scan.nextLine();
        System.out.println("Enter the type for the variable size: ");
        String type = scan.nextLine();
        String upFirst = name.substring(0, 1).toUpperCase();
        String restOfName = name.substring(1);
        String upName = upFirst + restOfName;
        System.out.println("//getter for " + name + "()\npublic " + type + " get" + upName + "()\n{\n return " + name + ";\n}" );
        System.out.println("//setter for " + name + "()\npublic void set" + upName + "(" + type + " " + name + ")\n{\n this." + name + " = " + name + "\n}");
    }
}
