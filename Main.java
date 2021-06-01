import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
/**
 * Write a description of class Main here.
 *
 * @author FIKRIADINARTA
 * @version 0.1
 */
public class Main
{
    public static void main(String args[]){
        
        //ArrayList<Integer> arri = new ArrayList<Integer>();
        //ArrayList<String> arrs = new ArrayList<String>();
        ArrayList<Mahasiswa> arrm = new ArrayList<Mahasiswa>();
        
        System.out.println("Data Mahasiswa");
        System.out.print("Jumlah Mahasiswa: ");
        Scanner input = new Scanner(System.in);
        int jumlah=0, nim=0,umur=0;
        String nama=null,alamat=null,kelas=null;
        jumlah = input.nextInt();
    
        //Menginput Data Mahasiswa
        for(int i=0; i < jumlah; i++){
            
            System.out.print("Nim ke-"+(i+1)+": ");
            nim = input.nextInt();
            System.out.print("Nama ke-"+(i+1)+": ");
            nama = input.next();
            System.out.print("Alamat "+(i+1)+": ");
            alamat = input.next();
            System.out.print("Kelas "+(i+1)+": ");
            kelas = input.next();
            System.out.print("Umur "+(i+1)+": ");
            umur = input.nextInt();
            arrm.add(new Mahasiswa(nim,nama,alamat,kelas,umur));
            System.out.println("\n");
            
        }
        
        System.out.println("\n");
        System.out.println("Menampilkan Data Mahasiswa");
        for (Mahasiswa mhs : arrm)
        {
            System.out.println("Nim : "+mhs.getnimMhs());
            System.out.println("Nama : "+mhs.getnamaMhs());
            System.out.println("Alamat : "+mhs.getalamatMhs());
            System.out.println("Kelas : "+mhs.getkelasMhs());
            System.out.println("Umur : "+mhs.getumurMhs());
            System.out.println("---------------------");
        }
        
        //Mencari data Mahasiswa
        System.out.println("\nSearch Data Mahasiswa");
        int cariNim;
        System.out.print("Cari NIM: ");
        cariNim = input.nextInt();
        System.out.println("Hasil yang dicari:");
        for (Mahasiswa mhs : arrm)
        {
            if(mhs.getnimMhs() == cariNim){
                System.out.println("Nim : "+mhs.getnimMhs());
                System.out.println("Nama : "+mhs.getnamaMhs());
                System.out.println("Alamat : "+mhs.getalamatMhs());
                System.out.println("Kelas : "+mhs.getkelasMhs());
                System.out.println("Umur : "+mhs.getumurMhs());
            }
        }
        /*
        System.out.println("Menampilkan Data Mahasiswa");
        for (Mahasiswa mhs: arrm)
        {
            if(mhs.getnimMhs() == 1001)
            {
                arrm.indexOf(mhs);
                arrm.remove(arrm.indexOf(mhs));
                break;
            }
            System.out.println(mhs.getnimMhs()+" - "+ mhs.getnamaMhs());
        }
        */
       
       //-----------------------------
       /*
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");
        System.out.println("Menampilkan Nilai Array List dengan for biasa");
        for(int i=0; i < arri.size(); i++){
            System.out.println(arri.get(i));
            //System.out.println(arrs.get(i));
        }
        
        System.out.println("");
        Collections.sort(arri);
        System.out.println("Menampilkan Nilai Array List iterator");
        for (Integer valx: arri){
            System.out.println(valx);
        }
        
        System.out.println("");
        System.out.println("Menampilkan Nilai Array sebelum sort");
        for (String valx: arrs){
            System.out.println(valx);
        }
        
        System.out.println("");
        Collections.sort(arrs);
        System.out.println("Menampilkan Nilai Array setelah sort");
        for (String valx: arrs){
            System.out.println(valx);
        }
      
          */
        
        /*
        arri.add(1);
        arri.add(2);
        arri.add(5);
        arri.add(4);
        
        arrs.add("Doni");
        arrs.add("Ayu");
        arrs.add("Bayu");
        arrs.add("Syauli");
        
        //arrm.add(new Mahasiswa(1001,"Doni"));
        
        */
    }
    
}