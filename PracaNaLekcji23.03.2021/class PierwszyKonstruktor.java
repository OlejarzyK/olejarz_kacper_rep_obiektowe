class PierwszyKonstruktor{
    public static void main (String[] args){

        int wzrost = 0;
        int waga = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Program oblicza BMI dla podanego wzrostu w cm i wagi w kg/n"
        +"0 = zakończ\n"
        +"1 - oblicz");
        

    while(){
        System.out.println("Podaj wzrost w cm:  ");
        wzrost = sc.nextInt();
        System.out.print("Podaj Wage w kg:  ");
        waga = sc.nextInt();
        MojeBmi mb = new MojeBmi(wzrost ,waga);
        System.out.println("BMI="+mb.mojeBmi());
        zakoncz - sc.nextInt();
      }

    }
}