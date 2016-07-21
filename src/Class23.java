public class Class23 {
	static int anInt210;
	int anInt208;
	int anInt207;
	int anInt211;
	int anInt209;

	Class23() {
	}

	Class23(final Class23 var1) {
		anInt208 = var1.anInt208;
		anInt207 = var1.anInt207;
		anInt211 = var1.anInt211;
		anInt209 = var1.anInt209;
	}

	static void method107(final int var0, final int var1, final int var2, final int var3, final String var4) {
		final Class131_Sub18 var5 = Class131_Sub20_Sub20.method880(var1, var2);
		if (var5 != null) {
			if (null != var5.anObjectArray1262) {
				final Class131_Sub10 var6 = new Class131_Sub10();
				var6.aClass131_Sub18_1057 = var5;
				var6.anInt1058 = var0;
				var6.aString1065 = var4;
				var6.anObjectArray1056 = var5.anObjectArray1262;
				Class4.method24(var6, 200000);
			}

			boolean var7 = true;
			if (var5.anInt1162 > 0)
				var7 = Class32.method141(var5);

			if (var7)
				if (Class100.method424(Class49.method254(var5), var0 - 1, -2081835178)) {
					if (var0 == 1) {
						client.aClass131_Sub14_Sub1_2070.method871(121);
						client.aClass131_Sub14_Sub1_2070.method585(var1);
						client.aClass131_Sub14_Sub1_2070.method586(var2);
						client.aClass131_Sub14_Sub1_2070.method586(var3);
					}

					if (var0 == 2) {
						client.aClass131_Sub14_Sub1_2070.method871(5);
						client.aClass131_Sub14_Sub1_2070.method585(var1);
						client.aClass131_Sub14_Sub1_2070.method586(var2);
						client.aClass131_Sub14_Sub1_2070.method586(var3);
					}

					if (var0 == 3) {
						client.aClass131_Sub14_Sub1_2070.method871(175);
						client.aClass131_Sub14_Sub1_2070.method585(var1);
						client.aClass131_Sub14_Sub1_2070.method586(var2);
						client.aClass131_Sub14_Sub1_2070.method586(var3);
					}

					if (var0 == 4) {
						client.aClass131_Sub14_Sub1_2070.method871(23);
						client.aClass131_Sub14_Sub1_2070.method585(var1);
						client.aClass131_Sub14_Sub1_2070.method586(var2);
						client.aClass131_Sub14_Sub1_2070.method586(var3);
					}

					if (var0 == 5) {
						client.aClass131_Sub14_Sub1_2070.method871(42);
						client.aClass131_Sub14_Sub1_2070.method585(var1);
						client.aClass131_Sub14_Sub1_2070.method586(var2);
						client.aClass131_Sub14_Sub1_2070.method586(var3);
					}

					if (var0 == 6) {
						client.aClass131_Sub14_Sub1_2070.method871(202);
						client.aClass131_Sub14_Sub1_2070.method585(var1);
						client.aClass131_Sub14_Sub1_2070.method586(var2);
						client.aClass131_Sub14_Sub1_2070.method586(var3);
					}

					if (var0 == 7) {
						client.aClass131_Sub14_Sub1_2070.method871(69);
						client.aClass131_Sub14_Sub1_2070.method585(var1);
						client.aClass131_Sub14_Sub1_2070.method586(var2);
						client.aClass131_Sub14_Sub1_2070.method586(var3);
					}

					if (var0 == 8) {
						client.aClass131_Sub14_Sub1_2070.method871(174);
						client.aClass131_Sub14_Sub1_2070.method585(var1);
						client.aClass131_Sub14_Sub1_2070.method586(var2);
						client.aClass131_Sub14_Sub1_2070.method586(var3);
					}

					if (var0 == 9) {
						client.aClass131_Sub14_Sub1_2070.method871(210);
						client.aClass131_Sub14_Sub1_2070.method585(var1);
						client.aClass131_Sub14_Sub1_2070.method586(var2);
						client.aClass131_Sub14_Sub1_2070.method586(var3);
					}

					if (var0 == 10) {
						client.aClass131_Sub14_Sub1_2070.method871(192);
						client.aClass131_Sub14_Sub1_2070.method585(var1);
						client.aClass131_Sub14_Sub1_2070.method586(var2);
						client.aClass131_Sub14_Sub1_2070.method586(var3);
					}

				}
		}
	}

	public static void method108(final Class100 var0, final int var1, final int var2, final int var3,
			final boolean var4) {
		Class113.anInt830 = 1;
		Class50.aClass100_495 = var0;
		Class24.anInt213 = var1;
		Class130.anInt901 = var2;
		Class113.anInt833 = var3;
		Class50.aBool496 = var4;
		Class113.anInt834 = 10000;
	}

	static final String method109(final int var0) {
		String var1 = Integer.toString(var0);

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3)
			var1 = var1.substring(0, var2) + "," + var1.substring(var2);

		return var1.length() > 9
				? " " + Class103.method427('\uff80') + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1
						+ ")" + "</col>"
				: (var1.length() > 6 ? " " + Class103.method427(16777215) + var1.substring(0, var1.length() - 4) + "K"
						+ " " + " (" + var1 + ")" + "</col>" : " " + Class103.method427(16776960) + var1 + "</col>");
	}
}
