class AnalistaContable():


    def sueldo(self, horas, precio, comisiones):
        print("el sueldo del analista contable es:", (horas*precio)- comisiones)


    def Datos(self, nombre, apellido, edad):
        print("el nombre del analista contable es: ", nombre  ," ", apellido, "\n su edad es: ", edad)

    def labores(self, especialilzacion, crear, tipoContrato):
        print("el analista contable hace", crear, "y esta especializado en: ",  especialilzacion,
              "\n el tipo de contrato que tiene es: ", tipoContrato)
