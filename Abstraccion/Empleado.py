import Persona

"""
AUTOR:Manuela Garcia Monsalve 
23 de agosto de 2018"""

"""esta es la clase que hereda de la clas persona 
en esta clase se crea un numevo constructor con nuevos parametros que permiten
ser heredados por los objetos que se crean en la otra clase."""



class Empleado(Persona):
    def __init__(self, nombre, apellido, edad, fechaN, sueldo, telefono, direccion,email, cargo ):  # se crea el constructor que recibe los parametros.
        """"entre los parametros estan:
        cedula
        nombre
        apellido
        edad
         fecha nacimiento
         sueldo
         telefono
         direccion
         email
         cargo"""
        super().__init__(nombre,apellido, edad, fechaN)
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
        self.fechaN = fechaN
        self.sueldo= sueldo
        self.telefono= telefono
        self.direccion= direccion
        self.email=email
        self.cargo=cargo
    #get de sueldo
    def getSueldo(self):
        return self.sueldo
    #set de sueldo
    def setSueldo(self, sueldo):
        self.sueldo = sueldo
    #get de telefono
    def getTelefono(self):
        return self.telefono
    #set de telefono
    def setTelefono(self, telefono):
        self.telefono=telefono
    #GET DE DIRECCION
    def getDireccion(self):
        return self.direccion
    #set de direccion
    def setDireccion(self, direccion):
        self.direccion=direccion
    #get de email
    def getEmail(self):
        return self.email
    #set de email
    def setEmail(self, email):
        self.email=email
    #get de cargo
    def getCargo(self):
        return self.cargo
    #set de cargo
    def setCarco(self, cargo):
        self.cargo= cargo




