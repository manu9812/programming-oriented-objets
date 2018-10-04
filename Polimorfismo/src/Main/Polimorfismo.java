/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Contabilidad.AnalistaContable;
import Contabilidad.AuxCartera;
import Contabilidad.AuxContable;
import Contabilidad.Contador;
import polimorfismo.Admin_DB;
import polimorfismo.Arquitecto;
import polimorfismo.Diseñador;
import polimorfismo.Programador;

/**
 *
 * @author Manuela García Monsalve 
 * 28 septiembre 2018
 */
public class Polimorfismo {

 /**
  * @param args the command line arguments
  */
 public static void main(String[] args) {
  // aqui creo los objetos 
  Arquitecto arqui1= new Arquitecto();
  arqui1.Datos("julian ", "Perez");
  arqui1.sueldo(48, 100000);
  arqui1.Labores("diseña software");
  
  
  // ----------------------------------------
  Admin_DB admin = new Admin_DB();
  admin.Datos("jorge", "gonzalez", "bases de datos jerarquica");
  admin.sueldo(50, 30000, 60000);
  admin.Labores("empleado", " desarrollo de bases de  datos ");
  
  
  //-----------------------------------------
  Diseñador disena = new Diseñador();
  disena.Datos("jorge", "garcía", 30);
  disena.sueldo(50, 39000, 27);
  disena.Labores("interfaces Gráficas", 3);
  
  //-----------------------------------------
  
  Programador programming = new Programador();
  programming.Datos("Daniel", "Orrego", "calle 67 este");
  programming.sueldo(69,150000, 8);
  programming.Labores("programador ", "PHP ");
  
  //-----------------------------------------
  
  AuxContable contable = new AuxContable();
  contable.Datos("Andrea", "Guerrero");
  contable.sueldo(50, 70000);
  contable.Labores("pago de personal", "ninguna");
 
  
  //----------------------------------------
  AuxCartera cartera= new AuxCartera();
  cartera.Datos("juana", "pepita");
  cartera.sueldo(60, 20000);
  cartera.Labores("dinero", "Finanzas");
  
  
  //----------------------------------------
  
  AnalistaContable analista= new AnalistaContable();
  analista.Datos("sofia", "Monsalve");
  analista.sueldo(45, 51);
  analista.Labores("analista", "ninguna");
  
  
  //----------------------------------------
  
  Contador contador= new Contador();
  contador.Datos("sergio", "perez");
  contador.sueldo(39, 20000);
  contador.Labores("administrar recursos", "contalidad avanzada");
 }
 
 
 
}
