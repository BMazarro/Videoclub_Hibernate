package proyecto;
// Generated 15-mar-2014 14:16:27 by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Alquiler generated by hbm2java
 */
public class Alquiler  implements java.io.Serializable {


     private AlquilerId id;
     private Date fechadev;

    public Alquiler() {
    }

	
    public Alquiler(AlquilerId id) {
        this.id = id;
    }
    public Alquiler(AlquilerId id, Date fechadev) {
       this.id = id;
       this.fechadev = fechadev;
    }
   
    public AlquilerId getId() {
        return this.id;
    }
    
    public void setId(AlquilerId id) {
        this.id = id;
    }
    public Date getFechadev() {
        return this.fechadev;
    }
    
    public void setFechadev(Date fechadev) {
        this.fechadev = fechadev;
    }




}


