package string;

/**
 * 1. Class name should always have keyword `class`
 * 2. They should always have public specifier
 * 3. There is a syntax for defining class names:
 *          a. Should always start with Capital letter
 *          b. Can contain a _, number and alphabets in between
 *          c. Should follow camel case after first letter
 *          d. Name of the public class and file name should be same
 *          e. We do not need public with each class but above rule should be followed
 *          f. We can have more than one class in a file but only one public class
 */

public class Bbc {

    /**
     * It is kept static because static ones are the first to load when running a program.
     * Main method is the method where program execution starts
     * Wht array of String? : So that we can pass multiple space separated arguments to program execution
     * We can also pass variable arguments instead of array of String
     * @param ab
     */
    public static void main(String... ab){
        /*
        println is used t print and add a new line at the end of the line
        print is used t print but does not add a new line at the end of the line
        */

        System.out.println( "I am printing arguments" );
        for (String a : ab){
            System.out.println(a);
        }

        /*
        Variable names are similar to class names but just does not start with a capital letter
        Method names are similar to variable names
        Variable declaration looks like : DataType variableName = value;
        Variable assignment looks like : variableName = value;

         */
        System.out.println("--------------------------------------------------------------------");
        String str1 = "";
        String str2 = "";
        String str3 = null;
        String str4 = new String("");
        System.out.println("str2.equals(str1) = " + str2.equals(str1)); // Output  -> str2.equals(str1) = true
        System.out.println("(str2 == str1) " + (str2 == str1)); // Output -> str2 == str1 = true
        System.out.println("str4.equals(str1) = " + str4.equals(str1)); // Output  -> str4.equals(str1) = true
        System.out.println("(str4 == str1) " + (str4 == str1)); // Output -> str4 == str1 = false
        if(str3 == str1){
            System.out.println("str3 is equal to str1 ");
        }else{
            System.out.println("str3 is not equal to str1 ");
        }
        if(str2 == str1){
            System.out.println("str2 is equal to str1 ");
        }else{
            System.out.println("str2 is not equal to str1 ");
        }
        // To read : String memory allocation
        // To read : StringBuilder vs StringBuffer vs String

        // Strings are immutable: meaning whenever a new value is assigned a new object is created

    }
}

class Cba{


}
