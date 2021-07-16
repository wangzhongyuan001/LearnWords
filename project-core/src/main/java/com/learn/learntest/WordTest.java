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
            if (unKnowMap.isEmpty()) {
                System.out.println("恭喜,已掌握所有单词!");
                return;
            }
            Set<Map.Entry<WordsEnum1, Integer>> entrySet = unKnowMap.entrySet();
            for (Map.Entry<WordsEnum1, Integer> entry : entrySet) {
                if (entry.getValue() == 0) {
                    unKnowMap.remove(entry.getKey());
                }
                System.out.println("请根据提示,输入对应的单词或词组:    "+entry.getKey().getMean());
                Scanner scanner = new Scanner(System.in);
                String word = scanner.nextLine();
                if (entry.getKey().getWord().equals(word)) {
                    System.out.println("回答正确!");
                    unKnowMap.put(entry.getKey(),entry.getValue()-1);
                }else {
                    System.out.println("回答错误,正确答案为:  "+entry.getKey().getWord());
                }
            }

        }
    }
}
