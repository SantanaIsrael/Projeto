package base;
public class Data {
    private int day, month, year;
    private String[] week = { "Sabado", "Domingo", "Segunda", "Terca", "Quarta", "Quinta",
            "Sexta" };
    private String[] mesExtenso = { "Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" };

    // Construtores
    public Data(int day, int month, int year) {
        if (chekdate()) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }

    public Data(Data otherDate) {
        this(otherDate.day, otherDate.month, otherDate.year);
    }

    public Data() {
        this(01, 01, 1970);
    }

    // getters
    public int getDia() {
        return day;
    }

    public int getMes() {
        return month;
    }

    public int getAno() {
        return year;
    }

    // Métodos de validade
    private boolean chekdate() {
        if ((day > 0 || day < 32) && (month > 0 || month < 13) && (year > 0)) {
            return true;
        } else
            return false;
    }

    private boolean chekdate(int day, int month, int year) {
        if ((day > 0 || day < 31) && (month > 0 || month < 13) && (year > 0)) {
            return true;
        } else
            return false;
    }

    public boolean isPrevious(Data date) {
        int year = date.getAno(), month = date.getMes();
        if (year < this.year) {
            return true;
        } else if (month < this.month) {
            return true;
        } else if (day < this.day) {
            return true;
        } else
            return false;
    }

    public boolean isPrevious(int day, int month, int year) {
        if (year < this.year) {
            return true;
        } else if (month < this.month) {
            return true;
        } else if (day < this.day) {
            return true;
        } else
            return false;
    }

    // Métodos de impressão data
    public void infoDate() {
        if (chekdate()) {
            System.out.println(day + "/" + month + "/" + year);
        } else
            System.out.println("Data invalida.");
    }

    public String infoDateExt() {
        if (chekdate()) {
            return day + " de " + mesExtenso[month - 1] + " de " + year + "\n";
        } else {
            return "Data Invalida.";
        }
    }

    public String dayOfWeek() {
        if (chekdate()) {
            int result = day + 2 * month + (3 * (month + 1) / 5) + year + year / 4 - year / 100 + year / 400 + 2;
            return week[result % 7];
        } else
            return "Erro";
    }

    // Métodos de verificação de dias
    public int howManyDays(Data otherDate) {
        int result;
        if (isPrevious(otherDate)) {
            result = this.day - otherDate.getDia();
            return result;
        } else
            result = otherDate.getDia() - this.day;
        return result;
    }

    public int howManyDays(int day, int month, int year) {
        int aux = 0;
        if (chekdate(day, month, year)) {
            if (isPrevious(day, month, year)) {
                aux = Math.abs(this.month - month) + Math.abs(this.day - day);
                if (this.year - year != -1) {
                    aux += Math.abs(this.year - year) * 365;
                }
            }
            aux = Math.abs(this.day - day) + (Math.abs(this.month - month) * 30);
            if (this.year - year != -1) {
                aux += Math.abs(this.year - year) * 365;
            }
        }
        return aux;
    }

    // Metodo que informa quantos anos tem até a data

    public int howManyAge(int year) {
        if (chekdate(29,05,year)) {
            return this.year - year;
        } else
            return 0;
    }
}