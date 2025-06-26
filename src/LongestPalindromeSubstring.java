public class LongestPalindromeSubstring {
        public String longestPalindrome(String s) {
            int start = 0;
            int end = 0;
            int max = 0;

            for (int i = 0; i < s.length(); i++) {
                for (int j = i+max; j < s.length(); j++) {
                    if (isPalindrome(s, i, j)) {
                        if ((j - i + 1) > max) {
                            max = j - i + 1;
                            start = i;
                            end = j;
                        }
                    }
                }
            }
            return s.substring(start, end+1);
        }

        public boolean isPalindrome(String str, int i, int j) {
            while (i < j) {
                if (str.charAt(i) != str.charAt(j)) return false;
                i++;
                j--;
            }

            return true;
        }
}
