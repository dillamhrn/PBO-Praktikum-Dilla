/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1.pbo;

/**
 *
 * @author LENOVO
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PostTest1PBO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> kontak = new ArrayList<>();
        int pilihan = 0;
        
        System.out.println("===========  Kontak Saya  ===========");
        
        while (pilihan != 5) {
            System.out.println("\n-------------------------------------");
            System.out.println("                Menu                 ");
            System.out.println("-------------------------------------");
            System.out.println("1. Tambah Kontak");
            System.out.println("2. List Kontak");
            System.out.println("3. Edit Kontak");
            System.out.println("4. Hapus Kontak");
            System.out.println("5. Keluar");
            System.out.println("_____________________________________");
            System.out.print("Masukkan pilihan [1-5]: ");
            pilihan = input.nextInt();
            input.nextLine();
            
            if (pilihan == 1) { // tambah kontak
                System.out.println("\n=====================================");
                System.out.println("             Kontak Baru");
                System.out.println("=====================================");
                System.out.print("Nama      : ");
                String nama = input.nextLine();
                System.out.print("Nomor HP  : ");
                String nomor = input.nextLine();
                kontak.add(nama + " | " + nomor);
                System.out.println("_____________________________________");
                System.out.println("Berhasil menambahkan '" + nama + "'");
            }
            else if (pilihan == 2) { // tampilkan kontak
                System.out.println("\n=====================================");
                System.out.println("             List Kontak");
                System.out.println("=====================================");
                if (kontak.isEmpty()) {
                    System.out.println("[!] Belum ada kontak");
                } else {
                    for (int i = 0; i < kontak.size(); i++) {
                        System.out.println((i + 1) + ". " + kontak.get(i));
                    }
                }
            }
            else if (pilihan == 3) { // edit kontak
                System.out.println("\n=====================================");
                System.out.println("             Edit Kontak");
                System.out.println("=====================================");
                System.out.print("Nomor urut kontak yang mau diubah: ");
                int idx = input.nextInt() - 1;
                input.nextLine();
                if (idx >= 0 && idx < kontak.size()) {
                    System.out.println("Kontak lama: " + kontak.get(idx));
                    System.out.println("_____________________________________");
                    System.out.print("Nama baru   : ");
                    String nama = input.nextLine();
                    System.out.print("Nomor baru  : ");
                    String hp = input.nextLine();
                    System.out.println("_____________________________________");
                    kontak.set(idx, nama + " - " + hp);
                    System.out.println("Berhasil memperbarui kontak");
                } else {
                    System.out.println("_____________________________________");
                    System.out.println("[!] Nomor kontak tidak valid.");
                }
            }
            else if (pilihan == 4) { // hapus kontak
                System.out.println("\n=====================================");
                System.out.println("             Hapus Kontak");
                System.out.println("=====================================");
                System.out.print("Nomor urut kontak yang mau dihapus: ");
                int idx = input.nextInt() - 1;
                input.nextLine();
                if (idx >= 0 && idx < kontak.size()) {
                    System.out.println("_____________________________________");
                    System.out.println("'" + kontak.get(idx) + "' berhasil dihapus.");
                    kontak.remove(idx);
                } else {
                    System.out.println("_____________________________________");
                    System.out.println("[!] Nomor kontak tidak valid.");
                }
            }
            else if (pilihan == 5) {
                System.out.println("=====================================");
                System.out.println("   Program selesai. Terima kasih!");
                System.out.println("=====================================");
            }
            else {
                System.out.println("[!]️ Pilihan tidak valid, coba lagi.");
            }
        }

        input.close();
    }
}

