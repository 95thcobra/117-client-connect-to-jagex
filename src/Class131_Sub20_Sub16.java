public class Class131_Sub20_Sub16 extends Class131_Sub20 {
	static int anInt1625;
	Class43[] aClass43Array1626;

	static final void method840(final Class131_Sub14_Sub1 var0, final int var1,
			final Class131_Sub20_Sub19_Sub2_Sub2 var2, final int var3) {
		byte var4 = -1;
		int var5;
		if ((var3 & 32) != 0) {
			System.out.println("FLAG: 32");
			var5 = var0.method595();
			final byte[] var6 = new byte[var5];
			final Class131_Sub14 var7 = new Class131_Sub14(var6);
			var0.method604(var6, 0, var5);
			GPI.aClass131_Sub14Array13[var1] = var7;
			var2.method1068(var7);
		}

		int var10;
		if ((var3 & 128) != 0) {
			System.out.println("FLAG: 128");
			var5 = var0.readUShort();
			if (var5 == '\uffff')
				var5 = -1;

			var10 = var0.method595();
			Class36.method206(var2, var5, var10);
		}

		if ((var3 & 2) != 0) {
			System.out.println("FLAG: 2");
			var2.anInt1726 = var0.readUShort();
			if (var2.anInt1726 == '\uffff')
				var2.anInt1726 = -1;
		}

		if ((var3 & 4) != 0) {
			System.out.println("FLAG: 4");
			var2.aString1705 = var0.method638();
			if (var2.aString1705.charAt(0) == 126) {
				var2.aString1705 = var2.aString1705.substring(1);
				Class131_Sub20_Sub15.method792(2, var2.aString2004, var2.aString1705);
			} else if (Class131_Sub11.aClass131_Sub20_Sub19_Sub2_Sub2_1073 == var2)
				Class131_Sub20_Sub15.method792(2, var2.aString2004, var2.aString1705);

			var2.aBool1716 = false;
			var2.anInt1732 = 0;
			var2.anInt1757 = 0;
			var2.anInt1761 = 150;
		}

		if ((var3 & 16) != 0) {
			System.out.println("FLAG: 16");
			var5 = var0.readUShort();
			var10 = var0.method595();
			var2.method926(var5, var10, client.anInt2038);
			var2.anInt1723 = client.anInt2038 + 300;
			var2.anInt1741 = var0.method595();
			var2.anInt1715 = var0.method595();
		}

		if ((var3 & 64) != 0) {
			System.out.println("FLAG: 64");
			var2.anInt1728 = var0.readUShort();
			if (var2.anInt1754 == 0) {
				var2.anInt1751 = var2.anInt1728;
				var2.anInt1728 = -1;
			}
		}

		if ((var3 & 1) != 0) {
			System.out.println("FLAG: 1");
			var5 = var0.readUShort();
			final Class82 var17 = (Class82) Class39.method214(Class42.method221(), var0.method595());
			final boolean var11 = var0.method595() == 1;
			final int var12 = var0.method595();
			final int var16 = var0.anInt1107;
			if ((var2.aString2004 != null) && (var2.aClass91_1980 != null)) {
				boolean var13 = false;
				if (var17.aBool691 && Class131_Sub20_Sub19_Sub2_Sub2.method1075(var2.aString2004))
					var13 = true;

				if (!var13 && (client.anInt2146 == 0) && !var2.aBool1990) {
					GPI.aClass131_Sub14_14.anInt1107 = 0;
					var0.method604(GPI.aClass131_Sub14_14.aByteArray1109, 0, var12);
					GPI.aClass131_Sub14_14.anInt1107 = 0;
					final Class131_Sub14 var8 = GPI.aClass131_Sub14_14;
					final String var9 = Class95.method395(var8, 32767);
					final String var15 = Class131_Sub20_Sub17_Sub4.method1054(Class131_Sub11.method575(var9));
					var2.aString1705 = var15.trim();
					var2.anInt1732 = var5 >> 8;
					var2.anInt1757 = var5 & 255;
					var2.anInt1761 = 150;
					var2.aBool1716 = var11;
					var2.aBool1717 = (Class131_Sub11.aClass131_Sub20_Sub19_Sub2_Sub2_1073 != var2) && var17.aBool691
							&& ("" != client.aString2243) && (var15.toLowerCase().indexOf(client.aString2243) == -1);
					int var14;
					if (var17.aBool690)
						var14 = var11 ? 91 : 1;
					else
						var14 = var11 ? 90 : 2;

					if (var17.anInt689 != -1)
						Class131_Sub20_Sub15.method792(var14,
								Class60.method291(var17.anInt689, (byte) -32) + var2.aString2004, var15);
					else
						Class131_Sub20_Sub15.method792(var14, var2.aString2004, var15);
				}
			}

			var0.anInt1107 = var12 + var16;
		}

		if ((var3 & 8192) != 0) {
			System.out.println("FLAG: 8192");
			var2.anInt1737 = var0.readUShort();
			var5 = var0.method642();
			var2.anInt1722 = var5 >> 16;
			var2.anInt1740 = client.anInt2038 + (var5 & '\uffff');
			var2.anInt1702 = 0;
			var2.anInt1739 = 0;
			if (var2.anInt1740 > client.anInt2038)
				var2.anInt1702 = -1;

			if (var2.anInt1737 == '\uffff')
				var2.anInt1737 = -1;
		}

		if ((var3 & 1024) != 0) {
			System.out.println("FLAG: 1024");
			var2.anInt1742 = var0.method584();
			var2.anInt1744 = var0.method584();
			var2.anInt1719 = var0.method584();
			var2.anInt1724 = var0.method584();
			var2.anInt1704 = var0.readUShort() + client.anInt2038;
			var2.anInt1746 = var0.readUShort() + client.anInt2038;
			var2.anInt1730 = var0.readUShort();
			if (var2.aBool2002) {
				var2.anInt1742 += var2.anInt2003;
				var2.anInt1744 += var2.anInt1999;
				var2.anInt1719 += var2.anInt2003;
				var2.anInt1724 += var2.anInt1999;
				var2.anInt1754 = 0;
			} else {
				var2.anInt1742 += var2.anIntArray1755[0];
				var2.anInt1744 += var2.anIntArray1756[0];
				var2.anInt1719 += var2.anIntArray1755[0];
				var2.anInt1724 += var2.anIntArray1756[0];
				var2.anInt1754 = 1;
			}

			var2.anInt1758 = 0;
		}

		if ((var3 & 2048) != 0) {
			System.out.println("FLAG: 2048");
			var5 = var0.readUShort();
			var10 = var0.method595();
			var2.method926(var5, var10, client.anInt2038);
			var2.anInt1723 = 300 + client.anInt2038;
			var2.anInt1741 = var0.method595();
			var2.anInt1715 = var0.method595();
		}

		if ((var3 & 256) != 0){
			System.out.println("FLAG: 256");
			GPI.aByteArray22[var1] = var0.method584();
		}
		if ((var3 & 512) != 0){
			System.out.println("FLAG: 512");
			var4 = var0.method584();
		}
		
		if ((var3 & 4096) != 0){
			System.out.println("FLAG: 4096");
			for (var5 = 0; var5 < 3; ++var5)
				var2.aStringArray1983[var5] = var0.method638();
		}
		if (var2.aBool2002)
			if (var4 == 127)
				var2.method1073(var2.anInt2003, var2.anInt1999);
			else {
				byte var18;
				if (var4 != -1)
					var18 = var4;
				else
					var18 = GPI.aByteArray22[var1];

				var2.method1070(var2.anInt2003, var2.anInt1999, var18);
			}

	}

	public Class131_Sub20_Sub16(final Class100 var1, final Class100 var2, final int var3, final boolean var4) {
		final Class115 var9 = new Class115();
		final int var8 = var1.method417(var3);
		aClass43Array1626 = new Class43[var8];
		final int[] var10 = var1.method420(var3);

		for (int var11 = 0; var11 < var10.length; ++var11) {
			final byte[] var12 = var1.method402(var3, var10[var11]);
			Class131_Sub5 var7 = null;
			final int var5 = ((var12[0] & 255) << 8) | (var12[1] & 255);

			for (Class131_Sub5 var13 = (Class131_Sub5) var9.method465(); null != var13; var13 = (Class131_Sub5) var9
					.method468())
				if (var13.anInt1005 == var5) {
					var7 = var13;
					break;
				}

			if (var7 == null) {
				final byte[] var6 = var2.method409(var5, 0);
				var7 = new Class131_Sub5(var5, var6);
				var9.method471(var7);
			}

			aClass43Array1626[var10[var11]] = new Class43(var12, var7);
		}

	}

	public boolean method841(final int var1) {
		return aClass43Array1626[var1].aBool436;
	}
}
