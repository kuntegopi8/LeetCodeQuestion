class Solution {
    public String reverseWords(String s) {
        StringBuffer sb = new StringBuffer();
        String str = s.trim();
        String st[] = str.split("\\s+");
        for(int i=st.length-1;i>=0;i--)
        {
            String word =st[i];
            
            sb.append(word);
             if (i > 0) {
            sb.append(" "); 
    }
            
        }
        return sb.toString();
       
        
    }
}