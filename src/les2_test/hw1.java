package les2_test;

public class hw1 {

	public static void main(String[] args) {
		System.out.println("min byte val is " + minByte() + " max is" + maxByte());
		System.out.println("min byte val is " + minShort() + " max is" + maxShort());
		// TODO Auto-generated method stub

	}
	public static byte minByte() {
		byte x = 0;
		while((byte)x >= 0) {
			x+=2;
		}
		return x;
	}
	public static byte maxByte() {
		return (byte) (minByte()-1);
	}
	
	public static short minShort() {
		short x = 0;
		short temp = (short)(maxByte()+1);
		while((short)x >= 0) {
			x+=temp;
		}
		return x;
	}
	public static short maxShort() {
		return (short) (minShort()-1);
	}
//	public static int minInt() {
//		short x = 0;
//		short temp = (maxShort()+1);
//		while((int)x >= 0) {
//			x+=temp;
//		}
//		return x;
//	}
//	public static short maxInt() {
//		return (short) (minShort()-1);
//	}

}
