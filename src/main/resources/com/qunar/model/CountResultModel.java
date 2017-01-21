package com.qunar.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 统计结果实体
 * Created by NULL on 2017/1/21.
 */
public class CountResultModel {

    // 英文字母个数
    private Integer sumOfEnglishCharacter;
    // 数字个数
    private Integer sumOfNumber;
    // 汉字个数
    private Integer sumOfChineseCharacter;
    // 中英文标点符号个数
    private Integer sumOfPunctuation;

    private List<String> top3;

    public CountResultModel() {
        top3 = new ArrayList<String>();
    }

    public Integer getSumOfEnglishCharacter() {
        return sumOfEnglishCharacter;
    }

    public void setSumOfEnglishCharacter(Integer sumOfEnglishCharacter) {
        this.sumOfEnglishCharacter = sumOfEnglishCharacter;
    }

    public Integer getSumOfNumber() {
        return sumOfNumber;
    }

    public void setSumOfNumber(Integer sumOfNumber) {
        this.sumOfNumber = sumOfNumber;
    }

    public Integer getSumOfChineseCharacter() {
        return sumOfChineseCharacter;
    }

    public void setSumOfChineseCharacter(Integer sumOfChineseCharacter) {
        this.sumOfChineseCharacter = sumOfChineseCharacter;
    }

    public Integer getSumOfPunctuation() {
        return sumOfPunctuation;
    }

    public void setSumOfPunctuation(Integer sumOfPunctuation) {
        this.sumOfPunctuation = sumOfPunctuation;
    }

    public List<String> getTop3() {
        return top3;
    }

    public void setTop3(List<String> top3) {
        this.top3 = top3;
    }

}
