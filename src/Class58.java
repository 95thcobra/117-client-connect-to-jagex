public final class Class58 {
	int anInt547;
	int anInt548;
	int anInt549;
	int anInt550;
	int anInt551;
	int anInt552;
	int anInt553;
	int anInt554;
	int anInt555;
	int anInt556;
	int anInt557;
	int anInt558;
	int anInt559;
	int anInt560;
	int anInt561;
	int anInt562;
	int anInt563;
	int anInt564;
	static int anInt565;
	static String aString566;

	static void method280(final Applet_Sub1 var0) {
		if (Class4.aBool33)
			Class131_Sub20_Sub19_Sub2_Sub2.method1071(var0);
		else {
			int var1;
			int var5;
			if (((Class81.anInt678 == 1) || (!RuntimeException_Sub1.aBool1954 && (Class81.anInt678 == 4)))
					&& (Class81.anInt682 >= ((Class4.anInt36 + 765) - 50)) && (Class81.anInt680 >= 453)) {
				Class50.aClass28_494.aBool252 = !Class50.aClass28_494.aBool252;
				Class24.method115();
				if (Class50.aClass28_494.aBool252)
					Class126_Sub1.method524();
				else {
					final Class100_Sub1 var4 = Class44.aClass100_Sub1_446;
					var1 = var4.method413("scape main");
					var5 = var4.method414(var1, "");
					Class23.method108(var4, var1, var5, 255, false);
				}
			}

			if (client.anInt2036 != 5) {
				++Class4.anInt37;
				if ((client.anInt2036 == 10) || (client.anInt2036 == 11)) {
					int var7;
					if (client.anInt2034 == 0) {
						if ((Class81.anInt678 == 1) || (!RuntimeException_Sub1.aBool1954 && (Class81.anInt678 == 4))) {
							var7 = 5 + Class4.anInt36;
							final short var10 = 463;
							final byte var14 = 100;
							final byte var2 = 35;
							if ((Class81.anInt682 >= var7) && (Class81.anInt682 <= (var14 + var7))
									&& (Class81.anInt680 >= var10) && (Class81.anInt680 <= (var2 + var10))) {
								Class131_Sub20_Sub19_Sub1.method917();
								return;
							}
						}

						if (Class109.aClass49_813 != null)
							Class131_Sub20_Sub19_Sub1.method917();
					}

					var7 = Class81.anInt678;
					var1 = Class81.anInt682;
					var5 = Class81.anInt680;
					if (!RuntimeException_Sub1.aBool1954 && (var7 == 4))
						var7 = 1;

					short var6;
					int var11;
					if (Class4.anInt35 == 0) {
						var11 = (Class4.anInt42 + 180) - 80;
						var6 = 291;
						if ((var7 == 1) && (var1 >= (var11 - 75)) && (var1 <= (var11 + 75)) && (var5 >= (var6 - 20))
								&& (var5 <= (20 + var6)))
							Class131_Sub20_Sub19_Sub1.method918(Class45.method226("secure", true)
									+ "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);

						var11 = 80 + Class4.anInt42 + 180;
						if ((var7 == 1) && (var1 >= (var11 - 75)) && (var1 <= (var11 + 75)) && (var5 >= (var6 - 20))
								&& (var5 <= (var6 + 20)))
							if ((client.anInt2028 & 33554432) != 0) {
								Class4.aString31 = "";
								Class4.aString41 = "This is a <col=00ffff>Tournament<col=ffffff> world.";
								Class4.aString44 = "Max stats and high level gear are provided.";
								Class4.aString45 = "Your normal account will not be affected.";
								Class4.anInt35 = 1;
								Class4.anInt50 = 0;
							} else if ((client.anInt2028 & 4) != 0) {
								if ((client.anInt2028 & 1024) != 0) {
									Class4.aString41 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
									Class4.aString44 = "Players can attack each other almost everywhere";
									Class4.aString45 = "and the Protect Item prayer won\'t work.";
								} else {
									Class4.aString41 = "This is a <col=ff0000>PvP<col=ffffff> world.";
									Class4.aString44 = "Players can attack each other";
									Class4.aString45 = "almost everywhere.";
								}

								Class4.aString31 = "Warning!";
								Class4.anInt35 = 1;
								Class4.anInt50 = 0;
							} else if ((client.anInt2028 & 1024) != 0) {
								Class4.aString41 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
								Class4.aString44 = "The Protect Item prayer will";
								Class4.aString45 = "not work on this world.";
								Class4.aString31 = "Warning!";
								Class4.anInt35 = 1;
								Class4.anInt50 = 0;
							} else {
								Class4.aString41 = "";
								Class4.aString44 = "Enter your username/email & password.";
								Class4.aString45 = "";
								Class4.anInt35 = 2;
								Class4.anInt50 = 0;
							}
					} else if (Class4.anInt35 != 1) {
						short var12;
						if (Class4.anInt35 == 2) {
							var12 = 231;
							var11 = var12 + 30;
							if ((var7 == 1) && (var5 >= (var11 - 15)) && (var5 < var11))
								Class4.anInt50 = 0;

							var11 += 15;
							if ((var7 == 1) && (var5 >= (var11 - 15)) && (var5 < var11))
								Class4.anInt50 = 1;

							var11 += 15;
							var12 = 361;
							if ((var7 == 1) && (var5 >= (var12 - 15)) && (var5 < var12)) {
								Class64.method306("Please enter your username.",
										"If you created your account after November",
										"2010, this will be the creation email address.");
								Class4.anInt35 = 5;
								return;
							}

							int var15 = (180 + Class4.anInt42) - 80;
							final short var9 = 321;
							if ((var7 == 1) && (var1 >= (var15 - 75)) && (var1 <= (75 + var15)) && (var5 >= (var9 - 20))
									&& (var5 <= (var9 + 20))) {
								Class4.aString40 = Class4.aString40.trim();
								if (Class4.aString40.length() == 0) {
									Class64.method306("", "Please enter your username/email address.", "");
									return;
								}

								if (Class4.aString47.length() == 0) {
									Class64.method306("", "Please enter your password.", "");
									return;
								}

								Class64.method306("", "Connecting to server...", "");
								Class4.aClass97_38 = Class50.aClass28_494.aLinkedHashMap257
										.containsKey(Integer.valueOf(Class97.method397(Class4.aString40)))
												? Class97.aClass97_773 : Class97.aClass97_768;
								Class32.method142(20);
								return;
							}

							var15 = 180 + Class4.anInt42 + 80;
							if ((var7 == 1) && (var1 >= (var15 - 75)) && (var1 <= (var15 + 75)) && (var5 >= (var9 - 20))
									&& (var5 <= (20 + var9))) {
								Class4.anInt35 = 0;
								Class4.aString40 = "";
								Class4.aString47 = "";
								Class63.anInt582 = 0;
								aString566 = "";
								Class4.aBool49 = true;
							}

							while (true) {
								while (Class45.method225()) {
									boolean var3 = false;

									for (int var8 = 0; var8 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| "
											.length(); ++var8)
										if (Class40.aChar413 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| "
												.charAt(var8)) {
											var3 = true;
											break;
										}

									if (Class131_Sub12.anInt1095 == 13) {
										Class4.anInt35 = 0;
										Class4.aString40 = "";
										Class4.aString47 = "";
										Class63.anInt582 = 0;
										aString566 = "";
										Class4.aBool49 = true;
									} else if (Class4.anInt50 == 0) {
										if ((Class131_Sub12.anInt1095 == 85) && (Class4.aString40.length() > 0))
											Class4.aString40 = Class4.aString40.substring(0,
													Class4.aString40.length() - 1);

										if ((Class131_Sub12.anInt1095 == 84) || (Class131_Sub12.anInt1095 == 80))
											Class4.anInt50 = 1;

										if (var3 && (Class4.aString40.length() < 320))
											Class4.aString40 = Class4.aString40 + Class40.aChar413;
									} else if (Class4.anInt50 == 1) {
										if ((Class131_Sub12.anInt1095 == 85) && (Class4.aString47.length() > 0))
											Class4.aString47 = Class4.aString47.substring(0,
													Class4.aString47.length() - 1);

										if ((Class131_Sub12.anInt1095 == 84) || (Class131_Sub12.anInt1095 == 80))
											Class4.anInt50 = 0;

										if (Class131_Sub12.anInt1095 == 84) {
											Class4.aString40 = Class4.aString40.trim();
											if (Class4.aString40.length() == 0) {
												Class64.method306("", "Please enter your username/email address.", "");
												return;
											}

											if (Class4.aString47.length() == 0) {
												Class64.method306("", "Please enter your password.", "");
												return;
											}

											Class64.method306("", "Connecting to server...", "");
											Class4.aClass97_38 = Class50.aClass28_494.aLinkedHashMap257
													.containsKey(Integer.valueOf(Class97.method397(Class4.aString40)))
															? Class97.aClass97_773 : Class97.aClass97_768;
											Class32.method142(20);
											return;
										}

										if (var3 && (Class4.aString47.length() < 20))
											Class4.aString47 = Class4.aString47 + Class40.aChar413;
									}
								}

								return;
							}
						} else if (Class4.anInt35 == 3) {
							var11 = 180 + Class4.anInt42;
							var6 = 276;
							if ((var7 == 1) && (var1 >= (var11 - 75)) && (var1 <= (var11 + 75)) && (var5 >= (var6 - 20))
									&& (var5 <= (20 + var6))) {
								Class4.aString41 = "";
								Class4.aString44 = "Enter your username/email & password.";
								Class4.aString45 = "";
								Class4.anInt35 = 2;
								Class4.anInt50 = 0;
							}

							var11 = 180 + Class4.anInt42;
							var6 = 326;
							if ((var7 == 1) && (var1 >= (var11 - 75)) && (var1 <= (var11 + 75)) && (var5 >= (var6 - 20))
									&& (var5 <= (20 + var6))) {
								Class64.method306("Please enter your username.",
										"If you created your account after November",
										"2010, this will be the creation email address.");
								Class4.anInt35 = 5;
								return;
							}
						} else {
							int var13;
							boolean var16;
							if (Class4.anInt35 == 4) {
								var11 = (180 + Class4.anInt42) - 80;
								var6 = 321;
								if ((var7 == 1) && (var1 >= (var11 - 75)) && (var1 <= (75 + var11))
										&& (var5 >= (var6 - 20)) && (var5 <= (var6 + 20))) {
									aString566.trim();
									if (aString566.length() != 6) {
										Class64.method306("", "Please enter a 6-digin PIN.", "");
										return;
									}

									Class63.anInt582 = Integer.parseInt(aString566);
									aString566 = "";
									Class4.aClass97_38 = Class4.aBool49 ? Class97.aClass97_774 : Class97.aClass97_769;
									Class64.method306("", "Connecting to server...", "");
									Class32.method142(20);
									return;
								}

								if ((var7 == 1) && (var1 >= ((Class4.anInt42 + 180) - 9))
										&& (var1 <= (130 + 180 + Class4.anInt42)) && (var5 >= 263) && (var5 <= 296))
									Class4.aBool49 = !Class4.aBool49;

								if ((var7 == 1) && (var1 >= ((180 + Class4.anInt42) - 34))
										&& (var1 <= (180 + Class4.anInt42 + 34)) && (var5 >= 351) && (var5 <= 363))
									Class131_Sub20_Sub19_Sub1.method918(Class45.method226("secure", true)
											+ "m=totp-authenticator/disableTOTPRequest", true, false);

								var11 = Class4.anInt42 + 180 + 80;
								if ((var7 == 1) && (var1 >= (var11 - 75)) && (var1 <= (75 + var11))
										&& (var5 >= (var6 - 20)) && (var5 <= (var6 + 20))) {
									Class4.anInt35 = 0;
									Class4.aString40 = "";
									Class4.aString47 = "";
									Class63.anInt582 = 0;
									aString566 = "";
								}

								while (Class45.method225()) {
									var16 = false;

									for (var13 = 0; var13 < "1234567890".length(); ++var13)
										if (Class40.aChar413 == "1234567890".charAt(var13)) {
											var16 = true;
											break;
										}

									if (Class131_Sub12.anInt1095 == 13) {
										Class4.anInt35 = 0;
										Class4.aString40 = "";
										Class4.aString47 = "";
										Class63.anInt582 = 0;
										aString566 = "";
									} else {
										if ((Class131_Sub12.anInt1095 == 85) && (aString566.length() > 0))
											aString566 = aString566.substring(0, aString566.length() - 1);

										if (Class131_Sub12.anInt1095 == 84) {
											aString566.trim();
											if (aString566.length() != 6) {
												Class64.method306("", "Please enter a 6-digin PIN.", "");
												return;
											}

											Class63.anInt582 = Integer.parseInt(aString566);
											aString566 = "";
											Class4.aClass97_38 = Class4.aBool49 ? Class97.aClass97_774
													: Class97.aClass97_769;
											Class64.method306("", "Connecting to server...", "");
											Class32.method142(20);
											return;
										}

										if (var16 && (aString566.length() < 6))
											aString566 = aString566 + Class40.aChar413;
									}
								}
							} else if (Class4.anInt35 == 5) {
								var11 = (Class4.anInt42 + 180) - 80;
								var6 = 321;
								if ((var7 == 1) && (var1 >= (var11 - 75)) && (var1 <= (var11 + 75))
										&& (var5 >= (var6 - 20)) && (var5 <= (var6 + 20))) {
									Class53.method273();
									return;
								}

								var11 = 80 + 180 + Class4.anInt42;
								if ((var7 == 1) && (var1 >= (var11 - 75)) && (var1 <= (75 + var11))
										&& (var5 >= (var6 - 20)) && (var5 <= (20 + var6))) {
									Class4.aString41 = "";
									Class4.aString44 = "Enter your username/email & password.";
									Class4.aString45 = "";
									Class4.anInt35 = 2;
									Class4.anInt50 = 0;
									Class4.aString47 = "";
								}

								while (Class45.method225()) {
									var16 = false;

									for (var13 = 0; var13 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| "
											.length(); ++var13)
										if (Class40.aChar413 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| "
												.charAt(var13)) {
											var16 = true;
											break;
										}

									if (Class131_Sub12.anInt1095 == 13) {
										Class4.aString41 = "";
										Class4.aString44 = "Enter your username/email & password.";
										Class4.aString45 = "";
										Class4.anInt35 = 2;
										Class4.anInt50 = 0;
										Class4.aString47 = "";
									} else {
										if ((Class131_Sub12.anInt1095 == 85) && (Class4.aString40.length() > 0))
											Class4.aString40 = Class4.aString40.substring(0,
													Class4.aString40.length() - 1);

										if (Class131_Sub12.anInt1095 == 84) {
											Class53.method273();
											return;
										}

										if (var16 && (Class4.aString40.length() < 320))
											Class4.aString40 = Class4.aString40 + Class40.aChar413;
									}
								}
							} else if (Class4.anInt35 == 6)
								while (true) {
									do
										if (!Class45.method225()) {
											var12 = 321;
											if ((var7 == 1) && (var5 >= (var12 - 20)) && (var5 <= (var12 + 20))) {
												Class4.aString41 = "";
												Class4.aString44 = "Enter your username/email & password.";
												Class4.aString45 = "";
												Class4.anInt35 = 2;
												Class4.anInt50 = 0;
												Class4.aString47 = "";
											}

											return;
										}
									while ((Class131_Sub12.anInt1095 != 84) && (Class131_Sub12.anInt1095 != 13));

									Class4.aString41 = "";
									Class4.aString44 = "Enter your username/email & password.";
									Class4.aString45 = "";
									Class4.anInt35 = 2;
									Class4.anInt50 = 0;
									Class4.aString47 = "";
								}
						}
					} else {
						while (Class45.method225())
							if (Class131_Sub12.anInt1095 == 84) {
								Class4.aString41 = "";
								Class4.aString44 = "Enter your username/email & password.";
								Class4.aString45 = "";
								Class4.anInt35 = 2;
								Class4.anInt50 = 0;
							} else if (Class131_Sub12.anInt1095 == 13)
								Class4.anInt35 = 0;

						var11 = (Class4.anInt42 + 180) - 80;
						var6 = 321;
						if ((var7 == 1) && (var1 >= (var11 - 75)) && (var1 <= (var11 + 75)) && (var5 >= (var6 - 20))
								&& (var5 <= (var6 + 20))) {
							Class4.aString41 = "";
							Class4.aString44 = "Enter your username/email & password.";
							Class4.aString45 = "";
							Class4.anInt35 = 2;
							Class4.anInt50 = 0;
						}

						var11 = Class4.anInt42 + 180 + 80;
						if ((var7 == 1) && (var1 >= (var11 - 75)) && (var1 <= (var11 + 75)) && (var5 >= (var6 - 20))
								&& (var5 <= (var6 + 20)))
							Class4.anInt35 = 0;
					}

				}
			}
		}
	}

	static byte[] method281(final byte[] var0) {
		final int var1 = var0.length;
		final byte[] var2 = new byte[var1];
		System.arraycopy(var0, 0, var2, 0, var1);
		return var2;
	}

	static void method282(final int var0, final int var1) {
		final int[] var2 = new int[4];
		final int[] var3 = new int[4];
		var2[0] = var0;
		var3[0] = var1;
		int var5 = 1;

		for (int var4 = 0; var4 < 4; ++var4)
			if (Class30.anIntArray277[var4] != var0) {
				var2[var5] = Class30.anIntArray277[var4];
				var3[var5] = Class30.anIntArray285[var4];
				++var5;
			}

		Class30.anIntArray277 = var2;
		Class30.anIntArray285 = var3;
		Class137.method506(Class30.aClass30Array273, 0, Class30.aClass30Array273.length - 1, Class30.anIntArray277,
				Class30.anIntArray285);
	}
}
