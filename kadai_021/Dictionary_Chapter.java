package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter {
	
	private HashMap<String, String> dict;
	
	public Dictionary_Chapter() {
	
	this.dict = new HashMap<String, String>();
	dict.put("apple" , "りんご");
	dict.put("peach" , "桃");
	dict.put("banana" , "バナナ");
	dict.put("lemon" , "レモン");
	dict.put("pear" , "梨");
	dict.put("kiwi" , "キウィ");
	dict.put("strawberry" , "いちご");
	dict.put("grape" , "ぶどう");
	dict.put("muscat" , "マスカット");
	dict.put("cherry" , "さくらんぼ");
	
	}
	
	public void serch(String serchList[]) { 
		int i = 0;
		while (i < serchList.length) {
			
			String word = serchList[i];
			if (this.dict.containsKey(word)) {
				System.out.println(word + "の意味は" + this.dict.get(word));
			}else {
				System.out.println(serchList[i] + "は辞書に存在しません");	
			}
			i = i + 1;
		}
	}
		
}
	
	

