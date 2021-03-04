
public class Adresse
{
    // Eigenschaften

    private String name;
    private String stra�e;
    private String stadt;


    // Konstruktor

    public Adresse(String name, String stra�e, String stadt)
    {
        super();    //ruft Konstruktor der Klasse Object auf!! 
        this.setName(name);
        this.setStra�e(stra�e);
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


    public String getStra�e()
    {
        return stra�e;
    }


    public void setStra�e(String stra�e)
    {
        this.stra�e = stra�e;
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
