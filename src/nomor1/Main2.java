package nomor1;

public class Main2 {
    public static void main(String[] args) {
        
        Object [][] data ={
            {"Parman"  ,"1965" ,"Laki"     }, // baris ke-0
            {"Paijo"   ,"1964" ,"Laki"     }, // baris ke-1
            {"Sutami"   ,"1970" ,"Perempuan"     }, // baris ke-2
            {"Sutijah"   ,"1969" ,"Perempuan"     }, // baris ke-3
            {"Paimin"   ,"1971" ,"Laki"}  // baris ke-4
        };
        
        Object[][] ganti = ChangeArrayLength.changeLength2D(data, 9, 3);
        
        System.out.println("Length   : "+ganti.length);
        System.out.println("Length 2 : "+ganti[0].length);
        System.out.println("");
        
        for(Object[] ganti2 : ganti){
            for(int i = 0; i<ganti[0].length; i++){
                System.out.println(ganti2[i]);
            }
            System.out.println();
        }
    }
}
