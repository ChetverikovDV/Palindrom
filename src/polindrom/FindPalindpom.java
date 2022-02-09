package polindrom;

import java.util.Arrays;

public class FindPalindpom {
    public String find(String array[]){
        int count = 0;
        for (int i = 0; i<array.length; i++){
            char[] numberArray = array[i].toCharArray();         //преобразовали элемент массива в микромассив
            //System.out.println(Arrays.toString(numberArray));  //выводим пачку микромассивов
            if (numberArray[1] == numberArray[3] && numberArray[0] == numberArray[4]){ //да да криво)))) ПЕРЕДЕЛАЮ
                System.out.println("Палиндром "+Arrays.toString(numberArray)); // пытаемся вывести полиндром
                count++;}
        }
        System.out.print("А всего тут " +count);
        System.out.println(" палиндромов");
        return null;
    }

}
