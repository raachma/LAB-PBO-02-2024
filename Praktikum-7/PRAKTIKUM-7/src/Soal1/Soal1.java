package Soal1;

 class Karyawan {
    
    private String nama;
    private int umur;
    private String jabatan;
    private int Gaji;
    



    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    public String getJabatan() {
        return jabatan;
    }
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    public int getGaji() {
        return Gaji;
    }
    public void setGaji(int gaji) {
        Gaji = gaji;
    }

    

}




abstract class Kehidupan{

    void prosesKehidupan(){
        System.out.println("???");
    }
}


class Pengalaman extends Kehidupan{

    @Override
    void prosesKehidupan(){
        System.out.println("");
    }


    void JenisPekerjaan(){
        System.out.println("software engineer");
    }

   
}


class Pendidikan extends Karyawan{
   String SD;
   String SMP;
   String SMA;
   String S1;
   String S2;
   String S3;

   public String getSD() {
    return SD;
}
public void setSD(String sD) {
    SD = sD;
}
public String getSMP() {
    return SMP;
}
public void setSMP(String sMP) {
    SMP = sMP;
}
public String getSMA() {
    return SMA;
}
public void setSMA(String sMA) {
    SMA = sMA;
}
public String getS1() {
    return S1;
}
public void setS1(String s1) {
    S1 = s1;
}
public String getS2() {
    return S2;
}
public void setS2(String s2) {
    S2 = s2;
}
public String getS3() {
    return S3;
}
public void setS3(String s3) {
    S3 = s3;
}


  
    
}


class Projek extends Karyawan{
    int ProjekIT;

    


    void ProjekIT
    
}

