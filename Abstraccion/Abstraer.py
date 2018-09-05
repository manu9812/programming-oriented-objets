"""
AUTOR:Manuela Garcia Monsalve
23 de agosto de 2018"""

"""esta es la clase main en dicha clase se crean dos metodos 
como lo son el metodo leer datos que permite capturar por consola la informacion de 
los empleados que son creados, y el metodo mostrar datos que permite 
que dicha informacion sea visualizada"""

class abstraer():
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




   # este metodo sirve para mostrar informcion  de cada uno de los empelados por consola
    def verDatos(self):
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

#se invican los metodos oon la ayuda de los objetos
Empleado1=abstraer()
Empleado2=abstraer()
Empleado3=abstraer()
Empleado4=abstraer()
Empleado5=abstraer()
Empleado1.leerDatos()
Empleado2.leerDatos()
Empleado3.leerDatos()
Empleado4.leerDatos()
Empleado5.leerDatos()
Empleado1.verDatos()
Empleado2.verDatos()
Empleado3.verDatos()
Empleado4.verDatos()
