class Solution {
    public int lengthOfLastWord(String s) {
        // int end = s.length()-1;
        
        // while(end>=0 && s.charAt(end)==' '){
        //     end--;
        // }
        // int start = end;
        // while(start>=0 && s.charAt(start)!=' '){
        //     start--;
        // }
        // return end -start;
        return Arrays.stream(s.trim().split(" "))
                 .reduce((first, second) -> second) // get last word
                 .orElse("")
                 .length();

    }
}