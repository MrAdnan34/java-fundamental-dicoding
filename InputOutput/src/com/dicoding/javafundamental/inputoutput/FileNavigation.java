package com.dicoding.javafundamental.inputoutput;

import java.io.File;

public class FileNavigation {
    public static void main(String args[]) {
        String dirname = "/java/latihan1";
        File file = null;

//        File file = new File(dirname);
//        // Buat directory
//        file.mkdirs();

        String[] paths;

        try {
            // Instansiasi objek File
            file = new File(dirname);

//            file.mkdirs();

            // Ambil list files dan masukkan ke string paths
            paths = file.list();

            // Tampilkan semua path yang ada
            for (String path : paths) {
                System.out.println(path);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}