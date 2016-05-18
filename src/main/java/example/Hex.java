package example;

import java.io.UnsupportedEncodingException;

public class Hex {
	
	public static int[] convertStringToHexNumArr(final String inputString) {
		if (null == inputString || inputString.length() == 0) {
			return null;
		}
		int[] intArr = new int[inputString.length()];
		for (int i = 0; i < inputString.length(); i++) {
			byte[] ba = null;
			try {
				ba = inputString.substring(i, i + 1).getBytes("GB2312");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			intArr[i] = ba[0] & 0xFF;
		}
		return intArr;
	}

	/**
	 * 字符串转成十六进制的字符串数组
	 * 
	 * @param inputString
	 * @return
	 */
	public static String[] covertStringToHexArr(final String inputString) {
		if (inputString == null) {
			return null;
		}
		try {
			int length = inputString.length();
			String[] hexStrArr = new String[length * 2];
			int index = 0;
			for (int i = 0; i < length; i++) {
				byte[] ba = inputString.substring(i, i + 1).getBytes("GB2312");
				for (byte b : ba) {
					
//					hexStrArr[index] = ;
					hexStrArr[index] = "0x" + Integer.toHexString(b & 0xFF);
					++index;
				}
			}
			return hexStrArr;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static String[] covertStringToHexArr2(final String inputString) {
		if (inputString == null) {
			return null;
		}
		
		
		
		
		try {
			int length = inputString.length();
			String[] hexStrArr = new String[length * 2];
			int index = 0;
			for (int i = 0; i < length; i++) {
				byte[] ba = inputString.substring(i, i + 1).getBytes("GB2312");
				for (byte b : ba) {
					
//					hexStrArr[index] = ;
					hexStrArr[index] = "0x" + Integer.toHexString(b & 0xFF);
					++index;
				}
			}
			return hexStrArr;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static void main(String[] args) {
		Hex h = new Hex();
		String[] str = h.covertStringToHexArr("王");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]);
		}
		System.out.println();
		
		int[] in = h.convertStringToHexNumArr("王康 13454");
		for (int i = 0; i < in.length; i++) {
			System.out.print(in[i] + "  "  );
		}
		
		
		System.out.println( Byte.parseByte("-126"));
		
	}

}
