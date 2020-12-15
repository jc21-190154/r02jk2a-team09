
public class Kadai01 {

	/**
	 * �ۑ�01
	 * ������̍��E�̕����𔽓]���ĕԂ����\�b�h
	 * @param s�@�Ώۂ̕���
	 * @return ���E�𔽓]��������
	 */
	String ReverseString(String s) {
		try {
			char[] c = s.toCharArray();
			for(int i = 0; i < c.length / 2; i++) {
				int j = c.length - 1 - i;
				char sw = c[j];
				c[j] = c[i];
				c[i] = sw;
	 		}
			return String.copyValueOf(c);
		}
		catch (NullPointerException e) {
			System.out.println(e);
			return s;
		}

	}

}
