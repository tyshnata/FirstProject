public class FirstAdd {

    public  boolean isPalindrom (String word) {  // метод, проверяющий является ли строка палиндромом
        boolean palindrom = true;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(word.length() -1 - i)) {
                palindrom = true;
            }
            else {
                palindrom = false;
                break;
            }

        }
        return palindrom;
    }

    public  Integer sum ( Integer i, Integer j){ // метод, суммирующий два числа
        Integer amount = 0;
        amount = i + j;
        return amount;

    }

    public  Integer factorial(Integer n){ // рекурсивный метод нахождения факториала заданного числа
       Integer result;

       if( n == 1)
           return 1;
       else {
           result = factorial(n-1)*n;
           return result;
       }
    }

    public int search( int n, Integer[] list){  // метод нахождения первого вхождения заданного
                                                 //целого числа в список
        int ind = 0;

        for (int i = 0; i < list.length; i++){
            if (list[i] == n){    // находим индекс первого вхождения числа в список
                ind = i;
                break;
            }
            else
                ind = -1; // если такого числа в списке нет
        }
        return ind;
    }

    public  String reverse (String s){ // метод, меняющий строку
       String  reverseString = "";

        for (int i = (s.length()-1); i >= 0 ; i--){
            reverseString += s.charAt(i);   // "читаем" строку в обратном порядке
        }
        return reverseString;
    }


   /*public static void main (String args[]){
        String s = "asd fgh jkl";
        reverse (s);
    }*/
    /*public static void main (String args[]){
        Integer[] list = new Integer[]{2,6,9,14,58,23,75,6,14};
        int n = 15;
        search(  n,  list);
    }*/

   /* public static void main (String args[]){
        Integer n = 5;
        factorial( n);
    }*/

    /*public static void main (String args[]){
        Integer i = 12,  j = 35;
        System.out.print(sum (  i,  j)); ;
    }*/


   /* public static void main (String args[]){
        String word = "asddsa";
        isPalindrom ( word );
    }*/
}