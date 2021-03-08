
public class Adresse
{
    // Eigenschaften

    private String name;
    private String straße;
    private String stadt;


    // Konstruktor

    public Adresse(String name, String straße, String stadt)
    {
        super();    //ruft Konstruktor der Klasse Object auf!! 
        this.setName(name);
        this.setStraße(straße);
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


    public String getStraße()
    {
        return straße;
    }


    public void setStraße(String straße)
    {
        this.straße= straße;
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
