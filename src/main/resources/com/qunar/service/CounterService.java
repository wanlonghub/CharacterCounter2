package com.qunar.service;

import com.qunar.model.CountResultModel;
import com.qunar.service.impl.CounterServiceImpl;

/**
 * 统计服务类
 * Created by NULL on 2017/1/21.
 */
public class CounterService implements CounterServiceImpl{

    /**
     * 字符统计服务
     * @param text
     * @return
     */
    public CountResultModel count(String text) {

        CountResultModel crm = new CountResultModel();
        crm.setSumOfChineseCharacter(1);
        crm.setSumOfEnglishCharacter(2);
        crm.setSumOfNumber(3);
        crm.setSumOfPunctuation(4);
        return crm;

    }

}
