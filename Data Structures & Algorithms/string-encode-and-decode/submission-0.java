class Solution {

    public String encode(List<String> strs) {
        StringBuffer sb = new StringBuffer();
        for(String s : strs){
            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {

        ArrayList<String> decodedString = new ArrayList();
        int startIndex=0;
        int endIndex=str.length();

        while(startIndex<endIndex){
            int hashIndex = str.indexOf("#",startIndex);
            int length = Integer.parseInt(str.substring(startIndex,hashIndex));

            int stringStartIndex = hashIndex+1;
            int stringEndIndex = stringStartIndex + length;
            decodedString.add(str.substring(stringStartIndex,stringEndIndex));

            startIndex = stringEndIndex;
        }

        return decodedString;

    }
}
