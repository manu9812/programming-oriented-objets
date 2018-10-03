#Autor Manuela Garcia Monsalve
# 28 septiembre 2018
#Esta es la subclase barco que heredara los atributos de la superclase vehiculo

from Vehiculo import *

#La clase barco heredara los atributos de marca,color y modelo de la superclase vehiculo
class Barco(Vehiculo):

    def __init__(self,marca,color,modelo,medio):#Se genera la heriencia de los atributos
        Vehiculo.__init__(marca,color,modelo)
        self.medio = medio

    def Prender(self): #Metodos a sobreescribir
        pass

    def Arrancar(self):
        pass

    def Apagar(self):
        pass