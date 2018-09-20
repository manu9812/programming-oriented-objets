

"""metodo: seek(byte) mueve el puntero hacia el byte indicado"""
archivo = open("remeras.txt". "r")
contenido= archivo.read()
#el puntero queda al final del documento
archivo.seek(0)

"""read([bytes]) Lee todo el contenido de un archivo.
 Si se le pasa la longitud de bytes,
 leerá solo el contenido hasta la longitud indicada."""
 archivo = open ("remeras.txt", "r")
 contenido = archivo.read()
 print contenido


 """readline([bytes]) Lee una línea del archivo."""
  archivo = open ("remeras.txt", "r")
 linea1= archivo.readline()
 print linea1

 """readlines() Lee todas las líneas de un archivo."""
 archivo = open("remeras.txt", "r")
 for linea in archivo.readlines():
    print linea


 """tell() Retorna la posición actual del puntero."""
 archivo = open("remeras.txt", "r")
 linea1 = archivo.readline()
 mas = archivo.read(archivo.tell() * 2)

 if archivo.tell() > 50:
     archivo.seek(50)

 """write(cadena) Escribe cadena dentro del archivo."""
 archivo = open("remeras.txt", "r+")
 contenido = archivo.read()
 final_de_archivo = archivo.tell()

 archivo.write('Nueva linea')
 archivo.seek(final_de_archivo)
 nuevo_contenido = archivo.read()

 print nuevo_contenido
 # Nueva linea

 """writelines(secuencia) Secuencia será cualquier
  iterable cuyos elementos serán escritos uno por línea."""
 archivo = open("remeras.txt", "r+")
 contenido = archivo.read()
 final_de_archivo = archivo.tell()
 lista = ['Línea 1\n', 'Línea 2']

 archivo.writelines(lista)
 archivo.seek(final_de_archivo)

 print archivo.readline()
# Línea 1

 print archivo.readline()
# Línea 2

""" close() Cierra un archivo."""

 archivo = open("remeras.txt", "r")
 contenido = archivo.read()
 archivo.close()
 print contenido

 """PROPIEDADES DEL OBJETO FILE
Se pueden acceder a las siguientes propiedades del objeto file:

closed: retorna True si el archivo se ha cerrado. De lo contrario, False.
mode: retorna el modo de apertura.
name: retorna el nombre del archivo
encoding: retorna la codificación de caracteres de un archivo de texto

 """

 archivo = open("remera.txt", "r+")
 contenido = archivo.read()
 nombre= archivo.name
 modo= archivo.mode
 encoding = archivo.encoding
 archivo.close()
 if archivo.close:
     print("el archivo se ha cerrado correctamente")
 else:
     print("el archivo permanece abierto")


""" cerrado de archivos de forma automatica """
 with open("remeras.txt", "r") as archivo:
    contenido = archivo.read()
 
 print archivo.closed
 # True
