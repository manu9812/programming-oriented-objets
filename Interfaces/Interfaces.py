
import Empleado,Enfermedades,Retardos
"""
AUTOR:Manuela Garcia Monsalve
23 de agosto de 2018"""


"""esta es la clase main en dicha clase se crean dos metodos 
como lo son el metodo leer datos que permite capturar por consola la informacion de 
los empleados que son creados, y el metodo mostrar datos que permite 
que dicha informacion sea visualizada"""

class Interfaces():
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
        print("\n")

    def meQuedeDormido(self):
        print("llegue tarde, porque me quede dormido")

    def habiaTrancon(self):
        print("llegue tarde, porque habia trancon")

    def meRobaron(self):
        print("llegue tarde, porque me robaron ")

    def gripa(self):
            print("tengo gripa")

    def migrana(self):
            print("tengo migraña")

    def gastritis(self):
            print("tengo gastritis")

    def fiebre(self):
            print("tengo fiebre")

    def colicos(self):
            print("tengo colicos")

    def diabetes(self):
            print("tengo diabetes")

    def azucarEnLaSangre(self):
            print("tengo azucar en la sangre ")

#se invican los metodos oon la ayuda de los objetos
Empleado1=Interfaces()
Empleado2=Interfaces()
Empleado3=Interfaces()
Empleado4=Interfaces()
Empleado5=Interfaces()
Empleado6=Interfaces()

Empleado1.leerDatos()
Empleado2.leerDatos()
Empleado3.leerDatos()
Empleado4.leerDatos()
Empleado5.leerDatos()
Empleado6.leerDatos()

Empleado1.verDatos()
Empleado1.azucarEnLaSangre()
Empleado1.habiaTrancon()

Empleado2.verDatos()
Empleado2.colicos()
Empleado2.meQuedeDormido()

Empleado3.verDatos()
Empleado3.diabetes()
Empleado3.meRobaron()


Empleado4.verDatos()
Empleado4.fiebre()
Empleado4.meRobaron()

Empleado5.verDatos()
Empleado5.gastritis()
Empleado5.habiaTrancon()

Empleado6.verDatos()
Empleado6.gripa()
Empleado6.meQuedeDormido()


