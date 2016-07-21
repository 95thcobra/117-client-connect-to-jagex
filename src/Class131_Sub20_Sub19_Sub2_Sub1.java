public final class Class131_Sub20_Sub19_Sub2_Sub1 extends Class131_Sub20_Sub19_Sub2 {
	Class131_Sub20_Sub6 aClass131_Sub20_Sub6_1978;

	final void method1061(final int var1, final int var2, final boolean var3) {
		if ((anInt1703 != -1) && (method1066(anInt1703).anInt1351 == 1))
			anInt1703 = -1;

		if (!var3) {
			final int var4 = var1 - anIntArray1755[0];
			final int var6 = var2 - anIntArray1756[0];
			if ((var4 >= -8) && (var4 <= 8) && (var6 >= -8) && (var6 <= 8)) {
				if (anInt1754 < 9)
					++anInt1754;

				for (int var5 = anInt1754; var5 > 0; --var5) {
					anIntArray1755[var5] = anIntArray1755[var5 - 1];
					anIntArray1756[var5] = anIntArray1756[var5 - 1];
					aByteArray1709[var5] = aByteArray1709[var5 - 1];
				}

				anIntArray1755[0] = var1;
				anIntArray1756[0] = var2;
				aByteArray1709[0] = 1;
				return;
			}
		}

		anInt1754 = 0;
		anInt1758 = 0;
		anInt1745 = 0;
		anIntArray1755[0] = var1;
		anIntArray1756[0] = var2;
		anInt1718 = (anInt1706 * 64) + (anIntArray1755[0] * 128);
		anInt1759 = (anIntArray1756[0] * 128) + (anInt1706 * 64);
	}

	@Override
	protected final Class131_Sub20_Sub19_Sub7 method868(final short var1) {
		if (aClass131_Sub20_Sub6_1978 == null)
			return null;
		else {
			final Class131_Sub20_Sub1 var4 = (anInt1703 != -1) && (anInt1735 == 0) ? method1066(anInt1703) : null;
			final Class131_Sub20_Sub1 var5 = (anInt1729 != -1) && ((anInt1729 != anInt1707) || (null == var4))
					? method1066(anInt1729) : null;
			Class131_Sub20_Sub19_Sub7 var3 = aClass131_Sub20_Sub6_1978.method729(var4, anInt1733, var5, anInt1748);
			if (var3 == null)
				return null;
			else {
				var3.method1015();
				anInt1750 = var3.anInt1643;
				if ((anInt1737 != -1) && (anInt1702 != -1)) {
					final Class131_Sub20_Sub19_Sub7 var2 = Class46.method235(anInt1737).method786(anInt1702);
					if (null != var2) {
						var2.method1020(0, -anInt1722, 0);
						final Class131_Sub20_Sub19_Sub7[] var6 = new Class131_Sub20_Sub19_Sub7[] { var3, var2 };
						var3 = new Class131_Sub20_Sub19_Sub7(var6, 2);
					}
				}

				if (aClass131_Sub20_Sub6_1978.anInt1465 == 1)
					var3.aBool1912 = true;

				return var3;
			}
		}
	}

	@Override
	final boolean method920(final int var1) {
		return aClass131_Sub20_Sub6_1978 != null;
	}

	final void method1062(final int var1, final byte var2) {
		int var3 = anIntArray1755[0];
		int var4 = anIntArray1756[0];
		if (var1 == 0) {
			--var3;
			++var4;
		}

		if (var1 == 1)
			++var4;

		if (var1 == 2) {
			++var3;
			++var4;
		}

		if (var1 == 3)
			--var3;

		if (var1 == 4)
			++var3;

		if (var1 == 5) {
			--var3;
			--var4;
		}

		if (var1 == 6)
			--var4;

		if (var1 == 7) {
			++var3;
			--var4;
		}

		if ((anInt1703 != -1) && (method1066(anInt1703).anInt1351 == 1))
			anInt1703 = -1;

		if (anInt1754 < 9)
			++anInt1754;

		for (int var5 = anInt1754; var5 > 0; --var5) {
			anIntArray1755[var5] = anIntArray1755[var5 - 1];
			anIntArray1756[var5] = anIntArray1756[var5 - 1];
			aByteArray1709[var5] = aByteArray1709[var5 - 1];
		}

		anIntArray1755[0] = var3;
		anIntArray1756[0] = var4;
		aByteArray1709[0] = var2;
	}

	static final void method1063(final int var0, final int var1, int var2, final int var3, final String var4,
			final String var5, final int var6, final int var7) {
		if (var2 >= 2000)
			var2 -= 2000;

		if (var2 == 43) {
			client.aClass131_Sub14_Sub1_2070.method871(204);
			client.aClass131_Sub14_Sub1_2070.method620(var3);
			client.aClass131_Sub14_Sub1_2070.method619(var0);
			client.aClass131_Sub14_Sub1_2070.method627(var1);
			client.anInt2138 = 0;
			Class21.aClass131_Sub18_194 = Class88.method377(var1);
			client.anInt2139 = var0;
		}

		if (var2 == 22) {
			client.anInt2083 = var6;
			client.anInt2135 = var7;
			client.anInt2131 = 2;
			client.anInt2247 = 0;
			client.anInt2218 = var0;
			client.anInt2258 = var1;
			client.aClass131_Sub14_Sub1_2070.method871(71);
			client.aClass131_Sub14_Sub1_2070.method619(var1 + Class50.anInt491);
			client.aClass131_Sub14_Sub1_2070.method636(Class80.aBoolArray652[82] ? 1 : 0);
			client.aClass131_Sub14_Sub1_2070.method586(var3);
			client.aClass131_Sub14_Sub1_2070.method619(var0 + Class131_Sub20_Sub20.anInt1649);
		}

		if (var2 == 17) {
			client.anInt2083 = var6;
			client.anInt2135 = var7;
			client.anInt2131 = 2;
			client.anInt2247 = 0;
			client.anInt2218 = var0;
			client.anInt2258 = var1;
			client.aClass131_Sub14_Sub1_2070.method871(54);
			client.aClass131_Sub14_Sub1_2070.method619(Class50.anInt491 + var1);
			client.aClass131_Sub14_Sub1_2070.method627(Class44.anInt441);
			client.aClass131_Sub14_Sub1_2070.method620(var0 + Class131_Sub20_Sub20.anInt1649);
			client.aClass131_Sub14_Sub1_2070.method591(Class80.aBoolArray652[82] ? 1 : 0);
			client.aClass131_Sub14_Sub1_2070.method619(client.anInt2179);
			client.aClass131_Sub14_Sub1_2070.method620(var3);
		}

		if (var2 == 40) {
			client.aClass131_Sub14_Sub1_2070.method871(77);
			client.aClass131_Sub14_Sub1_2070.method619(var0);
			client.aClass131_Sub14_Sub1_2070.method626(var1);
			client.aClass131_Sub14_Sub1_2070.method618(var3);
			client.anInt2138 = 0;
			Class21.aClass131_Sub18_194 = Class88.method377(var1);
			client.anInt2139 = var0;
		}

		Class131_Sub20_Sub19_Sub2_Sub1 var8;
		if (var2 == 13) {
			var8 = client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065[var3];
			if (var8 != null) {
				client.anInt2083 = var6;
				client.anInt2135 = var7;
				client.anInt2131 = 2;
				client.anInt2247 = 0;
				client.anInt2218 = var0;
				client.anInt2258 = var1;
				client.aClass131_Sub14_Sub1_2070.method871(59);
				client.aClass131_Sub14_Sub1_2070.method591(Class80.aBoolArray652[82] ? 1 : 0);
				client.aClass131_Sub14_Sub1_2070.method619(var3);
			}
		}

		Class131_Sub20_Sub19_Sub2_Sub2 var17;
		if (var2 == 50) {
			var17 = client.aClass131_Sub20_Sub19_Sub2_Sub2Array2039[var3];
			if (var17 != null) {
				client.anInt2083 = var6;
				client.anInt2135 = var7;
				client.anInt2131 = 2;
				client.anInt2247 = 0;
				client.anInt2218 = var0;
				client.anInt2258 = var1;
				client.aClass131_Sub14_Sub1_2070.method871(8);
				client.aClass131_Sub14_Sub1_2070.method620(var3);
				client.aClass131_Sub14_Sub1_2070.method613(Class80.aBoolArray652[82] ? 1 : 0);
			}
		}

		if (var2 == 8) {
			var8 = client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065[var3];
			if (null != var8) {
				client.anInt2083 = var6;
				client.anInt2135 = var7;
				client.anInt2131 = 2;
				client.anInt2247 = 0;
				client.anInt2218 = var0;
				client.anInt2258 = var1;
				client.aClass131_Sub14_Sub1_2070.method871(119);
				client.aClass131_Sub14_Sub1_2070.method585(Class44.anInt441);
				client.aClass131_Sub14_Sub1_2070.method619(client.anInt2179);
				client.aClass131_Sub14_Sub1_2070.method618(var3);
				client.aClass131_Sub14_Sub1_2070.method613(Class80.aBoolArray652[82] ? 1 : 0);
			}
		}

		if (var2 == 32) {
			client.aClass131_Sub14_Sub1_2070.method871(137);
			client.aClass131_Sub14_Sub1_2070.method618(client.anInt2179);
			client.aClass131_Sub14_Sub1_2070.method619(var3);
			client.aClass131_Sub14_Sub1_2070.method619(var0);
			client.aClass131_Sub14_Sub1_2070.method585(Class44.anInt441);
			client.aClass131_Sub14_Sub1_2070.method585(var1);
			client.anInt2138 = 0;
			Class21.aClass131_Sub18_194 = Class88.method377(var1);
			client.anInt2139 = var0;
		}

		if (var2 == 51) {
			var17 = client.aClass131_Sub20_Sub19_Sub2_Sub2Array2039[var3];
			if (null != var17) {
				client.anInt2083 = var6;
				client.anInt2135 = var7;
				client.anInt2131 = 2;
				client.anInt2247 = 0;
				client.anInt2218 = var0;
				client.anInt2258 = var1;
				client.aClass131_Sub14_Sub1_2070.method871(158);
				client.aClass131_Sub14_Sub1_2070.method618(var3);
				client.aClass131_Sub14_Sub1_2070.method591(Class80.aBoolArray652[82] ? 1 : 0);
			}
		}

		if (var2 == 16) {
			client.anInt2083 = var6;
			client.anInt2135 = var7;
			client.anInt2131 = 2;
			client.anInt2247 = 0;
			client.anInt2218 = var0;
			client.anInt2258 = var1;
			client.aClass131_Sub14_Sub1_2070.method871(28);
			client.aClass131_Sub14_Sub1_2070.method586(Class131_Sub12.anInt1099);
			client.aClass131_Sub14_Sub1_2070.method591(Class80.aBoolArray652[82] ? 1 : 0);
			client.aClass131_Sub14_Sub1_2070.method586(Class50.anInt491 + var1);
			client.aClass131_Sub14_Sub1_2070.method620(var0 + Class131_Sub20_Sub20.anInt1649);
			client.aClass131_Sub14_Sub1_2070.method586(Class131_Sub20_Sub1.anInt1370);
			client.aClass131_Sub14_Sub1_2070.method620(var3);
			client.aClass131_Sub14_Sub1_2070.method585(PacketDecoder.anInt544);
		}

		if (var2 == 35) {
			client.aClass131_Sub14_Sub1_2070.method871(80);
			client.aClass131_Sub14_Sub1_2070.method625(var1);
			client.aClass131_Sub14_Sub1_2070.method618(var3);
			client.aClass131_Sub14_Sub1_2070.method620(var0);
			client.anInt2138 = 0;
			Class21.aClass131_Sub18_194 = Class88.method377(var1);
			client.anInt2139 = var0;
		}

		if (var2 == 20) {
			client.anInt2083 = var6;
			client.anInt2135 = var7;
			client.anInt2131 = 2;
			client.anInt2247 = 0;
			client.anInt2218 = var0;
			client.anInt2258 = var1;
			client.aClass131_Sub14_Sub1_2070.method871(244);
			client.aClass131_Sub14_Sub1_2070.method620(var1 + Class50.anInt491);
			client.aClass131_Sub14_Sub1_2070.method618(Class131_Sub20_Sub20.anInt1649 + var0);
			client.aClass131_Sub14_Sub1_2070.method591(Class80.aBoolArray652[82] ? 1 : 0);
			client.aClass131_Sub14_Sub1_2070.method619(var3);
		}

		if (var2 == 46) {
			var17 = client.aClass131_Sub20_Sub19_Sub2_Sub2Array2039[var3];
			if (var17 != null) {
				client.anInt2083 = var6;
				client.anInt2135 = var7;
				client.anInt2131 = 2;
				client.anInt2247 = 0;
				client.anInt2218 = var0;
				client.anInt2258 = var1;
				client.aClass131_Sub14_Sub1_2070.method871(188);
				client.aClass131_Sub14_Sub1_2070.method613(Class80.aBoolArray652[82] ? 1 : 0);
				client.aClass131_Sub14_Sub1_2070.method619(var3);
			}
		}

		if (var2 == 19) {
			client.anInt2083 = var6;
			client.anInt2135 = var7;
			client.anInt2131 = 2;
			client.anInt2247 = 0;
			client.anInt2218 = var0;
			client.anInt2258 = var1;
			client.aClass131_Sub14_Sub1_2070.method871(229);
			client.aClass131_Sub14_Sub1_2070.method586(var0 + Class131_Sub20_Sub20.anInt1649);
			client.aClass131_Sub14_Sub1_2070.method619(var3);
			client.aClass131_Sub14_Sub1_2070.method636(Class80.aBoolArray652[82] ? 1 : 0);
			client.aClass131_Sub14_Sub1_2070.method618(Class50.anInt491 + var1);
		}

		if (var2 == 4) {
			client.anInt2083 = var6;
			client.anInt2135 = var7;
			client.anInt2131 = 2;
			client.anInt2247 = 0;
			client.anInt2218 = var0;
			client.anInt2258 = var1;
			client.aClass131_Sub14_Sub1_2070.method871(108);
			client.aClass131_Sub14_Sub1_2070.method618(var1 + Class50.anInt491);
			client.aClass131_Sub14_Sub1_2070.method618((var3 >> 14) & 32767);
			client.aClass131_Sub14_Sub1_2070.method620(Class131_Sub20_Sub20.anInt1649 + var0);
			client.aClass131_Sub14_Sub1_2070.method636(Class80.aBoolArray652[82] ? 1 : 0);
		}

		if (var2 == 9) {
			var8 = client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065[var3];
			if (var8 != null) {
				client.anInt2083 = var6;
				client.anInt2135 = var7;
				client.anInt2131 = 2;
				client.anInt2247 = 0;
				client.anInt2218 = var0;
				client.anInt2258 = var1;
				client.aClass131_Sub14_Sub1_2070.method871(181);
				client.aClass131_Sub14_Sub1_2070.method636(Class80.aBoolArray652[82] ? 1 : 0);
				client.aClass131_Sub14_Sub1_2070.method619(var3);
			}
		}

		if ((var2 == 30) && (null == client.aClass131_Sub18_2049)) {
			Class1.method18(var1, var0);
			client.aClass131_Sub18_2049 = Class131_Sub20_Sub20.method880(var1, var0);
			Class131_Sub20_Sub6.method734(client.aClass131_Sub18_2049);
		}

		Class131_Sub18 var19;
		if (var2 == 58) {
			var19 = Class131_Sub20_Sub20.method880(var1, var0);
			if (var19 != null) {
				client.aClass131_Sub14_Sub1_2070.method871(84);
				client.aClass131_Sub14_Sub1_2070.method620(client.anInt2179);
				client.aClass131_Sub14_Sub1_2070.method620(var19.anInt1168);
				client.aClass131_Sub14_Sub1_2070.method625(Class44.anInt441);
				client.aClass131_Sub14_Sub1_2070.method618(client.anInt2206);
				client.aClass131_Sub14_Sub1_2070.method620(var0);
				client.aClass131_Sub14_Sub1_2070.method626(var1);
			}
		}

		if (var2 == 7) {
			var8 = client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065[var3];
			if (null != var8) {
				client.anInt2083 = var6;
				client.anInt2135 = var7;
				client.anInt2131 = 2;
				client.anInt2247 = 0;
				client.anInt2218 = var0;
				client.anInt2258 = var1;
				client.aClass131_Sub14_Sub1_2070.method871(179);
				client.aClass131_Sub14_Sub1_2070.method626(PacketDecoder.anInt544);
				client.aClass131_Sub14_Sub1_2070.method618(Class131_Sub12.anInt1099);
				client.aClass131_Sub14_Sub1_2070.method612(Class80.aBoolArray652[82] ? 1 : 0);
				client.aClass131_Sub14_Sub1_2070.method618(var3);
				client.aClass131_Sub14_Sub1_2070.method618(Class131_Sub20_Sub1.anInt1370);
			}
		}

		if (var2 == 37) {
			client.aClass131_Sub14_Sub1_2070.method871(27);
			client.aClass131_Sub14_Sub1_2070.method625(var1);
			client.aClass131_Sub14_Sub1_2070.method618(var3);
			client.aClass131_Sub14_Sub1_2070.method618(var0);
			client.anInt2138 = 0;
			Class21.aClass131_Sub18_194 = Class88.method377(var1);
			client.anInt2139 = var0;
		}

		if (var2 == 25) {
			var19 = Class131_Sub20_Sub20.method880(var1, var0);
			if (null != var19) {
				Class131_Sub20_Sub19_Sub5.method986();
				final int var12 = Class49.method254(var19);
				final int var13 = (var12 >> 11) & 63;
				Class40.method218(var1, var0, var13, var19.anInt1168);
				client.anInt2090 = 0;
				final int var10 = Class49.method254(var19);
				final int var16 = (var10 >> 11) & 63;
				String var14;
				if (var16 == 0)
					var14 = null;
				else if ((var19.aString1199 != null) && (var19.aString1199.trim().length() != 0))
					var14 = var19.aString1199;
				else
					var14 = null;

				client.aString2181 = var14;
				if (null == client.aString2181)
					client.aString2181 = "Null";

				if (var19.aBool1263)
					client.aString2182 = var19.aString1237 + Class103.method427(16777215);
				else
					client.aString2182 = Class103.method427('\uff00') + var19.aString1273
							+ Class103.method427(16777215);
			}

		} else {
			if (var2 == 14) {
				var17 = client.aClass131_Sub20_Sub19_Sub2_Sub2Array2039[var3];
				if (null != var17) {
					client.anInt2083 = var6;
					client.anInt2135 = var7;
					client.anInt2131 = 2;
					client.anInt2247 = 0;
					client.anInt2218 = var0;
					client.anInt2258 = var1;
					client.aClass131_Sub14_Sub1_2070.method871(142);
					client.aClass131_Sub14_Sub1_2070.method619(Class131_Sub20_Sub1.anInt1370);
					client.aClass131_Sub14_Sub1_2070.method585(PacketDecoder.anInt544);
					client.aClass131_Sub14_Sub1_2070.method620(Class131_Sub12.anInt1099);
					client.aClass131_Sub14_Sub1_2070.method620(var3);
					client.aClass131_Sub14_Sub1_2070.method591(Class80.aBoolArray652[82] ? 1 : 0);
				}
			}

			if (var2 == 23)
				Class65.aClass33_595.method194(Class39.anInt410, var0, var1);

			if (var2 == 1004) {
				client.anInt2083 = var6;
				client.anInt2135 = var7;
				client.anInt2131 = 2;
				client.anInt2247 = 0;
				client.aClass131_Sub14_Sub1_2070.method871(133);
				client.aClass131_Sub14_Sub1_2070.method618(var3);
			}

			if (var2 == 47) {
				var17 = client.aClass131_Sub20_Sub19_Sub2_Sub2Array2039[var3];
				if (var17 != null) {
					client.anInt2083 = var6;
					client.anInt2135 = var7;
					client.anInt2131 = 2;
					client.anInt2247 = 0;
					client.anInt2218 = var0;
					client.anInt2258 = var1;
					client.aClass131_Sub14_Sub1_2070.method871(221);
					client.aClass131_Sub14_Sub1_2070.method591(Class80.aBoolArray652[82] ? 1 : 0);
					client.aClass131_Sub14_Sub1_2070.method620(var3);
				}
			}

			if (var2 == 10) {
				var8 = client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065[var3];
				if (var8 != null) {
					client.anInt2083 = var6;
					client.anInt2135 = var7;
					client.anInt2131 = 2;
					client.anInt2247 = 0;
					client.anInt2218 = var0;
					client.anInt2258 = var1;
					client.aClass131_Sub14_Sub1_2070.method871(226);
					client.aClass131_Sub14_Sub1_2070.method618(var3);
					client.aClass131_Sub14_Sub1_2070.method636(Class80.aBoolArray652[82] ? 1 : 0);
				}
			}

			if (var2 == 49) {
				var17 = client.aClass131_Sub20_Sub19_Sub2_Sub2Array2039[var3];
				if (var17 != null) {
					client.anInt2083 = var6;
					client.anInt2135 = var7;
					client.anInt2131 = 2;
					client.anInt2247 = 0;
					client.anInt2218 = var0;
					client.anInt2258 = var1;
					client.aClass131_Sub14_Sub1_2070.method871(91);
					client.aClass131_Sub14_Sub1_2070.method620(var3);
					client.aClass131_Sub14_Sub1_2070.method612(Class80.aBoolArray652[82] ? 1 : 0);
				}
			}

			if (var2 == 11) {
				var8 = client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065[var3];
				if (null != var8) {
					client.anInt2083 = var6;
					client.anInt2135 = var7;
					client.anInt2131 = 2;
					client.anInt2247 = 0;
					client.anInt2218 = var0;
					client.anInt2258 = var1;
					client.aClass131_Sub14_Sub1_2070.method871(155);
					client.aClass131_Sub14_Sub1_2070.method612(Class80.aBoolArray652[82] ? 1 : 0);
					client.aClass131_Sub14_Sub1_2070.method586(var3);
				}
			}

			if (var2 == 21) {
				client.anInt2083 = var6;
				client.anInt2135 = var7;
				client.anInt2131 = 2;
				client.anInt2247 = 0;
				client.anInt2218 = var0;
				client.anInt2258 = var1;
				client.aClass131_Sub14_Sub1_2070.method871(140);
				client.aClass131_Sub14_Sub1_2070.method620(Class50.anInt491 + var1);
				client.aClass131_Sub14_Sub1_2070.method618(var3);
				client.aClass131_Sub14_Sub1_2070.method619(var0 + Class131_Sub20_Sub20.anInt1649);
				client.aClass131_Sub14_Sub1_2070.method636(Class80.aBoolArray652[82] ? 1 : 0);
			}

			if (var2 == 48) {
				var17 = client.aClass131_Sub20_Sub19_Sub2_Sub2Array2039[var3];
				if (null != var17) {
					client.anInt2083 = var6;
					client.anInt2135 = var7;
					client.anInt2131 = 2;
					client.anInt2247 = 0;
					client.anInt2218 = var0;
					client.anInt2258 = var1;
					client.aClass131_Sub14_Sub1_2070.method871(233);
					client.aClass131_Sub14_Sub1_2070.method619(var3);
					client.aClass131_Sub14_Sub1_2070.method591(Class80.aBoolArray652[82] ? 1 : 0);
				}
			}

			if (var2 == 31) {
				client.aClass131_Sub14_Sub1_2070.method871(196);
				client.aClass131_Sub14_Sub1_2070.method627(var1);
				client.aClass131_Sub14_Sub1_2070.method626(PacketDecoder.anInt544);
				client.aClass131_Sub14_Sub1_2070.method586(Class131_Sub12.anInt1099);
				client.aClass131_Sub14_Sub1_2070.method586(var3);
				client.aClass131_Sub14_Sub1_2070.method620(Class131_Sub20_Sub1.anInt1370);
				client.aClass131_Sub14_Sub1_2070.method619(var0);
				client.anInt2138 = 0;
				Class21.aClass131_Sub18_194 = Class88.method377(var1);
				client.anInt2139 = var0;
			}

			if ((var2 == 57) || (var2 == 1007)) {
				var19 = Class131_Sub20_Sub20.method880(var1, var0);
				if (var19 != null)
					Class23.method107(var3, var1, var0, var19.anInt1168, var5);
			}

			int var9;
			if (var2 == 28) {
				client.aClass131_Sub14_Sub1_2070.method871(141);
				client.aClass131_Sub14_Sub1_2070.method585(var1);
				var19 = Class88.method377(var1);
				if ((var19.anIntArrayArray1269 != null) && (var19.anIntArrayArray1269[0][0] == 5)) {
					var9 = var19.anIntArrayArray1269[0][1];
					Class96.anIntArray766[var9] = 1 - Class96.anIntArray766[var9];
					Class24.method117(var9);
				}
			}

			if (var2 == 38) {
				Class131_Sub20_Sub19_Sub5.method986();
				var19 = Class88.method377(var1);
				client.anInt2090 = 1;
				Class131_Sub20_Sub1.anInt1370 = var0;
				PacketDecoder.anInt544 = var1;
				Class131_Sub12.anInt1099 = var3;
				Class131_Sub20_Sub6.method734(var19);
				client.aString2177 = Class103.method427(16748608)
						+ Class79_Sub1.method645(var3, (short) 13639).aString1385 + Class103.method427(16777215);
				if (client.aString2177 == null)
					client.aString2177 = "null";

			} else {
				if (var2 == 3) {
					client.anInt2083 = var6;
					client.anInt2135 = var7;
					client.anInt2131 = 2;
					client.anInt2247 = 0;
					client.anInt2218 = var0;
					client.anInt2258 = var1;
					client.aClass131_Sub14_Sub1_2070.method871(52);
					client.aClass131_Sub14_Sub1_2070.method586(Class131_Sub20_Sub20.anInt1649 + var0);
					client.aClass131_Sub14_Sub1_2070.method586((var3 >> 14) & 32767);
					client.aClass131_Sub14_Sub1_2070.method591(Class80.aBoolArray652[82] ? 1 : 0);
					client.aClass131_Sub14_Sub1_2070.method586(Class50.anInt491 + var1);
				}

				if (var2 == 41) {
					client.aClass131_Sub14_Sub1_2070.method871(139);
					client.aClass131_Sub14_Sub1_2070.method619(var0);
					client.aClass131_Sub14_Sub1_2070.method586(var3);
					client.aClass131_Sub14_Sub1_2070.method626(var1);
					client.anInt2138 = 0;
					Class21.aClass131_Sub18_194 = Class88.method377(var1);
					client.anInt2139 = var0;
				}

				if (var2 == 15) {
					var17 = client.aClass131_Sub20_Sub19_Sub2_Sub2Array2039[var3];
					if (var17 != null) {
						client.anInt2083 = var6;
						client.anInt2135 = var7;
						client.anInt2131 = 2;
						client.anInt2247 = 0;
						client.anInt2218 = var0;
						client.anInt2258 = var1;
						client.aClass131_Sub14_Sub1_2070.method871(248);
						client.aClass131_Sub14_Sub1_2070.method586(var3);
						client.aClass131_Sub14_Sub1_2070.method591(Class80.aBoolArray652[82] ? 1 : 0);
						client.aClass131_Sub14_Sub1_2070.method586(client.anInt2179);
						client.aClass131_Sub14_Sub1_2070.method585(Class44.anInt441);
					}
				}

				if (var2 == 36) {
					client.aClass131_Sub14_Sub1_2070.method871(157);
					client.aClass131_Sub14_Sub1_2070.method627(var1);
					client.aClass131_Sub14_Sub1_2070.method620(var3);
					client.aClass131_Sub14_Sub1_2070.method619(var0);
					client.anInt2138 = 0;
					Class21.aClass131_Sub18_194 = Class88.method377(var1);
					client.anInt2139 = var0;
				}

				if (var2 == 1005) {
					var19 = Class88.method377(var1);
					if ((null != var19) && (var19.anIntArray1154[var0] >= 100000))
						Class131_Sub20_Sub15.method792(27, "", var19.anIntArray1154[var0] + " x "
								+ Class79_Sub1.method645(var3, (short) 9005).aString1385);
					else {
						client.aClass131_Sub14_Sub1_2070.method871(133);
						client.aClass131_Sub14_Sub1_2070.method618(var3);
					}

					client.anInt2138 = 0;
					Class21.aClass131_Sub18_194 = Class88.method377(var1);
					client.anInt2139 = var0;
				}

				if (var2 == 1002) {
					client.anInt2083 = var6;
					client.anInt2135 = var7;
					client.anInt2131 = 2;
					client.anInt2247 = 0;
					client.aClass131_Sub14_Sub1_2070.method871(11);
					client.aClass131_Sub14_Sub1_2070.method618((var3 >> 14) & 32767);
				}

				if (var2 == 12) {
					var8 = client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065[var3];
					if (var8 != null) {
						client.anInt2083 = var6;
						client.anInt2135 = var7;
						client.anInt2131 = 2;
						client.anInt2247 = 0;
						client.anInt2218 = var0;
						client.anInt2258 = var1;
						client.aClass131_Sub14_Sub1_2070.method871(163);
						client.aClass131_Sub14_Sub1_2070.method619(var3);
						client.aClass131_Sub14_Sub1_2070.method636(Class80.aBoolArray652[82] ? 1 : 0);
					}
				}

				if (var2 == 2) {
					client.anInt2083 = var6;
					client.anInt2135 = var7;
					client.anInt2131 = 2;
					client.anInt2247 = 0;
					client.anInt2218 = var0;
					client.anInt2258 = var1;
					client.aClass131_Sub14_Sub1_2070.method871(33);
					client.aClass131_Sub14_Sub1_2070.method627(Class44.anInt441);
					client.aClass131_Sub14_Sub1_2070.method620((var3 >> 14) & 32767);
					client.aClass131_Sub14_Sub1_2070.method619(Class50.anInt491 + var1);
					client.aClass131_Sub14_Sub1_2070.method586(Class131_Sub20_Sub20.anInt1649 + var0);
					client.aClass131_Sub14_Sub1_2070.method613(Class80.aBoolArray652[82] ? 1 : 0);
					client.aClass131_Sub14_Sub1_2070.method618(client.anInt2179);
				}

				if (var2 == 5) {
					client.anInt2083 = var6;
					client.anInt2135 = var7;
					client.anInt2131 = 2;
					client.anInt2247 = 0;
					client.anInt2218 = var0;
					client.anInt2258 = var1;
					client.aClass131_Sub14_Sub1_2070.method871(186);
					client.aClass131_Sub14_Sub1_2070.method618((var3 >> 14) & 32767);
					client.aClass131_Sub14_Sub1_2070.method612(Class80.aBoolArray652[82] ? 1 : 0);
					client.aClass131_Sub14_Sub1_2070.method620(var0 + Class131_Sub20_Sub20.anInt1649);
					client.aClass131_Sub14_Sub1_2070.method586(var1 + Class50.anInt491);
				}

				if (var2 == 24) {
					var19 = Class88.method377(var1);
					boolean var18 = true;
					if (var19.anInt1162 > 0)
						var18 = Class32.method141(var19);

					if (var18) {
						client.aClass131_Sub14_Sub1_2070.method871(141);
						client.aClass131_Sub14_Sub1_2070.method585(var1);
					}
				}

				if (var2 == 34) {
					client.aClass131_Sub14_Sub1_2070.method871(224);
					client.aClass131_Sub14_Sub1_2070.method627(var1);
					client.aClass131_Sub14_Sub1_2070.method620(var0);
					client.aClass131_Sub14_Sub1_2070.method620(var3);
					client.anInt2138 = 0;
					Class21.aClass131_Sub18_194 = Class88.method377(var1);
					client.anInt2139 = var0;
				}

				if (var2 == 1001) {
					client.anInt2083 = var6;
					client.anInt2135 = var7;
					client.anInt2131 = 2;
					client.anInt2247 = 0;
					client.anInt2218 = var0;
					client.anInt2258 = var1;
					client.aClass131_Sub14_Sub1_2070.method871(85);
					client.aClass131_Sub14_Sub1_2070.method612(Class80.aBoolArray652[82] ? 1 : 0);
					client.aClass131_Sub14_Sub1_2070.method586(var1 + Class50.anInt491);
					client.aClass131_Sub14_Sub1_2070.method619(var0 + Class131_Sub20_Sub20.anInt1649);
					client.aClass131_Sub14_Sub1_2070.method620((var3 >> 14) & 32767);
				}

				if (var2 == 29) {
					client.aClass131_Sub14_Sub1_2070.method871(141);
					client.aClass131_Sub14_Sub1_2070.method585(var1);
					var19 = Class88.method377(var1);
					if ((var19.anIntArrayArray1269 != null) && (var19.anIntArrayArray1269[0][0] == 5)) {
						var9 = var19.anIntArrayArray1269[0][1];
						if (var19.anIntArray1271[0] != Class96.anIntArray766[var9]) {
							Class96.anIntArray766[var9] = var19.anIntArray1271[0];
							Class24.method117(var9);
						}
					}
				}

				if (var2 == 18) {
					client.anInt2083 = var6;
					client.anInt2135 = var7;
					client.anInt2131 = 2;
					client.anInt2247 = 0;
					client.anInt2218 = var0;
					client.anInt2258 = var1;
					client.aClass131_Sub14_Sub1_2070.method871(209);
					client.aClass131_Sub14_Sub1_2070.method619(Class50.anInt491 + var1);
					client.aClass131_Sub14_Sub1_2070.method618(Class131_Sub20_Sub20.anInt1649 + var0);
					client.aClass131_Sub14_Sub1_2070.method619(var3);
					client.aClass131_Sub14_Sub1_2070.method612(Class80.aBoolArray652[82] ? 1 : 0);
				}

				if (var2 == 39) {
					client.aClass131_Sub14_Sub1_2070.method871(230);
					client.aClass131_Sub14_Sub1_2070.method626(var1);
					client.aClass131_Sub14_Sub1_2070.method619(var0);
					client.aClass131_Sub14_Sub1_2070.method618(var3);
					client.anInt2138 = 0;
					Class21.aClass131_Sub18_194 = Class88.method377(var1);
					client.anInt2139 = var0;
				}

				if (var2 == 6) {
					client.anInt2083 = var6;
					client.anInt2135 = var7;
					client.anInt2131 = 2;
					client.anInt2247 = 0;
					client.anInt2218 = var0;
					client.anInt2258 = var1;
					client.aClass131_Sub14_Sub1_2070.method871(37);
					client.aClass131_Sub14_Sub1_2070.method620(Class131_Sub20_Sub20.anInt1649 + var0);
					client.aClass131_Sub14_Sub1_2070.method613(Class80.aBoolArray652[82] ? 1 : 0);
					client.aClass131_Sub14_Sub1_2070.method620((var3 >> 14) & 32767);
					client.aClass131_Sub14_Sub1_2070.method618(var1 + Class50.anInt491);
				}

				if (var2 == 26)
					Class47.method240();

				if (var2 == 1003) {
					client.anInt2083 = var6;
					client.anInt2135 = var7;
					client.anInt2131 = 2;
					client.anInt2247 = 0;
					var8 = client.aClass131_Sub20_Sub19_Sub2_Sub1Array2065[var3];
					if (var8 != null) {
						Class131_Sub20_Sub6 var15 = var8.aClass131_Sub20_Sub6_1978;
						if (var15.anIntArray1468 != null)
							var15 = var15.method731();

						if (var15 != null) {
							client.aClass131_Sub14_Sub1_2070.method871(249);
							client.aClass131_Sub14_Sub1_2070.method620(var15.anInt1457);
						}
					}
				}

				if (var2 == 42) {
					client.aClass131_Sub14_Sub1_2070.method871(112);
					client.aClass131_Sub14_Sub1_2070.method620(var0);
					client.aClass131_Sub14_Sub1_2070.method618(var3);
					client.aClass131_Sub14_Sub1_2070.method627(var1);
					client.anInt2138 = 0;
					Class21.aClass131_Sub18_194 = Class88.method377(var1);
					client.anInt2139 = var0;
				}

				if (var2 == 33) {
					client.aClass131_Sub14_Sub1_2070.method871(125);
					client.aClass131_Sub14_Sub1_2070.method619(var3);
					client.aClass131_Sub14_Sub1_2070.method585(var1);
					client.aClass131_Sub14_Sub1_2070.method618(var0);
					client.anInt2138 = 0;
					Class21.aClass131_Sub18_194 = Class88.method377(var1);
					client.anInt2139 = var0;
				}

				if (var2 == 1) {
					client.anInt2083 = var6;
					client.anInt2135 = var7;
					client.anInt2131 = 2;
					client.anInt2247 = 0;
					client.anInt2218 = var0;
					client.anInt2258 = var1;
					client.aClass131_Sub14_Sub1_2070.method871(250);
					client.aClass131_Sub14_Sub1_2070.method586(Class50.anInt491 + var1);
					client.aClass131_Sub14_Sub1_2070.method619(Class131_Sub20_Sub1.anInt1370);
					client.aClass131_Sub14_Sub1_2070.method619(Class131_Sub12.anInt1099);
					client.aClass131_Sub14_Sub1_2070.method619((var3 >> 14) & 32767);
					client.aClass131_Sub14_Sub1_2070.method618(var0 + Class131_Sub20_Sub20.anInt1649);
					client.aClass131_Sub14_Sub1_2070.method626(PacketDecoder.anInt544);
					client.aClass131_Sub14_Sub1_2070.method612(Class80.aBoolArray652[82] ? 1 : 0);
				}

				if (var2 == 44) {
					var17 = client.aClass131_Sub20_Sub19_Sub2_Sub2Array2039[var3];
					if (null != var17) {
						client.anInt2083 = var6;
						client.anInt2135 = var7;
						client.anInt2131 = 2;
						client.anInt2247 = 0;
						client.anInt2218 = var0;
						client.anInt2258 = var1;
						client.aClass131_Sub14_Sub1_2070.method871(241);
						client.aClass131_Sub14_Sub1_2070.method591(Class80.aBoolArray652[82] ? 1 : 0);
						client.aClass131_Sub14_Sub1_2070.method620(var3);
					}
				}

				if (var2 == 45) {
					var17 = client.aClass131_Sub20_Sub19_Sub2_Sub2Array2039[var3];
					if (null != var17) {
						client.anInt2083 = var6;
						client.anInt2135 = var7;
						client.anInt2131 = 2;
						client.anInt2247 = 0;
						client.anInt2218 = var0;
						client.anInt2258 = var1;
						client.aClass131_Sub14_Sub1_2070.method871(143);
						client.aClass131_Sub14_Sub1_2070.method619(var3);
						client.aClass131_Sub14_Sub1_2070.method613(Class80.aBoolArray652[82] ? 1 : 0);
					}
				}

				if (client.anInt2090 != 0) {
					client.anInt2090 = 0;
					Class131_Sub20_Sub6.method734(Class88.method377(PacketDecoder.anInt544));
				}

				if (client.aBool2178)
					Class131_Sub20_Sub19_Sub5.method986();

				if ((null != Class21.aClass131_Sub18_194) && (client.anInt2138 == 0))
					Class131_Sub20_Sub6.method734(Class21.aClass131_Sub18_194);

			}
		}
	}

	public static int method1064(int var0, int var1) {
		int var2;
		for (var2 = 0; var1 > 0; --var1) {
			var2 = (var2 << 1) | (var0 & 1);
			var0 >>>= 1;
		}

		return var2;
	}

	static final void method1065(final int var0, final int var1) {
		if (Class77.method344(var0))
			GPI.method22(Class131_Sub18.aClass131_Sub18ArrayArray1174[var0], var1);
	}

	public static Class131_Sub20_Sub1 method1066(final int var0) {
		Class131_Sub20_Sub1 var1 = (Class131_Sub20_Sub1) Class131_Sub20_Sub1.aClass121_1367.method482(var0);
		if (null != var1)
			return var1;
		else {
			final byte[] var2 = Class131_Sub20_Sub1.aClass100_1365.method402(12, var0);
			var1 = new Class131_Sub20_Sub1();
			if (var2 != null)
				var1.method687(new Class131_Sub14(var2));

			var1.method681();
			Class131_Sub20_Sub1.aClass121_1367.method479(var1, var0);
			return var1;
		}
	}

	public static int method1067(final CharSequence var0) {
		final int var1 = var0.length();
		int var3 = 0;

		for (int var2 = 0; var2 < var1; ++var2) {
			final char var4 = var0.charAt(var2);
			if (var4 <= 127)
				++var3;
			else if (var4 <= 2047)
				var3 += 2;
			else
				var3 += 3;
		}

		return var3;
	}
}
