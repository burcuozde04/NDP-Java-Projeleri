package odev5;

public class burcu1 {

	public static void main(String[] args) {
		
		//  4 tane rastgele tam sayı yazdırdım.
		int a = (int)(Math.random() * 1000) + 1;
        int b = (int)(Math.random() * 1000) + 1;
        int c = (int)(Math.random() * 1000) + 1;
        int d = (int)(Math.random() * 1000) + 1;
        
        	// Geçici değişkeni, değerleri değiştirmek için kullandım.
            int geçici; 

            // Sayıları sıraladım.
            if (a > b) { geçici = a; a = b; b = geçici; }
            if (a > c) { geçici = a; a = c; c = geçici; }
            if (a > d) { geçici = a; a = d; d = geçici; }
            if (b > c) { geçici = b; b = c; c = geçici; }
            if (b > d) { geçici = b; b = d; d = geçici; }
            if (c > d) { geçici = c; c = d; d = geçici; }

         // Sıralanmış sayıları ekrana yazdırdım.
            System.out.println(a + " " + b);
            System.out.println(c + " " + d);
    }
}


