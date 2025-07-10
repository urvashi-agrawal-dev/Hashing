import java.util.*;
class chrhash{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a words");
        String input=sc.nextLine();
        //input = input.toLowerCase();
        Map<Character ,Integer>freq = new HashMap<>();
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if(ch == ' ')continue;
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer>entry:freq.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }
}