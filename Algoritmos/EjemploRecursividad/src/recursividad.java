public class recursividad {

    public String serieN0(int n) {
        if (n == 0) {
            return n + "";
        } else {
            return n + serieN0(n - 1) + "";
        }
    }

    public String serie0N(int n) {
        if (n == 0) {
            return "0";
        } else {
            return serie0N(n - 1) + "" + n;
        }
    }

    public int calculoMultiplicacion(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a + calculoMultiplicacion(a, b - 1);
        }
    }

    public String serieFibonacci(int n) {
        if (n == 0) {
            return "0";
        } else if (n == 1) {
            return "0 1";
        } else {
            return serieFibonacci(n - 1) + " " + (serieFibonacciNumero(n));
        }
    }

    public int serieFibonacciNumero(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return serieFibonacciNumero(n - 1) + serieFibonacciNumero(n - 2);
        }
    }

    public boolean primo(int n, int divisor) {
        if (n < 2) {
            return false;
        } else if (divisor == n) {
            return true;
        } else if (divisor % n == 0) {
            return false;
        } else {
            return primo(n, divisor + 1);
        }
    }

    public int econtrarNumeroArreglo(int n, int[] vector, int contador) {
        if (contador == vector.length) {
            return -1;
        } else if (vector[contador] == n) {
            return contador;
        } else {
            return econtrarNumeroArreglo(n, vector, contador + 1);
        }
    }


    public int mayorArreglo(int[] arreglo, int contador, int var) {
        if (contador == arreglo.length) {
           return var;
        } else if (var>arreglo[contador]){
            var=var;
        } else {
            var=arreglo[contador];
        }
        return  mayorArreglo(arreglo,contador+1,var);
    }

    public boolean aparicionInmediata(String cad, char cad1, char cad2, int contador) {
        if (contador == cad.length()) {
            return false;
        }
        char c = cad.charAt(contador);
        if (c == cad1) {
            return true;
        } else if (c == cad2) {
            return false;
        } else {
            return aparicionInmediata(cad, cad1, cad2, contador + 1);
        }
    }

    public int OrejasDeConejos(int n) {
        if (n == 0) {
            return n;
        } else {
            return OrejasDeConejos(n - 1) + 2;
        }
    }

    public int sumaNumeros(String cad, int contador) {
        if (contador == cad.length()) {
            return 0;
        }
        char c = cad.charAt(contador);
        if (c >= '0' && c <= '9') {
            return (c-'0') + sumaNumeros(cad,contador+1);
        }else{
            return  sumaNumeros(cad,contador+1);
        }

    }
}
