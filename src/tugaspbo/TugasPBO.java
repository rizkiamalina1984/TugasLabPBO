package tugaspbo;
public class TugasPBO {

    // Properti
    private String nama;
    private int umur;
    private String jenis;
    private String warna;

    // Konstruktor
    public TugasPBO(String nama, int umur, String jenis, String warna) {
    this.nama = nama;
    this.umur = umur;
    this.jenis = jenis;
    this.warna = warna;
}
    
    // Method untuk mengeluarkan suara kucing
    public String suara() {
        return "Meow!";
    }

    // Method untuk memberi tahu kucing sedang makan
    public String makan(String makanan) {
        return this.nama + " sedang makan " + makanan + ".";
    }
    // Method untuk memberi tahu kucing sedang tidur
    public String tidur() {
        return this.nama + " sedang tidur.";
    }

    // Method untuk mendapatkan informasi tentang kucing
    public String getInfo() {
        return "Nama: " + this.nama + "\nUmur: " + this.umur + "\nJenis: " + this.jenis + "\nWarna: " + this.warna;
    }

    // Main method untuk melakukan instantiation dan penggunaan objek kucing
    public static void main(String[] args) {
        // Instantiation dengan 3 object berbeda
        TugasPBO kucing1 = new TugasPBO("Momo", 3, "Persia", "Putih");
        TugasPBO kucing2 = new TugasPBO("Kiki", 2, "Anggora", "Coklat");
        TugasPBO kucing3 = new TugasPBO("Tom", 5, "Kampung", "Abu-abu");


        // Contoh pemanggilan method
        System.out.println(kucing1.suara());
        System.out.println(kucing2.makan("ikan"));
        System.out.println(kucing3.tidur());

        // Informasi lengkap tentang kucing
        System.out.println(kucing1.getInfo());

}
    
}