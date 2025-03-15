/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasharipasaranmasalalu;
import java.util.Scanner;
/**
 *
 * @author maeby
 */
public class Tugasharipasaranmasalalu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String minggu,senin,selasa,rabu,kamis,jumat,sabtu, hasil="", hasil2="";
        int tanggal1,bulan1,tahun1,tanggal2,bulan2,tahun2,hari1,hari2;
        System.out.print("Nama Hari saat ini = ");
        String in = input.nextLine();
        System.out.print("Nama pasaran hari ini = ");
        String in2 = input.nextLine();
        System.out.print("Masukkan Tanggal saat ini = ");
        tanggal1 = input.nextInt();
        System.out.print("Masukkan Bulan saat ini = ");
        bulan1 = input.nextInt();
        System.out.print("Masukkan Tahun saat ini = ");
        tahun1 = input.nextInt();
        System.out.print("Masukkan Tanggal yang lalu = ");
        tanggal2 = input.nextInt();
        System.out.print("Masukkan Bulan yang lalu = ");
        bulan2 = input.nextInt();
        System.out.print("Masukkan Tahun yang lalu = ");
        tahun2 = input.nextInt();
        
        switch (bulan1){
                case 1 :
                    hari1 = tanggal1;
                break;
                case 2 : 
                    hari1 = 31+tanggal1;
                break;
                case 3 :
                    if (tahun1%4==0){
                        hari1 = 31+29+tanggal1;
                    } else {
                        hari1 = 31+28+tanggal1;
                    }
                break;
                case 4 :
                    if (tahun1%4==0){
                        hari1 = 31+29+31+tanggal1;
                    } else {
                        hari1 = 31+28+31+tanggal1;
                    }
                break;
                case 5 :
                    if (tahun1%4==0){
                        hari1 = 31+29+31+30+tanggal1;
                    } else {
                        hari1 = 31+28+31+30+tanggal1;
                    }
                break;
                case 6 :
                    if (tahun1%4==0){
                        hari1 = 31+29+31+30+31+tanggal1;
                    } else {
                        hari1 = 31+28+31+30+31+tanggal1;
                    }
                break;
                case 7 :
                    if (tahun1%4==0){
                        hari1 = 31+29+31+30+31+30+tanggal1;
                    } else {
                        hari1 = 31+28+31+30+31+30+tanggal1;
                    }
                break;
                case 8 :
                    if (tahun1%4==0){
                        hari1 = 31+29+31+30+31+30+31+tanggal1;
                    } else {
                        hari1 = 31+28+31+30+31+30+31+tanggal1;
                    }
                break;
                case 9 :
                    if (tahun1%4==0){
                        hari1 = 31+29+31+30+31+30+31+31+tanggal1;
                    } else {
                        hari1 = 31+28+31+30+31+30+31+31+tanggal1;
                    }
                break;
                case 10 :
                    if (tahun1%4==0){
                        hari1 = 31+29+31+30+31+30+31+31+30+tanggal1;
                    } else {
                        hari1 = 31+28+31+30+31+30+31+31+30+tanggal1;
                    }
                break;
                case 11 :
                    if (tahun1%4==0){
                        hari1 = 31+29+31+30+31+30+31+31+30+31+tanggal1;
                    } else {
                        hari1 = 31+28+31+30+31+30+31+31+30+31+tanggal1;
                    }
                break;
                case 12 : 
                    if (tahun1%4==0){
                        hari1 = 31+29+31+30+31+30+31+31+30+31+30+tanggal1;
                    } else {
                        hari1 = 31+28+31+30+31+30+31+31+30+31+30+tanggal1;
                    }
                break;
                default :
                    hari1 = 9999;
        }
        
            
        switch (bulan2){
                case 1 :
                    hari2 = tanggal2;
                break;
                case 2 : 
                    hari2 = 31+tanggal2;
                break;
                case 3 :
                    if (tahun2%4==0){
                        hari2 = 31+29+tanggal2;
                    } else {
                        hari2 = 31+28+tanggal2;
                    }
                break;
                case 4 :
                    if (tahun2%4==0){
                        hari2 = 31+29+31+tanggal2;
                    } else {
                        hari2 = 31+28+31+tanggal2;
                    }
                break;
                case 5 :
                    if (tahun2%4==0){
                        hari2 = 31+29+31+30+tanggal2;
                    } else {
                        hari2 = 31+28+31+30+tanggal2;
                    }
                break;
                case 6 :
                    if (tahun2%4==0){
                        hari2 = 31+29+31+30+31+tanggal2;
                    } else {
                        hari2 = 31+28+31+30+31+tanggal2;
                    }
                break;
                case 7 :
                    if (tahun2%4==0){
                        hari2 = 31+29+31+30+31+30+tanggal2;
                    } else {
                        hari2 = 31+28+31+30+31+30+tanggal2;
                    }
                break;
                case 8 :
                    if (tahun2%4==0){
                        hari2 = 31+29+31+30+31+30+31+tanggal2;
                    } else {
                        hari2 = 31+28+31+30+31+30+31+tanggal2;
                    }
                break;
                case 9 :
                    if (tahun2%4==0){
                        hari2 = 31+29+31+30+31+30+31+31+tanggal2;
                    } else {
                        hari2 = 31+28+31+30+31+30+31+31+tanggal2;
                    }
                break;
                case 10 :
                    if (tahun2%4==0){
                        hari2 = 31+29+31+30+31+30+31+31+30+tanggal2;
                    } else {
                        hari2 = 31+28+31+30+31+30+31+31+30+tanggal2;
                    }
                break;
                case 11 :
                    if (tahun2%4==0){
                        hari2 = 31+29+31+30+31+30+31+31+30+31+tanggal2;
                    } else {
                        hari2 = 31+28+31+30+31+30+31+31+30+31+tanggal2;
                    }
                break;
                case 12 : 
                    if (tahun2%4==0){
                        hari2 = 31+29+31+30+31+30+31+31+30+31+30+tanggal2;
                    } else {
                        hari2 = 31+28+31+30+31+30+31+31+30+31+30+tanggal2;
                    }
                break;
                default:
                    hari2=9999;
                    }
        
        int selisihtahun = 0, h1 = 0, h2 = 0, selisihhari, k, u;
        u = tahun2;
        k = 0;
        if (tahun1!= tahun2){
            selisihtahun = tahun1-tahun2-1;
            while (u<tahun1-1){
              u=u+1;  
              if (u%4==0){
                  k = k+1;
              }
            }
            h1 = 365*selisihtahun+k;
            if (tahun2%4==0){
            h2 = 366-hari2;
            }else{
                h2 = 365-hari2;
            }
            selisihhari = hari1+h1+h2;
        }else{
        selisihhari = Math.abs (hari1-hari2);
    }
        
            
        int hari = 0;
        switch (in){
            case "minggu":
                hari = 6;
            break;
            case "senin":
                hari = 5;
            break;
            case "selasa":
                hari = 4;
            break;
            case "rabu":
                hari = 3;
            break;
            case "kamis":
                hari = 2;
            break;
            case "jumat":
                hari = 1;
            break;
            case "sabtu":
                hari = 0;
            break;
            default :
                System.out.println("masukkan nama hari");
        }    
                
            int pasaran = 0;
            switch(in2){
                case "pon":
                    pasaran = 4;
                break;
                case "wage":
                    pasaran = 3;
                break;
                case "kliwon":
                    pasaran = 2;
                break;
                case "legi":
                    pasaran = 1;
                break;
                case "pahing":
                    pasaran = 0;
                break;
                default :
                    System.out.println("Masukkan nama pasaran!");
            }    
           
            int hari3 = (selisihhari+hari)%7;
            if (hari3>6){
                hari3 -= 6;
            }
            switch (hari3){
            case 6 :
                hasil = "minggu";
            break;
            case 5 :
                hasil = "senin";
            break;
            case 4 :
                hasil = "selasa";
            break;
            case 3 :
                hasil = "rabu" ;
            break;
            case 2 :
                hasil = "kamis";
            break;
            case 1 :
                hasil = "jumat";
            break;
            case 0 :
                hasil = "sabtu";
            break;
            default :
                System.out.println("masukkan nama hari ke berapa!");
            }       
            
        int pasaran2 = (selisihhari+pasaran)%5;
        if (pasaran2>4){
            pasaran2 -=4;
        }
        switch (pasaran2){
            case 4 :
                hasil2 ="pon";
            break;
            case 3 :
                hasil2 ="wage";
            break;
            case 2 :
                hasil2 ="kliwon";
            break;
            case 1 :
                hasil2 ="legi";
            break;
            case 0 :
                hasil2 ="pahing";
            break;
            default:
                System.out.println("Masukkan nama pasaran!");
        }  
        System.out.println ("hari = "+hasil);
        System.out.println ("pasaran = "+hasil2);
    }
    }
