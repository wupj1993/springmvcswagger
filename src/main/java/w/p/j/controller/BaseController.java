/*
 * Copyright (c) 2015 - 7 - 20
 * -7 :43:25
 * -一个人的时候你要好好的努力，这样以后配得起相遇那一刻的怦然心动，你若盛开，清风自来。
 * -作者:吴培基
 * -QQ:757671834
 */

package w.p.j.controller;

import com.alibaba.fastjson.serializer.SerializerFeature;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpStatus;
import w.p.j.daomain.BaseResult;

/******************************************************
 * ****** Created by 吴培基 on 2015/7/20.19:43
 * ****************************************************
 */
public class BaseController {
    public   Log LOGGER = LogFactory.getLog(getClass());
    SerializerFeature[] feature =
            { SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.WriteNullListAsEmpty,
                    SerializerFeature.WriteNullStringAsEmpty, SerializerFeature.WriteNullBooleanAsFalse,
                    SerializerFeature.WriteMapNullValue };

    /**
     * @description: 构造成功返回结果
     * @param resultData  : 需要返回的数据，可选
     * @return
     */
    protected BaseResult buildSuccessResultInfo(Object resultData)
    {
        LOGGER.debug(String.format("enter function, %s", resultData));
        BaseResult resultVo = new BaseResult();
        resultVo.setResultData(resultData);
        resultVo.setResultMessage("success");
        resultVo.setResultCode(HttpStatus.OK);
        return  resultVo;
      //  return JSON.toJSONString(resultVo, feature);
    }

    /**
     * @description: 构造失败返回结果
     * @param resultCode
     *            :任意非0数字，代表失败
     * @param failedMsg
     *            ：失败信息
     * @return
     */

    protected BaseResult buildFailedResultInfo(HttpStatus resultCode, String failedMsg)
    {
        BaseResult resultVo = new BaseResult(resultCode, failedMsg);
       // return JSON.toJSONString(resultVo, feature);
        return resultVo;
    }
}
