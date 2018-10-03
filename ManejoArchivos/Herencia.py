#Autor Manuela Garcia Monsalve
# 28 septiembre 2018
#Clase main donde se crearan los objetos y sus instancias

from Moto import *
from Carro import *
from Avion import *
from Barco import *
from ArchivosMan import *

class Herencia():

    carro = Carro('Renaul','Gris','Logan','Terreste')
    text = ReadAndWrite()
    texto = text.leer()
    texto += carro.Prender()
    text.escribir(texto)
