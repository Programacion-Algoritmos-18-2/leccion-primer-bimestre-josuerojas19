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

class EmpleadoPorHoras(Empleado):
        def __init__(self):
            super(EmpleadoPorHoras, self). __init__()
            self.numH = 0
            self.valorH = 0

        def agregarNumeroDeH(self, nh):
            self.numH = nh

        def obtenerNumeroDeH(self):
            return self.numH

        def agregarValorPorH(self, vh):
            self.valorH = vh

        def obtenerValorPorH(self):
            return self.valorH

        def calcular_Sueldo_Final(self):
            sueldo = self.valorH * self.numH + self.comision_fija
            return sueldo
        def presentarDatos2(self):
            cadena = "%s \n Numero horas: %s \n Valor Hora: %s \n Sueldo Final: %s" % (super(EmpleadoPorHoras, self).presentarDatos(), self.obtenerNumeroDeH(), self.obtenerValorPorH(), self.calcular_Sueldo_Final())
            return cadena

