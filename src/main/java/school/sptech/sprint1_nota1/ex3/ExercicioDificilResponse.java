package school.sptech.sprint1_nota1.ex3;

public class ExercicioDificilResponse {

    private Integer enesimoTermo;
    private Integer soma;

    public ExercicioDificilResponse() {
    }

    public ExercicioDificilResponse(Integer enesimoTermo, Integer soma) {
        this.enesimoTermo = enesimoTermo;
        this.soma = soma;
    }

    public void calculo(int num) {

        if (num > 0) {
            int a = 0;
            int b = 1;

            if (num == 1) {
                enesimoTermo = 1;
                soma = 1;
            }

            int temp = a + b;
            int c = 0;

            for (int i = 3; i <= num; i++) {
                c = a + b;
                temp += c;
                a = b;
                b = c;
            }

            enesimoTermo = b;
            soma = temp;
        }

    }

    public Integer getEnesimoTermo() {
        return enesimoTermo;
    }

    public Integer getSoma() {
        return soma;
    }

}
