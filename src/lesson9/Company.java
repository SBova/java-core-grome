package lesson9;

public class Company {
    private String name;
    private String countryFounded;

    protected String code;

    public int someField;

    public Company(String name, String countryFounded) {
        this.name = name;
        this.countryFounded = countryFounded;
    }

    // гетер только чтение, гетер и сетер чтение и перезапись

    public String getName() {
        return name;
    }

   /*/ public void setName(String name) {
        this.name = name;
    }/*/

    public String getCountryFounded() {
        return countryFounded;
    }

    public void setCountryFounded(String countryFounded) {
        this.countryFounded = countryFounded;
    }
}
