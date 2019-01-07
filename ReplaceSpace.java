package swordToOffer;

public class ReplaceSpace {
	public String replaceSpace(StringBuffer str) {
		int spacenum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ')
				spacenum++;
		}
		int newindex = str.length() + 2 * spacenum - 1;
		int beforelength = str.length() - 1;
		str.setLength(newindex + 1);// 必须要扩容，调用append方法stringbuffer会自己扩容
		while (newindex >= 0 && beforelength >= 0) {
			if (str.charAt(beforelength) != ' ')
				str.setCharAt(newindex--, str.charAt(beforelength--));
			else {
				str.setCharAt(newindex--, '0');
				str.setCharAt(newindex--, '2');
				str.setCharAt(newindex--, '%');
				beforelength--;
			}
		}
		return str.toString();
	}
}
