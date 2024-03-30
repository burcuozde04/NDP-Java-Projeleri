package odev5;

public class burcu2 {

	public static void main(String[] args) {
		
		// Dizi boyutu için rastgele bir sayı verdim (0-5 arası). 
		// Ben 4 olarak değer verdim.
		int diziBoyutu = 4; 

		// Dizi boyutunda bir dizi oluşturdum.
        int[] dizi = new int[diziBoyutu];

        // Diziye rastgele değerler vermesini sağladım (0-100 arası).
        for (int i = 0; i < diziBoyutu; i++) {
            dizi[i] = (int)(Math.random() * 100) + 1;
        }

        // Diziyi küçükten büyüğe sıraladım.
        for (int i = 0; i < dizi.length; i++) {
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] > dizi[j]) {
                	
                	// Değerleri yer değiştirme.
                    int geçici = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = geçici;
                }
            }
        }

        // Sıralanmış diziyi çarpıp, topladım.
        int toplam = 0;
        int carpim = 1;
        for (int i = 0; i < dizi.length; i++) {
            carpim *= dizi[i]; 
            toplam += carpim; 
        }

        // Sonuçları ekrana yazdırdım.
        System.out.println("Siralanmis Dizi: ");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }
        System.out.println("\nCarpimin, Toplami: " + toplam);
    }
}


