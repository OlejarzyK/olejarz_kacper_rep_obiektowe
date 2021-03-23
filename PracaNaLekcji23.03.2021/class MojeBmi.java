class MojeBmi{
    private int wzrost = 0;
    private int waga = 0;

    public MojeBmi (int wzrost, int waga){
        this.wzrost = wzrost;
        this waga = waga;
    }
    public double mojeBmi(){
        return waga/((double)wzrost/100*(double)wzrost/100);
    }

    public void getWzrost(int wzrost){
        this.wzrost = wzrost;
    }
    public void getWaga(int waga){
        this.waga = waga;
    }

    public int getWzrost(){
        return wzrost;
    }
    
       public int getWaga(){
        return waga;
    }
}