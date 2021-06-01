
/**
 * Write a description of class mahasiswa here.
 *
 * @author FIKRIADINARTA
 * @version 0.1
 */
public class Mahasiswa
{
    // instance variables - replace the example below with your own
    private int nim;
    private String nama;
    private String alamat;
    private String kelas;
    private int umur;
    
    public Mahasiswa(int nim, String nama,String alamat,String kelas,int umur)
    {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.kelas = kelas;
        this.umur = umur;
    }
   
    public String getnamaMhs()
    {
         return this.nama;
    }
    
    public int getnimMhs()
    {
         return this.nim;
    }
    
    public String getalamatMhs()
    {
         return this.alamat;
    }
    
    public String getkelasMhs()
    {
         return this.kelas;
    }
    
    public int getumurMhs()
    {
         return this.umur;
    }
    
    public void setnamaMhs(String nama)
    {
        this.nama = nama;
    }
    
    public void setnimMhs(int nim)
    {
        this.nim = nim;
    }
    
    public void setalamatMhs(String alamat)
    {
        this.alamat = alamat;
    }
    
    public void setkelasMhs(String kelas)
    {
        this.kelas = kelas;
    }

    public void setumurMhs(int umur)
    {
        this.umur = umur;
    }
}