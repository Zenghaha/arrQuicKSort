package com.ud.es.uia.system;

public class RemoveKDigits {

    /**
     *  删除整数的k个数字，获得删除后的最小值
     * @param num 目标整数（用String做参数是因为考虑到num的值足够大）
     * @param k 删除数量
     * @return
     */
    public static String removeKDigits(String num,int k) {
        //新整数的最终长度 = 原整数长度 - k
        int newLength = num.length() - k;
        //创建一个栈 用于接收所有的数字
        char[] stack = new char[num.length()];
        int top = 0;
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            //当栈顶数字大于遍历到的当前数字，栈顶数字出栈（相当于删除数字）
            while (top > 0 && stack[top - 1] > c && k > 0) {
                top -= 1;
                k -= 1;
            }
            //遍历到的当前数字入栈
            stack[top++] = c;
        }
        // 找到栈中第一个非零数字的位置，以此构建新的整数字符串
        int offset = 0;
        while (offset < newLength && stack[offset] == '0') {
            offset++;
        }
        return offset == newLength ? "0" : new String(stack,offset,newLength - offset);
    }

    public static void main(String[] args) {
        System.out.println(removeKDigits("4216856264842654849389466",4));
    }
}
