package es.iesmz.tests;

public class DiasLluvia {

    boolean[][] calendario;

    public DiasLluvia() {
        this.calendario = new boolean[12][31];
    }

    private boolean registroDia(int mes, int dia, boolean haLlovido){
        boolean registro = false;
        if ((mes > 0 && mes <= 12)) {
            if (mes == 2){
                if (dia > 1 && dia < 29){
                    calendario[mes][dia] = haLlovido;
                    registro = true;
                }
            } else if (mes%2 == 0){
                if (dia > 1 && dia < 30){
                    calendario[mes][dia] = haLlovido;
                    registro = true;
                }
            } else {
                if (dia > 1 && dia < 31){
                    calendario[mes][dia] = haLlovido;
                    registro = true;
                }
            }
        }
        return registro;
    }

    boolean consultaDia(int mes, int dia){
        return calendario[mes][dia];
    }
}
