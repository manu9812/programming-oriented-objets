class Contador():



    def sueldo(self, horas, precio,propina):
        print("el sueldo del contador es:", (horas*precio)+ propina)


    def Datos(self, nombre, apellido, correo):
        print("el nombre del contador es: ", nombre  ," ", apellido, "\n su correo es: ", correo)

    def labores(self, especialilzacion, crear, CargoDirecto):
        print("el contador hace", crear, "y esta especializado en: ",  especialilzacion,
              "\n el cargo directo es: ", CargoDirecto)