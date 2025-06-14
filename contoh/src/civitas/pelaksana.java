package civitas;

 public class pelaksana extends  civitass {
     private String kelasDiajar;
public pelaksana(String nama, String KodeUnik, String kelasDiajar){
    super(nama, KodeUnik);
    this.kelasDiajar = kelasDiajar;
}

     public String getKelasDiajar() {
         return kelasDiajar;
     }
     public void setkelasDiajar(String kelasDiajar){
    this.kelasDiajar = kelasDiajar;

     }
 }