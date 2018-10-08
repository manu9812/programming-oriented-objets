class Programador():



    def sueldo(self, horas, precio, prima):
        print("el sueldo del programador es:", (horas*precio)+ prima)


    def Datos(self, nombre, apellido, universidad):
        print("el nombre del programador es: ", nombre  ," ", apellido,
              "\n estudió en la universidad:", universidad )

    def labores(self, especialilzacion, crear, lenguaje):
        print("el programador hace", crear, "y esta especializado en: ",  especialilzacion,
              "\n es experto en en lenguaje de programación: "+ lenguaje)