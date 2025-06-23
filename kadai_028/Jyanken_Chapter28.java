package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	private HashMap<String, String> Hands;
	
	public Jyanken_Chapter28() {
	
	this.Hands = new HashMap<String, String>();
	Hands.put("r" , "グー");
	Hands.put("s" , "チョキ");
	Hands.put("p" , "パー");
	}
	
	public String getMyChoise() {
		
		System.out.println("自分のじゃんけんの手を入力しましょう"
				+ "\nグーはrockのrを入力しましょう"
				+ "\nチョキはscissorsのsを入力しましょう"
				+ "\nパーはpaperのpを入力しましょう");
		

		Scanner scanner = new Scanner(System.in);
		String input= scanner.nextLine();
		
		if (!"r".equals(input) && !"s".equals(input) && !"p".equals(input) ) {
			
			System.out.println("入力が正しくありません");
			
			scanner.close();
			
			return "";
		};
		
		scanner.close();
		
		return input;
	}
	
	public String getRandum() {
		
		String[] jyankenArray = { "r","s","p"};
        
        int i = (int)(Math.floor(Math.random()*3));
		
		return jyankenArray[i];
	}
	
	public void playGame(String myHand, String yourHand) {
		
		if (myHand == "") {
			return ;
		}else {
			String MyHand = this.Hands.get(myHand);
			String YourHand = this.Hands.get(yourHand);
			System.out.println("自分の手は" + MyHand + ",対戦相手の手は" + YourHand);
			
			int i = 0;
			switch (MyHand+YourHand){
				case "グーグー" -> i = 0;
				case "グーチョキ" -> i = 1;
				case "グーパー" -> i = 2;
				case "チョキグー" -> i = 2;
				case "チョキチョキ" -> i = 0;
				case "チョキパー" -> i = 1;
				case "パーグー" -> i = 1;
				case "パーチョキ" -> i = 2;
				case "パーパー" -> i = 0;
			};
			
			switch(i) {
			case 0 -> System.out.println("あいこです");
			case 1 -> System.out.println("自分の勝ちです");
			case 2 -> System.out.println("自分の負けです");
			}
		}
	}
}
