
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner string = new Scanner(System.in);

        int i, j, menu, jmlh;
        String str;

        do {
            System.out.println("===== Tugas 7 : String Manipulation =====");
            System.out.println("1. Backspace");
            System.out.println("2. Int to String");
            System.out.println("3. Palindrom");
            System.out.println("4. Exit");
            System.out.printf("Pilihan: ");
            menu = scan.nextInt();
            switch (menu) {
                case 1://fix
                    System.out.println("===== Menu 1 : Backspace =====");
                    System.out.println("Masukkan String: ");
                    str = string.nextLine();
                    String hasil = str.replace("<", "\b");//escape sequence
                    System.out.print("String = ");
                    System.out.print(hasil);
                    System.out.println("");
                    break;
                case 2://fix
                    //kamus
                    String[] satuan = {"", "satu ", "dua ", "tiga ", "empat ", "lima ", "enam ", "tujuh ", "delapan ", "sembilan "};
                    String[] puluhan = {"", "", "dua puluh ", "tiga puluh ", "empat puluh ", "lima puluh ", "enam puluh ", "tujuh puluh ", "delapan puluh ", "sembilan puluh "};
                    String[] ratusan = {"", "seratus ", "dua ratus ", "tiga ratus ", "empat ratus ", "lima ratus ", "enam ratus ", "tujuh ratus ", "delapan ratus ", "sembilan ratus "};
                    String[] ribuan = {"", "seribu ", "dua ribu ", "tiga ribu ", "empat ribu ", "lima ribu ", "enam ribu ", "tujuh ribu ", "delapan ribu ", "sembilan ribu "};
                    System.out.println("===== Menu 2 : Int to String =====");
                    System.out.printf("Masukkan kalimat : ");
                    str = string.nextLine();

                    String[] pecah = str.split(" ");

                    System.out.print("Kalimat: ");
                    for (i = 0; i < pecah.length; i++) {
                        try {
                            int baru = Integer.parseInt(pecah[i]);//proses angka
                            
                            if (baru <= 9999 & baru % 100 / 10 == 1 & baru % 10 != 1 & baru % 10 != 0) {
                                System.out.print(ribuan[baru / 1000] + ratusan[baru % 1000 / 100] + satuan[baru % 10] + "belas ");
                            } else if (baru <= 9999 & baru % 100 / 10 == 1 & baru % 10 == 1) {
                                System.out.print(ribuan[baru / 1000] + ratusan[baru % 1000 / 100] + "sebelas ");
                            } else if (baru <= 9999 & baru % 100 / 10 == 1 & baru % 10 == 0) {
                                System.out.print(ribuan[baru / 1000] + ratusan[baru % 1000 / 100] + "sepuluh ");
                            } else if (baru <= 9999) {
                                System.out.print(ribuan[baru / 1000] + ratusan[baru % 1000 / 100] + puluhan[baru % 100 / 10] + satuan[baru % 10]);
                            } else {
                                System.out.print("");
                            }
                            
                        } catch (NumberFormatException e) {
                            System.out.print(pecah[i] + " ");//proses yang bukan angka
                        }
                    }
                    System.out.printf("\n\n");
                    break;
                case 3://fix
                    System.out.println("===== Menu 3 : Palindrom =====");
                    System.out.printf("Masukkan jumlah test case: ");
                    jmlh = scan.nextInt();
                    boolean[] jawaban = new boolean[jmlh];
                    for (i = 0; i < jmlh; i++) {
                        System.out.printf("Masukkan String Test Case ke-%d : ", i + 1);
                        str = string.nextLine();

                        //reverse
                        String akhir = "";
                        for (j = str.length() - 1; j >= 0; j--) {
                            akhir = akhir + str.charAt(j);
                        }

                        //true false
                        jawaban[i] = str.matches(akhir);
                    }
                    for (i = 0; i < jmlh; i++) {
                        System.out.printf("Test-Case #%d : %s\n", i + 1, jawaban[i]);
                    }
                    System.out.println("");
                    break;
                case 4://fix
                    break;
                default://fix
                    System.out.printf("Input Salah\n\n");
                    break;
            }
        } while (menu != 4);
    }
}
