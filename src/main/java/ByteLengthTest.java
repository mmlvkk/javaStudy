import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;



public class ByteLengthTest {
	public static void main(String[] args) {
		String s = "后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走后走";
//		String s= "TOL：H24/A599航路至长沙不含以远航班【杭州起飞】通行量监控#1-OVTAN：H24航路长沙不含以远航班通行量监控#OVTAN：H24航路【（除南昌低空）南宁落地】开车申请#OVTAN：长沙不含以远航班【非福州温州路桥起飞】通行量监控。#OVTAN：广西贵州省机场落地航班通行量监控。";
		
//		String s = "dfasdfasdflsadjflksjadflkjslfdjklsfjkldjsfaadfasdfasdflsadjflksjadflkjslfdjklsfjkldjsfasdfadsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsds";
		char ss = 0x6c49;
		byte sss = 2;
		
		
		System.out.println(s.length());
		
		//String d = "FYG：ZHO后走B208的航班100公里（除太原区域）#FYG：太原西安不含以远航班【非合肥区域南京起飞】通行量监控#杭州起飞走R343方向30分钟一架。#TAPEN：W554航线往GS方向【杭州起飞】通行量监控";
		try {
			System.out.println(s.getBytes("UTF-8").length);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
//		System.out.print(Character.toString((char)0x738b) + "  ");
//		System.out.print(Character.toString((char)0x5eb7) + "  ");
//		for (int i = 0; i < 0xffff; i++) {
//			System.out.print(Character.toString((char)i) + "  ");
//			if (i%10==0) {
//				System.out.println();
//			}
//		}
		Charset cset = Charset.defaultCharset();
		Charset cset1 = Charset.forName("BIG5");
//		System.out.println(cset.toString());
//		System.out.println(cset1.toString());
		
		
		
		
//		String str = "0";
//		String str1="00";
//		Integer m = Integer.parseInt(str);
//		
//		Integer n  = Integer.parseInt("0");
//	
//		System.out.println(n);
//		System.out.println(m==n);
		
		
//		Integer mm =0;
//		Integer nn  =0;
//		System.out.println(mm==nn);
		
//		Integer q =new Integer(0);
//		Integer a  =new Integer(0);
//		System.out.println(q==a);
		
		
		CTRLContentStatisticQueryResultBean bean = new CTRLContentStatisticQueryResultBean();
		bean.setRepeatCount(Integer.valueOf("0"));
		
		
		CTRLContentStatisticQueryResultBean bean2 = new CTRLContentStatisticQueryResultBean();
		bean2.setRepeatCount(Integer.valueOf("0"));
		
		System.out.println(bean.getRepeatCount()==bean2.getRepeatCount());
		
		
		
		
		
	}

}
