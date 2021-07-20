package com.learn.wordsEnum;

/**
 * @author wangzhongyuan
 * @version 1.0
 * @date 2021/7/15
 */
public enum WordsEnum3 {
    WORDS_ENUM_1("direction","n:方向,说明"),
    WORDS_ENUM_2("direct","adj:径直的,直接的 adv:径直地,直接地"),
    WORDS_ENUM_3("direct","v:指导,管理,导演(电影或戏剧)"),
    WORDS_ENUM_4("direct result","直接结果(词组)"),
    WORDS_ENUM_5("direct you","指引着你(词组)"),
    WORDS_ENUM_6("director","n:主任,导演,董事"),
    WORDS_ENUM_7("outside director","外部董事"),
    WORDS_ENUM_8("steer","v:驾驶;引导"),
    WORDS_ENUM_9("hijack","v:劫持(交通工具,尤指飞机);操纵(会议等,以推销自己的意图),控制"),
    WORDS_ENUM_10("paragraph","n:段落,节"),
    WORDS_ENUM_11("graph","n:图标,曲线图"),
    WORDS_ENUM_12("graphic","adj:(描述等)形象的,绘画的 n:图表,图形"),
    WORDS_ENUM_13("parallel","adj:平行的,并联的,极相似的"),
    WORDS_ENUM_14("parallel","n:极其相似的人(或情况等),相似处,纬线"),
    WORDS_ENUM_15("parallel","v:与...相似"),
    WORDS_ENUM_16("be parallel to/with","与...平行"),
    WORDS_ENUM_17("a parallel situation","相似的情况"),
    WORDS_ENUM_18("paradox","n:似非而是的谐语,悖论,矛盾的人(事物,情况)"),
    WORDS_ENUM_19("face the paradox","面对矛盾"),
    WORDS_ENUM_20("parachute","n:降落伞"),
    WORDS_ENUM_21("parachute","v:跳伞,空投,突然派到"),
    WORDS_ENUM_22("lose the parachute","失去保护伞"),
    WORDS_ENUM_23("parachute to","空降到..."),
    WORDS_ENUM_24("paralysis","n:麻痹,瘫痪,(活动,工作等)等能力的完全丧失"),
    WORDS_ENUM_25("section","n:片面,部分,地区,部门,截面,阶层"),
    WORDS_ENUM_26("sector","n:部分,部门,行业,军事管制区"),
    WORDS_ENUM_27("private sector","私营部门"),
    WORDS_ENUM_28("state sector","国有部门(短语)"),
    WORDS_ENUM_29("insect","昆虫"),
    WORDS_ENUM_30("segment","n:段,片,部门,部分"),
    WORDS_ENUM_31("segment","v:划分,分割"),
    WORDS_ENUM_32("sheet","n:床单,张,片"),
    WORDS_ENUM_33("sheer","adj:纯粹的,十足的,陡峭的,(用来强调事物的大小程度和数量)"),
    WORDS_ENUM_34("sheer difficulty","极大的苦难"),
    WORDS_ENUM_35("question","n:问题,疑问 v:询问,对...表示疑问"),
    WORDS_ENUM_36("issue","n:问题,争端,发行,发行物,期号,版次"),
    WORDS_ENUM_37("issue","v:发行,发表,发布,发放,发给"),
    WORDS_ENUM_38("increase","n:增加,增进,提高 v:增加,增进,提高"),
    WORDS_ENUM_39("increasingly","adv:渐增地,越来越多的"),
    WORDS_ENUM_40("decrease","v:(使)减少,(使)减小 n:减少,减小"),
    WORDS_ENUM_41("mute","adj:哑的,缄默的,无声的 n:哑巴,静音器 v:减轻(声音),抑制(情感),减弱"),
    WORDS_ENUM_42("reduce","v:减少,简化"),
    WORDS_ENUM_43("reduction","n:减少,降低"),
    WORDS_ENUM_44("graphic designer","平面设计师"),
    ;
    private String word;
    private String mean;

    WordsEnum3(String word, String mean) {
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
