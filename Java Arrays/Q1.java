/*Q1. Given an array of integers {2, 6, -5, -1, 0, 4, -9}, 
print only the positive values present in the array.*/

public class Q1{
    static private void positive_val(int a[]){
 
 for (int x : a){
    if(x>0){
       System.out.println(x);
    }
 }
}
    public static void main(String[] args) {
        int arr[]={2, 6, -5, -1, 0, 4, -9};
       positive_val(arr);
    }
}