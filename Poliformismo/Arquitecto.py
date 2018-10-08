from Sistemas import *

class Arquitecto():

    def sueldo(self, horas, precio, extras):
        print("el sueldo del arquitecto es:", (horas*precio)+ extras)


    def Datos(self, nombre, apellido, telefono):
        print("el nombre del arquitecto es: ", nombre  ," ", apellido,
              "su telefono es: ", telefono)

    def labores(self, especialilzacion, crear, empresa):
        print("el arquitecto hace", crear, "y esta especializado en: ",  especialilzacion,
              "\n trabaja en: ", empresa)