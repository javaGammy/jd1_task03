import java.util.Random;

public class OneDimArray {
    public static void getInfo() {
        int[] array;
        array = formANewArray(10);
        printArray(array);




    }

    public static void initArray(int[] array) {
        //Метод заполнения массива
        if (array == null) {
            return;
        }
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
    }

    public static void printArray(int[] array) {
        //Метод вывода массива на экран
        if (array == null) {
            return;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }


    public static void getSumElem(int n, int k) {
        //Задача 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
        int sum = 0;
        int[] array = new int[n];
        initArray(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
                sum += array[i];
            }
        }
        printArray(array);
        System.out.println("\n" + sum);
    }

    public static void negativeOrPoziztive(int[] array) {
        //Задача 3. Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число встречается раньше - положительное или
        //отрицательное.
        if (array == null) {
            return;
        }
        if (array[0] > 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    public static void isIncreasSequence(int[] array) {
        //Задача 4. Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей.
        if (array == null) {
            return;
        }
        boolean flag = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("Последовательность возрастающая");
        } else {
            System.out.println("Последовательность не является возрастающей");
        }
    }

    public static void getArrayOfFetalNum(int[] array) {
        //Задача 5. Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел этой последовательности.
        //Если таких чисел нет, то вывести сообщение об этом факте.
        if (array == null) {
            return;
        }
        int count = 0;
        initArray(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        if (count == 0) {
            return;
        }
        int[] mas = new int[count];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                mas[j] = array[i];
                j++;

            }
        }
        printArray(array);
        printArray(mas);

    }

    public static int getMaxFromArray(int[] array) {
        //Метод нахождения максимального элемента в массиве
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static int getMinFromArrayEvenIndex(int[] array) {
        //Метод нахождения минимального элемента в массиве нечетных индексов
        int min = array[1];
        for (int i = 3; i < array.length; i += 2) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int getMinFromArray(int[] array) {
        //Метод нахождения минимального элемента в массиве
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    public static int getMaxFromArrayOddIndex(int[] array) {
        //Метод нахождения минимального элемента в массиве четных
        int max = array[2];
        for (int i = 4; i < array.length; i += 2) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void getMinLongAxis(int[] array) {
        //Задача 6.Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти числа.
        if (array == null) {
            return;
        }
        System.out.println(getMaxFromArray(array) - getMinFromArray(array));
    }

    public static void replaceArrayMemberByZ(int[] array, int z) {
        //Задача 7.Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом.
        //Подсчитать количество замен
        if (array == null) {
            return;
        }
        initArray(array);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                count++;
            }
        }
        int j = 0;
        int[] mas = new int[count];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                mas[j] = array[i];
                j++;
            }

        }
        printArray(array);
        printArray(mas);
    }

    public static void getCountNumArray(int[] array) {
        //Задача 8. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
        //положительных и нулевых элементов
        if (array == null) {
            return;
        }
        int countNegative = 0;
        int countPositive = 0;
        int countZero = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                countNegative++;
            } else if (array[i] > 0) {
                countPositive++;
            } else {
                countZero++;
            }
        }
        printArray(array);
        System.out.println(" " + countNegative + " " + countPositive + " " + countZero);
    }

    public static void swapMaxMin(int[] array) {
        //Задача 9. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
        int getMin = getMinFromArray(array);
        int getMax = getMaxFromArray(array);
        int max = 0;
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == getMax) {
                max = i;
            } else if (array[i] == getMin){
                min = i;
            }
        }
        array[max] = getMin;
        array[min] = getMax;
        System.out.println("Index of min = " + min + " index of max " + max);
        printArray(array);
    }
    public static void printIndexOfArray(int[] array){
        //Задача 10. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
        for(int i = 0; i < array.length; i++){
            if(array[i] > i){
                System.out.println(" " + array[i]);
            }
        }
    }
    public static void printNumDivByMToL(int[] array, int m, int l){
        //Задача 11. Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1).
        for (int i = 0; i < array.length; i ++){
            if(array[i] % m == l){
                System.out.print(" " + i);
            }
        }
    }
    public static int getNumberArrayElements(int[] array, int m, int l, int n){
        //Задача 13. Определить количество элементов последовательности натуральных чисел, кратных числу М и заключенных в
        //промежутке от L до N.
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % m == 0 && array[i] >= l && array[i] <= n){
                count++;
            }
        }
        return count;
    }
    public static int getSumMinMax(int n){
        //Задача 14. Дан одномерный массив A[N]. Найти:
        //max( , , , ) min( , , , )
        int sum;
        int[] array = new int[n];
        sum = getMaxFromArrayOddIndex(array) + getMinFromArrayEvenIndex(array);
        return sum;

    }
    public static void getElemBelongToSegment(int n, int c, int d){
        //Задача 15. Дана последовательность действительных чисел n a ,a , ,a 1 2  . Указать те ее элементы, которые принадлежат отрезку
        //[с, d].

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++){
            if (array[i] >= c && array[i] <= d){
                System.out.println(" " + i);
            }
        }
    }
    public static void getElemBelongToSegment(int n){
        //Задача 16. Даны действительные числа n a ,a , ,a 1 2  . Найти
        //max( , , , ) 1 2 2 2 −1 +1 + + + n n n n a a a a  a a .
        int max;
        int temp;
        int[] array = new int[2 * n];
        initArray(array);
        printArray(array);
        max = array[0] + array[2 * n - 1];
        for(int i = 1; i < array.length - 2; i++){
            temp = array[i] + array[2 * n - (i + 1)];
            if (temp > max){
                max = temp;
            }
        }
        System.out.println(max);
    }
    public static int[] formANewSsequence(int n) {
        //17. Дана последовательность целых чисел n a ,a , ,a 1 2  . Образовать новую последовательность, выбросив из исходной
        //те члены, которые равны min( , , , ) 1 2 n a a  a .
        int[] array = new int[n];
        initArray(array);
        printArray(array);
        int j = 0;
        int[] mas = new int[array.length];
        int min = getMinFromArray(array);
        System.out.println(min);
        for(int i = 0; i < array.length; i++){
            if(array[i] == min){
                mas[j] = array[i];
                j++;
            }
        }


        return mas;

    }
    /*public static int getOftenMeetingNum(int n) {
        //В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел
        //несколько, то определить наименьшее из них.
        int[] array = new int[n];
        int count = 0;

    }*/
    public static int[] formANewArray(int n) {
        //20. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент
        //(освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
        int[] array = new int[n];
        initArray(array);
        printArray(array);
        for(int i = 0; i < array.length; i++){
            if(i % 2 != 0){
                array[i] = 0;

            }
        }

        return array;

    }





}
