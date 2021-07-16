package com.learn.wordsEnum;

/**
 * @author wangzhongyuan
 * @version 1.0
 * @date 2021/7/15
 */
public enum WordsEnum1 {
    WORDS_ENUM_1("work","工作(量),工作地点,产品,著作"),
    WORDS_ENUM_2("work","(使)工作,有效,产生...作用"),
    WORDS_ENUM_3("work against","极力反对,阻碍"),
    WORDS_ENUM_4("work on","致力于,从事于"),
    WORDS_ENUM_5("work out","计算出,找到...办法,成功的发展..."),
    WORDS_ENUM_6("workout","锻炼"),
    WORDS_ENUM_7("workplace","工作场所"),
    WORDS_ENUM_8("workstation","工作台"),
    WORDS_ENUM_9("workaholic","工作狂"),
    WORDS_ENUM_10("patchwork","拼凑物,混杂物"),
    WORDS_ENUM_11("career","生涯,经历,职业"),
    WORDS_ENUM_12("labor","劳动力,劳动,(英国)工党"),
    WORDS_ENUM_13("labor","劳动,工作,艰苦的做,吃力的做"),
    WORDS_ENUM_14("labor cost","劳动力成本"),
    WORDS_ENUM_15("child labor","童工"),
    WORDS_ENUM_16("state","州,国家,政府,情况,状态"),
    WORDS_ENUM_17("state","州的,国家的,国有的"),
    WORDS_ENUM_18("state","v:声明,规定"),
    WORDS_ENUM_19("heads of state","国家元首"),
    WORDS_ENUM_20("a new state department building","一个新的国务院(国家部门)大楼"),
    WORDS_ENUM_21("a state of peace","和平状态"),
    WORDS_ENUM_22("federal,state and local government","联邦,州和地方政府"),
    WORDS_ENUM_23("in the state sector","在国有部门"),
    WORDS_ENUM_24("state funding","国家拨款"),
    WORDS_ENUM_25("state approval","国家批准"),
    WORDS_ENUM_26("stated","规定的,声明的"),
    WORDS_ENUM_27("statement","n:声明,表述"),
    WORDS_ENUM_28("overstate","vt:过分夸大"),
    WORDS_ENUM_29("status","n:身份,地位,情况,状态,重要性"),
    WORDS_ENUM_30("in the acquisition of status","学术地位"),
    WORDS_ENUM_31("legal status","法律地位"),
    WORDS_ENUM_32("immigration status","移民身份"),
    WORDS_ENUM_33("financial status","财务状况"),
    WORDS_ENUM_34("statue","n:成文法,法令,法规"),
    WORDS_ENUM_35("federal statues","联邦法规"),
    WORDS_ENUM_36("estate","n:地产,庄园,住宅区,遗产"),
    WORDS_ENUM_37("real estate","房地产"),
    WORDS_ENUM_38("statistical","统计的,统计学的"),
    WORDS_ENUM_39("statistical review","统计审查"),
    WORDS_ENUM_40("statistical errors","统计错误"),
    WORDS_ENUM_41("statistic","n:统计数字,统计资料,统计学"),
    WORDS_ENUM_42("stationary","adj:静止不动的,固定的"),
    WORDS_ENUM_43("change","n:变化,零钱"),
    WORDS_ENUM_44("change","v:改变,更换"),
    WORDS_ENUM_45("climate change","气候变化"),
    WORDS_ENUM_46("change one's attitude towards","改变某人对...的看法"),
    WORDS_ENUM_47("exchange","v:交换,兑换,交流,交易"),
    WORDS_ENUM_48("exchange","n:交换,兑换,交流,交易,交易所"),
    WORDS_ENUM_49("social","adj:社会的,好社交的,社交的"),
    WORDS_ENUM_50("social contexts","社会背景"),
    WORDS_ENUM_51("social media","社交媒体"),
    WORDS_ENUM_52("asocial","adj:缺乏社交性的"),
    WORDS_ENUM_53("sociable","好交际的,合群的"),
    WORDS_ENUM_54("society","n:社会,社团,协会,上流社会"),
    WORDS_ENUM_55("sociologist","社会学家"),
    WORDS_ENUM_56("public","adj:公开的,公众的,公共的,政府的"),
    WORDS_ENUM_57("public","n:公众,民众,志趣相投的群体(或从事同一类活动/具有共同特征)"),
    WORDS_ENUM_58("in public situations","在公共场合"),
    WORDS_ENUM_59("public resources","公共资源"),
    WORDS_ENUM_60("public awareness of conservation","公众的环保意识"),
    WORDS_ENUM_61("public health problems","公众健康问题"),
    WORDS_ENUM_62("public officials","公务员,政府工作人员"),
    WORDS_ENUM_63("most of the traveling public","大多数旅客"),
    WORDS_ENUM_64("publicly","adj:公开的,公众的,公然的"),
    WORDS_ENUM_65("publicly traded companies","公开上市交易的公司"),
    WORDS_ENUM_66("publicized","v:引起公众对...注意;宣传(尤指用广告)"),
    WORDS_ENUM_67("publication","n:出版物,出版,发行,发表,公布"),
    WORDS_ENUM_68("publication process","出版流程"),
    WORDS_ENUM_69("republican","n:共和主义者,拥护共和政体者"),
    WORDS_ENUM_70("republican","adj:共和国的,共和政体的,共和党的,拥护共和政体的"),
    WORDS_ENUM_71("republican party","共和党"),
    WORDS_ENUM_72("republican governor","共和党州长"),
    ;
    private String word;
    private String mean;

    WordsEnum1(String word, String mean) {
        this.word = word;
        this.mean = mean;
    }

    public String getWord() {
        return word;
    }

    public String getMean() {
        return mean;
    }
}
