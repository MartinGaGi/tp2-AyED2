import java.util.ArrayList;

public class Universidad {
    
    String nombre;
    String direccion;
    ArrayList<Carrera> carreras;//Relacion con la clase Carrera.
    ArrayList<Estudiante> estudiantes;//Relacion con la clase Estudiante.
    ArrayList<Profesor> profesores;//Relacion con la clase Profesor.
    ArrayList<Personal> personal;//Relacion con la clase Personal.
    
    public Universidad(String nombre, String direccion){
        this.nombre=nombre;
        this.direccion=direccion;
        this.carreras= new ArrayList<>();
        this.estudiantes=new ArrayList<>();
        this.profesores=new ArrayList<>();
        this.personal=new ArrayList<>();
    }
    //GETTERS
    public String getNombre(){
        return nombre;
    }
    public String getDireccion(){
        return direccion;
    }
    public ArrayList<Carrera> getCarreras(){
        return carreras;
    }
    public ArrayList<Estudiante> getEstudiantes(){
        return estudiantes;
    }
    public ArrayList<Profesor> getProfesores(){
        return profesores;
    }
    public ArrayList<Personal> getPersonal(){
        return personal;
    }
    //SETTERS
    public void setNombre(String nombre){
        if(nombre != null && !nombre.trim().isEmpty()){
           this.nombre=nombre;
        }
        else{
            System.out.println("Nombre Invalido.");
        }
    }
    public void setDireccion(String direccion){
         if(direccion != null && !direccion.trim().isEmpty()){
           this.direccion=direccion;
        }
        else{
            System.out.println("Dirección Invalida.");
        }
    }
    public void setEstudiantes(ArrayList<Estudiante> estudiantes){
        this.estudiantes=estudiantes;
    }
    public void setProfesores(ArrayList<Profesor> profesores){
        this.profesores = profesores;
    }
    public void setPersonal(ArrayList<Personal> personal){
        this.personal = personal;
    }
    
    public void agregarEstudiante(Estudiante estudiante){
        if(estudiante != null){
            estudiantes.add(estudiante);
        } else {
            System.out.println("Estudiante invalido.");
        }
    }
    
    public void agregarProfesor(Profesor profesor){
        if(profesor != null){
            profesores.add(profesor);
            System.out.println("Profesor " + profesor.getNombre() + " " + profesor.getApellido() + " agregado exitosamente.");
        } else {
            System.out.println("Profesor invalido.");
        }
    }
    
    public void agregarPersonal(Personal personal){
        if(personal != null){
            this.personal.add(personal);
            System.out.println("Personal " + personal.getNombre() + " " + personal.getApellido() + " agregado exitosamente.");
        } else {
            System.out.println("Personal invalido.");
        }
    }
    
    public Profesor obtenerProfesor(String documento){
        for(Profesor profesor : profesores){
            if(profesor.getDocumento().equalsIgnoreCase(documento)){
                return profesor;
            }
        }
        return null;
    }
    
    public Personal obtenerPersonal(String documento){
        for(Personal empleado : personal){
            if(empleado.getDocumento().equalsIgnoreCase(documento)){
                return empleado;
            }
        }
        return null;
    }
    
    //METODOS PARA GESTIONAR CARRERAS
    public void agregarCarrera(Carrera carrera){
        if(carrera != null){
            carreras.add(carrera);
            System.out.println("Carrera " + carrera.getNombre() + " agregada exitosamente.");
        }
        else{
            System.out.println("Carrera invalida.");
        }
    }
    
    public Carrera obtenerCarrera(String nombre){//esto es para buscar la carrera a la que se le va a inscribir el estudiante.
        for(Carrera carrera : carreras){
            if(carrera.getNombre().equalsIgnoreCase(nombre)){
                return carrera;
            }
        }
        return null;
    }
    
    public void listarCarreras(){
        System.out.println("=== CARRERAS DE " + nombre + " ===");
        if(carreras.isEmpty()){
            System.out.println("No hay carreras registradas.");
        }
        else{
            for(Carrera carrera : carreras){
                System.out.println("- " + carrera.getNombre());
            }
        }
    }
    
    //Método toString
    @Override
    public String toString(){
        return "Universidad:" +
                "Nombre='" + nombre + '\'' +
                ", Direccion='" + direccion + '\'' +
                ", Carreras=" + carreras.size() +
                ", Estudiantes=" + estudiantes.size() +
                ", Profesores=" + profesores.size() +
                ", Personal=" + personal.size();
    }
    
    //Método equals - utiliza nombre como identificador único
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Universidad universidad = (Universidad) o;
        return nombre != null && nombre.equals(universidad.nombre);
    }
    
    //Método hashCode - basado en nombre
    @Override
    public int hashCode(){
        return nombre != null ? nombre.hashCode() : 0;
    }
}
