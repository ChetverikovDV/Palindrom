package polindrom;

public class Main {
    public static void main(String[] args) {
        ArrayForPalindrom polindrom = new ArrayForPalindrom();   //Массив для полиндрома
        String tempPolindromArray[] = polindrom.generate();     //Генерим этот массив
        //System.out.println(Arrays.toString(tempPolindromArray)); //Выводим этот массив
        FindPalindpom findPalindpom = new FindPalindpom();
        findPalindpom.find(tempPolindromArray);
    }
}
