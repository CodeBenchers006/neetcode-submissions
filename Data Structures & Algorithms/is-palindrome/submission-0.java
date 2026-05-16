class Solution {
    public boolean isPalindrome(String s) {
        String fs="";

        for(char c: s.toLowerCase().toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c)){
                fs +=c;
            }
        }
        int a=0;
        int b=fs.length()-1;

        while(a<b){
            if(fs.charAt(a) != fs.charAt(b)){
                return false;
            }
            a++;
            b--;

        }
        return true;
    }
}
