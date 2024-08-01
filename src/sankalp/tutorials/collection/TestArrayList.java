package sankalp.tutorials.collection;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

// In this example we will learn how to create, add, search, remove adn iterate over ArrayList
public class TestArrayList {

    public static void main(String [] a){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(31);
        list.add(41);
        list.add(71);
        list.add(91);

        // Method 1 to iterate over list
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("--------------------");
        // Method 2 to iterate over list
        for( Integer temp: list ){
            System.out.println(temp);
        }

        System.out.println("--------------------");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Input the value you want to remove: ");

        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        Integer input = scanner.nextInt();

        list.remove( input );

        iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Input the value you want to search: ");

        scanner = new Scanner(new InputStreamReader(System.in));
        input = scanner.nextInt();


        boolean found = false;
        for(Integer i: list){
            if(input.equals(i)){
                found = true;
                System.out.println("Found at "+ list.indexOf(i));
                break;
            }
        }
        if(!found){
            System.out.println("Your search was never found");
        }
    }
}
