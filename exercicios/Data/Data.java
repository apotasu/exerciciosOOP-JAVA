public class Data {
    public String mesEmExtenso (int mes){
        switch (mes){
            case 1: return"Janeiro";
            case 2: return"Fevereiro";
            case 3: return"Março";
            case 4: return"Abril";
            case 5: return"Maio";
            case 6: return"Junho";
            case 7: return"Julho";
            case 8: return"Agosto";
            case 9: return"Setembro";
            case 10: return"Outubro";
            case 11: return"Novembro";
            case 12: return"Dezembro";
            default: return "Mes invalido";
        }

    }
    public String AnoBissexto (int ano){
        if (ano % 4 == 0){
            return "O ano é bissexto";
        } else {
            return "O ano nao é bissexto";
        }
    }
    public String ChecarDia (int dia, int mes, int ano){
        if (dia > 31 || dia < 1){
            return "A data inserida nao é valida";
        } else if (mes > 12 || mes < 1){
            return "A data inserida nao é valida";
        } else if (ano > 9999 || ano < 1){
            return "A data inserida nao é valida";
        } else {
            return "O dia de hoje é " + dia +"/" + mes +"/"+ ano;
        }
    }
    public String DiaDosFinados (int dia, int mes, int ano){
        if (dia == 2 || mes == 11){
            return "Hoje é dia dos finados";
        } else {
            return "Hoje nao é dia dos finados";
        }
    }
}
