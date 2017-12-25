package com.lepay.common.util;

import java.util.regex.Pattern;

/**
 * @author Edison
 * @ClassName:
 * @Desc:
 * @date 2017/12/24
 * @history
 */
public class StringUtil {

    private static Pattern linePattern = Pattern.compile("(\\w)");
    private static Pattern humpPattern = Pattern.compile("[A-Z]");


    public static String lineToHump(String str){
        if (null == str || "".equals(str))
            return str;
        str = str.toLowerCase();
    }

}
