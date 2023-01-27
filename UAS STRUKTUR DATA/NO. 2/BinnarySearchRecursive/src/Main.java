public class Main {
    public static void main(String[] args) {
        int[] intArray = {-82,9,34,14,-50,0,22,31};

        System.out.println(recursiveBinarySearch(intArray, -50));
        


    }

    public static int recursiveBinarySearch(int[] input, int value){
        return recursiveBinarySearch(input, 0, input.length, value);
    }

    public static int recursiveBinarySearch(int[] input, int start, int end, int value){
        if(start >= end){
            return -1;
        }
        int midpoint = (start + end)/2;

        System.out.println("Midpoint = " + midpoint);
        if(input[midpoint] == value){
            return midpoint;
        }
        else if(input[midpoint]< value){
            return recursiveBinarySearch(input, midpoint + 1, end, value);
        }
        else{
            return recursiveBinarySearch(input, start, midpoint, value);
        }
    }
}