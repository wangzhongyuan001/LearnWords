package com.learn.learntest;


import com.learn.words.BaseWord;
import com.learn.words.Word;

import java.util.*;

/**
 * @author wangzhongyuan
 * @version 1.0
 * @date 2021/7/15
 */
public class WordTest {
    public static void main(String[] args) throws Exception {
        System.out.println("请输入第几单元:");
        Scanner unitScanner = new Scanner(System.in);
        String unit = "WordsUnit" + unitScanner.nextLine();
        BaseWord baseWord = (BaseWord) Class.forName("com.learn.words." + unit).newInstance();
        Map<String, String> wordMap = new HashMap<>();
        baseWord.getAllWord(wordMap);

        Set<Map.Entry<String, String>> entries = wordMap.entrySet();
        List<Word> wordList = new ArrayList<>();
        List<Word> missWordList = new ArrayList<>();
        for (Map.Entry<String, String> entry : entries) {
            String word = entry.getKey();
            String desc = entry.getValue();
            Word word1 = new Word();
            word1.setWord(word);
            word1.setDesc(desc);
            wordList.add(word1);
        }
        Collections.shuffle(wordList);
        for (Word word : wordList) {
            System.out.println("请根据提示,输入对应的单词或词组:    " + word.getDesc());
            Scanner scanner = new Scanner(System.in);
            String wordStr = scanner.nextLine();
            if (word.getWord().equals(wordStr)) {
                System.out.println("回答正确!");
            } else {
                System.out.println("回答错误,正确答案为:   " + word.getWord());
                missWordList.add(word);
            }
        }

        System.out.println("-----------复习开始----------");
        while (true) {
            if (missWordList.isEmpty()) {
                System.out.println("恭喜,已掌握所有单词!");
                return;
            }

            System.out.println("剩余未掌握单词量:" + missWordList.size());
            Iterator<Word> iterator = missWordList.iterator();
            List<Word> list = new ArrayList<>();
            while (iterator.hasNext()) {
                Word word = iterator.next();
                System.out.println("请根据提示,输入对应的单词或词组:    " + word.getDesc());
                Scanner scanner = new Scanner(System.in);
                String wordStr = scanner.nextLine();
                if (word.getWord().equals(wordStr)) {
                    System.out.println("回答正确!");
                } else {
                    list.add(word);
                    System.out.println("回答错误,正确答案为:   " + word.getWord());
                }
            }
            missWordList = list;
        }
    }
}
