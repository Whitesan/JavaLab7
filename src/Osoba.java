public class Osoba extends Wpis{
    private String imie;
    private String nazwisko;
    private String adres;
    private NrTelefoniczny Nr;
    public Osoba(String imie,String nazwisko,String adres,int nrkierunkowy,int nrTelefonu)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.Nr = new NrTelefoniczny();
        this.Nr.SetNr(nrTelefonu,nrkierunkowy);
    }
    public NrTelefoniczny getNumber()
    {
        return Nr;
    }
    public String Opis()
    {
        return imie + " " + nazwisko + adres + "Tel.: " + Nr.getNrkierunkowy() + Nr.getNrTelefonu();

    }
    public String toString()
    {
        return Opis();
    }

}
