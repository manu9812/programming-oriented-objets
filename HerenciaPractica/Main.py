
import Empleado

"""
AUTOR:Manuela Garcia Monsalve 
23 de agosto de 2018"""

"""esta es la clase main en dicha clase se crean dos metodos 
como lo son el metodo leer datos que permite capturar por consola la informacion de 
los empleados que son creados, y el metodo mostrar datos que permite 
que dicha informacion sea visualizada"""

class main:
    def  leerDatos(self):
        print("ingrese su nombre ")
        self.nombre=input()
        print ("ingrese su apellido")
        self.apellido=input()
        self.edad= int(input("ingrese su edad"))
        print("ingrese su fecha de nacimiento")
        self.fechaN=input()
        self.sueldo= int(input("ingrese su sueldo"))
        print("ingrese  su telefono")
        self.telefono=input()
        print("ingrese su direccion")
        self.direccion=input()
        print("ingrese su email")
        self.email=input()
        print("ingrese su cargo")
        self.cargo=input()




    def mostrarDatos(self):
        print("SUS DATOS ")
        print("Nombre: ", self.nombre," ",self.apellido,"\n")
        print("Edad: ",self.edad,"\n")
        print("fecha de nacimiento: ", self.fechaN, "\n")
        print("sueldo: ", self.sueldo, "\n")
        print("telefono: ", self.telefono, "\n")
        print("direccion: ", self.direccion, "\n" )
        print("email: ", self.email, "\n")
        print("cargo:", self.cargo, "\n")
        print("------------------------------------------------")


Empleado1=main()
Empleado2=main()
Empleado3=main()
Empleado1.leerDatos()
Empleado2.leerDatos()
Empleado3.leerDatos()
Empleado1.mostrarDatos()
Empleado2.mostrarDatos()
Empleado3.mostrarDatos()