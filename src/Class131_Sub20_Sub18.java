import java.awt.Component;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Class131_Sub20_Sub18 extends Class131_Sub20 {
	int anInt1634;
	int[] anIntArray1635;
	int[] anIntArray1636;
	static int anInt1637;
	int anInt1638;
	int anInt1639;
	int anInt1640;
	String[] aStringArray1642;
	static Class121 aClass121_1641 = new Class121(128);

	public static boolean method864(final File var0, final boolean var1) {
		try {
			final RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
			final int var3 = var2.read();
			var2.seek(0L);
			var2.write(var3);
			var2.seek(0L);
			var2.close();
			if (var1)
				var0.delete();

			return true;
		} catch (final Exception var4) {
			return false;
		}
	}

	public static void method865(final Component var0) {
		var0.setFocusTraversalKeysEnabled(false);
		var0.addKeyListener(Class80.aClass80_655);
		var0.addFocusListener(Class80.aClass80_655);
	}

	static void method866(final Class131_Sub14_Sub1 var0, final int var1, BufferedWriter... bw1) throws IOException {
		
		
		int requiresFlagbasedupdating = var0.readBits(1);
		
		final boolean updateFlags = requiresFlagbasedupdating == 1; // indicates whether player requires flag based updating after it is done being updated
		if (updateFlags)
			GPI.anIntArray23[++GPI.anInt21 - 1] = var1;

		final int typeOfUpdate = var0.readBits(2); // Type of update, 0=remove, 1=walk, 2=run, 3=tele, less than 15 tiles 12,more 30 
		final Class131_Sub20_Sub19_Sub2_Sub2 var4 = client.aClass131_Sub20_Sub19_Sub2_Sub2Array2039[var1];
		
		if (bw1.length > 0) {
			bw1[0].write("Flag based updating [1,"+requiresFlagbasedupdating+"]\n");
			bw1[0].write("Type of update: [2,"+typeOfUpdate+"]\n");
		}
		
		// Remove from locallist.
		if (typeOfUpdate == 0) {
			if (updateFlags)
				var4.aBool2002 = false;
			else if (client.anInt2148 == var1)
				throw new RuntimeException();
			else {
				GPI.anIntArray18[var1] = ((var4.anIntArray1756[0] + Class50.anInt491) >> 6) + (var4.anInt1979 << 28)
						+ (((Class131_Sub20_Sub20.anInt1649 + var4.anIntArray1755[0]) >> 6) << 14);
				if (var4.anInt1728 != -1)
					GPI.anIntArray19[var1] = var4.anInt1728;
				else
					GPI.anIntArray19[var1] = var4.anInt1751;

				GPI.anIntArray20[var1] = var4.anInt1726;
				client.aClass131_Sub20_Sub19_Sub2_Sub2Array2039[var1] = null;
				if (var0.readBits(1) != 0)
					Class61.method297(var0, var1);

			}
		} else {
			int var5;
			int var8;
			int var10;
			if (typeOfUpdate == 1) {
				var5 = var0.readBits(3);
				var8 = var4.anIntArray1755[0];
				var10 = var4.anIntArray1756[0];
				if (var5 == 0) {
					--var8;
					--var10;
				} else if (var5 == 1)
					--var10;
				else if (var5 == 2) {
					++var8;
					--var10;
				} else if (var5 == 3)
					--var8;
				else if (var5 == 4)
					++var8;
				else if (var5 == 5) {
					--var8;
					++var10;
				} else if (var5 == 6)
					++var10;
				else if (var5 == 7) {
					++var8;
					++var10;
				}

				if ((var1 == client.anInt2148) && ((var4.anInt1718 < 1536) || (var4.anInt1759 < 1536)
						|| (var4.anInt1718 >= 11776) || (var4.anInt1759 >= 11776))) {
					var4.method1073(var8, var10);
					var4.aBool2002 = false;
				} else if (updateFlags) {
					var4.aBool2002 = true;
					var4.anInt2003 = var8;
					var4.anInt1999 = var10;
				} else {
					var4.aBool2002 = false;
					var4.method1070(var8, var10, GPI.aByteArray22[var1]);
				}

			} else if (typeOfUpdate == 2) {
				var5 = var0.readBits(4);
				var8 = var4.anIntArray1755[0];
				var10 = var4.anIntArray1756[0];
				if (var5 == 0) {
					var8 -= 2;
					var10 -= 2;
				} else if (var5 == 1) {
					--var8;
					var10 -= 2;
				} else if (var5 == 2)
					var10 -= 2;
				else if (var5 == 3) {
					++var8;
					var10 -= 2;
				} else if (var5 == 4) {
					var8 += 2;
					var10 -= 2;
				} else if (var5 == 5) {
					var8 -= 2;
					--var10;
				} else if (var5 == 6) {
					var8 += 2;
					--var10;
				} else if (var5 == 7)
					var8 -= 2;
				else if (var5 == 8)
					var8 += 2;
				else if (var5 == 9) {
					var8 -= 2;
					++var10;
				} else if (var5 == 10) {
					var8 += 2;
					++var10;
				} else if (var5 == 11) {
					var8 -= 2;
					var10 += 2;
				} else if (var5 == 12) {
					--var8;
					var10 += 2;
				} else if (var5 == 13)
					var10 += 2;
				else if (var5 == 14) {
					++var8;
					var10 += 2;
				} else if (var5 == 15) {
					var8 += 2;
					var10 += 2;
				}

				if ((var1 != client.anInt2148) || ((var4.anInt1718 >= 1536) && (var4.anInt1759 >= 1536)
						&& (var4.anInt1718 < 11776) && (var4.anInt1759 < 11776))) {
					if (updateFlags) {
						var4.aBool2002 = true;
						var4.anInt2003 = var8;
						var4.anInt1999 = var10;
					} else {
						var4.aBool2002 = false;
						var4.method1070(var8, var10, GPI.aByteArray22[var1]);
					}
				} else {
					var4.method1073(var8, var10);
					var4.aBool2002 = false;
				}

			} else {
				var5 = var0.readBits(1);
				int var6;
				int var7;
				int var9;
				int var11;
				if (var5 == 0) {
					var8 = var0.readBits(12);
					var10 = var8 >> 10;
					var11 = (var8 >> 5) & 31;
					if (var11 > 15)
						var11 -= 32;

					var6 = var8 & 31;
					if (var6 > 15)
						var6 -= 32;

					var9 = var4.anIntArray1755[0] + var11;
					var7 = var4.anIntArray1756[0] + var6;
					if ((var1 == client.anInt2148) && ((var4.anInt1718 < 1536) || (var4.anInt1759 < 1536)
							|| (var4.anInt1718 >= 11776) || (var4.anInt1759 >= 11776))) {
						var4.method1073(var9, var7);
						var4.aBool2002 = false;
					} else if (updateFlags) {
						var4.aBool2002 = true;
						var4.anInt2003 = var9;
						var4.anInt1999 = var7;
					} else {
						var4.aBool2002 = false;
						var4.method1070(var9, var7, GPI.aByteArray22[var1]);
					}

					var4.anInt1979 = (byte) ((var10 + var4.anInt1979) & 3);
					if (var1 == client.anInt2148)
						Class39.anInt410 = var4.anInt1979;

				} else {
					var8 = var0.readBits(30);
					var10 = var8 >> 28;
					var11 = (var8 >> 14) & 16383;
					var6 = var8 & 16383;
					var9 = ((var11 + var4.anIntArray1755[0] + Class131_Sub20_Sub20.anInt1649) & 16383)
							- Class131_Sub20_Sub20.anInt1649;
					var7 = ((var4.anIntArray1756[0] + Class50.anInt491 + var6) & 16383) - Class50.anInt491;
					if ((var1 == client.anInt2148) && ((var4.anInt1718 < 1536) || (var4.anInt1759 < 1536)
							|| (var4.anInt1718 >= 11776) || (var4.anInt1759 >= 11776))) {
						var4.method1073(var9, var7);
						var4.aBool2002 = false;
					} else if (updateFlags) {
						var4.aBool2002 = true;
						var4.anInt2003 = var9;
						var4.anInt1999 = var7;
					} else {
						var4.aBool2002 = false;
						var4.method1070(var9, var7, GPI.aByteArray22[var1]);
					}

					var4.anInt1979 = (byte) ((var4.anInt1979 + var10) & 3);
					if (client.anInt2148 == var1)
						Class39.anInt410 = var4.anInt1979;

				}
			}
		}
	}
}
