
public class MainApp {

	public static void main(String args[]) {
		MainApp app = new MainApp();

		System.out.print("Deret Prima : ");
		int angkaPrima = 15;
		for(int i = 0; i < angkaPrima; i++) {
			boolean isPrima = app.cekBilanganPrima(i);
			if(isPrima) {
				System.out.print(i + " ");
			}			
		}

		System.out.println("");
		
		String kalimat = "sindy cantik";
		String kalimatKebalik = app.reversString(kalimat);
		System.out.println(kalimat);
		System.out.println(kalimatKebalik);
		
		int angka = 8;
		int pembagi = 3;
		int hasilBagi = app.pembagian(angka, pembagi);
		System.out.println(angka+ " / " + pembagi + " = " + hasilBagi);
		
		int[] arrayAngka = {8,2,5,1,3,7};
		int jumlahAngka = app.sumArray(arrayAngka, arrayAngka.length - 1);
		System.out.println("Jumlah angka = " + jumlahAngka);
	}
	
	int sumArray(int[] angka, int panjangAngka) {
		if(panjangAngka != 0) {
			return angka[panjangAngka]+sumArray(angka, --panjangAngka);
		} else {
			return angka[panjangAngka];
		}
	}
	
	int pembagian(int angka, int pembagi) {
		if(angka > pembagi) {
			return 1+pembagian(angka-pembagi, pembagi);
		} else {
			return 0;
		}
	}
	
	String reversString(String kalimat) {
		String kalimatBaru = "";
		for(int i = kalimat.length()-1; i >= 0; i--){
			kalimatBaru = kalimatBaru + kalimat.charAt(i);
		}
		return kalimatBaru;
				
	}

	int ambilBilanganPrima(int angka, int pembagi) {
		if(pembagi > 1) {
			if(angka % pembagi == 0) {
				return 1+ambilBilanganPrima(angka, --pembagi);				
			} else {
				return 0+ambilBilanganPrima(angka, --pembagi);
			}
		} else {
			return 1;
		}
	}
	
	boolean cekBilanganPrima(int angka) {
		int jumlah = ambilBilanganPrima(angka, angka);
		if(jumlah == 2) {
			return true;
		} else {
			return false;
		}
	}
}
