package Day6;
public class Peakelement {

    public static void main(String[] args) {
        int[] arr= {15,35,85,96,5,6,8,12}; // Define the array

        // length of the array _______
        System.out.println("Length of the array is : " + arr.length);

        // Iterate over the array to find the peak element
        for (int i = 1; i < arr.length - 1; i++) {

            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {

                System.out.println("Peak element: " + arr[i]);
                break;
            }
        }
    }
}


