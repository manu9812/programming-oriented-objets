

class AuxiliarCartera():




    def sueldo(self, horas, precio, pencion):
        print("el sueldo del auxiliar de cartera es:", (horas*precio)- pencion)


    def Datos(self, nombre, apellido, estadoCivil):
        print("el nombre del  auxiliar de cartera es: ", nombre  ," ", apellido,
              "\n su estado civil es: ", estadoCivil)

    def labores(self, especialilzacion, crear, horasDiarias):
        print("el auxiliar de cartera", crear, "y esta especializado en: ",  especialilzacion,
              "\n  trabaja diariamente ", horasDiarias , "horas al dia")