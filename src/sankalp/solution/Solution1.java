package sankalp.solution;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution1 {

    public static void main(String [] a){

        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        System.out.println("Enter the size of array: ");
        Integer size = scanner.nextInt();
        System.out.println("Enter your input");
        List<Integer> list = new ArrayList<>();
        for( int i=0; i<size; i++ ){
            list.add(scanner.nextInt());
        }
        System.out.println("Your array looks like:");
        for (Integer i: list){
            System.out.print(i+", ");
        }
        System.out.println("");
        System.out.println("Enter the element you want to search: ");
        Integer input = scanner.nextInt();
        boolean found = false;
        for(Integer i : list){
            if(i.equals(input)){
                found=true;
                System.out.println("Found at position: "+ (list.indexOf(i)+1));
                break;
            }
        }
        if(!found){
            System.out.println("Wrong Input!!!");
        }


    }
}
