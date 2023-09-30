import java.util.Arrays; 

class World { 

     public static void main(String args[]) 

    { 

   int[] array_num = { 2, 3, 4, 1, 5 }; 

        System.out.println("Random input numbers: "); 

        for (int numbers : array_num) { 

        System.out.print(numbers + " "); 

    } 

        Arrays.sort(array_num); 

        System.out.println("\nSorted output: "); 

        for (int numbers : array_num) { 

        System.out.print(numbers + " "); 

    } 

   } 
}