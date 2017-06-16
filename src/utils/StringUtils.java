package utils;

import java.io.PrintWriter;
import java.io.StringWriter;
import org.apache.log4j.Logger;

public class StringUtils
{
	private static Logger logger = Logger.getLogger(StringUtils.class);

    /**
     * 获取异常信息
     *
     * @param e
     * @return
     */
    public static String getExceptionMessage(Exception e) {

        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        e.printStackTrace(printWriter);

        return stringWriter.toString();
    }

}
