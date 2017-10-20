
public class EstacionDeTren
{
 private String ciudad;
 private TicketMachine maquina1;
 private TicketMachine maquina2;
 
 
 /**
  * constructor de la estacion de trenes
  */
 public EstacionDeTren(String nombreCiudad, int precio1, int precio2)
 {
  ciudad = nombreCiudad;
  maquina1 = new TicketMachine(precio1);
  maquina2 = new TicketMachine(precio2);
  
 }
 
 /**
  * simula vender billete maquina 1
  */
 public void ventaBilleteMaquina1()
 { 
     maquina1.insertMoney(500);
     maquina1.printTicket();
    
 }
 
 /**
  * simula vender billete maquina 1
  */
 public void ventaBilleteMaquina2()
 { 
     maquina2.insertMoney(600);
     maquina2.printTicket();
    
 }
 
 /**
  * devuelve el total maquina1
  */
 public int recaudado1Maquina()
 {
  return maquina1.getTotal();
 }
 
 /**
  * devuelve el total maquina2
  */
 public int recaudado2Maquina()
 {
  return maquina2.getTotal();
 }
 
 /**
  * devuelve el total de las dos maquinas
  */
 public int totalRecaudado()
 {
  return maquina1.getTotal()+ maquina2.getTotal();  
 }

 public void recaudacion()
 {  System.out.println("recaudado 1 " + maquina1.getTotal());
    System.out.println("recaudado 2 " + maquina2.getTotal());
    System.out.println("recaudado total " + (maquina1.getTotal() +maquina2.getTotal() ));   
 }
 
}
