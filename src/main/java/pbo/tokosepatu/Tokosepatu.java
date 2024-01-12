package pbo.tokosepatu;
import java.util.Scanner;

public class Tokosepatu {
    double harga, total, bayar, kembalian;
    int pil, jumlah;
    
    double hitungTotal(int jml){
        jumlah = jml;
        switch(pil){
            case 0:
                System.exit(0);
                break;
            case 1:
                harga = 650000;
                total = total+(harga*jml);
                break;
            case 2:
                harga = 699800;
                total = total+(harga*jml);
                break;
            case 3:
                harga = 650000;
                total = total+(harga*jml);
                break;
            case 4:
                harga = 780000;
                total = total+(harga*jml);
                break;
            case 5:
                harga = 599800;
                total = total+(harga*jml);
                break;
            case 6:
                harga = 305370;
                total = total+(harga*jml);
                break;
            case 9:
                break;
            default:
                System.out.println("ERROR: Input yang Anda Masukkan Salah!");
                break;
        }
        return total;
    }
    
    void viewTotal(){
        System.out.println("----[PEMBAYARAN]----");
        System.out.println("Total: Rp." + total);
    }
    
    double hitungKembalian(double byr){
        bayar = byr;
        kembalian = byr-total;
        return kembalian;
    }
    
    void viewKembalian(){
        System.out.println("Kembalian: Rp." + kembalian);
        System.out.println("====TERIMA KASIH====");
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Tokosepatu in = new Tokosepatu();
        System.out.println("===================");
        System.out.println("MUAMAR GADAFI SPORT");
        do{
            System.out.println("===================");
            System.out.println("Pilih Barang:");
            System.out.println("1. Specs Lightspeed [Rp. 650.000,00]");
            System.out.println("2. Specs Accelerator Illuzion [Rp. 699.800,00]");
            System.out.println("3. Specs Lightspeed Reborn[Rp. 650.000,00]");
            System.out.println("4. Specs Reborn Ivory [Rp. 780.000,00]");
            System.out.println("5. Specs Galactica Nbr [Rp. 599.800,00]");
            System.out.println("6. Specs Metalasa Sansiro [Rp. 305.370,00]");
            System.out.println("\n9. Selesai dan hitung pembayaran");
            System.out.println("0. Keluar Program");
            System.out.println("=================================");
            System.out.print("Masukkan Pilihan Anda:");
            in.pil = input.nextInt();
            if(in.pil>=1 && in.pil<=6){
                System.out.print("Masukkan Jumlah Beli:");
                in.jumlah = input.nextInt();
            }else{
            }
            in.hitungTotal(in.jumlah);
        }while(in.pil!=9);
        in.viewTotal();
        System.out.print("Bayar: Rp.");
        in.bayar = input.nextDouble();
        in.hitungKembalian(in.bayar);
        in.viewKembalian();
    }
}
