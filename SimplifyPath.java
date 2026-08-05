import java.util.Stack;
class SimplifyPath {
    public static String simplifyPath(String path) {
      String [] components = path.split("/");
      Stack<String> st= new Stack<>();
      for(String c : components)
      {
        if(c.equals("") || c.equals("."))
           continue;
        else if(c.equals("..")){
            if(!st.isEmpty())
              st.pop();
        }
        else
           st.push(c);
        }
      
      StringBuilder simplified = new StringBuilder();
      
      for(String x : st){
        
        simplified.append("/").append(x);
       }
      return simplified.length()>0 ? simplified.toString() : "/"; 
    }
    
    public static void main(String [] args){
        String path="/home/";
        System.out.print(simplifyPath(path));
    }
}