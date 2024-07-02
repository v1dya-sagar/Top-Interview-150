package TopInterview150.TwoPointers;

public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("sagar", "vidyasagar"));
    }
        public static boolean isSubsequence(String s, String t) {

            int i=0,j=0;
            int n=t.length();
            int m=s.length();
            char ss[]=s.toCharArray();
            char tt[]=t.toCharArray();

            if(m<1)
                return true;
            // just finds if all characters of ss are present in tt
            while(i<n){
                if(tt[i]==ss[j]){
                    j++;
                }
                i++;
            // if count of found letters is same as the length of given subsequence just return true
                if(j==m)
                    return true;
            }

            return false;
        }
}
