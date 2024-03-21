package tugaspbo2;

public class TugasPBO2 {
    
    private String text;

    // Konstruktor
    public TugasPBO2 (String text) {
        this.text = text;
    }

    // Metode untuk menghitung jumlah karakter dalam string
    public int hitungKarakter() {
        return text.length();
    }

    // Metode untuk mengonversi string menjadi huruf kapital
    public String keHurufBesar() {
        return text.toUpperCase();
    }

    // Metode untuk mengonversi string menjadi huruf kecil
    public String keHurufKecil() {
        return text.toLowerCase();
    }

    // Metode untuk memeriksa apakah string diawali dengan string tertentu
    public boolean diAwaliDengan(String awalan) {
        return text.startsWith(awalan);
    }

    // Metode untuk memeriksa apakah string diakhiri dengan string tertentu
    public boolean diAkhirDengan(String akhiran) {
        return text.endsWith(akhiran);
    }

    // Metode untuk mengganti substring dengan string lain
    public String ganti(String strLama, String strBaru) {
        return text.replace(strLama, strBaru);
    }

    // Metode untuk membagi string menjadi array substring berdasarkan delimiter
    public String[] pecah(String pemisah) {
        return text.split(pemisah);
    }

    public static void main(String[] args) {
        TugasPBO2 contoh = new TugasPBO2("Happy Friday!");

        // Menggunakan metode kustom
        System.out.println("Jumlah karakter: " + contoh.hitungKarakter());
        System.out.println("Huruf kapital: " + contoh.keHurufBesar());
        System.out.println("Huruf kecil: " + contoh.keHurufKecil());
        System.out.println("Diawali dengan 'Happy': " + contoh.diAwaliDengan("Happy"));
        System.out.println("Diakhiri dengan 'Friday!': " + contoh.diAkhirDengan("Friday!"));
        System.out.println("Ganti 'Friday!' dengan 'Java': " + contoh.ganti("Friday!", "Java"));

        // Memecah string dan mencetak setiap substring
        System.out.println("Membagi string:");
        String[] subtrings = contoh.pecah(", ");
        for (String subtring : subtrings) {
            System.out.println(subtring);
        }
    }
}