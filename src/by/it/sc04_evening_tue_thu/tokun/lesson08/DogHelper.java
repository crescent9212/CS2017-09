package by.it.sc04_evening_tue_thu.tokun.lesson08;

public class DogHelper {
    static void printAllNames(Dog[] dogs){
        for (int i = 0; i < dogs.length ; i++) {
            System.out.print(dogs[i].getName() + " ");
        }
    };

    static double averageAge(Dog[] dogs){
        int sum = 0;
        for (int i = 0; i < dogs.length ; i++) {
            sum += dogs[i].getAge();
        }
        return (double)sum/dogs.length;
    };
}
