public abstract class DomesticAnimal extends AbstrakAnimal{

    private String weinght;
    private int age;
    private String gender;

    private  String nickName;

    public DomesticAnimal(String weinght, int age, String gender, String nickName) {
        this.weinght = weinght;
        this.age = age;
        this.gender = gender;
        this.nickName = nickName;
    }

    public String getWeinght() {
        return weinght;
    }

    public void setWeinght(String weinght) {
        this.weinght = weinght;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return
                "weinght='" + weinght + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", nickName='" + nickName + '\'';
    }
}
