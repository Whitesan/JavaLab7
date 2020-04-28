public class Firma extends Wpis {
    private String adres;
    private String nazwa;
    private NrTelefoniczny nr;
    public Firma(String nazwa,String adres,int nrkierunkowy,int nrTelefonu)
    {
        this.adres = adres;
        this.nazwa = nazwa;
        this.nr = new NrTelefoniczny();
        this.nr.SetNr(nrTelefonu,nrkierunkowy);
    }
    public NrTelefoniczny getNumber()
    {
        return nr;
    }
    public String Opis()
    {
        return nazwa + " " + adres + " Nr.Tel: " + nr.getNrkierunkowy() + nr.getNrTelefonu();
    }
    public String toString()
    {
        return Opis();
    }
}
