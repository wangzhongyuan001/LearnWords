package com.learn.learntest;


import com.learn.wordsEnum.WordsEnum1;

import java.util.*;

/**
 * @author wangzhongyuan
 * @version 1.0
 * @date 2021/7/15
 */
public class WordTest {
    public static void main(String[] args) {
        WordsEnum1[] values = WordsEnum1.values();
        List<WordsEnum1> enum1List = Arrays.asList(values);
        Collections.shuffle(enum1List);
        Map<WordsEnum1,Integer> unKnowMap = new LinkedHashMap<>();
        for (WordsEnum1 wordsEnum : enum1List) {
            System.out.println("请根据提示,输入对应的单词或词组:    "+wordsEnum.getMean());
            Scanner scanner = new Scanner(System.in);
            String word = scanner.nextLine();
            if (wordsEnum.getWord().equals(word)) {
                System.out.println("回答正确!");
            }else {
                System.out.println("回答错误,正确答案为:  "+wordsEnum.getWord());
                unKnowMap.put(wordsEnum,2);
            }
        }

        System.out.println("-----------复习开始----------");
        while (true) {
            if (isAllEmpty(unKnowMap)) {
                System.out.println("恭喜,已掌握所有单词!");
                return;
            }
            Set<Map.Entry<WordsEnum1, Integer>> entrySet = unKnowMap.entrySet();
            System.out.println("剩余未掌握单词量:"+entrySet.size());
            for (Map.Entry<WordsEnum1, Integer> entry : entrySet) {

                System.out.println("请根据提示,输入对应的单词或词组:    "+entry.getKey().getMean());
                Scanner scanner = new Scanner(System.in);
                String word = scanner.nextLine();
                if (entry.getValue() == 0 || "skip".equals(word)) {
                    unKnowMap.put(entry.getKey(),0);
                    continue;
                }

                if (entry.getKey().getWord().equals(word)) {
                    System.out.println("回答正确!");
                    unKnowMap.put(entry.getKey(),entry.getValue()-1);
                }else {
                    System.out.println("回答错误,正确答案为:  "+entry.getKey().getWord());
                }
            }

        }
    }

    private static boolean isAllEmpty(Map<WordsEnum1, Integer> unKnowMap) {
        Set<WordsEnum1> keySet = unKnowMap.keySet();
        for (WordsEnum1 wordsEnum1 : keySet) {
            if (unKnowMap.get(wordsEnum1) != 0) {
                return false;
            }
        }
        return true;
    }
}
