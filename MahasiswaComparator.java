import java.util.Comparator;

/**
 * Write a description of class MahasiswaComparator here.
 *
 * @author fikriadinarta
 * @version (a version number or a date)
 */
public class MahasiswaComparator implements Comparator<Mahasiswa>
{
    // instance variables - replace the example below with your own
  
    /**
     * Constructor for objects of class MahasiswaComparator
     */
    public MahasiswaComparator()
    {
        // initialise instance variables
       
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    @Override
    public int compare(Mahasiswa mhs1, Mahasiswa mhs2)
    {
        // put your code here
        //return mhs1.getnimMhs() - mhs2.getnimMhs();
        return mhs1.getumurMhs() - mhs2.getumurMhs();
    }
}