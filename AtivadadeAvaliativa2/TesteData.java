package ExercicioNatal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TesteData {

    private Date data;

    public TesteData(Date initialDate) {
        this.data = initialDate;
    }

    public Date getDataAtual() {
        return new Date();
    }

    public void adicionarDias(int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.data);
        calendar.add(Calendar.DAY_OF_YEAR, days);
        this.data = calendar.getTime();
    }



    public int getMesData() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.data);
        return calendar.get(Calendar.MONTH) + 1;
    }

    public int getAnoData() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.data);
        return calendar.get(Calendar.YEAR);
    }

    public String getDataFormatada() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(this.data);
    }

    public static Date converteStringParaData(String dataEmTexto) {
            throws ParseException {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            return sdf.parse(dataEmTexto);
        }
    }
}