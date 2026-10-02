class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for(String i : operations){
            if(i.equals("+")){
                int top = st.pop();
                int newtop = top + st.peek();
                st.push(top);
                st.push(newtop);
            }
            else if(i.equals("C")){
                st.pop();
            }
            else if(i.equals("D")){
              
                int newtop =2 *st.peek();
            
                st.push(newtop);
            }
            else{
                st.push(Integer.parseInt(i));
            }
        }
        int sum=0;
        for(int i : st){
            sum+=i;
        }
    
        return sum;
        
    }
}