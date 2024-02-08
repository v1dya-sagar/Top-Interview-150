package TopInterview150.ArrayString;

public class RemoveElement {
    public static void main(String[] args) {
        int[] a = {3,2,2,3};
        int val = 3;
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] != val){
                a[c] = a[i];
                c++;
            }
        }
        System.out.println(c);
    }
}
