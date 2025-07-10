import java.util.*;
class hash{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,3,2,1,4};
        Map<Integer,Integer> freq=new HashMap<>();

        for(int num : arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry : freq.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        
        }
    }
}