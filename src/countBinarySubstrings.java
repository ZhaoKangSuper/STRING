/**
 * Created by ZHAOKANG on 2017/11/15.
 */
public class countBinarySubstrings {

    public int solution(String s)
    {
        int [] group = new int[s.length()];
        int t =0;
        group[0] = 1 ;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i-1) != s.charAt(i)){
                group[++t] = 1 ;
            }else{
                group[t]++;
            }
        }

        int ans = 0 ;
        for (int i = 1; i <= t ; i++) {
            ans +=Math.min(group[i-1],group[i]);
        }
        return ans ;
    }

    public static void main(String [] args){
        System.out.println(new countBinarySubstrings().solution("1110001010101"));
    }
}
