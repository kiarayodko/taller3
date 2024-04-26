package aed;

public class Fecha {
    public int _dia;
    public int _mes;
    public Fecha(int dia, int mes) {
       _dia=dia;
       _mes=mes;
    }

    public Fecha(Fecha fecha) {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public Integer dia() {
        return _dia;
    }

    public Integer mes() {
        return _mes;
    }

    public String toString() {
        return String.valueOf(_dia)+"/"+String.valueOf(_mes);
        
    }

    @Override
    public boolean equals(Object otra) {
        //otra no es null
        boolean oen = (otra == null);
        //clase distinta
        boolean cd = otra.getClass() != this.getClass();
        //chequeo q tengan igual clase y no sea nula
        if (oen || cd) {
            return false;
        }
        Fecha otraFecha = (Fecha) otra;
        return _dia == otraFecha._dia && _mes== otraFecha._mes;

        
    }

    public void incrementarDia() {
        if ((_dia)<diasEnMes(_mes)){
            
            _dia=_dia+1;
        }
        else{
            _dia=1;
            _mes=_mes+1;

        }

    }

    private int diasEnMes(int mes) {
        int dias[] = {
                // ene, feb, mar, abr, may, jun
                31, 28, 31, 30, 31, 30,
                // jul, ago, sep, oct, nov, dic
                31, 31, 30, 31, 30, 31
        };
        return dias[mes - 1];
    }

}
