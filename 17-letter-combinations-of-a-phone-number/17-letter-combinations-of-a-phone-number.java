class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list = Arrays.asList("", "", "abc", "def", "ghi", "jkl", "mno", "pqrs","tuv", "wxyz");
        
        List<String> res = new LinkedList<>();
        for(int i=0;i<digits.length();i++){
            int d = Integer.parseInt(digits.charAt(i)+"");
            String s = list.get(d);
            if(res.size() == 0)
                for(int j=0;j<s.length();j++) res.add(s.charAt(j)+"");
            else{
                List<String> newList = new LinkedList<>();
                for(String x:res){
                    for(int j=0;j<s.length();j++) {        
                        newList.add(x+s.charAt(j)); 
                    } 
                }
                res = newList;
            }      
        }
        return res;
    }
}