

/* Complete methods: copyFrontAndBack and __________. 
 * DO NOT MODIFY THE MAIN METHOD!
 *
 *Array task: Complete the method copyFrontAndBack. 
 *
 * This method:
 *  -takes in an array of integers that will have a length of at least 1. 
 *  -If the original array was length 2 or more, return a new array of 
 *  length 2 that contains the first and last elements from the original 
 *  array. 
 *  -If the original array was length 1, return an array of length 2 where both 
 *  elements are equal to the contents of the original array
 * 
 * An example of this method working is included in the main method
 * 
 * 
 *Split task: Complete the method maxWordLength
 * 
 * This method:
 *  -takes in a sentence stored in a String  
 *  -returns the length of the longest word in that String
 *  
 * Remember that you can use .length() to find the length of a word
 * 
 * An example of this method working is included in the main method
 * 
 * 
 * 
 * 
 * 
*/

import java.util.*;

public class App {
    public static void main(String[] args)  {


        
           
           
       
        //copyFrontAndBack example
        System.out.println("With input [1, 2, 3], you should get: [1, 3]. You got: " + Arrays.toString(copyFrontAndBack(new int[]{1,2,3})));
        System.out.println("With input [1, 2, 3, 4], you should get: [1, 4]. You got: " + Arrays.toString(copyFrontAndBack(new int[]{1,2,3, 4})));
        System.out.println("With input [7], you should get: [7, 7]. You got: " + Arrays.toString(copyFrontAndBack(new int[]{7})));
        
        //wordLength example
        System.out.println("With input \"Java is fun\" you should return 4. You got: " + maxWordLength("Java is fun"));
        System.out.println("With input \"Java is scary\" you should return 5. You got: " + maxWordLength("Java is scary"));
        System.out.println("With input \"I can do this\" you should return 4. You got: " + maxWordLength("I can do this"));
    }

    public static int[] copyFrontAndBack(int[] nums){

       // return null; //this is a placeholder
       String[] array = new String[1];
       

       Scanner scannerTwo = new Scanner(System.in);
       String input = scannerTwo.nextLine();
       String[] pieces = input.split(" ");
       array[0] = pieces[0];
       array[1] = pieces[1];
       array[2] = pieces[2];
       array[3] = pieces[3];
       array[4] = pieces[4];

       int age = Integer.valueOf(pieces[0]);
        for (int i = 0; i < pieces.length; i++) {
            int number = (age);
            if (age < number) {
                age = number;
            }
            int arrayLength = age;
            if (arrayLength == 2 || arrayLength > 2){
                return pieces[0] + pieces[arrayLength]
            }


    //first try:
    // Scanner scannerTwo = new Scanner(System.in);
    // String input = scannerTwo.nextLine();
    // String[] pieces = input.split(" ");
     
    //     int first = Integer.valueOf(pieces[1]);
     
    //     int age = Integer.valueOf(pieces[1]);
    //     for (int i = 0; i < pieces.length; i++) {
    //         int number = (age);
    //         if (age < number) {
    //             age = number;
    //         }
    //     }
    //    if (pieces.length()= 1){
    //        return pieces[age];
    //    }

    }
}

    public static int maxWordLength(String sentence){


      //  return -1; //this is a placeholder
      Scanner scanner = new Scanner(System.in);
      String inputOne = scanner.nextLine();
      String[] partTwo = inputOne.split(" ");

      int greatest = 0;
      String nameOfGreatest = "";
      int age = Integer.valueOf(partTwo[1]);
      String name = String.valueOf(partTwo[0]);
      
             
              
              if (greatest < age) {
                  greatest = age;
                  nameOfGreatest = name;
              }
        return greatest;
    }



}
