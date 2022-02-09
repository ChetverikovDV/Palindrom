package polindrom;

public class ArrayForPalindrom {
    public String[] generate(){
        String array[] = new String[89999];
        for(int i = 0; i < array.length; i++ ){
            array[i] = String.valueOf(i+10001);
        }
        return array;
    }
}
