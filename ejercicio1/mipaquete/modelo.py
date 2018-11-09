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


class EmpleadoFijo(Empleado):
        def __init__(self):
            super(EmpleadoFijo, self).__init__()
            self.sueldf = 0
            self.desS = 0

        def agregarSueldoFijo(self, sf):
            self.sueldf = sf

        def obtenerSueldoFijo(self):
            return self.sueldf

        def agregarDescuentoSeguro(self, ds):
            self.desS = ds

        def obtenerDescuentoSeguro(self):
            return self.desS

        def calcular_Sueldo_Final(self):
            sueldo = (self.sueldf + self.comision_fija) - self.desS
            return sueldo

        def presentarDatos3(self):
            cadena = "%s \n Sueldo fijo: %s \n Descuento Seguro: %s \n Sueldo Final: %s" % (super(EmpleadoFijo, self).presentarDatos(), self.obtenerSueldoFijo(), self.obtenerSueldoFijo(), self.calcular_Sueldo_Final())
            return cadena

class EmpleadoSemanal(Empleado):
        def __init__(self):
            super(EmpleadoSemanal,self). __init__()
            self.numSma = 0
            self.vpSma = 0

        def agegarNumeroDeSemana(self, nsm):
            self.numSema = nsm

        def obtenerNumeroDeSemana(self):
            return self.numSma

        def agregarValorPorSemana(self, vps):
            self.vpSma = vps

        def obtenerValorPorSemana(self):
            return self.vpSma

        def calcular_Sueldo_Final(self):
            sueldo = self.vpSma * self.numSema +self.comision_fija
            return sueldo

        def presentarDatos4(self):
            cadena = "%s \n Numero de Semana: %s \n Valor Por Semana: %S \n Sueldo Final: %s" % (super(EmpleadoSemanal, self).presentarDatos(), self.obtenerNumeroDeSemana(), self.obtenerValorPorSemana(), self.calcular_Sueldo_Final())
            return cadena