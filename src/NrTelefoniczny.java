public class NrTelefoniczny implements Comparable<NrTelefoniczny>{
    private int nrTelefonu;
    private int nrkierunkowy;
    public NrTelefoniczny()
    {
        nrkierunkowy = 0;
        nrTelefonu = 0;
    }
    public NrTelefoniczny(int nrTelefonu,int nrkierunkowy)
    {
        this.nrTelefonu = nrTelefonu;
        this.nrkierunkowy = nrkierunkowy;
    }
    public void SetNr(int nrTelefonu,int nrkierunkowy)
    {
        this.nrTelefonu = nrTelefonu;
        this.nrkierunkowy = nrkierunkowy;
    }
    public int getNrTelefonu()
    {
        return nrTelefonu;
    }
    public int getNrkierunkowy()
    {
        return nrkierunkowy;
    }
    public String toString()
    {
        return  "Nr tel: " + nrkierunkowy + nrTelefonu;
    }
    public int compareTo(NrTelefoniczny nr)
    {
        if(this.nrTelefonu == nr.nrTelefonu)
        {
            if(this.nrkierunkowy < nr.nrkierunkowy)
                return -1;
            else if(this.nrkierunkowy > nr.nrkierunkowy)
                return 1;
            else
                return 0;
        }
        if(this.nrTelefonu < nr.nrTelefonu)
            return -1;
        else
            return 1;
    }
    public void show()
    {
        System.out.println(nrkierunkowy + nrTelefonu);
    }
}
