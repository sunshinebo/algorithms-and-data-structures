package class01;

/**
 * @Description: 打印一个整数的二进制表示形式
 * @author: leon
 * @date: 2023年10月28日 20:32
 */
public class Code_printB {

        /**
         * 定义了一个Java方法print，接受一个整数num作为参数，并打印出该整数的二进制表示形式。
         *
         * public static void print(int num ) {：
         * 方法的定义，它是一个公共（public）静态（static）方法，返回类型为void，表示不返回任何值。方法名为print，并接受一个整数参数num。
         *
         * for (int i = 31; i >= 0; i--) {：
         * 这是一个for循环，用于迭代整数的32个位（从最高位到最低位）。i的初始值是31，每次迭代递减1，循环继续执行直到i的值为0。
         *
         * System.out.print((num & (1 << i)) == 0 ? "0" : "1");：这是循环内的代码。它执行以下操作：
         * 1 << i：这是一个位运算操作，它将1左移i位。这意味着将1左移31位，30位，29位，...，一直到0位，以便在每次循环中检查整数num的每一位。
         * num & (1 << i)：这是位与运算，它用于检查整数num的第i位是否为1。如果num的第i位为1，结果不为0，否则结果为0。
         * (num & (1 << i)) == 0 ? "0" : "1"：这是一个条件表达式，用于将0和1转化为字符串以进行打印。如果num的第i位为1，它会打印"1"，否则打印"0"。
         *
         * System.out.println();：在循环结束后，打印一个空行，用于分隔不同整数的二进制表示。
         *
         * 该方法会遍历整数num的每一位，从最高位到最低位，以二进制形式打印出来。这有助于理解整数在计算机内部是如何表示的，以及它的二进制位模式是什么样的。
         */
        public static void print(int num ){
            for (int i = 31; i >= 0; i--) {
                System.out.print((num & (1 << i)) == 0 ? "0" : "1");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            //32 bit
            int num = 4;
            print(num);
        }

}
