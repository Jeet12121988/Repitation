package may21;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EnterySet {

	public static void main(String[] args) {
		HashMap<String,String> hs= new HashMap<String,String>();
		hs.put("Bangalore", "Karnatka");
		hs.put("Nagpur", "Maharastra");
		hs.put("Chhidwara", "Madhya Pradesh");
		hs.put("Hydrabad", "Telangana");
		
		System.out.println(hs);
		
		for(String i:hs.keySet()) {
			
			System.out.println("City"+ i+ "-is located in-"+hs.get(i));
		}
		
		Set<Map.Entry<String,String>> set=hs.entrySet();
		Iterator<Map.Entry<String, String>> i=set.iterator();
		
		while(i.hasNext()) {
			
			Map.Entry<String,String> mp=i.next();
			
			
			
			System.out.println(mp.getKey()+"-"+mp.getValue());
			//System.out.println();
		}
		
		

	}

}
