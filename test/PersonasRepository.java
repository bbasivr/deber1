
import java.util.ArrayList;
import java.util.List;


public class PersonasRepository {
      private List<Persona> personas= new ArrayList<>();
    
    public PersonasRepository(){
     Persona pr1 = new Persona();
        pr1.setCodigo(1);
        pr1.setNombre("CESAR");
        pr1.setDestino("GUAYAQUIL");
        pr1.setEdad(10);
   
        
       
        Persona pr2 = new Persona(2, "Galo","Manta",2);
        Persona pr3 = new Persona(3,"Victoria","Quito", 45);
     
    
             personas.add(pr1);
             personas.add(pr2);
             personas.add(pr3);
    
}
     public void agregar(Persona persona){
         personas.add(persona);
         
     }
   List<Persona> getPersonas(){
       return personas;
   }
   
   public Persona getPersona(int id){
       
       for(Persona persona:personas){
           if(persona.getCodigo()==id){
              return persona; 
           }
               break;
       }
       return null;
   }
   
   
   public List<Persona> getPorRangoEdad(int inicio,int fin){
       List<Persona> result = new ArrayList<>();
       for(Persona p: personas){
           if(p.getEdad()<=inicio || fin>=p.getEdad()){
               result.add(p);
           }
       }
       return result;
   }
   
   public List<Persona> getPersonaPorNombre(String filtro){
       List<Persona> result = new ArrayList();
       for(Persona persona:personas){
           if(persona.getNombre().contains(filtro))
               result.add(persona);
            break;
        }       
          return result;   

  
    }

    public void Imprimir(){
        System.out.println(personas.toString());
    }
}
