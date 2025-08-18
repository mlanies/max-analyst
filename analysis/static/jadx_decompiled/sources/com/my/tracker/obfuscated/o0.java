package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.FileReader;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class o0 {
    final t a;
    final z0 b;
    final Context c;

    public static final class a {
        public final int a;
        public final String b;
        public final String c;

        public a(int i, String str, String str2) {
            this.a = i;
            this.b = str;
            this.c = str2;
        }
    }

    public o0(t tVar, z0 z0Var, Context context) {
        this.a = tVar;
        this.b = z0Var;
        this.c = context.getApplicationContext();
    }

    public static o0 a(t tVar, z0 z0Var, Context context) {
        return new o0(tVar, z0Var, context);
    }

    public a b() {
        String str = "ro.mtpi." + this.b.g();
        String strA = w0.a(str);
        if (TextUtils.isEmpty(strA)) {
            y0.a("PreInstallHandler: empty data for source: 3");
            return null;
        }
        y0.a("PreInstallHandler: raw data in SystemProperties has been found: " + strA);
        return a(3, strA, str);
    }

    public void c() {
        String strM = this.b.m();
        if (TextUtils.isEmpty(strM)) {
            return;
        }
        p0 p0VarA = p0.a(this.c);
        if (p0VarA.p()) {
            return;
        }
        y0.a("PreInstallHandler: checking preinstall");
        try {
            String strA = a(this.c.getPackageManager().getResourcesForApplication(strM), this.c.getPackageName(), strM);
            p0VarA.t();
            if (TextUtils.isEmpty(strA)) {
                y0.a("PreInstallHandler: referrer is empty");
                return;
            }
            y0.a("PreInstallHandler: referrer " + strA);
            this.a.a(strA, o.b(this.c), (Runnable) null);
            p0.a(this.c).u();
        } catch (Throwable unused) {
            y0.a("PreInstallHandler: unable to locate vendor app " + strM);
        }
    }

    public static String a(Resources resources, String str, String str2) {
        int identifier = resources.getIdentifier(str + "_mytracker", "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public static a a(int i, String str, String str2) {
        try {
            y0.a("PreInstallHandler: converting raw data to json");
            return new a(i, new JSONObject(str).toString(), str2);
        } catch (Throwable th) {
            y0.a("PreInstallHandler error: exception when converting raw data to json", th);
            try {
                y0.a("PreInstallHandler: converting raw data to json with pid");
                return new a(i, new JSONObject().put("pid", str).toString(), str2);
            } catch (Throwable th2) {
                y0.b("PreInstallHandler error: exception when converting raw data to json with pid", th2);
                y0.a("PreInstallHandler: nothing has been found for source: " + i);
                return null;
            }
        }
    }

    public a a() {
        if (!this.b.p()) {
            y0.a("PreInstallHandler: tracking preinstall is disabled");
            return null;
        }
        a aVarB = b();
        if (aVarB != null) {
            return aVarB;
        }
        a aVarA = a(1);
        if (aVarA != null) {
            return aVarA;
        }
        if (this.b.q()) {
            return a(2);
        }
        return null;
    }

    public a a(int i) {
        String str;
        if (i == 1) {
            str = "ro.mytracker.preinstall.path";
        } else if (i == 2) {
            str = "ro.appsflyer.preinstall.path";
        } else {
            y0.a("PreInstallHandler: wrong property property key");
            return null;
        }
        String strA = w0.a(str);
        if (TextUtils.isEmpty(strA)) {
            y0.a("PreInstallHandler: empty path for source: " + i);
            return null;
        }
        String strA2 = a(strA);
        if (TextUtils.isEmpty(strA2)) {
            y0.a("PreInstallHandler: empty data for source: " + i);
            return null;
        }
        y0.a("PreInstallHandler: raw data for source has been found: " + strA2);
        return a(i, strA2, strA);
    }

    public String a(String str) {
        BufferedReader bufferedReader;
        try {
            try {
                y0.a("PreInstallHandler: searching string in file " + str);
                String str2 = this.c.getPackageName() + "=";
                int length = str2.length();
                bufferedReader = new BufferedReader(new FileReader(str));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            bufferedReader.close();
                            break;
                        }
                        y0.a("PreInstallHandler: processing string " + line);
                        if (line.startsWith(str2) && line.length() > length) {
                            String strSubstring = line.substring(length);
                            if (!TextUtils.isEmpty(strSubstring)) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable unused) {
                                }
                                return strSubstring;
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            y0.b("PreInstallHandler error: exception while retrieving data in file" + str, th);
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return null;
                        } catch (Throwable th2) {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable unused2) {
                                }
                            }
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Throwable unused3) {
        }
    }
}
