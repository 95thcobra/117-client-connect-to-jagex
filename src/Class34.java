import java.io.IOException;
import java.math.BigInteger;
import java.net.Socket;
import java.util.Iterator;

public class Class34 {
	static BigInteger aBigInteger358 = new BigInteger("10001", 16);
	static BigInteger aBigInteger359 = new BigInteger(
			"a145f32cc0061a676331cfa6dc1dc8dc300a3a08b42ed2dca3a70104aefc6fb3c9a84caf6c8e2dea05d8c06aa2ea1e8661aedc32fc071021e85711c7730a6d06b80dc1dd7f6143f927bfa204e8965820d2a736dc1fb5fa8092061636b247b34223f707ee55a25bb247cc3312a5724268f3997318e28c009159c5838077b54849",
			16);

	static final void method196(final String var0) {
		if (null != var0) {
			final String var2 = Class85.method371(var0, client.aClass142_2031);
			if (var2 != null)
				for (int var3 = 0; var3 < client.anInt2290; ++var3) {
					final Class44 var6 = client.aClass44Array2292[var3];
					final String var4 = var6.aString442;
					final String var5 = Class85.method371(var4, client.aClass142_2031);
					if (Class1.method14(var0, var2, var4, var5)) {
						--client.anInt2290;

						for (int var1 = var3; var1 < client.anInt2290; ++var1)
							client.aClass44Array2292[var1] = client.aClass44Array2292[var1 + 1];

						client.anInt2216 = client.anInt2298;
						client.aClass131_Sub14_Sub1_2070.method871(53);
						client.aClass131_Sub14_Sub1_2070.method636(Class131_Sub6.method554(var0));
						client.aClass131_Sub14_Sub1_2070.method589(var0);
						break;
					}
				}
		}
	}

	static Class30 method197() {
		Class30.anInt275 = 0;
		Class30 var0;
		if (Class30.anInt275 < Class30.anInt274)
			var0 = Class30.aClass30Array273[++Class30.anInt275 - 1];
		else
			var0 = null;

		return var0;
	}

	static final void method198() {
		for (Class131_Sub20_Sub19_Sub4 var0 = (Class131_Sub20_Sub19_Sub4) client.aClass115_2284
				.method465(); null != var0; var0 = (Class131_Sub20_Sub19_Sub4) client.aClass115_2284.method468())
			if ((var0.anInt1797 == Class39.anInt410) && (client.anInt2038 <= var0.anInt1803)) {
				if (client.anInt2038 >= var0.anInt1802) {
					if (var0.anInt1806 > 0) {
						final Class131_Sub20_Sub19_Sub2_Sub1 var2 = client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065[var0.anInt1806
								- 1];
						if ((var2 != null) && (var2.anInt1718 >= 0) && (var2.anInt1718 < 13312) && (var2.anInt1759 >= 0)
								&& (var2.anInt1759 < 13312))
							var0.method954(var2.anInt1718, var2.anInt1759,
									Class18.method88(var2.anInt1718, var2.anInt1759, var0.anInt1797) - var0.anInt1801,
									client.anInt2038);
					}

					if (var0.anInt1806 < 0) {
						final int var1 = -var0.anInt1806 - 1;
						Class131_Sub20_Sub19_Sub2_Sub2 var3;
						if (client.anInt2148 == var1)
							var3 = Class131_Sub11.aClass131_Sub20_Sub19_Sub2_Sub2_1073;
						else
							var3 = client.aClass131_Sub20_Sub19_Sub2_Sub2Array2039[var1];

						if ((var3 != null) && (var3.anInt1718 >= 0) && (var3.anInt1718 < 13312) && (var3.anInt1759 >= 0)
								&& (var3.anInt1759 < 13312))
							var0.method954(var3.anInt1718, var3.anInt1759,
									Class18.method88(var3.anInt1718, var3.anInt1759, var0.anInt1797) - var0.anInt1801,
									client.anInt2038);
					}

					var0.method956(client.anInt2103);
					Class65.aClass33_595.method155(Class39.anInt410, (int) var0.aDouble1808, (int) var0.aDouble1809,
							(int) var0.aDouble1810, 60, var0, var0.anInt1816, -1, false);
				}
			} else
				var0.method501();

	}

	static final void method199() {
		try {
			if (client.anInt2115 == 0) {
				if (null != Class131_Sub20_Sub20.aClass86_1654) {
					Class131_Sub20_Sub20.aClass86_1654.method373();
					Class131_Sub20_Sub20.aClass86_1654 = null;
				}

				Class107.aClass87_811 = null;
				client.aBool2098 = false;
				client.anInt2079 = 0;
				client.anInt2115 = 1;
			}

			if (client.anInt2115 == 1) {
				if (null == Class107.aClass87_811)
					Class107.aClass87_811 = Class36.aClass78_371.method347(Class131_Sub7.aString1027,
							Class131_Sub11.anInt1072);

				if (Class107.aClass87_811.anInt714 == 2)
					throw new IOException();

				if (Class107.aClass87_811.anInt714 == 1) {
					Class131_Sub20_Sub20.aClass86_1654 = new Class86((Socket) Class107.aClass87_811.anObject716,
							Class36.aClass78_371);
					Class107.aClass87_811 = null;
					client.anInt2115 = 2;
				}
			}

			if (client.anInt2115 == 2) {
				client.aClass131_Sub14_Sub1_2070.anInt1107 = 0;
				client.aClass131_Sub14_Sub1_2070.method636(14);
				Class131_Sub20_Sub20.aClass86_1654.method375(client.aClass131_Sub14_Sub1_2070.aByteArray1109, 0, 1);
				client.aClass131_Sub14_Sub1_2072.anInt1107 = 0;
				client.anInt2115 = 3;
			}

			int var0;
			if (client.anInt2115 == 3) {
				if (null != Class131_Sub20_Sub6.aClass17_1480)
					Class131_Sub20_Sub6.aClass17_1480.method66();

				if (Class131_Sub20_Sub19_Sub4.aClass17_1817 != null)
					Class131_Sub20_Sub19_Sub4.aClass17_1817.method66();

				var0 = Class131_Sub20_Sub20.aClass86_1654.method374();
				if (null != Class131_Sub20_Sub6.aClass17_1480)
					Class131_Sub20_Sub6.aClass17_1480.method66();

				if (null != Class131_Sub20_Sub19_Sub4.aClass17_1817)
					Class131_Sub20_Sub19_Sub4.aClass17_1817.method66();

				if (var0 != 0) {
					Class131_Sub20_Sub13.method783(var0);
					return;
				}

				client.aClass131_Sub14_Sub1_2072.anInt1107 = 0;
				client.anInt2115 = 5;
			}

			int var2;
			int var3;
			if (client.anInt2115 == 5) {
				final int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D),
						(int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D),
						(int) (Math.random() * 9.9999999E7D) };
				client.aClass131_Sub14_Sub1_2070.anInt1107 = 0;
				client.aClass131_Sub14_Sub1_2070.method636(1);
				client.aClass131_Sub14_Sub1_2070.method636(Class4.aClass97_38.method11((byte) -20));
				client.aClass131_Sub14_Sub1_2070.method585(var1[0]);
				client.aClass131_Sub14_Sub1_2070.method585(var1[1]);
				client.aClass131_Sub14_Sub1_2070.method585(var1[2]);
				client.aClass131_Sub14_Sub1_2070.method585(var1[3]);
				switch (Class4.aClass97_38.anInt770) {
				case 0:
				case 3:
					client.aClass131_Sub14_Sub1_2070.method587(Class63.anInt582);
					client.aClass131_Sub14_Sub1_2070.anInt1107 += 5;
					break;
				case 1:
					client.aClass131_Sub14_Sub1_2070.anInt1107 += 8;
					break;
				case 2:
					client.aClass131_Sub14_Sub1_2070.method585(((Integer) Class50.aClass28_494.aLinkedHashMap257
							.get(Integer.valueOf(Class97.method397(Class4.aString40)))).intValue());
					client.aClass131_Sub14_Sub1_2070.anInt1107 += 4;
				}

				client.aClass131_Sub14_Sub1_2070.method589(Class4.aString47);
				client.aClass131_Sub14_Sub1_2070.method610(aBigInteger358, aBigInteger359);
				client.aClass131_Sub14_Sub1_2187.anInt1107 = 0;
				if (client.anInt2036 == 40)
					client.aClass131_Sub14_Sub1_2187.method636(18);
				else
					client.aClass131_Sub14_Sub1_2187.method636(16);

				client.aClass131_Sub14_Sub1_2187.method586(0);
				var2 = client.aClass131_Sub14_Sub1_2187.anInt1107;
				client.aClass131_Sub14_Sub1_2187.method585(117);
				client.aClass131_Sub14_Sub1_2187.method623(client.aClass131_Sub14_Sub1_2070.aByteArray1109, 0,
						client.aClass131_Sub14_Sub1_2070.anInt1107);
				var3 = client.aClass131_Sub14_Sub1_2187.anInt1107;
				client.aClass131_Sub14_Sub1_2187.method589(Class4.aString40);
				client.aClass131_Sub14_Sub1_2187
						.method636(((client.aBool2237 ? 1 : 0) << 1) | (client.aBool2033 ? 1 : 0));
				client.aClass131_Sub14_Sub1_2187.method586(Class2.anInt7);
				client.aClass131_Sub14_Sub1_2187.method586(Class88.anInt723);
				final Class131_Sub14_Sub1 var4 = client.aClass131_Sub14_Sub1_2187;
				final byte[] var5 = new byte[24];

				int var6;
				try {
					Class72.aClass140_617.method510(0L);
					Class72.aClass140_617.method511(var5);

					for (var6 = 0; (var6 < 24) && (var5[var6] == 0); ++var6)
						;

					if (var6 >= 24)
						throw new IOException();
				} catch (final Exception var12) {
					for (int var8 = 0; var8 < 24; ++var8)
						var5[var8] = -1;
				}

				var4.method623(var5, 0, 24);
				client.aClass131_Sub14_Sub1_2187.method589(client.aString2150);
				client.aClass131_Sub14_Sub1_2187.method585(Class39.anInt412);
				final Class131_Sub14 var18 = new Class131_Sub14(Class131_Sub20_Sub4.aClass131_Sub19_1442.method674());
				Class131_Sub20_Sub4.aClass131_Sub19_1442.method675(var18);
				client.aClass131_Sub14_Sub1_2187.method623(var18.aByteArray1109, 0, var18.aByteArray1109.length);
				client.aClass131_Sub14_Sub1_2187.method636(Class131_Sub20_Sub14.anInt1594);
				client.aClass131_Sub14_Sub1_2187.method585(Class71.aClass100_Sub1_612.anInt789);
				client.aClass131_Sub14_Sub1_2187.method585(Class84.aClass100_Sub1_696.anInt789);
				client.aClass131_Sub14_Sub1_2187.method585(Class32.aClass100_Sub1_297.anInt789);
				client.aClass131_Sub14_Sub1_2187.method585(Class28.aClass100_Sub1_254.anInt789);
				client.aClass131_Sub14_Sub1_2187.method585(Class78.aClass100_Sub1_648.anInt789);
				client.aClass131_Sub14_Sub1_2187.method585(Class29.aClass100_Sub1_268.anInt789);
				client.aClass131_Sub14_Sub1_2187.method585(Class44.aClass100_Sub1_446.anInt789);
				client.aClass131_Sub14_Sub1_2187.method585(Class60.aClass100_Sub1_571.anInt789);
				client.aClass131_Sub14_Sub1_2187.method585(Class51.aClass100_Sub1_502.anInt789);
				client.aClass131_Sub14_Sub1_2187.method585(Class126_Sub1.aClass100_Sub1_953.anInt789);
				client.aClass131_Sub14_Sub1_2187.method585(Class131_Sub20_Sub19_Sub1.aClass100_Sub1_1701.anInt789);
				client.aClass131_Sub14_Sub1_2187.method585(Class82.aClass100_Sub1_686.anInt789);
				client.aClass131_Sub14_Sub1_2187.method585(Class44.aClass100_Sub1_443.anInt789);
				client.aClass131_Sub14_Sub1_2187.method585(Class131_Sub4_Sub4.aClass100_Sub1_1689.anInt789);
				client.aClass131_Sub14_Sub1_2187.method585(Applet_Sub1.aClass100_Sub1_2023.anInt789);
				client.aClass131_Sub14_Sub1_2187.method585(Class4.aClass100_Sub1_55.anInt789);
				client.aClass131_Sub14_Sub1_2187.method588(var1, var3, client.aClass131_Sub14_Sub1_2187.anInt1107);
				client.aClass131_Sub14_Sub1_2187.method592(client.aClass131_Sub14_Sub1_2187.anInt1107 - var2);
				Class131_Sub20_Sub20.aClass86_1654.method375(client.aClass131_Sub14_Sub1_2187.aByteArray1109, 0,
						client.aClass131_Sub14_Sub1_2187.anInt1107);
				client.aClass131_Sub14_Sub1_2070.method870(var1);

				for (var6 = 0; var6 < 4; ++var6)
					var1[var6] += 50;

				client.aClass131_Sub14_Sub1_2072.method870(var1);
				client.anInt2115 = 6;
			}

			if ((client.anInt2115 == 6) && (Class131_Sub20_Sub20.aClass86_1654.method372() > 0)) {
				var0 = Class131_Sub20_Sub20.aClass86_1654.method374();
				if ((var0 == 21) && (client.anInt2036 == 20))
					client.anInt2115 = 7;
				else if (var0 == 2)
					client.anInt2115 = 9;
				else if ((var0 == 15) && (client.anInt2036 == 40)) {
					client.anInt2156 = -1;
					client.anInt2115 = 13;
				} else if ((var0 == 23) && (client.anInt2063 < 1)) {
					++client.anInt2063;
					client.anInt2115 = 0;
				} else {
					if (var0 != 29) {
						Class131_Sub20_Sub13.method783(var0);
						return;
					}

					client.anInt2115 = 11;
				}
			}

			if ((client.anInt2115 == 7) && (Class131_Sub20_Sub20.aClass86_1654.method372() > 0)) {
				client.anInt2064 = (Class131_Sub20_Sub20.aClass86_1654.method374() + 3) * 60;
				client.anInt2115 = 8;
			}

			if (client.anInt2115 == 8) {
				client.anInt2079 = 0;
				Class64.method306("You have only just left another world.", "Your profile will be transferred in:",
						(client.anInt2064 / 60) + " seconds.");
				if (--client.anInt2064 <= 0)
					client.anInt2115 = 0;

			} else {
				if ((client.anInt2115 == 9) && (Class131_Sub20_Sub20.aClass86_1654.method372() >= 13)) {
					final boolean var14 = Class131_Sub20_Sub20.aClass86_1654.method374() == 1;
					Class131_Sub20_Sub20.aClass86_1654.method376(client.aClass131_Sub14_Sub1_2072.aByteArray1109, 0, 4);
					client.aClass131_Sub14_Sub1_2072.anInt1107 = 0;
					if (var14) {
						var2 = client.aClass131_Sub14_Sub1_2072.readOpcode() << 24;
						var2 |= client.aClass131_Sub14_Sub1_2072.readOpcode() << 16;
						var2 |= client.aClass131_Sub14_Sub1_2072.readOpcode() << 8;
						var2 |= client.aClass131_Sub14_Sub1_2072.readOpcode();
						var3 = Class97.method397(Class4.aString40);
						if ((Class50.aClass28_494.aLinkedHashMap257.size() >= 10)
								&& !Class50.aClass28_494.aLinkedHashMap257.containsKey(Integer.valueOf(var3))) {
							final Iterator var17 = Class50.aClass28_494.aLinkedHashMap257.entrySet().iterator();
							var17.next();
							var17.remove();
						}

						Class50.aClass28_494.aLinkedHashMap257.put(Integer.valueOf(var3), Integer.valueOf(var2));
						Class24.method115();
					}

					client.anInt2190 = Class131_Sub20_Sub20.aClass86_1654.method374();
					client.aBool2192 = Class131_Sub20_Sub20.aClass86_1654.method374() == 1;
					client.anInt2148 = Class131_Sub20_Sub20.aClass86_1654.method374();
					client.anInt2148 <<= 8;
					client.anInt2148 += Class131_Sub20_Sub20.aClass86_1654.method374();
					client.anInt2149 = Class131_Sub20_Sub20.aClass86_1654.method374();
					Class131_Sub20_Sub20.aClass86_1654.method376(client.aClass131_Sub14_Sub1_2072.aByteArray1109, 0, 1);
					client.aClass131_Sub14_Sub1_2072.anInt1107 = 0;
					client.incomingPacket = client.aClass131_Sub14_Sub1_2072.readOpcode();
					Class131_Sub20_Sub20.aClass86_1654.method376(client.aClass131_Sub14_Sub1_2072.aByteArray1109, 0, 2);
					client.aClass131_Sub14_Sub1_2072.anInt1107 = 0;
					client.anInt2156 = client.aClass131_Sub14_Sub1_2072.readUShort();

					try {
						Class76.method342(client.aclient2265, "zap");
					} catch (final Throwable var11) {
						;
					}

					client.anInt2115 = 10;
				}

				if (client.anInt2115 == 10) {
					if (Class131_Sub20_Sub20.aClass86_1654.method372() >= client.anInt2156) {
						client.aClass131_Sub14_Sub1_2072.anInt1107 = 0;
						Class131_Sub20_Sub20.aClass86_1654.method376(client.aClass131_Sub14_Sub1_2072.aByteArray1109, 0,
								client.anInt2156);
						Class67.method317();
						Class36.method208(client.aClass131_Sub14_Sub1_2072);
						Class105.anInt808 = -1;
						GPI.drawMapRegion(false);
						client.incomingPacket = -1;
					}

				} else {
					if ((client.anInt2115 == 11) && (Class131_Sub20_Sub20.aClass86_1654.method372() >= 2)) {
						client.aClass131_Sub14_Sub1_2072.anInt1107 = 0;
						Class131_Sub20_Sub20.aClass86_1654.method376(client.aClass131_Sub14_Sub1_2072.aByteArray1109, 0,
								2);
						client.aClass131_Sub14_Sub1_2072.anInt1107 = 0;
						Class58.anInt565 = client.aClass131_Sub14_Sub1_2072.readUShort();
						client.anInt2115 = 12;
					}

					if ((client.anInt2115 == 12)
							&& (Class131_Sub20_Sub20.aClass86_1654.method372() >= Class58.anInt565)) {
						client.aClass131_Sub14_Sub1_2072.anInt1107 = 0;
						Class131_Sub20_Sub20.aClass86_1654.method376(client.aClass131_Sub14_Sub1_2072.aByteArray1109, 0,
								Class58.anInt565);
						client.aClass131_Sub14_Sub1_2072.anInt1107 = 0;
						final String var15 = client.aClass131_Sub14_Sub1_2072.method638();
						final String var10 = client.aClass131_Sub14_Sub1_2072.method638();
						final String var9 = client.aClass131_Sub14_Sub1_2072.method638();
						Class64.method306(var15, var10, var9);
						Class32.method142(10);
					}

					if (client.anInt2115 != 13) {
						++client.anInt2079;
						if (client.anInt2079 > 2000)
							if (client.anInt2063 < 1) {
								if (Class140.anInt929 == Class131_Sub11.anInt1072)
									Class131_Sub11.anInt1072 = Class49.anInt478;
								else
									Class131_Sub11.anInt1072 = Class140.anInt929;

								++client.anInt2063;
								client.anInt2115 = 0;
							} else
								Class131_Sub20_Sub13.method783(-3);
					} else {
						if (client.anInt2156 == -1) {
							if (Class131_Sub20_Sub20.aClass86_1654.method372() < 2)
								return;

							Class131_Sub20_Sub20.aClass86_1654
									.method376(client.aClass131_Sub14_Sub1_2072.aByteArray1109, 0, 2);
							client.aClass131_Sub14_Sub1_2072.anInt1107 = 0;
							client.anInt2156 = client.aClass131_Sub14_Sub1_2072.readUShort();
						}

						if (Class131_Sub20_Sub20.aClass86_1654.method372() >= client.anInt2156) {
							Class131_Sub20_Sub20.aClass86_1654
									.method376(client.aClass131_Sub14_Sub1_2072.aByteArray1109, 0, client.anInt2156);
							client.aClass131_Sub14_Sub1_2072.anInt1107 = 0;
							var0 = client.anInt2156;
							client.aClass131_Sub14_Sub1_2070.anInt1107 = 0;
							client.aClass131_Sub14_Sub1_2072.anInt1107 = 0;
							client.incomingPacket = -1;
							client.anInt2041 = 1;
							client.anInt2219 = -1;
							client.anInt2154 = -1;
							client.anInt2156 = 0;
							client.anInt2075 = 0;
							client.anInt2046 = 0;
							client.anInt2166 = 0;
							client.aBool2047 = false;
							client.anInt2259 = 0;
							client.anInt2218 = 0;

							for (var2 = 0; var2 < 2048; ++var2)
								client.aClass131_Sub20_Sub19_Sub2_Sub2Array2039[var2] = null;

							Class131_Sub11.aClass131_Sub20_Sub19_Sub2_Sub2_1073 = null;

							for (var2 = 0; var2 < client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065.length; ++var2) {
								final Class131_Sub20_Sub19_Sub2_Sub1 var19 = client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065[var2];
								if (var19 != null) {
									var19.anInt1726 = -1;
									var19.aBool1727 = false;
								}
							}

							Class131_Sub11.aClass114_1074 = new Class114(32);
							Class32.method142(30);

							for (var2 = 0; var2 < 100; ++var2)
								client.aBoolArray2252[var2] = true;

							client.aClass131_Sub14_Sub1_2070.method871(81);
							final Class131_Sub14_Sub1 var20 = client.aClass131_Sub14_Sub1_2070;
							var3 = client.aBool2237 ? 2 : 1;
							var20.method636(var3);
							client.aClass131_Sub14_Sub1_2070.method586(Class2.anInt7);
							client.aClass131_Sub14_Sub1_2070.method586(Class88.anInt723);
							Class36.method208(client.aClass131_Sub14_Sub1_2072);
							if (client.aClass131_Sub14_Sub1_2072.anInt1107 != var0)
								throw new RuntimeException();
						}
					}
				}
			}
		} catch (final IOException var13) {
			if (client.anInt2063 < 1) {
				if (Class140.anInt929 == Class131_Sub11.anInt1072)
					Class131_Sub11.anInt1072 = Class49.anInt478;
				else
					Class131_Sub11.anInt1072 = Class140.anInt929;

				++client.anInt2063;
				client.anInt2115 = 0;
			} else
				Class131_Sub20_Sub13.method783(-2);
		}
	}

	static Class131_Sub20_Sub17_Sub3[] method200() {
		final Class131_Sub20_Sub17_Sub3[] var0 = new Class131_Sub20_Sub17_Sub3[Class13.anInt116];

		for (int var2 = 0; var2 < Class13.anInt116; ++var2) {
			final Class131_Sub20_Sub17_Sub3 var1 = var0[var2] = new Class131_Sub20_Sub17_Sub3();
			var1.anInt1826 = Class13.anInt113;
			var1.anInt1828 = Class13.anInt115;
			var1.anInt1824 = Class13.anIntArray114[var2];
			var1.anInt1825 = Class131_Sub20_Sub15.anIntArray1605[var2];
			var1.anInt1822 = Class131_Sub20_Sub19_Sub3.anIntArray1766[var2];
			var1.anInt1827 = Class4.anIntArray54[var2];
			final int var4 = var1.anInt1827 * var1.anInt1822;
			final byte[] var5 = Class13.aByteArrayArray117[var2];
			var1.anIntArray1823 = new int[var4];

			for (int var3 = 0; var3 < var4; ++var3)
				var1.anIntArray1823[var3] = Class36.anIntArray370[var5[var3] & 255];
		}

		Class5.method28();
		return var0;
	}
}
