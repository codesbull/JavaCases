
public class ArrayExtend {
//09
	public static void main(String[] args) {
		String[] names = new String[] {"A","B","C"};
		String[] extended = new String[5];
		extended[3] = "D";
		extended[4] = "E";
		System.arraycopy(names, 0, extended,0,names.length);
		for (String s:extended) {
			System.out.println(s);
		}
	}

}