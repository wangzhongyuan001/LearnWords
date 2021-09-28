package com.learn.wordsEnum;

/**
 * @author wangzhongyuan
 * @version 1.0
 * @date 2021/9/27
 */
public enum WordsEnum4 {
    WORDS_ENUM_1("research","n/v:研究,调查"),
    WORDS_ENUM_2("research findings","研究成果"),
    WORDS_ENUM_3("published research","已发表的研究"),
    WORDS_ENUM_4("research methodology","研究方法"),
    WORDS_ENUM_5("research into","对...进行研究,对...进行调查"),
    WORDS_ENUM_6("researcher","n:研究员/调查员"),
    WORDS_ENUM_7("search","n/v:搜寻,搜查,(在计算机上)搜索"),
    WORDS_ENUM_8("search through","仔细搜查"),
    WORDS_ENUM_9("search for","搜寻..."),
    WORDS_ENUM_10("rake","n:耙子;v:搜索,搜寻,轻易获得(钱财),(用耙)耙"),
    WORDS_ENUM_11("mark","n:痕迹,斑点,污点,记号,符号,分数"),
    WORDS_ENUM_12("mark","v:给...打分数,指出,标明,做标记"),
    WORDS_ENUM_13("marked","adj:显著的,明显的,有记号的"),
    WORDS_ENUM_14("a marked difference","一个显著的差异"),
    WORDS_ENUM_15("markedly","adv:显著的,明显的"),
    WORDS_ENUM_16("marker","n:标记,标志"),
    WORDS_ENUM_17("remark","n:评论,引人注目v:评论,谈论,说起"),
    WORDS_ENUM_18("remarkable","adj:值得注意的,卓越的"),
    WORDS_ENUM_19("unremarkable","adj:未被注意的"),
    WORDS_ENUM_20("spot","n:点,斑点,地点;v:认出,认清,发现"),
    WORDS_ENUM_21("suggest","v:建议,暗示,表明"),

    WORDS_ENUM_22("cue","n:暗示,信号,线索"),
    WORDS_ENUM_23("daily cues","日常暗示"),
    WORDS_ENUM_24("look for cues","寻找线索"),
    WORDS_ENUM_25("subtle cues","微妙的线索"),
    WORDS_ENUM_26("test","n/v: 测试,实验,检验"),
    WORDS_ENUM_27("contest","n: 比赛,争论,争夺;v: 争取赢得,争辩"),
    WORDS_ENUM_28("protest","n: 抗议,反对;v: 抗议,反对,对...提出异议"),
    WORDS_ENUM_29("testify","v:证明,证实,(尤其指出庭)作证"),
    WORDS_ENUM_30("economic","adj: 经济上的,经济学的"),
    WORDS_ENUM_31("uneconomic","adj:非经济的"),
    WORDS_ENUM_32("socio-economic","社会经济的,社会经济学的"),
    WORDS_ENUM_33("socio-economic status","社会经济地位"),
    WORDS_ENUM_35("economics","n:经济学,经济状况"),
    WORDS_ENUM_36("basic economics","基础经济学"),
    WORDS_ENUM_37("family economics","家庭经济状况"),
    WORDS_ENUM_38("economist","n: 经济学家"),
    WORDS_ENUM_39("economical","adj:经济的,节约的,精打细算的"),
    WORDS_ENUM_40("economically","adv:经济上地,经济地,实惠地"),
    WORDS_ENUM_41("economy","n: 节约,经济;adj: 便宜的,经济的"),
    WORDS_ENUM_42("the world economy","世界经济"),
    WORDS_ENUM_43("bio-economy","生物经济"),
    WORDS_ENUM_44("astronomy","n:天文学"),
    WORDS_ENUM_45("inflation","n: 通货膨胀"),
    WORDS_ENUM_46("ecology","n: 生态学"),
    WORDS_ENUM_47("end","n: 末端,末尾,结束,目的,意图;v: 结束"),
    WORDS_ENUM_48("by the end of","到...末期"),
    WORDS_ENUM_49("put an end to","结束..."),
    WORDS_ENUM_50("with other ends in mind","心里想着其他目的"),
    WORDS_ENUM_51("end up","最终成为,最后处于"),
    WORDS_ENUM_52("ending","(故事等的)结局"),
    ;
    private String word;
    private String mean;

    WordsEnum4(String word, String mean) {
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
