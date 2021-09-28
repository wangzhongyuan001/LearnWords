package com.learn.learntest;


import com.learn.wordsEnum.WordsEnum4;

import java.util.*;

/**
 * @author wangzhongyuan
 * @version 1.0
 * @date 2021/7/15
 */
public class WordTest {
    public static void main(String[] args) {
        WordsEnum4[] values = WordsEnum4.values();
        List<WordsEnum4> enum1List = Arrays.asList(values);
        Collections.shuffle(enum1List);
        Map<WordsEnum4, Integer> unKnowMap = new LinkedHashMap<>();
        for (WordsEnum4 wordsEnum : enum1List) {
            System.out.println("请根据提示,输入对应的单词或词组:    " + wordsEnum.getMean());
            Scanner scanner = new Scanner(System.in);
            String word = scanner.nextLine();
            if (wordsEnum.getWord().equals(word)) {
                System.out.println("回答正确!");
            } else {
                System.out.println("回答错误,正确答案为:  " + wordsEnum.getWord());
                unKnowMap.put(wordsEnum, 1);
            }
        }

        System.out.println("-----------复习开始----------");
        while (true) {
            if (isAllEmpty(unKnowMap)) {
                System.out.println("恭喜,已掌握所有单词!");
                return;
            }
            Set<Map.Entry<WordsEnum4, Integer>> entrySet = unKnowMap.entrySet();
            long count = entrySet.stream().filter(entry -> entry.getValue() > 0).count();
            System.out.println("剩余未掌握单词量:" + count);
            for (Map.Entry<WordsEnum4, Integer> entry : entrySet) {
                if (entry.getValue() == 0) {
                    continue;
                }

                System.out.println("请根据提示,输入对应的单词或词组:    " + entry.getKey().getMean());
                Scanner scanner = new Scanner(System.in);
                String word = scanner.nextLine();
                if ("skip".equals(word)) {
                    unKnowMap.put(entry.getKey(), 0);
                    continue;
                }

                if (entry.getKey().getWord().equals(word)) {
                    System.out.println("回答正确!");
                    unKnowMap.put(entry.getKey(), entry.getValue() - 1);
                } else {
                    System.out.println("回答错误,正确答案为:  " + entry.getKey().getWord());
                }
            }

        }
    }

    private static boolean isAllEmpty(Map<WordsEnum4, Integer> unKnowMap) {
        Set<WordsEnum4> keySet = unKnowMap.keySet();
        for (WordsEnum4 wordsEnum : keySet) {
            if (unKnowMap.get(wordsEnum) <= 0) {
                return false;
            }
        }
        return true;
    }
}
