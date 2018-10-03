
#Autor Manuela Garcia Monsalve
# 28 septiembre 2018

class ReadAndWrite:


    def leer(self):
        text = open('archivo.txt',"r")
        content = text.read()
        text.close()
        return (content)

    def escribir(self,texto):
        text = open('archivo.txt', "w")
        text.write(texto)


