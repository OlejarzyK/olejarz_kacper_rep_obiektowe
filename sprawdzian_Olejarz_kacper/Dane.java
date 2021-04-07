class Dane{
    private  String imie ="";
    private String nazwisko = "";
    private String dataurodzenia = "";

    public
    public void(String imie, String nazwisko, String dataurodzenia){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataurodzenia = dataurodzenia;
    } 
    @Override
    public String toString(){
        return imie + " " + nazwisko + " urodzony " + dataurodzenia;
    }

}