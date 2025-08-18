package defpackage;

import org.apache.http.protocol.HTTP;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class ey8 {
    public static int a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 10) {
            return 2;
        }
        if (i == 20) {
            return 3;
        }
        if (i != 30) {
            return i != 40 ? 2 : 5;
        }
        return 4;
    }

    public static int b(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        throw new IllegalArgumentException(wg0.g(i, "unknown value ", " for PhoneType"));
    }

    public static /* synthetic */ int c(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i2;
    }

    public static /* synthetic */ String d(int i) {
        if (i == 1 || i == 2) {
            return "so";
        }
        if (i == 3) {
            return "dylib";
        }
        if (i == 4) {
            return "so";
        }
        throw null;
    }

    public static /* synthetic */ int e(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 10;
        }
        if (i == 3) {
            return 20;
        }
        if (i == 4) {
            return 30;
        }
        if (i == 5) {
            return 40;
        }
        throw null;
    }

    public static /* synthetic */ String f(int i) {
        switch (i) {
            case 1:
                return "unknown";
            case 2:
                return "image/jpeg";
            case 3:
                return "image/png";
            case 4:
                return "image/webp";
            case 5:
                return "image/gif";
            case 6:
                return "image/*";
            case 7:
                return "image/heic";
            case 8:
                return "video/mp4";
            case 9:
                return "video/*";
            case 10:
                return HTTP.PLAIN_TEXT_TYPE;
            case 11:
                return "text/x-vcard";
            default:
                throw null;
        }
    }

    public static int g(int i, int i2, int i3) {
        return (au1.s(i) + i2) * i3;
    }

    public static String h(long j, String str) {
        return str + j;
    }

    public static String i(long j, String str, String str2) {
        return str + j + str2;
    }

    public static String j(String str, boolean z) {
        return str + z;
    }

    public static void k(int i, String str) {
        z04.c0(str + i);
    }

    public static void l(k36 k36Var, String str, String str2, String str3, String str4) {
        k36Var.U(str);
        k36Var.U(str2);
        k36Var.U(str3);
        k36Var.U(str4);
    }

    public static void m(xlc xlcVar, int i, long j, t19 t19Var) {
        xlcVar.j(i, j);
        t19Var.a().getClass();
    }

    public static /* synthetic */ String n(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "CHANNEL_ADMIN" : "CHANNEL" : "GROUP" : "USER" : "UNKNOWN";
    }

    public static /* synthetic */ String o(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "Margin" : "ReplaceablePadding" : "Padding" : "Translate" : "None";
    }

    public static /* synthetic */ String p(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "PHONE_CONFIRM" : "PHONE_REBINDING" : "PHONE_BINDING" : "UNKNOWN";
    }

    public static /* synthetic */ String q(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "INVALID" : "VALID" : "UNKNOWN";
    }

    public static /* synthetic */ String r(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "UNSPECIFIED" : "FROM_DEFAULT_COUNTRY" : "FROM_NUMBER_WITHOUT_PLUS_SIGN" : "FROM_NUMBER_WITH_IDD" : "FROM_NUMBER_WITH_PLUS_SIGN";
    }

    public static /* synthetic */ String s(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "SINGLE" : "LAST" : "FIRST_OR_DEFAULT" : "FIRST";
    }

    public static /* synthetic */ String t(int i) {
        switch (i) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case 6:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ int u(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("UNKNOWN")) {
            return 1;
        }
        if (str.equals("PHONE_BINDING")) {
            return 2;
        }
        if (str.equals("PHONE_REBINDING")) {
            return 3;
        }
        if (str.equals("PHONE_CONFIRM")) {
            return 4;
        }
        throw new IllegalArgumentException("No enum constant ru.ok.tamtam.api.commands.base.PhoneBindTokenType.".concat(str));
    }
}
