import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class Class53 {
	static void method273() {
		Class4.aString40 = Class4.aString40.trim();
		if (Class4.aString40.length() == 0)
			Class64.method306("Please enter your username.", "If you created your account after November",
					"2010, this will be the creation email address.");
		else {
			final long var0 = Class109.method436();
			byte var2;
			if (var0 == 0L)
				var2 = 5;
			else {
				final String var3 = Class4.aString40;
				final Random var4 = new Random();
				final Class131_Sub14 var5 = new Class131_Sub14(128);
				final Class131_Sub14 var6 = new Class131_Sub14(128);
				final int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
				var5.method636(10);

				int var8;
				for (var8 = 0; var8 < 4; ++var8)
					var5.method585(var4.nextInt());

				var5.method585(var7[0]);
				var5.method585(var7[1]);
				var5.method635(var0);
				var5.method635(0L);

				for (var8 = 0; var8 < 4; ++var8)
					var5.method585(var4.nextInt());

				var5.method610(Class42.aBigInteger420, Class42.aBigInteger422);
				var6.method636(10);

				for (var8 = 0; var8 < 3; ++var8)
					var6.method585(var4.nextInt());

				var6.method635(var4.nextLong());
				var6.method603(var4.nextLong());
				final byte[] var9 = new byte[24];

				try {
					Class72.aClass140_617.method510(0L);
					Class72.aClass140_617.method511(var9);

					int var10;
					for (var10 = 0; (var10 < 24) && (var9[var10] == 0); ++var10)
						;

					if (var10 >= 24)
						throw new IOException();
				} catch (final Exception var23) {
					for (int var12 = 0; var12 < 24; ++var12)
						var9[var12] = -1;
				}

				var6.method623(var9, 0, 24);
				var6.method635(var4.nextLong());
				var6.method610(Class42.aBigInteger420, Class42.aBigInteger422);
				var8 = Class131_Sub6.method554(var3);
				if ((var8 % 8) != 0)
					var8 += 8 - (var8 % 8);

				final Class131_Sub14 var11 = new Class131_Sub14(var8);
				var11.method589(var3);
				var11.anInt1107 = var8;
				var11.method608(var7);
				Class131_Sub14 var13 = new Class131_Sub14(var11.anInt1107 + var5.anInt1107 + 5 + var6.anInt1107);
				var13.method636(2);
				var13.method636(var5.anInt1107);
				var13.method623(var5.aByteArray1109, 0, var5.anInt1107);
				var13.method636(var6.anInt1107);
				var13.method623(var6.aByteArray1109, 0, var6.anInt1107);
				var13.method586(var11.anInt1107);
				var13.method623(var11.aByteArray1109, 0, var11.anInt1107);
				final String var14 = Class27.method122(var13.aByteArray1109);

				byte var20;
				try {
					final URL var15 = new URL(Class45.method226("services", false) + "m=accountappeal/login.ws");
					final URLConnection var16 = var15.openConnection();
					var16.setDoInput(true);
					var16.setDoOutput(true);
					var16.setConnectTimeout(5000);
					final OutputStreamWriter var17 = new OutputStreamWriter(var16.getOutputStream());
					var17.write(
							"data2=" + Class52.method272(var14) + "&dest=" + Class52.method272("passwordchoice.ws"));
					var17.flush();
					final InputStream var18 = var16.getInputStream();
					var13 = new Class131_Sub14(new byte[1000]);

					while (true) {
						final int var19 = var18.read(var13.aByteArray1109, var13.anInt1107, 1000 - var13.anInt1107);
						if (var19 == -1) {
							var17.close();
							var18.close();
							String var21 = new String(var13.aByteArray1109);
							if (var21.startsWith("OFFLINE"))
								var20 = 4;
							else if (var21.startsWith("WRONG"))
								var20 = 7;
							else if (var21.startsWith("RELOAD"))
								var20 = 3;
							else if (var21.startsWith("Not permitted for social network accounts."))
								var20 = 6;
							else {
								var13.method632(var7);

								while ((var13.anInt1107 > 0) && (var13.aByteArray1109[var13.anInt1107 - 1] == 0))
									--var13.anInt1107;

								var21 = new String(var13.aByteArray1109, 0, var13.anInt1107);
								if (Class1.method13(var21)) {
									Class131_Sub20_Sub19_Sub1.method918(var21, true, false);
									var20 = 2;
								} else
									var20 = 5;
							}
							break;
						}

						var13.anInt1107 += var19;
						if (var13.anInt1107 >= 1000) {
							var20 = 5;
							break;
						}
					}
				} catch (final Throwable var22) {
					var22.printStackTrace();
					var20 = 5;
				}

				var2 = var20;
			}

			switch (var2) {
			case 2:
				Class64.method306("", "Page has opened in a new window.", "(Please check your popup blocker.)");
				Class4.anInt35 = 6;
				break;
			case 3:
				Class64.method306("", "Error connecting to server.", "");
				break;
			case 4:
				Class64.method306("The part of the website you are trying", "to connect to is offline at the moment.",
						"Please try again later.");
				break;
			case 5:
				Class64.method306("Sorry, there was an error trying to", "log you in to this part of the website.",
						"Please try again later.");
				break;
			case 6:
				Class64.method306("", "Error connecting to server.", "");
				break;
			case 7:
				Class64.method306("You must enter a valid login to proceed. For accounts",
						"created after 24th November 2010, please use your",
						"email address. Otherwise please use your username.");
			}

		}
	}

	public static boolean method274(final int var0) {
		return (var0 & 1) != 0;
	}
}
