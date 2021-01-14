package adaitw.java;
/*
Bono Antiguedad:
mayor a 2 años pero menor a 5 : bono es 20% del sueldo
mayor a 5 años : bono es 30% del sueldo.-
Bono por sueldo:
Si sueldo menor a 100, se da 25% de este.
Si es mayor a 1000 pero menor o igual a 3500, se da 15% del sueldo.
Para mas de 3500 se da un 10%.
* */
public class Bono {
    Double valor;

    public Bono(Integer antiguedad, Double salario) {
        Double bonoAntiguedad;
        Double bonoSalario;

        //Calculo bono Antiguedad:
        if (antiguedad > 2 && antiguedad < 5) {
            bonoAntiguedad = salario * 0.2;

        } else if (antiguedad >= 5) {
            bonoAntiguedad = salario * 0.3;
        } else {
            bonoAntiguedad = 0.0;
        }

        //Calculo bono Salario:
        if (salario < 1000) {
            bonoSalario = salario * 0.25;
        } else if (salario <= 3500) {
            bonoSalario = salario * 0.15;
        } else {
            bonoSalario = salario * 0.10;
        }

        //Comparo bonos:
        //If tradicional
        if(bonoAntiguedad > bonoSalario){
            this.valor = bonoAntiguedad;
        }else{
            this.valor = bonoSalario;
        }

        //Operador condicional ternario o shorthand if:
        // this.valor = bonoAntiguedad > bonoSalario ? bonoAntiguedad : bonoSalario;
    }

    public Double obtenerValor() {
        return this.valor;
    }
}