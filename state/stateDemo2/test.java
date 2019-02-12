package stateDemo2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 希望改变状态时不需要改代码，状态可以从数据库等渠道获取，自动切换状态
 * @author Leonhardt
 *
 */
public class test {
	public static void main(String[] args){
		Persion persion = new Persion();
		Map<String,Mood> moods =  new HashMap<String,Mood>();
		moods.put("happy", new HappyMood());
		moods.put("sad", new SadMood());
		
		for(Entry<String, Mood> entry : moods.entrySet()){
			persion.addMoods(entry.getKey(), entry.getValue());
		}
		
		try {
			persion.action();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
