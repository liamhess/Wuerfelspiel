
public class WuerfelTester {
	
	Wuerfel w = new Wuerfel();
	
	int wurf;
	
	public WuerfelTester() {
		wurf = w.wuerfeln();
		
	}
	
	public int getAugenzahl() {
		return wurf;
	}
	
	public int getSummeDrei() {
		wurf = w.wuerfeln();
//		System.out.println(wurf1);
		wurf += w.wuerfeln();
//		System.out.println(wurf1);
		wurf += w.wuerfeln();
//		System.out.println(wurf1);
		
		return wurf;
	}
	
	public double getMittelDrei() {
		return (double) getSummeDrei() / 3;
	}
	
	public void getVerteilung () {
		int counter = 0;
		int eins = 0;
		int zwei = 0;
		int drei = 0;
		int vier = 0;
		int fuenf = 0;
		int sechs = 0;
		
		while (counter<1000) {
			int wurf = w.wuerfeln();
//			System.out.println(wurf);
			
			if (wurf==1) {
				eins++;
			} else if (wurf==2) {
				zwei++;
			} else if (wurf==3) {
				drei++;
			} else if (wurf==4) {
				vier++;
			} else if (wurf==5) {
				fuenf++;
			} else if (wurf==6) {
				sechs++;
			}
			
			counter++;
		}
		
//		System.out.println(eins);
//		System.out.println(zwei);
//		System.out.println(drei);
//		System.out.println(vier);
//		System.out.println(fuenf);
//		System.out.println(sechs);
		
		double einsw = (double)eins / 1000;
		double zweiw = (double)zwei / 1000;
		double dreiw = (double)drei / 1000;
		double vierw = (double)vier / 1000;
		double fuenfw = (double)fuenf / 1000;
		double sechsw = (double)sechs / 1000;
		
		System.out.println("Die Wahrscheinlichkeit für die 1 beträgt: " + einsw);
		System.out.println("Die Wahrscheinlichkeit für die 2 beträgt: " + zweiw);
		System.out.println("Die Wahrscheinlichkeit für die 3 beträgt: " + dreiw);
		System.out.println("Die Wahrscheinlichkeit für die 4 beträgt: " + vierw);
		System.out.println("Die Wahrscheinlichkeit für die 5 beträgt: " + fuenfw);
		System.out.println("Die Wahrscheinlichkeit für die 6 beträgt: " + sechsw);
		
//		System.out.println(einsw+zweiw+dreiw+vierw+fuenfw+sechsw);
	}
	
	public void ausHaeuschen() {
		wurf=w.wuerfeln();
		System.out.println("Du hast eine " + wurf + " gewürfelt.");
		if (wurf==6) {
			System.out.println("Du darfst aus dem Häuschen!");
		} else if (w.wuerfeln()==6) {
			System.out.println("Du darfst aus dem Häuschen!");
		} else if (w.wuerfeln()==6) {
			System.out.println("Du darfst aus dem Häuschen!");
		} else {
			System.out.println("Du musst warten!");
		}
	}
	
}
