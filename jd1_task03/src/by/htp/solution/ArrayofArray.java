import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayOfArray {
    public static void initArray(int[][] array) {
        //Метод заполнения матрицы
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(9);
            }

        }
    }

    /*public static void initArray2(int[][] array) {
        //Метод заполнения матрицы
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i][0] = 1;
            for (int j = 0; j < array[i].length - 1; j++) {
                array[i + 1][j] = 0;
            }


        }
        printArray(array);
    }*/
    public static void printArray(int[][] array) {
        //Метод вывода матрицы на экран
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printArray01() {
        //Задача 1. Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке была ровно одна единица, и
        //вывести на экран.
        int[][] array = new int[3][4];

        for (int i = 0; i < array.length; i++) {
            array[i][0] = 1;
        }


        printArray(array);
    }

    public static void printArray09() {
        //Задача 2. Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9].
        int[][] array = new int[2][3];
        initArray(array);
        printArray(array);
    }

    public static void printFirstLastColumn() {
        //Задача 3. Дана матрица. Вывести на экран первый и последний столбцы.
        int[][] array = new int[5][5];
        initArray(array);
        printArray(array);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[j][0] + " " + array[j][4]);

            }
            System.out.println();
        }
    }

    public static void printFirstLastString() {
        //Задача 4. Дана матрица. Вывести на экран первый и последний строки.
        int[][] array = new int[5][5];
        initArray(array);
        printArray(array);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[0][j] + " ");
                System.out.print(array[4][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printOddString() {
        //Задача 5. Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.
        int[][] array = new int[5][5];
        initArray(array);
        printArray(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 0) {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void printEvenColumn() {
        //Задача 6. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
        int[][] array = new int[5][5];
        initArray(array);
        printArray(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j % 2 != 0 && array[0][1] > array[4][1] && array[0][3] > array[4][3]) {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static int getSumEvenElem() {
        //Задача 7. Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов.
        int[][] array = new int[5][5];
        initArray(array);
        printArray(array);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 != 0 && array[i][j] < 0) {
                    sum += Math.abs(array[i][j]);
                }
            }
        }
        return sum;
    }

    public static int getCountNumb7(int n, int m) {
        //задача 8. Дан двухмерный массив n×m элементов. Определить, сколько раз встречается число 7 среди элементов
        //массива.
        int[][] array = new int[n][m];
        initArray(array);
        printArray(array);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 7) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void getDiagonalElem() {
        //Задача 9. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
        int[][] array = new int[5][5];
        initArray(array);
        printArray(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println();

    }

    public static void getKStringPColumn(int k, int p) {
        //Задача 10. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
        int[][] array = new int[5][5];
        initArray(array);
        printArray(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " " + array[i][p]);
            }
        }
        System.out.println();
    }

    public static void getLiftRight(int m, int n) {
        //Задача 11. Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа налево, вторая
        //строка слева направо, третья строка справа налево и так далее.
        int[][] array = new int[m][n];
        initArray(array);
        printArray(array);
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = array[0].length - 1; j >= 0; j--) {
                    System.out.print(array[i][j] + " ");
                }
            } else {
                for (int j = 0; j < array[0].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
    public static void getFormArray12(int n) {
        //Задача 12.Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        int[][] array = new int[n][n];


        for (int i = 0; i < n / 2; i++) {
            for (int j = 0 + i; j < n - i; j++) {
                array[i][j] = 1;
            }
        }

        for (int i = n / 2; i < n; i++) {
            for (int j = n - 1 - i; j < i + 1; j++) {
                array[i][j] = 1;

            }
        }

        printArray(array);

    }
    public static void getFormArray13(int n) {
        //Задача 13.Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        int[][] array = new int[n][n];


        for (int i = 0; i < n / 2; i++) {
            for (int j = 0 + i; j < n - i; j++) {
                array[i][j] = 1;
            }
        }

        for (int i = n / 2; i < n; i++) {
            for (int j = n - 1 - i; j < i + 1; j++) {
                array[i][j] = 1;

            }
        }

        printArray(array);

    }
    public static void getFormArray14(int n) {
        //Задача 14.Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        int[][] array = new int[n][n];


        for (int i = 0; i < n / 2; i++) {
            for (int j = 0 + i; j < n - i; j++) {
                array[i][j] = 1;
            }
        }

        for (int i = n / 2; i < n; i++) {
            for (int j = n - 1 - i; j < i + 1; j++) {
                array[i][j] = 1;

            }
        }

        printArray(array);

    }
    public static void getFormArray15(int n) {
        //Задача 15.Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        int[][] array = new int[n][n];


        for (int i = 0; i < n / 2; i++) {
            for (int j = 0 + i; j < n - i; j++) {
                array[i][j] = 1;
            }
        }

        for (int i = n / 2; i < n; i++) {
            for (int j = n - 1 - i; j < i + 1; j++) {
                array[i][j] = 1;

            }
        }

        printArray(array);

    }
    public static void getFormArray16(int n) {
        //Задача 16.Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        int[][] array = new int[n][n];


        for (int i = 0; i < n / 2; i++) {
            for (int j = 0 + i; j < n - i; j++) {
                array[i][j] = 1;
            }
        }

        for (int i = n / 2; i < n; i++) {
            for (int j = n - 1 - i; j < i + 1; j++) {
                array[i][j] = 1;

            }
        }

        printArray(array);

    }
    public static void getFormArray17(int n) {
        //Задача 17.Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        int[][] array = new int[n][n];


        for (int i = 0; i < n / 2; i++) {
            for (int j = 0 + i; j < n - i; j++) {
                array[i][j] = 1;
            }
        }

        for (int i = n / 2; i < n; i++) {
            for (int j = n - 1 - i; j < i + 1; j++) {
                array[i][j] = 1;

            }
        }

        printArray(array);

    }
    public static void getFormArray18(int n) {
        //Задача 18.Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        int[][] array = new int[n][n];


        for (int i = 0; i < n / 2; i++) {
            for (int j = 0 + i; j < n - i; j++) {
                array[i][j] = 1;
            }
        }

        for (int i = n / 2; i < n; i++) {
            for (int j = n - 1 - i; j < i + 1; j++) {
                array[i][j] = 1;

            }
        }

        printArray(array);

    }


    public static void getFormArray19(int n) {
        //Задача 19.Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        int[][] array = new int[n][n];


        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i; j++) {
                array[i][j] = 1;
            }
        }

        for (int i = n / 2; i < n; i++) {
            for (int j = n - 1 - i; j < i + 1; j++) {
                array[i][j] = 1;

            }
        }

        printArray(array);

    }
    public static void getFormArray20(int n) {
        //Задача 20.Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        int[][] array = new int[n][n];


        for (int i = 0; i < n / 2; i++) {
            for (int j = 0 + i; j < n - i; j++) {
                array[i][j] = 1;
            }
        }

        for (int i = n / 2; i < n; i++) {
            for (int j = n - 1 - i; j < i + 1; j++) {
                array[i][j] = 1;

            }
        }

        printArray(array);

    }
    public static void getFormArray21(int n) {
        //Задача 21.Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        int[][] array = new int[n][n];


        for (int i = 0; i < n / 2; i++) {
            for (int j = 0 + i; j < n - i; j++) {
                array[i][j] = 1;
            }
        }

        for (int i = n / 2; i < n; i++) {
            for (int j = n - 1 - i; j < i + 1; j++) {
                array[i][j] = 1;

            }
        }

        printArray(array);

    }
    public static void getFormArray22(int n) {
        //Задача 22.Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        int[][] array = new int[n][n];


        for (int i = 0; i < n / 2; i++) {
            for (int j = 0 + i; j < n - i; j++) {
                array[i][j] = 1;
            }
        }

        for (int i = n / 2; i < n; i++) {
            for (int j = n - 1 - i; j < i + 1; j++) {
                array[i][j] = 1;

            }
        }

        printArray(array);

    }


    public static void getArrayNum() {
        //26. С клавиатуры вводится двумерный массив чисел размерностью nxm. Выполнить с массивом следующие действия:
        //а) вычислить сумму отрицательных элементов в каждой строке;
        //б) определить максимальный элемент в каждой строке;
        //в) переставить местами максимальный и минимальный элементы матрицы.
        Scanner sc = new Scanner(System.in);
        int n, m;

        System.out.print("Введите n ");
        n = sc.nextInt();

        System.out.print("Введите m ");
        m = sc.nextInt();

        int[][] array = new int[n][m];

        initArray(array);
        int sum = 0;
        int max = 0;
        max = array[0][0];
        printArray(array);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += array[i][j];
            }
            System.out.println(sum);
        }

    }

    public static void getCompositionMatrix2(int l, int n, int m) {
        //Задача 39. Найдите произведение двух матриц.
        int[][] firstArray = new int[l][n];
        int[][] secondArray = new int[n][m];
        int[][] resultArray = new int[firstArray.length][secondArray[0].length];

        initArray(firstArray);
        printArray(firstArray);
        initArray(secondArray);
        printArray(secondArray);

        for (int i = 0; i < resultArray[0].length; i++){
            for ( int j = 0; j < resultArray.length; j++){
                for (int k = 0; k < firstArray[0].length; k++){
                    resultArray[i][j] = resultArray[i][j] + firstArray[i][k] * secondArray[k][j];
                }
            }
        }
        printArray(resultArray);

    }
}

















