#Autor Manuela Garcia Monsalve
# 28 septiembre 2018
#Esta es la super clase Vehiculo donde se encuentran los atributos de marca, modelo y color que seran
#heredados para las subclases

class Vehiculo():

    def __init__(self,marca,color, modelo): #Se generan los atributos para poder ser heredados
        self.marca = marca
        self.color = color
        self.modelo = modelo


    def Prender(self): #Metodo prender vehiculo
        pass

    def Arrancar(self):#Metodo arrancar vehiculo
        pass

    def Apagar(self):#Metodo apagar vehiculo
        pass


