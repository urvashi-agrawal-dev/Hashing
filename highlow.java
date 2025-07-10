import java.util.*;
class highlow{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Map<Integer,Integer>freqMap=new HashMap<>();
        for(int num:arr){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }
        int maxFreq=Integer.MAX_VALUE;
        int minFreq=Integer.MIN_VALUE;
        int mostFreq=-1;
        int leastFreq=-1;
        for(Map.Entry<Integer,Integer> entry:freqMap.entrySet()){
            int key=entry.getKey();
            int value=entry.getValue();
            if(value>maxFreq){
                maxFreq=value;
                mostFreq=key;
            }
            if(value<minFreq){
                minFreq=value;
                leastFreq=key;
            }
        }
        System.out.println("freq of most element"+mostFreq+"(freq of less:"+maxFreq+")");
        System.out.println("freq of less elemnet" +leastFreq+ "(freq of less:"+minFreq+")");
    }
}