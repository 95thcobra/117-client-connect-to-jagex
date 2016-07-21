public class Class36 {
	public static Class21 aClass21_368;
	String aString369;
	public static int[] anIntArray370;
	public static Class78 aClass78_371;
	String aString372;

	static final int method205(final int var0, final int var1) {
		final int var2 = Class38.method211(var0 - 1, var1 - 1) + Class38.method211(1 + var0, var1 - 1)
				+ Class38.method211(var0 - 1, 1 + var1) + Class38.method211(1 + var0, var1 + 1);
		final int var3 = Class38.method211(var0 - 1, var1) + Class38.method211(var0 + 1, var1)
				+ Class38.method211(var0, var1 - 1) + Class38.method211(var0, var1 + 1);
		final int var4 = Class38.method211(var0, var1);
		return (var2 / 16) + (var3 / 8) + (var4 / 4);
	}

	static void method206(final Class131_Sub20_Sub19_Sub2_Sub2 var0, final int var1, final int var2) {
		if ((var1 == var0.anInt1703) && (var1 != -1)) {
			final int var3 = Class131_Sub20_Sub19_Sub2_Sub1.method1066(var1).anInt1369;
			if (var3 == 1) {
				var0.anInt1733 = 0;
				var0.anInt1734 = 0;
				var0.anInt1735 = var2;
				var0.anInt1736 = 0;
			}

			if (var3 == 2)
				var0.anInt1736 = 0;
		} else if ((var1 == -1) || (var0.anInt1703 == -1) || (Class131_Sub20_Sub19_Sub2_Sub1
				.method1066(var1).anInt1363 >= Class131_Sub20_Sub19_Sub2_Sub1.method1066(var0.anInt1703).anInt1363)) {
			var0.anInt1703 = var1;
			var0.anInt1733 = 0;
			var0.anInt1734 = 0;
			var0.anInt1735 = var2;
			var0.anInt1736 = 0;
			var0.anInt1758 = var0.anInt1754;
		}

	}

	public static void method207(final Class100 var0) {
		Class131_Sub20_Sub10.aClass100_1554 = var0;
	}

	static final void method208(final Class131_Sub14_Sub1 var0) {
		var0.bitAccess();
		final int var3 = client.anInt2148;
		final Class131_Sub20_Sub19_Sub2_Sub2 var4 = Class131_Sub11.aClass131_Sub20_Sub19_Sub2_Sub2_1073 = client.aClass131_Sub20_Sub19_Sub2_Sub2Array2039[var3] = new Class131_Sub20_Sub19_Sub2_Sub2();
		var4.anInt1981 = var3;
		final int var6 = var0.readBits(30);
		final byte var9 = (byte) (var6 >> 28);
		final int var7 = (var6 >> 14) & 16383;
		final int var5 = var6 & 16383;
		var4.anIntArray1755[0] = var7 - Class131_Sub20_Sub20.anInt1649;
		var4.anInt1718 = (var4.anIntArray1755[0] << 7) + (var4.method1069() << 6);
		var4.anIntArray1756[0] = var5 - Class50.anInt491;
		var4.anInt1759 = (var4.anIntArray1756[0] << 7) + (var4.method1069() << 6);
		var4.anInt1979 = var9 * 1840261741;
		Class39.anInt410 = var9;
		if (GPI.aClass131_Sub14Array13[var3] != null)
			var4.method1068(GPI.aClass131_Sub14Array13[var3]);

		GPI.localPlayers = 0;
		GPI.anIntArray17[++GPI.localPlayers - 1] = var3;
		GPI.skipFlags[var3] = 0;
		GPI.otherPlayers = 0;

		for (int var8 = 1; var8 < 2048; ++var8)
			if (var3 != var8) {
				final int var1 = var0.readBits(18);
				final int var10 = var1 >> 16;
				final int var11 = (var1 >> 8) & 255;
				final int var2 = var1 & 255;
				GPI.anIntArray18[var8] = var2 + (var11 << 14) + (var10 << 28);
				GPI.anIntArray19[var8] = 0;
				GPI.anIntArray20[var8] = -1;
				GPI.anIntArray24[++GPI.otherPlayers - 1] = var8;
				GPI.skipFlags[var8] = 0;
			}

		var0.byteAccess();
	}

	public static void method209() {
		Class135.aClass128_906 = new Class128();
	}
}
