package proyecto;
// Generated 15-mar-2014 14:16:27 by Hibernate Tools 3.2.1.GA



/**
 * Ejemplares generated by hbm2java
 */
public class Ejemplares  implements java.io.Serializable {


     private EjemplaresId id;
     private String estado;

    public Ejemplares() {
    }

	
    public Ejemplares(EjemplaresId id) {
        this.id = id;
    }
    public Ejemplares(EjemplaresId id, String estado) {
       this.id = id;
       this.estado = estado;
    }
   
    public EjemplaresId getId() {
        return this.id;
    }
    
    public void setId(EjemplaresId id) {
        this.id = id;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }




}


