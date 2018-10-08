class Diseñador():



    def sueldo(self, horas, precio, salud):
        print("el sueldo del diseñador es:", (horas*precio)-salud)


    def Datos(self, nombre, apellido, hijos):
        print("el nombre del diseñador es: ", nombre  ," ", apellido,
              " \n tene ", hijos,  " hijos")

    def labores(self, especialilzacion, crear, enfoque):
        print("el diseñador hace", crear, "y esta especializado en: ",  especialilzacion,
              "enfocado a: ", enfoque)