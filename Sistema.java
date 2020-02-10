import java.util.Scanner;

public class Sistema{
    
    public static void main (String [] args){
        
        String nombre = " ";
        int clave = 0, antiguidad = 0;
        
        Scanner entrada = new Scanner (System.in);
        
        
        System.out.println("***********************************************");
        System.out.println("*Bienvenido al Sistema Vacacional tecnologia Punto Fijo. C.A*");
        System.out.println("***********************************************");
        System.out.println ("");
        System.out.println ("");
        
        
        System.out.println ("¿Cual es el nombre del trabajador?: ");
        nombre = entrada.nextLine();
        System.out.println("");
        
        
        System.out.println ("¿Cuanto tiempo de servicio tiene el trabajador?: ");
        antiguidad = entrada.nextInt();
        System.out.println("");
        
       
         System.out.println("¿Cual es la clave del trabajador?: ");
        clave = entrada.nextInt();
        System.out.println("");
        
             if(clave==1){
            
            if (antiguidad == 1){
                 
                System.out.println ("El trabajador " + nombre +  " Tiene derecho a 6 dias de vacaciones");
            }
         
            if (antiguidad >=2 && antiguidad<=6){
                 
                System.out.println ("El trabajador " + nombre +  " Tiene derecho a 6 dias de vacaciones");
            }
            
            else if (antiguidad >=7){
            
            System.out.println ("El trabajador " + nombre +  " Tiene derecho a 20 dias de vacaciones");
        }
        
            
        } 
        else if (clave ==2){
            
          
          
           if (antiguidad == 1){
                
                System.out.println ("El trabajador " + nombre +  " Tiene derecho a 67 dias de vacaciones");
            }
            else if (antiguidad>=2 && antiguidad<=6){
                
            System.out.println ("El trabajador " + nombre +  " Tiene derecho a 15 dias de vacaciones");
            }
            
            else if (antiguidad >=7){
            
            System.out.println ("El trabajador " + nombre +  " Tiene derecho a 22 dias de vacaciones");
    
            }
          
            
         }
        
        else if (clave == 3){
        
        
         if (antiguidad == 1){
                
                System.out.println ("El trabajador " + nombre +  " Tiene derecho a 10 dias de vacaciones");
            }
            else if (antiguidad>=2 && antiguidad<=6){
                
            System.out.println ("El trabajador " + nombre +  " Tiene derecho a 20 dias de vacaciones");
            }
            
            else if (antiguidad >=7){
            
            System.out.println ("El trabajador " + nombre +  " Tiene derecho a 30 dias de vacaciones");
        }
        
        
    }
        
        else{
     
     System.out.println ("Error la clave que puso es incorrecta");
    
      }  
        
        
    }  
}     
