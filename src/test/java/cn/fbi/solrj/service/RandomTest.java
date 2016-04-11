/**
 * @author 冠勇科技  jemond 
 * @date 2016年1月7日下午12:46:16 
 * 
 */

package cn.fbi.solrj.service;

import java.util.Random;

public class RandomTest
{

    private static final int A = 48271;

    private static final int M = 2147483647;

    private static final int Q = M / A;

    private static final int R = M % A;

    private static int state;

    public static int randomInt()
    {
        Random random = new Random();
        long l = 9223372036854775807l; // random.nextLong();
        long pp = l + 9223372036854775807l;
        System.out.println(pp);

        System.out.println(l + "====random l === ");

        l = System.currentTimeMillis() + l;
        state = (int) l % Integer.MAX_VALUE;
        System.out.println(state + "====state====");
        int tmpState = A * (state % Q) - R * (state / Q);
        System.out.println(tmpState + "tmpstate ======");

        if (tmpState >= 0)
        {
            state = tmpState;
        }
        else
        {
            state = tmpState + M;
        }

        System.out.println(M + "======mMMMMM");

        return state;
    }

    public static void main(String[] args)
    {
        int i = randomInt();
        System.out.println(i + "=");
    }

}
