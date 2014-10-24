package proyecto;
// Generated 15-mar-2014 14:16:27 by Hibernate Tools 3.2.1.GA



/**
 * EjemplaresId generated by hbm2java
 */
public class EjemplaresId  implements java.io.Serializable {


     private int idpel;
     private int num;

    public EjemplaresId() {
    }

    public EjemplaresId(int idpel, int num) {
       this.idpel = idpel;
       this.num = num;
    }
   
    public int getIdpel() {
        return this.idpel;
    }
    
    public void setIdpel(int idpel) {
        this.idpel = idpel;
    }
    public int getNum() {
        return this.num;
    }
    
    public void setNum(int num) {
        this.num = num;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof EjemplaresId) ) return false;
		 EjemplaresId castOther = ( EjemplaresId ) other; 
         
		 return (this.getIdpel()==castOther.getIdpel())
 && (this.getNum()==castOther.getNum());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdpel();
         result = 37 * result + this.getNum();
         return result;
   }   


}

