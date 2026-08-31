class Carta {
    String palo;
    int valor; // 2–10, 11=J, 12=Q, 13=K, 14=A

    public Carta(String palo, int valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public String toString() {

        if (valor == 11) {
            return "Valor: As" + " Palo: " + palo;
        }else if(valor==12){
            return "Valor: Q" +" Palo: " +palo;
        }else if(valor==13){
            return "Valor: J" +" Palo: " +palo;
        } else if(valor==14){
            return "Valor: As" +" Palo: " +palo;
        } else{
            return "Valor: " +valor +" Palo: " +palo;
        }
    }
}