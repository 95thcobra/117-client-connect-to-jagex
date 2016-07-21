import java.math.BigInteger;

public class Class131_Sub14 extends Class131 {
	static long aLong1110;
	public int anInt1107;
	public byte[] aByteArray1109;
	public static int[] anIntArray1108 = new int[256];
	static long[] aLongArray1111;

	public byte method584() {
		return aByteArray1109[++anInt1107 - 1];
	}

	public Class131_Sub14(final byte[] var1) {
		aByteArray1109 = var1;
		anInt1107 = 0;
	}

	public void method585(final int var1) {
		aByteArray1109[++anInt1107 - 1] = (byte) (var1 >> 24);
		aByteArray1109[++anInt1107 - 1] = (byte) (var1 >> 16);
		aByteArray1109[++anInt1107 - 1] = (byte) (var1 >> 8);
		aByteArray1109[++anInt1107 - 1] = (byte) var1;
	}

	public void method586(final int var1) {
		aByteArray1109[++anInt1107 - 1] = (byte) (var1 >> 8);
		aByteArray1109[++anInt1107 - 1] = (byte) var1;
	}

	public void method587(final int var1) {
		aByteArray1109[++anInt1107 - 1] = (byte) (var1 >> 16);
		aByteArray1109[++anInt1107 - 1] = (byte) (var1 >> 8);
		aByteArray1109[++anInt1107 - 1] = (byte) var1;
	}

	public void method588(final int[] var1, final int var2, final int var3) {
		final int var4 = anInt1107;
		anInt1107 = var2;
		final int var6 = (var3 - var2) / 8;

		for (int var7 = 0; var7 < var6; ++var7) {
			int var8 = method642();
			int var9 = method642();
			int var10 = 0;
			final int var11 = -1640531527;

			for (int var5 = 32; var5-- > 0; var9 += (var8 + ((var8 << 4) ^ (var8 >>> 5)))
					^ (var10 + var1[(var10 >>> 11) & 3])) {
				var8 += (var9 + ((var9 << 4) ^ (var9 >>> 5))) ^ (var10 + var1[var10 & 3]);
				var10 += var11;
			}

			anInt1107 -= 8;
			method585(var8);
			method585(var9);
		}

		anInt1107 = var4;
	}

	public void method589(final String var1) {
		final int var2 = var1.indexOf(0);
		if (var2 >= 0)
			throw new IllegalArgumentException("");
		else {
			anInt1107 += Canvas_Sub1.method878(var1, 0, var1.length(), aByteArray1109, anInt1107);
			aByteArray1109[++anInt1107 - 1] = 0;
		}
	}

	public void method590(final String var1) {
		final int var2 = var1.indexOf(0);
		if (var2 >= 0)
			throw new IllegalArgumentException("");
		else {
			aByteArray1109[++anInt1107 - 1] = 0;
			anInt1107 += Canvas_Sub1.method878(var1, 0, var1.length(), aByteArray1109, anInt1107);
			aByteArray1109[++anInt1107 - 1] = 0;
		}
	}

	public void method591(final int var1) {
		aByteArray1109[++anInt1107 - 1] = (byte) (var1 + 128);
	}

	public void method592(final int var1) {
		aByteArray1109[anInt1107 - var1 - 2] = (byte) (var1 >> 8);
		aByteArray1109[anInt1107 - var1 - 1] = (byte) var1;
	}

	public void method593(final int var1) {
		aByteArray1109[anInt1107 - var1 - 1] = (byte) var1;
	}

	public void method594(final int var1) {
		if ((var1 & -128) != 0) {
			if ((var1 & -16384) != 0) {
				if ((var1 & -2097152) != 0) {
					if ((var1 & -268435456) != 0)
						method636((var1 >>> 28) | 128);

					method636((var1 >>> 21) | 128);
				}

				method636((var1 >>> 14) | 128);
			}

			method636((var1 >>> 7) | 128);
		}

		method636(var1 & 127);
	}

	public int method595() {
		return aByteArray1109[++anInt1107 - 1] & 255;
	}

	public int readUShort() {
		anInt1107 += 2;
		return ((aByteArray1109[anInt1107 - 2] & 255) << 8) + (aByteArray1109[anInt1107 - 1] & 255);
	}

	public int method597() {
		anInt1107 += 2;
		int var1 = (aByteArray1109[anInt1107 - 1] & 255) + ((aByteArray1109[anInt1107 - 2] & 255) << 8);
		if (var1 > 32767)
			var1 -= 65536;

		return var1;
	}

	public int method598() {
		anInt1107 += 3;
		return (aByteArray1109[anInt1107 - 1] & 255) + ((aByteArray1109[anInt1107 - 3] & 255) << 16)
				+ ((aByteArray1109[anInt1107 - 2] & 255) << 8);
	}

	public byte method599() {
		return (byte) (0 - aByteArray1109[++anInt1107 - 1]);
	}

	public long method600() {
		final long var1 = method642() & 4294967295L;
		final long var3 = method642() & 4294967295L;
		return (var1 << 32) + var3;
	}

	public String method601() {
		if (aByteArray1109[anInt1107] != 0)
			return method638();
		else {
			++anInt1107;
			return null;
		}
	}

	public String method602() {
		final byte var1 = aByteArray1109[++anInt1107 - 1];
		if (var1 != 0)
			throw new IllegalStateException("");
		else {
			final int var3 = anInt1107;

			while (aByteArray1109[++anInt1107 - 1] != 0)
				;

			final int var2 = anInt1107 - var3 - 1;
			return var2 == 0 ? "" : Class83.method361(aByteArray1109, var3, var2);
		}
	}

	public void method603(final long var1) {
		aByteArray1109[++anInt1107 - 1] = (byte) ((int) (var1 >> 40));
		aByteArray1109[++anInt1107 - 1] = (byte) ((int) (var1 >> 32));
		aByteArray1109[++anInt1107 - 1] = (byte) ((int) (var1 >> 24));
		aByteArray1109[++anInt1107 - 1] = (byte) ((int) (var1 >> 16));
		aByteArray1109[++anInt1107 - 1] = (byte) ((int) (var1 >> 8));
		aByteArray1109[++anInt1107 - 1] = (byte) ((int) var1);
	}

	public void method604(final byte[] var1, final int var2, final int var3) {
		for (int var4 = var2; var4 < (var3 + var2); ++var4)
			var1[var4] = aByteArray1109[++anInt1107 - 1];

	}

	public int method605() {
		final int var1 = aByteArray1109[anInt1107] & 255;
		return var1 < 128 ? method595() - 64 : readUShort() - '\uc000';
	}

	public int method606() {
		final int var1 = aByteArray1109[anInt1107] & 255;
		return var1 < 128 ? method595() : readUShort() - '\u8000';
	}

	public int method607() {
		byte var1 = aByteArray1109[++anInt1107 - 1];

		int var2;
		for (var2 = 0; var1 < 0; var1 = aByteArray1109[++anInt1107 - 1])
			var2 = (var2 | (var1 & 127)) << 7;

		return var2 | var1;
	}

	public void method608(final int[] var1) {
		final int var2 = anInt1107 / 8;
		anInt1107 = 0;

		for (int var3 = 0; var3 < var2; ++var3) {
			int var8 = method642();
			int var4 = method642();
			int var5 = 0;
			final int var6 = -1640531527;

			for (int var7 = 32; var7-- > 0; var4 += (((var8 << 4) ^ (var8 >>> 5)) + var8)
					^ (var1[(var5 >>> 11) & 3] + var5)) {
				var8 += (var4 + ((var4 << 4) ^ (var4 >>> 5))) ^ (var5 + var1[var5 & 3]);
				var5 += var6;
			}

			anInt1107 -= 8;
			method585(var8);
			method585(var4);
		}

	}

	public void method609(final int[] var1, final int var2, final int var3) {
		final int var4 = anInt1107;
		anInt1107 = var2;
		final int var6 = (var3 - var2) / 8;

		for (int var10 = 0; var10 < var6; ++var10) {
			int var7 = method642();
			int var8 = method642();
			int var9 = -957401312;
			final int var11 = -1640531527;

			for (int var5 = 32; var5-- > 0; var7 -= (((var8 << 4) ^ (var8 >>> 5)) + var8) ^ (var1[var9 & 3] + var9)) {
				var8 -= (((var7 << 4) ^ (var7 >>> 5)) + var7) ^ (var1[(var9 >>> 11) & 3] + var9);
				var9 -= var11;
			}

			anInt1107 -= 8;
			method585(var7);
			method585(var8);
		}

		anInt1107 = var4;
	}

	public void method610(final BigInteger var1, final BigInteger var2) {
		final int var3 = anInt1107;
		anInt1107 = 0;
		final byte[] var4 = new byte[var3];
		method604(var4, 0, var3);
		final BigInteger var5 = new BigInteger(var4);
		final BigInteger var6 = var5.modPow(var1, var2);
		final byte[] var7 = var6.toByteArray();
		anInt1107 = 0;
		method586(var7.length);
		method623(var7, 0, var7.length);
	}

	public boolean method611() {
		anInt1107 -= 4;
		final byte[] var4 = aByteArray1109;
		final int var3 = anInt1107;
		int var1 = -1;

		int var2;
		for (var2 = 0; var2 < var3; ++var2)
			var1 = (var1 >>> 8) ^ anIntArray1108[(var1 ^ var4[var2]) & 255];

		var1 = ~var1;
		var2 = method642();
		return var1 == var2;
	}

	static {
		int var1;
		for (int var0 = 0; var0 < 256; ++var0) {
			int var2 = var0;

			for (var1 = 0; var1 < 8; ++var1)
				if ((var2 & 1) == 1)
					var2 = (var2 >>> 1) ^ -306674912;
				else
					var2 >>>= 1;

			anIntArray1108[var0] = var2;
		}

		aLongArray1111 = new long[256];

		for (var1 = 0; var1 < 256; ++var1) {
			long var4 = var1;

			for (int var3 = 0; var3 < 8; ++var3)
				if (1L == (var4 & 1L))
					var4 = (var4 >>> 1) ^ -3932672073523589310L;
				else
					var4 >>>= 1;

			aLongArray1111[var1] = var4;
		}

	}

	public void method612(final int var1) {
		aByteArray1109[++anInt1107 - 1] = (byte) (0 - var1);
	}

	public void method613(final int var1) {
		aByteArray1109[++anInt1107 - 1] = (byte) (128 - var1);
	}

	public int method614() {
		return (aByteArray1109[++anInt1107 - 1] - 128) & 255;
	}

	public int method615() {
		return (0 - aByteArray1109[++anInt1107 - 1]) & 255;
	}

	public int method616() {
		return (128 - aByteArray1109[++anInt1107 - 1]) & 255;
	}

	public byte method617() {
		return (byte) (128 - aByteArray1109[++anInt1107 - 1]);
	}

	public void method618(final int var1) {
		aByteArray1109[++anInt1107 - 1] = (byte) var1;
		aByteArray1109[++anInt1107 - 1] = (byte) (var1 >> 8);
	}

	public void method619(final int var1) {
		aByteArray1109[++anInt1107 - 1] = (byte) (var1 >> 8);
		aByteArray1109[++anInt1107 - 1] = (byte) (var1 + 128);
	}

	public void method620(final int var1) {
		aByteArray1109[++anInt1107 - 1] = (byte) (128 + var1);
		aByteArray1109[++anInt1107 - 1] = (byte) (var1 >> 8);
	}

	public int method621() {
		anInt1107 += 2;
		int var1 = ((aByteArray1109[anInt1107 - 1] & 255) << 8) + ((aByteArray1109[anInt1107 - 2] - 128) & 255);
		if (var1 > 32767)
			var1 -= 65536;

		return var1;
	}

	public int method622() {
		anInt1107 += 2;
		return ((aByteArray1109[anInt1107 - 1] - 128) & 255) + ((aByteArray1109[anInt1107 - 2] & 255) << 8);
	}

	public void method623(final byte[] var1, final int var2, final int var3) {
		for (int var4 = var2; var4 < (var3 + var2); ++var4)
			aByteArray1109[++anInt1107 - 1] = var1[var4];

	}

	public void method624(final int var1) {
		aByteArray1109[++anInt1107 - 1] = (byte) (var1 >> 16);
		aByteArray1109[++anInt1107 - 1] = (byte) var1;
		aByteArray1109[++anInt1107 - 1] = (byte) (var1 >> 8);
	}

	public void method625(final int var1) {
		aByteArray1109[++anInt1107 - 1] = (byte) var1;
		aByteArray1109[++anInt1107 - 1] = (byte) (var1 >> 8);
		aByteArray1109[++anInt1107 - 1] = (byte) (var1 >> 16);
		aByteArray1109[++anInt1107 - 1] = (byte) (var1 >> 24);
	}

	public void method626(final int var1) {
		aByteArray1109[++anInt1107 - 1] = (byte) (var1 >> 8);
		aByteArray1109[++anInt1107 - 1] = (byte) var1;
		aByteArray1109[++anInt1107 - 1] = (byte) (var1 >> 24);
		aByteArray1109[++anInt1107 - 1] = (byte) (var1 >> 16);
	}

	public void method627(final int var1) {
		aByteArray1109[++anInt1107 - 1] = (byte) (var1 >> 16);
		aByteArray1109[++anInt1107 - 1] = (byte) (var1 >> 24);
		aByteArray1109[++anInt1107 - 1] = (byte) var1;
		aByteArray1109[++anInt1107 - 1] = (byte) (var1 >> 8);
	}

	public int method628() {
		anInt1107 += 4;
		return (aByteArray1109[anInt1107 - 4] & 255) + ((aByteArray1109[anInt1107 - 2] & 255) << 16)
				+ ((aByteArray1109[anInt1107 - 1] & 255) << 24) + ((aByteArray1109[anInt1107 - 3] & 255) << 8);
	}

	public int method629() {
		anInt1107 += 2;
		return (aByteArray1109[anInt1107 - 2] & 255) + ((aByteArray1109[anInt1107 - 1] & 255) << 8);
	}

	public int method630() {
		anInt1107 += 4;
		return ((aByteArray1109[anInt1107 - 3] & 255) << 24) + ((aByteArray1109[anInt1107 - 4] & 255) << 16)
				+ ((aByteArray1109[anInt1107 - 1] & 255) << 8) + (aByteArray1109[anInt1107 - 2] & 255);
	}

	public void method631(final int var1) {
		if ((var1 >= 0) && (var1 < 128))
			method636(var1);
		else if ((var1 >= 0) && (var1 < '\u8000'))
			method586('\u8000' + var1);
		else
			throw new IllegalArgumentException();
	}

	public void method632(final int[] var1) {
		final int var2 = anInt1107 / 8;
		anInt1107 = 0;

		for (int var3 = 0; var3 < var2; ++var3) {
			int var8 = method642();
			int var4 = method642();
			int var5 = -957401312;
			final int var6 = -1640531527;

			for (int var7 = 32; var7-- > 0; var8 -= (var4 + ((var4 << 4) ^ (var4 >>> 5))) ^ (var1[var5 & 3] + var5)) {
				var4 -= (((var8 << 4) ^ (var8 >>> 5)) + var8) ^ (var5 + var1[(var5 >>> 11) & 3]);
				var5 -= var6;
			}

			anInt1107 -= 8;
			method585(var8);
			method585(var4);
		}

	}

	public String method633() {
		final byte var1 = aByteArray1109[++anInt1107 - 1];
		if (var1 == 0) {
			final int var2 = method607();
			if ((var2 + anInt1107) > aByteArray1109.length)
				throw new IllegalStateException("");
			else {
				final String var3 = Class106.method431(aByteArray1109, anInt1107, var2);
				anInt1107 += var2;
				return var3;
			}
		} else
			throw new IllegalStateException("");
	}

	public void method634(final CharSequence var1) {
		final int var2 = Class131_Sub20_Sub19_Sub2_Sub1.method1067(var1);
		aByteArray1109[++anInt1107 - 1] = 0;
		method594(var2);
		final int var4 = anInt1107;
		final byte[] var5 = aByteArray1109;
		final int var9 = anInt1107;
		final int var7 = var1.length();
		int var6 = var9;

		for (int var8 = 0; var8 < var7; ++var8) {
			final char var3 = var1.charAt(var8);
			if (var3 <= 127)
				var5[var6++] = (byte) var3;
			else if (var3 <= 2047) {
				var5[var6++] = (byte) (192 | (var3 >> 6));
				var5[var6++] = (byte) (128 | (var3 & 63));
			} else {
				var5[var6++] = (byte) (224 | (var3 >> 12));
				var5[var6++] = (byte) (128 | ((var3 >> 6) & 63));
				var5[var6++] = (byte) (128 | (var3 & 63));
			}
		}

		final int var10 = var6 - var9;
		anInt1107 = var4 + var10;
	}

	public void method635(final long var1) {
		aByteArray1109[++anInt1107 - 1] = (byte) ((int) (var1 >> 56));
		aByteArray1109[++anInt1107 - 1] = (byte) ((int) (var1 >> 48));
		aByteArray1109[++anInt1107 - 1] = (byte) ((int) (var1 >> 40));
		aByteArray1109[++anInt1107 - 1] = (byte) ((int) (var1 >> 32));
		aByteArray1109[++anInt1107 - 1] = (byte) ((int) (var1 >> 24));
		aByteArray1109[++anInt1107 - 1] = (byte) ((int) (var1 >> 16));
		aByteArray1109[++anInt1107 - 1] = (byte) ((int) (var1 >> 8));
		aByteArray1109[++anInt1107 - 1] = (byte) ((int) var1);
	}

	public void method636(final int var1) {
		aByteArray1109[++anInt1107 - 1] = (byte) var1;
	}

	public int method637(final int var1) {
		final byte[] var2 = aByteArray1109;
		final int var5 = anInt1107;
		int var3 = -1;

		for (int var4 = var1; var4 < var5; ++var4)
			var3 = (var3 >>> 8) ^ anIntArray1108[(var3 ^ var2[var4]) & 255];

		var3 = ~var3;
		method585(var3);
		return var3;
	}

	public String method638() {
		final int var1 = anInt1107;

		while (aByteArray1109[++anInt1107 - 1] != 0)
			;

		final int var2 = anInt1107 - var1 - 1;
		return var2 == 0 ? "" : Class83.method361(aByteArray1109, var1, var2);
	}

	public Class131_Sub14(final int var1) {
		aByteArray1109 = Class61.method296(var1);
		anInt1107 = 0;
	}

	public int method639() {
		anInt1107 += 2;
		int var1 = ((aByteArray1109[anInt1107 - 1] & 255) << 8) + (aByteArray1109[anInt1107 - 2] & 255);
		if (var1 > 32767)
			var1 -= 65536;

		return var1;
	}

	public void method640(final int var1) {
		aByteArray1109[anInt1107 - var1 - 4] = (byte) (var1 >> 24);
		aByteArray1109[anInt1107 - var1 - 3] = (byte) (var1 >> 16);
		aByteArray1109[anInt1107 - var1 - 2] = (byte) (var1 >> 8);
		aByteArray1109[anInt1107 - var1 - 1] = (byte) var1;
	}

	public int method641() {
		anInt1107 += 2;
		return ((aByteArray1109[anInt1107 - 2] - 128) & 255) + ((aByteArray1109[anInt1107 - 1] & 255) << 8);
	}

	public int method642() {
		anInt1107 += 4;
		return (aByteArray1109[anInt1107 - 1] & 255) + 
				((aByteArray1109[anInt1107 - 3] & 255) << 16) + 
				((aByteArray1109[anInt1107 - 4] & 255) << 24) + 
				((aByteArray1109[anInt1107 - 2] & 255) << 8);
	}

	public int method643() {
		return aByteArray1109[anInt1107] < 0 ? method642() & Integer.MAX_VALUE : readUShort();
	}

	public int method644() {
		anInt1107 += 4;
		return (aByteArray1109[anInt1107 - 3] & 255) + ((aByteArray1109[anInt1107 - 2] & 255) << 24)
				+ ((aByteArray1109[anInt1107 - 1] & 255) << 16) + ((aByteArray1109[anInt1107 - 4] & 255) << 8);
	}
}
