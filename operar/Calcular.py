"""en este programa se pretende realizar algunas operaciones como lo son sumar, restar, relaizar el area de un circulo, realizar
el teorema de pitagoras


el rpograma es realizado por:
Manuela  Garcia Monsalve
el dia
20 de abril del 2018"""


import math  # se importa la libreria math con el objetivo de realizar algunas operaciones como los radicales

# se crea la case calcular
class calcular:
   # se crea el metodo sumar que recibe como parametros dos enteros y retorna el resultado de la suma de los mismos
    def sumar(number1, number2):
        return (number1 + number2)

   # se crea el metodo restar que recibe como parametros dos enteros y retorna el resultado de la resta de los mismos
    def restar(number1, number2):
        return (number1 - number2)

   #se crea el metodo areaCirculo que recibe como parametro el radio del circulo y retorna el resultado de multiplicar dos veces el padio por 3,1416

    def areaCirculo(radio):
        return (3.1415*radio*radio)


    # se crea el metodo teoremaPitagoras que recibe como parametros dos numeros enternos y retorna el resultado de hallar el cuadrado de ambos numeros
   # la suma de lis mismos y al resultado sacar su respectiva reiz cuadrada
    def teoremaPitagoras(number1, number2):
        mult=((number1*number1)+(number2*number2))
        radical= math.sqrt(mult)
        return radical

Calcular= calcular() # se crea el obejto calcular

# ahora se invocan todos los metodos ya creados ayudados del objeto calcular

print("SUMA")
print("el resultado de la suma es", calcular.sumar(66,90))
print("\n")

print("RESTA")
print("el resultado de la RESTA es", calcular.restar(120,90))
print("\n")

print (" AREA DEL CIRCULO")
print("el resultado del area del circulo es:" , calcular.areaCirculo(30))
print ("\n")

print ("TEOREMA DE PITAGORAS")
print("el resultado del teorema de pitagoras es:" , calcular.teoremaPitagoras(3,4))





