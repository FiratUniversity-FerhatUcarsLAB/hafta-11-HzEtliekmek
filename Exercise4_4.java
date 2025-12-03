public class Exercise4_4 {

    public static void main(String[] args) {
        // Soru 1: Değer döndüren metodu kullanmazsak ne olur?
        // Cevap: Hiçbir şey olmaz, hata vermez, sadece değer kaybolur.
        int x = add(5, 10); 
        add(5, 10); // Bu satır hata vermez.

        // Soru 2: Void metodu ifade içinde kullanırsak ne olur?
        // System.out.println(noid()); 
        // Cevap: "void type not allowed here" hatası verir. Derlenmez.
        
        System.out.println("Cevaplar kod içindeki yorum satırlarındadır.");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void noid() {
        // Boş
    }
}
