from Contabilidad import *
class  AuxContable():

    def sueldo(self, horas, precio, prima):
        print("el sueldo del auxiliar contable es:", (horas*precio)+ prima)


    def Datos(self, nombre, apellido, cedula):
        print("el nombre del auxiliar contable es: ", nombre  ," ", apellido,
              "\n la cedula de ciudadania es: ", cedula)

    def labores(self, especialilzacion, crear,experiencia, vivienda):
        print("el auxiliar contable hace", crear, "y esta especializado en: ",  especialilzacion,
              "\n tiene una experiencia de:", experiencia ," Años",
               "\n vive en:", vivienda)