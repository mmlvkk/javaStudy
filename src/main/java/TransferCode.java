import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class TransferCode {

	public static void main(String[] args) {
		String s = "PLT：A599/W19航路【广州落地】60公里,除上海两场#TOL：H24/A599航路至长沙不含以远航班【杭州起飞】通行量监控#PLT：A599/W19航路【广州落地】60公里,除上海两场#PLT：A599/W19航路【广州落地】60公里,除上海两场#1-PLT：A599/W19航路往PLT方向航班通行量监控。#PLT：A599/W19航路【广州落地】60公里,除上海两场";
		System.out.println(StringFilter(s));
	}

	// 过滤特殊字符
	public static String StringFilter(String str) throws PatternSyntaxException {

		// 清除掉所有特殊字符
		// String
		// regEx="[`~!@#$%^&*()+=|{}':;',//[//].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
		String regEx = "[`~!@$%^&*()+=|{}':;',//[//].<>/?~！@￥%……&*（）——+|{}【】‘；：”“’。，、？]";
		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(str);
		return m.replaceAll(",").trim();
	}

}
