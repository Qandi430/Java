package kr.co.dothome.qandi.chapter01;
import java.util.*;
public class test {

	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		System.out.println("solution = "+solution(participant,completion));
	}
	
	public static String solution(String[] participant, String[] completion) {
        
        String answer = "";
        
        HashMap<String,Integer> map = new HashMap<>();
        
        for(int i = 0; i<completion.length; i++){
            map.put(completion[i],0);
        }
        
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        
        while(iterator.hasNext()){
            String key = (String)iterator.next();
            for(int j = 0; j<participant.length; j++){
                if(key.equals(participant[j])){
                    map.put(participant[j], map.get(participant[j]) + 1);
                }else if(map.containsKey(participant[j])==false) {
                	return participant[j];
                }
            }
        }
        
        
        set = map.keySet();
        iterator = set.iterator();
        
        while(iterator.hasNext()){
            String key = (String)iterator.next();
            int val = map.get(key);
            if(val != 1){
                answer = key;
            }
        }
        
        return answer;
    }
}

