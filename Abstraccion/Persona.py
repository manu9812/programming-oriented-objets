""""en este programa se pretende utlizar la herencia
AUTOR Manuela Garcia Monsalve
fecha: 23 mayo 2018"""




class persona: # clase persona
    def __init__(self, nombre, apellido, edad, fechaN): # se crea el constructor que recibe los parametros.
        """"entre los parametros estan:
        cedula
        nombre
        apellido
        edad
         fecha nacimiento """
        self.nombre=nombre
        self.apellido=apellido
        self.edad=edad
        self.fechaN=fechaN

    #get de nombre
    def getNombre(self):
        return self.nombre
    # set de nombre
    def setNombre(self, nombre):
        self.nombre= nombre
    #get de apellido
    def getApellido(self):
        return  self.apellido
    #set de apllido
    def setApellido(self, apellido):
        self.apellido=apellido
    # get de edad
    def getEdad(self):
        return  self.edad
    #set de edad
    def setEdad(self, edad):
        self.edad=edad
    #get de fecha de nacimiento
    def getFechaN(self):
        return  self.fechaN
    #set de fecha de nacimiento
    def serFechaN(self, fechaN):
        self.fechaN= fechaN

    def verDatos(self):

        pass


