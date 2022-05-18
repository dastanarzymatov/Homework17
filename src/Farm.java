import java.util.Arrays;

public class Farm{
    private String adress;
    private String overname;

    private Cow[] cows;
    private Horse[] horses;
    private Sheep[] sheep;


    public Farm(String adress, String overname, Cow[] cows, Horse[] horses, Sheep[] sheep) {
        this.adress = adress;
        this.overname = overname;
        this.cows = cows;
        this.horses = horses;
        this.sheep = sheep;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getOvername() {
        return overname;
    }

    public void setOvername(String overname) {
        this.overname = overname;
    }

    @Override
    public String toString() {
        return "Farm " +
                "adress='" + adress + '\'' +
                ", \novername='" + overname + '\'' +
                ",\n cows=" + Arrays.toString(cows) +
                ",\n horses=" + Arrays.toString(horses) +
                ",\n sheep=" + Arrays.toString(sheep) +
                '}';//
    }

    //±Класс Farm(address, cows, horses, sheep, OwnerName)


}
