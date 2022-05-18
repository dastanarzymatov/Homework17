public class Main {
    public static void main(String[] args) {
//±1-Farmда 3 sheep, 5 cows, 2 horses болсун.
//±2-Farmда 1 sheep, 1 cow, 1 horse болсун.
//±Класс Cow (weight, age, gender, nickName)
//±Класс Sheep(weight, age, gender, nickName)
//±Класс Horse(weight, age, color, gender, nickName)
//±Класс Farm(address, cows, horses, sheep, OwnerName)
//±2 Farm тузунуз.

Cow cow=new Cow("300",4, "male","Sake");
Cow cow2=new Cow("250",2,"female","sarygul");
Cow cow3=new Cow("350",4,"male","Emma");
Cow cow4=new Cow("400",3,"fimale","Ella");
Cow cow5=new Cow("444",4,"male","Baha");
Cow cow6=new Cow("450",2,"fimale","Pelli");

   Cow[]cows=new Cow[]{cow,cow2,cow3,cow4,cow5};
   Cow[] cow1=new Cow[]{cow6};

   Sheep sheep=new Sheep("70",2,"male","Kozubek");
   Sheep sheep2=new Sheep("70",1,"female","susi");
   Sheep sheep3=new Sheep("70",3,"male","miko");
   Sheep sheep4=new Sheep("70",4,"female","Milashka");

   Sheep[]sheep1= new Sheep[]{sheep,sheep2,sheep3};
   Sheep[]sheeps= new Sheep[]{sheep4};

   Horse horse=new Horse("600",3,"female","Gulsary","ak");
   Horse horse2=new Horse("600",3,"male","Ahi","kara");
   Horse horse3=new Horse("600",3,"male","Molni","kuron");

   Horse[]horses=new Horse[]{horse,horse2};
   Horse[]horses1=new Horse[]{horse3};

   Farm farm=new Farm("Bishkek","Super",cows,horses,sheep1);
   Farm farm1=new Farm("Batken","superFarm",cow1,horses1,sheeps);
       System.out.println(farm);
       System.out.println(farm1);
    }
}