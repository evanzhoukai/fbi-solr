/**
 * @author 冠勇科技  jemond 
 * @date 2016年1月7日上午11:03:55 
 * 
 */

package cn.fbi.solrj.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UuidTesst
{

    public static void main(String[] args) throws Exception
    {
        Random random = new Random();
        int ra = random.nextInt(100);

        Long ll = System.currentTimeMillis();
        Long l = System.currentTimeMillis();
        System.out.println("=====开始========" + ll);
        System.out.println("=====结束========" + l);
        System.out.println("=====随机========" + ra);
        List<String> list = new ArrayList<String>();
        list.add("我");
        list.add("是");

    }

}
