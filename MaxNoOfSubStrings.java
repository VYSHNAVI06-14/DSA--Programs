import java.util.*;
public class MaxNoOfSubStrings {
  public static void main(String[]args){
   String s="adefaddaccc";
   System.out.print(Cal(s));
  }
  public static List<String> Cal(String s){
    // String s="adefaddaccc";
    int first[]=new int[26];
    int last[]=new int[26];
    Arrays.fill(first,-1);
    for(int i=0;i<s.length();i++){
      int index=s.charAt(i)-'a';
      if(first[index]==-1)
        first[index]=i;
      last[index]=i;
    }
    List<int[]> list=new ArrayList<>();
    for(int j=0;j<26;j++){
      if(first[j]==-1) continue;
      int left=first[j];
      int right=last[j];
      boolean valid=true;
      for(int i=left;i<=right;i++){
        int index=s.charAt(i)-'a';
        if(first[index]<left){
          valid=false;
          break;
        }
        if(last[index]>right)
           right=last[index];
      }
      if(valid)
        list.add(new int[]{left,right});
    }
    list.sort((a,b)->a[1]-b[1]);
    List<String> res=new ArrayList<>();
    int prevEnd=-1;
    for(int[]lists:list){
      if(lists[0]>prevEnd) {
        res.add(s.substring(lists[0],lists[1]+1));
        prevEnd=lists[1];
      }
    }
    return res;
  }

}
