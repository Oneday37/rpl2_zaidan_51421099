package rpl2_pert2_51421099;

public class Mahasiswa extends Student{
    public Mahasiswa(){
        super();
    }
    
    @Override
    public String toString(){
        return "Nama = " + getName() + "\n" +
                "NPM = " + getNpm() + "\n" +
                "Kelas = " + getClassNumber() + "\n" +
                "Tahun Lahir = " + getBirthYear() + "\n" +
                "Umur = " + calculatorAge() + "\n" +
                "Alamat = " + getAlamat();
    }
}
