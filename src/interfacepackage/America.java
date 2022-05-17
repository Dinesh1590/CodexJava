package interfacepackage;

public class America implements Country {

    float area;
    int population;
    String ns;
    String currency;

    public America(float area, int population, String ns, String currency) {
        this.area = area;
        this.currency = currency;
        this.ns = ns;
        this.population = population;
    }


    @Override
    public float area() {
        return area;
    }

    @Override
    public int population() {
        return population;
    }

    @Override
    public String nationalsong() {
        return ns;
    }

    @Override
    public String currency() {
        return currency;
    }
}
