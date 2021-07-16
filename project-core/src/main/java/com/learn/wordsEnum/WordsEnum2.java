package com.learn.wordsEnum;

/**
 * @author wangzhongyuan
 * @version 1.0
 * @date 2021/7/15
 */
public enum WordsEnum2 {
    WORDS_ENUM_1("human","adj:人(类)的,n:人"),
    WORDS_ENUM_2("human nature","人性(短语)"),
    WORDS_ENUM_3("human beings","人类(短语)"),
    WORDS_ENUM_4("nonhuman","adj:非人类的"),
    WORDS_ENUM_5("humanity","n:人类,人性,人道,人文科学"),
    WORDS_ENUM_6("humankind","n:人类"),
    WORDS_ENUM_7("study of all humankind","对全人类的研究"),
    WORDS_ENUM_8("humane","adj:人道的"),
    WORDS_ENUM_9("receive humane care","收到人道的对待(短语)"),
    WORDS_ENUM_10("humanist"," n:人道主义者"),
    WORDS_ENUM_11("anthropology","n:人类学"),
    WORDS_ENUM_12("anthropologist","n:人类学家"),
    WORDS_ENUM_13("take","v:携带,拿,取,乘坐,花费,夺取,需要...时间,学习,接受"),
    WORDS_ENUM_14("mistake","n:错误,误解"),
    WORDS_ENUM_15("mistake","v:弄错,误解,把...误认为"),
    WORDS_ENUM_16("base mistake","基本错误"),
    WORDS_ENUM_17("factual mistakes","事实性错误"),
    WORDS_ENUM_18("government","n:政体,管理,政府"),
    WORDS_ENUM_19("government revenues","政府收入(短语)"),
    WORDS_ENUM_20("government transparency","政府透明度(短语)"),
    WORDS_ENUM_21("government-funded","adj:政府拨款的"),
    WORDS_ENUM_22("govern","v:统治,管理,支配,控制"),
    WORDS_ENUM_23("governor","n:(英国殖民地的)总督,(美国的)州长"),
    WORDS_ENUM_24("governance","n:统治(方式),管理(方法)"),
    WORDS_ENUM_25("control","n:控制,控制能力,指挥"),
    WORDS_ENUM_26("control","v:控制,支配,指挥"),
    WORDS_ENUM_27("take control of","控制(短语)"),
    WORDS_ENUM_28("air traffic control","空中交通指挥(短语)"),
    WORDS_ENUM_29("curb","v:控制,抑制"),
    WORDS_ENUM_30("curb","n:起控制(或限制)作用的事务,路边；勒马绳"),
    WORDS_ENUM_31("chancellor","n:大臣,总理,首席法官,大学名誉校长"),
    WORDS_ENUM_32("Chancellor of the Exchequer","财政大臣(短语)"),
    WORDS_ENUM_33("accord","n:协议,条约,符合,一致,自愿"),
    WORDS_ENUM_34("accord","v:给与,符合"),
    WORDS_ENUM_35("with one accord","一直地(短语)"),
    WORDS_ENUM_36("with one accord voice","异口同声地(短语)"),
    WORDS_ENUM_37("in accord with","按照,与...一致(短语)"),
    WORDS_ENUM_38("of one's own accord","自愿地,主动地(短语)"),
    WORDS_ENUM_39("record","n:记录,最佳成绩,履历,唱片,(过去的)经历,前科,犯罪记录"),
    WORDS_ENUM_40("record","v:记录,录音"),
    WORDS_ENUM_41("record","adj:创纪录的"),
    WORDS_ENUM_42("mean","v:意思是,打算,意味着,(对某人)很重要"),
    WORDS_ENUM_43("mean","adj:卑鄙的,刻薄的,破旧的,吝啬的,低劣的,平均的"),
    WORDS_ENUM_44("mean","n:平均值,平均数"),
    WORDS_ENUM_45("be meant to do sth","打算做某事,(尤指因某人的吩咐或根据职责)应该做某事"),
    WORDS_ENUM_46("meaning","n:意义,含义"),
    WORDS_ENUM_47("meaningful","意味深长的,有意义的"),
    WORDS_ENUM_48("means","n:方式,方法,手段"),
    WORDS_ENUM_49("a means of","...的方式(或方法/途径)"),
    WORDS_ENUM_50("by this means","借助这种手段(或方法)"),
    WORDS_ENUM_51("by means of","用;依靠"),
    WORDS_ENUM_52("by no means","绝不,一点也不"),
    WORDS_ENUM_53("meantime","n:期间,同时"),
    WORDS_ENUM_54("meantime","adv:在间隔时间里;(与此)同时"),
    WORDS_ENUM_55("in the meantime","期间;同时"),
    WORDS_ENUM_56("meanwhile","n:其间,其时"),
    WORDS_ENUM_57("meanwhile","adv:同时,其间"),
    ;
    private String word;
    private String mean;

    WordsEnum2(String word, String mean) {
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
