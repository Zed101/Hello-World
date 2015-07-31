
public class AvionU {

	public static void main(String[] args) {
		
		int satp = 11;
		int minp = 23;
		int minl = 60;

		if (satp > 24 || minp > 60) {
			System.out.println("illegal");
		}

		int ukupnomin = satp * 60 + minp + minl;
		int sat = ukupnomin / 60;
		int min = ukupnomin % 60;
		if (sat > 23) {
			System.out.println("Avion slijece u " + (sat - 24) + ":" + min);
		} else {
			System.out.println("Avion slijece u " + sat + ":" + min);

		}
	}
}
