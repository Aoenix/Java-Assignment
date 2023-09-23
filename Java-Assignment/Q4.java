/*Q4. Calculate the minimum element in the array {2, -3, 5, 8, 1, 0, -4} using 
 library method for calculating the minimum element.*/
public class Q4 {
    public static void main(String[] args) {
        int [] arr={2, -3, 5, 8, 1, 0, -4};
        int min=arr[0];
        for (int x : arr){
            min=Math.min(min,x);
        }
        System.out.println(min);
    }
}
