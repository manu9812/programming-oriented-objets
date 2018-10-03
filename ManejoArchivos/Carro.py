#Autor Manuela Garcia Monsalve
# 28 septiembre 2018
# 3sta es la clase carro que hereda de la super clase vehiculo
from Vehiculo import *

class Carro(Vehiculo):

    def __init__(self,marca,color,modelo,medio):
        Vehiculo.__init__(self,marca,color,modelo)
        self.medio = medio

    def Prender(self):
        return "\nEl carro posee: " + self.marca + "\nModelo: " + self.modelo \
               + "\nColor: " + self.color  + "\nMedio: " + self.medio +"\n"

    def Arrancar(self):
        pass

    def Apagar(self):
        pass
