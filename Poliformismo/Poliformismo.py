from Admin_BD import *
from AnalistaContable import*
from Arquitecto import*
from AuxCartera import*
from AuxContable import*
from Contador import*
from Diseñador import*
from Programador import*

class Poliformismo():

    def informacion(self):
        print("Informacion de especializaciones")

empleado=Admin_BD()
empleado.sueldo(50,50000, 2000)
empleado.Datos("manuel", "Gomez", "CALLE 1000")
empleado.labores(" bases de datos relacionales", "bases de datos ", 5)
print("\n")

empleado2=AnalistaContable()
empleado2.sueldo(60,40000, 60000)
empleado2.Datos("jorge", "Lopez", 34)
empleado2.labores("analisis y diseño de estructuras contables", "analista", "contrato a termino indefinido")
print("\n")


empleado3=Arquitecto()
empleado3.sueldo(20, 100000, 130000)
empleado3.Datos("Andrea", "Estrada", 3103456783)
empleado3.labores("ninguna", "diseñador", "u nacional")
print("\n")

empleado4=AuxiliarCartera()
empleado4.sueldo(40, 45000,40000)
empleado4.Datos("juan", "Andrade","soltero")
empleado4.labores("pago de empleados", "auxiliar cartera", 7)
print("\n")

empleado5=AuxContable()
empleado5.sueldo(53, 44000, 139000)
empleado5.Datos("felipe", "Gomez", 12013233)
empleado5.labores("recibos de caja menor", "auxiliar contable", 5, "Barranquilla")
print("\n")


empleado6=Contador()
empleado6.sueldo(59, 80000, 1200000)
empleado6.Datos("Geronimo", "Pineda", " AGHS@gmail.com")
empleado6.labores("estrategias de negocio ", "contador", "contador sede principal")
print("\n")

empleado7=Diseñador()
empleado7.sueldo(59, 80000, 100000)
empleado7.Datos("emilio", "fernandez", 0)
empleado7.labores("diseño grafico web", "diseñador", "desarrollo de interfaces web y de apps")
print("\n")

empleado8=Programador()
empleado8.sueldo(80, 120000, 1000000)
empleado8.Datos("Mario", "Monsalve", "uniminuto")
empleado8.labores("desarrollo de apps android", "programador", "java")



