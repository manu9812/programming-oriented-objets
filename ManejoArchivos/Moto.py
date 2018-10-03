#Autor Manuela Garcia Monsalve
# 28 septiembre 2018
#Subclase Moto que aparte de heredar de la super clase vehiculo, tambien tendra metodos propios
#como picar

from Vehiculo import *

class Moto(Vehiculo):

    def __init__(self,marca,color,modelo,medio,rueda):
        Vehiculo.__init__(marca,color,modelo)
        self.medio = medio
        self.rueda = rueda

    def Preder(self):
        pass

    def Apagar(self):
        pass
    def Arrancar(self):
        pass

    def Picar(self): #Metodo propio de la clase
        pass

