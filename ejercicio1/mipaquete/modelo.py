class Empleado(object):
    def __init__(self):
        self.nombre = " "
        self.apellido = " "
        self.cedula = " "
        self.comision_fija = 0

    def agregarComision_Fija(self, x):
        self.comision_fija = x

    def obtenerComision_Fija(self):
        return self.comision_fija

    def agregarNombre(self, n):
        self.nombre = n

    def obtenerNombre(self):
        return self.nombre

    def agegarApellido(self, a):
        self.apellido = a

    def obtenerApellido(self):
        return self.apellido

    def agregarCedula(self, c):
        self.cedula = c

    def obtenerCedula(self):
        return self.cedula

    def presentarDatos(self):
        cadena = "La informacion de %s %s\n\tcedula%s"%(self.obtenerNombre(), self.obtenerApellido(), self.obtenerCedula())
        return cadena