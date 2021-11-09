
public class WuerfelTester {
	
	Wuerfel w1 = new Wuerfel();
	Wuerfel w2 = new Wuerfel();
	Wuerfel w3 = new Wuerfel();
	
	int wurf1;
	
	public WuerfelTester() {
		wurf1 = w1.wuerfeln();
		
	}
	
	public int getAugenzahl() {
		return wurf1;
	}
	
	public int getSummeDrei() {
		wurf1 = w1.wuerfeln();
		wurf1 += w2.wuerfeln();
		wurf1 += w3.wuerfeln();
		
		return wurf1;
	}
	
}
