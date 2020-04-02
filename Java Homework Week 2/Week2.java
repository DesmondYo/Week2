
public class Week2 {

	public static void main(String[] args) {
		
		//1.
		
			System.out.println(true && false);
			System.out.println(true || false);
			System.out.println(false && false);
			System.out.println(true && (false || true));
			System.out.println(false || (true && false));
			System.out.println(false || 1 < 5);
			System.out.println(5 >= 4 && 1 > 3);
			System.out.println(10 < 4 || 1 > 4);
			System.out.println(12 >= 2 && 1 < 24);
			System.out.println("Hello".charAt(0) == 'h');
			
		//2. 
			boolean isHotOutside = true;
			
			boolean isWeekDay = false;
			
			boolean hasMoneyInPocket = true;
		
		//3.
			double costOfMilk = 2.50;
			
			double moneyInWallet = 1.00;
			
			char thirstLevel = '4';
			
		//4A. 
			boolean shouldByIcecream = isHotOutside && hasMoneyInPocket;
			
			System.out.println(shouldByIcecream);
			
		//4B.
			
			boolean willGoSwimming = isHotOutside && !isWeekDay;
			
			System.out.println(willGoSwimming);
			
		//4C.
			
			boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekDay;
			
			System.out.println(isAGoodDay);
			
		//4D. 
			
			boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet >= 2 ;
			
			System.out.println(willBuyMilk);
			
		

	}

}
