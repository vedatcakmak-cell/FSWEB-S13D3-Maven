package org.example;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", "Doe", 25);
        System.out.println(person1.getFirstName());
        System.out.println(person1.isTeen());
        System.out.println((person1.getLastName()));

        Person person2 = new Person("Duygu", "Özcan", 32, true, 1.65, 54);

        System.out.println("KadınMı: "+ true);


        Wall wall1 = new Wall(23,10);
        System.out.println("Area: "+wall1.getArea() );
    }

    public static int enBuyukSayiyiBul(int[] numbers){
        int max = numbers[0];

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>max){
                max= numbers[i];
            }
        }
        return  max;
    }

    public static int enBuyukIkinciSayi(int[] numbers){
        int max = numbers[0];
        int secondMax = numbers[0];

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>max){
                max= numbers[i];
                secondMax= max;
            } else if (numbers[i]<max && numbers[i]>secondMax) {
                secondMax= numbers[i];
            }
        }
        return  secondMax;
    }

}
