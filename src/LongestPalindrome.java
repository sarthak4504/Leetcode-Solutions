public class LongestPalindrome {
        public int longestPalindrome(String s) {
            int [] freq=new int[128];
            char [] charArr=s.toCharArray();

            for(int i=0;i<s.length();i++) freq[charArr[i]]++;

            int res=0;
            boolean odd=false;

            for(int i=0;i<128;i++){
                if(freq[i]%2==0) res+=freq[i];
                else {
                    res+=freq[i]-1;
                    odd=true;
                }
            }

            if(odd) res+=1;
            return res;

        }
}
