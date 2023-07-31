import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] karakterData = {
                { "Knight",
                        "Knight adalah pejuang yang ulung dengan kemampuan bertahan yang hebat. "
                                + "Dia membawa perisai besar dan pedang berat untuk melindungi diri dan rekan-rekannya dalam pertempuran." },
                { "Mage",
                        "Mage adalah penyihir kuat dengan kemampuan sihir yang luar biasa. "
                                + "Dia dapat melempar mantra untuk menghancurkan musuhnya dari jarak jauh. "
                                + "Meskipun dia lemah dalam pertempuran fisik, kekuatannya dalam sihir menjadikannya pilihan yang bijaksana dalam tim." },
                { "Archer",
                        "Archer adalah penembak jitu yang sangat terampil. Dia menggunakan busur panjang "
                                + "untuk menyerang musuh dari jarak jauh dengan tepat. Kecepatan dan ketepatan adalah kekuatannya dalam pertempuran." },
                { "Berserker",
                        "Berserker adalah pejuang berani yang mengandalkan kekuatan dan kemarahan dalam pertempuran. "
                                + "Dia bergerak cepat dan menyerang musuhnya dengan kemarahan yang tak terbendung. "
                                + "Meskipun dia kuat dalam serangan, kekurangan pertahanan membuatnya harus berhati-hati dalam pertempuran." },
                { "Aerith",
                        "Aerith berambut cokelat dengan kepangan yang diikat pita merah, dengan white materia di atasnya "
                                + "Aerith merupakan anggota AVALANCHE dan bekerja sebagai penjual bunga di jalan Midgar. "
                                + "Senjatanya adalah guard stick, yang kemampuan menyerangnya relatif lemah dan agak tidak berguna." }
        };

        Scanner scanner = new Scanner(System.in);
        int character;

        System.out.println("Selamat datang di pemilihan karakter fantasy!");
        System.out.println("Berikut adalah pilihan karakter yang tersedia:\n");
        for (int i = 0; i < karakterData.length; i++) {
            System.out.println((i + 1) + ". " + karakterData[i][0]);
        }

        do {
            System.out.print("\nMasukkan nomor karakter yang anda pilih (1-"+karakterData.length+"): ");
            character= scanner.nextInt();
        } while (character < 1 || character > karakterData.length);

        String name = karakterData[character - 1][0];
        String description = karakterData[character- 1][1];

        System.out.println("\nAnda memilih karakter " + name + ".");
        System.out.println(description);

        System.out.println("\nSelamat bermain fantasy dengan karakter " + name + " anda.");
    }
}
