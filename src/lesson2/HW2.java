package lesson2;

public class HW2 {

    static int sizeA = 4;
    static int sizeB = 4;

    static String[][] arrayCorrect = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};

    static String[][] arrayIncorrectData = {{"1", "2", "3", "4"}, {"5", "j", "7", "8"}, {"1", "2", "3", "4"}, {"5", "6", "7", "8"}};

    static String[][] arrayIncorrectSize= {{"1", "2", "4"}, {"1", "2", "4"}, {"1", "2", "4"}, {"1", "2", "4"}};



    public static void main(String[] args) {

        try {
            System.out.println("Сумма массива равна: " + getSumm(arrayCorrect));
        } catch (MyArraySizeException | MyArrayDataException ex){
            System.out.println(ex.getMessage());
        }
        try {
            System.out.println("Сумма массива равна: " + getSumm(arrayIncorrectData));
        } catch (MyArraySizeException | MyArrayDataException ex){
            System.out.println(ex.getMessage());
        }
        try {
            System.out.println("Сумма массива равна: " + getSumm(arrayIncorrectSize));
        } catch (MyArraySizeException | MyArrayDataException ex){
            System.out.println(ex.getMessage());
        }


    }

    static void checkValue(String[][] array) throws MyArraySizeException{
        if(array.length!=sizeA || array[0].length!=sizeB) throw new MyArraySizeException();

    }

    static Integer getSumm(String[][] array) throws MyArrayDataException,MyArraySizeException{
        checkValue(array);
        Integer result = 0;
        int i =0;
        int j =0;
        try {
            for (; i < array.length; i++) {
                j =0;
                for (; j < array.length; j++) {
                    result = result + Integer.parseInt(array[i][j]);
                }
            }
        } catch (NumberFormatException ex){
            throw new  MyArrayDataException("Ошибка в позиции: " + i+","+j);
        }

        return result;
    }

    public static class MyArraySizeException extends Exception {
        public MyArraySizeException(){
            super("Ошибка размерности массива");
        }
    }

    public static class MyArrayDataException extends Exception {
        public MyArrayDataException(String message){
            super(message);
        }
    }

}
