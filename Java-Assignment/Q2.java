/*Q2. Convert the list of Strings {“ab”, “bc”, “cd”, “de”, “ef”, “fg”, “gh”} 
into an array of strings and print all strings stored on odd indices of the array. */
public class Q2 {
 public static void main(String[] args) {
    String str[] = {"ab", "bc","cd","de","ef","fg","gh"};
    for(int i=0;i<str.length;i++)
    {
        if(i%2==1){
            System.out.println(str[i]);
        }
    }
 }
}
