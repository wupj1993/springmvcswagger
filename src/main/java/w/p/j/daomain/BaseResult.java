/*
 * Copyright (c) 2015 - 7 - 20
 * -7 :40:59
 * -一个人的时候你要好好的努力，这样以后配得起相遇那一刻的怦然心动，你若盛开，清风自来。
 * -作者:吴培基
 * -QQ:757671834
 */

package w.p.j.daomain;

import java.io.Serializable;

/******************************************************
 * ****** Created by 吴培基 on 2015/7/20.19:40
 * ****************************************************
 */
public class BaseResult implements Serializable {
    // 返回码，0表示成功，非0表示失败
    private int resultCode;

    // 返回消息，成功为“success”，失败为具体失败信息
    private String resultMessage;

    // 返回数据
    private Object resultData;

    public BaseResult(int resultCode, String resultMessage, Object resultData) {
        this.resultCode = resultCode;
        this.resultMessage = resultMessage;
        this.resultData = resultData;
    }

    public BaseResult(int resultCode, String resultMessage) {
        this.resultCode = resultCode;
        this.resultMessage = resultMessage;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public Object getResultData() {
        return resultData;
    }

    public void setResultData(Object resultData) {
        this.resultData = resultData;
    }

    public BaseResult()
    {

    }

    @Override
    public String toString() {
        return "BaseResult{" +
                "resultCode=" + resultCode +
                ", resultMessage='" + resultMessage + '\'' +
                ", resultData=" + resultData +
                '}';
    }
}
