from Sistemas import *

class Admin_BD():



    def sueldo(self, horas, precio, IBA):
        print("el sueldo del administrador de bases de datos es:", (horas*precio)-IBA)


    def Datos(self, nombre, apellido, Direccion):
        print("el nombre del administrador de bases de datos  es: ", nombre  ," ", apellido, "\n y  su direccion es", Direccion)

    def labores(self, especialilzacion, crear, experiencia):
        print("el administrador de bases de datos hace", crear, "y esta especializado en: ",
              especialilzacion,"\n su experiencia es de:", experiencia, " años")