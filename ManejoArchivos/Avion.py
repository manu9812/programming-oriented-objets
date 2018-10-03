#Autor Manuela García Monsalve
#28 septiembre 2018
#Clase avion que heredara los atributos de la superclase vehiculo

from Vehiculo import *

class Avion(Vehiculo):

    def __init__(self,marca,color,modelo,medio):
        Vehiculo.__init__(marca,color,modelo)
        self.medio = medio

    def Prender(self):
        pass

    def Arrancar(self):
        pass

    def Apagar(self):
        pass

