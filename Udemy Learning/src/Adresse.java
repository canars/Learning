
public class Adresse
{
    // Eigenschaften

    private String name;
    private String straﬂe;
    private String stadt;


    // Konstruktor

    public Adresse(String name, String straﬂe, String stadt)
    {
        super();    //ruft Konstruktor der Klasse Object auf!! 
        this.setName(name);
        this.setStraﬂe(straﬂe);
        this.setStadt(stadt);
    }


    // Methoden

    public String getName()
    {
        return name;
    }


    public void setName(String name)
    {
        this.name = name;
    }


    public String getStraﬂe()
    {
        return straﬂe;
    }


    public void setStraﬂe(String straﬂe)
    {
        this.straﬂe = straﬂe;
    }


    public String getStadt()
    {
        return stadt;
    }


    public void setStadt(String stadt)
    {
        this.stadt = stadt;
    }

}
