package school.sptech.sprint1_nota1.ex3;

public class ExercicioDificilResponse {

    private int enesimoTermo;
    private int soma;

    public ExercicioDificilResponse() {
    }

    public ExercicioDificilResponse(int enesimoTermo, int soma) {
        this.enesimoTermo = enesimoTermo;
        this.soma = soma;
    }

    public void calculo(int num) {

        if (num > 0) {
            int a = 0;
            int b = 1;
            int temp = a + b;
            int c = 0;

            if (num == 1) {
                enesimoTermo = 1;
                soma = 1;
            }

            for (int i = 2; i <= num; i++) {
                c = a + b;
                temp += c;
                a = b;
                b = c;
            }

            enesimoTermo = b;
            soma = temp;
        }

    }

    public int getEnesimoTermo() {
        return enesimoTermo;
    }

    public void setEnesimoTermo(int enesimoTermo) {
        this.enesimoTermo = enesimoTermo;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }

}
