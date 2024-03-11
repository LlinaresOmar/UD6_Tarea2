package es.iesmz.tests;

public class DiasLluvia {

    boolean[][] calendario;

    public DiasLluvia() {
        this.calendario = new boolean[12][31];
    }

    private boolean registroDia(int mes, int dia, boolean haLlovido){
        boolean registro = false;
        if ((mes >= 1 && mes <= 12)) {
            if (mes == 2){
                if (dia >= 1 && dia <= 29){
                    calendario[mes-1][dia-1] = haLlovido;
                    registro = true;
                }
            } else if (mes%2 == 0){
                if (dia >= 1 && dia <= 31){
                    calendario[mes-1][dia-1] = haLlovido;
                    registro = true;
                }
            } else {
                if (dia >= 1 && dia <= 30){
                    calendario[mes-1][dia-1] = haLlovido;
                    registro = true;
                }
            }
        }
        return registro;
    }

    boolean consultaDia(int mes, int dia){
        return calendario[mes-1][dia-1];
    }

    int contarDiasLluvia(){
        int diasQueHaLlovido = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 31; j++) {
                if (calendario[i][j]){
                    diasQueHaLlovido++;
                }
            }
        }
        return diasQueHaLlovido;
    }

    int trimestreLluvioso() {
        int diasTrimestre1 = 0;
        int diasTrimestre2 = 0;
        int diasTrimestre3 = 0;
        int diasTrimestre4 = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 31; j++) {
                if (calendario[i][j]) {
                    if (i < 3) {
                        diasTrimestre1++;
                    } else if (i < 6) {
                        diasTrimestre2++;
                    } else if (i < 9) {
                        diasTrimestre3++;
                    } else {
                        diasTrimestre4++;
                    }
                }
            }
        }
        int trimestreMasLLuvioso = 0;
        if (diasTrimestre1 > diasTrimestre2 && diasTrimestre1 > diasTrimestre3 && diasTrimestre1 > diasTrimestre4){
            trimestreMasLLuvioso = 1;
        } else if (diasTrimestre2 > diasTrimestre1 && diasTrimestre2 > diasTrimestre3 && diasTrimestre2 > diasTrimestre4){
            trimestreMasLLuvioso = 2;
        } else if (diasTrimestre3 > diasTrimestre2 && diasTrimestre3 > diasTrimestre1 && diasTrimestre3 > diasTrimestre4){
            trimestreMasLLuvioso = 3;
        } else if (diasTrimestre4 > diasTrimestre2 && diasTrimestre4 > diasTrimestre3 && diasTrimestre4 > diasTrimestre1){
            trimestreMasLLuvioso = 4;
        }
        return trimestreMasLLuvioso;
    }

    int primerDiaLluvia(){
        int diaLluvia = 0, mesLluvia = 0, diaAnyoLluvia = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 31; j++) {
                if (calendario[i][j]){
                    diaLluvia = j +1;
                    mesLluvia = i;
                } else {
                    diaLluvia = -1;
                    mesLluvia = -1;
                }
            }
        }
        diaAnyoLluvia = mesLluvia*(30+1)+(mesLluvia/2)+diaLluvia;
        return diaAnyoLluvia;
    }

}
