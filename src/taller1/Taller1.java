
package taller1;


public class Taller1 {



    
 public static void main(String[]args){ 
 
int Salario []={850000,755000,150000,250000,1116000};

 
 for (int  Sa = 0;Sa<Salario.length;Sa++){
    
   System.out.println("Salarios" + Salario [Sa]);   
   
    int PP;
    PP = (Salario[0]+Salario[1]+Salario[2]+Salario[3]+Salario[4])/5;
     System.out.println("promedio" + PP );
     
     
       if (PP > Salario[2]+Salario[3]){
           
         System.out.println("Cantidad de trabajadores que ganan mas que el promedio" );
          
          } else if (PP < (Salario[0]+Salario[1]+Salario[4])){
          
     System.out.println("Cantidad de trabajadores que ganan menos que el promedio");
     
 } else  {
          
 System.out.println("Cantidad de trabajadores que ganan igual que el promedio");
    }
     
     
    
     
     
     
    }   
 } 
  }


  


     
     
     

    
    


        
        
        
        
        
        
    
