import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class lab4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Pinapple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");

        for (String item : fruits){
            System.out.println(item);
        }
        System.out.println("Enter index: ");
        String i = sc.nextLine();
        int j = Integer.parseInt(i);
        String secFruits = fruits.get(j);
        System.out.println("Object at index "+j+" from list "+secFruits);

        boolean contain = fruits.contains("Apple");
        System.out.println("Is fruits in this list? "+ contain );

        int listSize = fruits.size();
        System.out.println("List size: "+ listSize);

//2 
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(15);
        numbers.add(33);
        numbers.add(20);
        numbers.add(12);
        numbers.add(34);

        Collections.sort(numbers);
        System.out.println(numbers);

//3
        ArrayList<String> nameMem = new ArrayList<>();
        nameMem.add("Peter");
        nameMem.add("Lily");
        nameMem.add("Marie");
        nameMem.add("Rosé");
        System.out.println("Array: "+nameMem);

        System.out.println("enter name to delete: ");
        String nameDel = sc.nextLine();
        nameMem.remove(nameDel);
        System.out.println("Member name \""+nameDel+"\" has been deleted");
        System.out.println("Array after deleting: "+nameMem);
                
        sc.close();
    }
}


