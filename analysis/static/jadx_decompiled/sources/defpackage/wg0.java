package defpackage;

import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class wg0 {
    public static int a(String str) {
        str.getClass();
        switch (str) {
            case "LEFT":
                return 2;
            case "REMOVING":
                return 4;
            case "REMOVED":
                return 3;
            case "ACTIVE":
                return 1;
            case "CLOSED":
                return 5;
            case "HIDDEN":
                return 6;
            default:
                throw new IllegalArgumentException(zr6.i("No such value ", str, " for ChatStatus"));
        }
    }

    public static /* synthetic */ char b(int i) {
        if (i == 1) {
            return 'u';
        }
        if (i == 2) {
            return 'g';
        }
        throw null;
    }

    public static /* synthetic */ String c(int i) {
        if (i == 1) {
            return "add";
        }
        if (i == 2) {
            return "remove";
        }
        throw null;
    }

    public static int d(float f, float f2, int i, int i2) {
        return tu0.G(f * f2) + i + i2;
    }

    public static lg3 e(int i, int i2, Bundle bundle) {
        return od2.a(new eqe(i), bundle, i2);
    }

    public static Object f(ArrayList arrayList, int i) {
        return arrayList.get(arrayList.size() - i);
    }

    public static String g(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String h(String str, int i, String str2, int i2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String i(String str, String str2) {
        return str + str2;
    }

    public static StringBuilder j(String str, int i, String str2, int i2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static void k(String str, s35 s35Var) {
        pnf.o(s35Var, new c64(str));
    }

    public static void l(boolean z, coc cocVar, boolean z2, String str) {
        cocVar.c(new gqd(z));
        cocVar.a(new gqd(z2));
        cocVar.d(str);
    }

    public static int m(float f, float f2, int i, int i2) {
        return i2 - (tu0.G(f * f2) * i);
    }

    public static /* synthetic */ String n(int i) {
        if (i == 1) {
            return "USER";
        }
        if (i == 2) {
            return "GROUP";
        }
        throw null;
    }

    public static /* synthetic */ String o(int i) {
        switch (i) {
            case 1:
                return "RELEASED";
            case 2:
                return "RELEASING";
            case 3:
                return "INITIALIZED";
            case 4:
                return "PENDING_OPEN";
            case 5:
                return "CLOSING";
            case 6:
                return "REOPENING_QUIRK";
            case 7:
                return "REOPENING";
            case 8:
                return "OPENING";
            case 9:
                return "OPENED";
            case 10:
                return "CONFIGURED";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String p(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "DROP_LATEST" : "DROP_OLDEST" : "SUSPEND";
    }

    public static /* synthetic */ String q(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "VIDEO" : "AUDIO" : "UNKNOWN";
    }

    public static /* synthetic */ String r(int i) {
        switch (i) {
            case 1:
                return "RELEASED";
            case 2:
                return "RELEASING";
            case 3:
                return "INITIALIZED";
            case 4:
                return "PENDING_OPEN";
            case 5:
                return "CLOSING";
            case 6:
                return "REOPENING_QUIRK";
            case 7:
                return "REOPENING";
            case 8:
                return "OPENING";
            case 9:
                return "OPENED";
            case 10:
                return "CONFIGURED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String s(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "UNKNOWN" : "BACK" : "FRONT";
    }

    public static /* synthetic */ String t(int i) {
        switch (i) {
            case 1:
                return "UNINITIALIZED";
            case 2:
                return "INITIALIZED";
            case 3:
                return "GET_SURFACE";
            case 4:
                return "OPENING";
            case 5:
                return "OPENED";
            case 6:
                return "CLOSED";
            case 7:
                return "RELEASING";
            case 8:
                return "RELEASED";
            default:
                return "null";
        }
    }
}
