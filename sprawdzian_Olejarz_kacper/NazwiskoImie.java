class NazwiskoImie{
    public static void main (String[]args){
        Sprawdzian sprawdzian = new Sprawdzian();
        sprawdzian.PrzedmiotNazwa = "programowanie obiektowe";
        sprawdzian.data = "2021-04-07";
        sprawdzian.ocena = 5;
        System.out.println(sprawdzian.data + " " + sprawdzian.ocena + " " + sprawdzian.PrzedmiotNazwa);

        Dane dane = new Dane(imie:"Kacper", nazwisko:"Olejarz", dataurodzenia:"18-04-2005");
        

    }

}