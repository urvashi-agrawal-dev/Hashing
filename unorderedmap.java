import java.util.*;
class unorderedmap{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of elements");
        
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter nos");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        Map<Integer,Integer>freq=new HashMap<>();
        for(int num:arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        
        for(Map.Entry<Integer,Integer>entry:freq.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }
}