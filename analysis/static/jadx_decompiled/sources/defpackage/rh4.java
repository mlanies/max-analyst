package defpackage;

import android.widget.ImageView;
import androidx.fragment.app.a;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public abstract /* synthetic */ class rh4 {
    public static final d24 a(int i) {
        String str;
        switch (i) {
            case 1:
                str = "ALREADY_DOWNLOADING";
                break;
            case 2:
                str = "FILE_IS_NULL";
                break;
            case 3:
                str = "INTERRUPTED";
                break;
            case 4:
                str = "FAIL";
                break;
            case 5:
                str = "CANCELLED";
                break;
            case 6:
                str = "MAX_FAIL_COUNT";
                break;
            default:
                throw null;
        }
        kpa[] kpaVarArr = {new kpa("state", str)};
        qqd qqdVar = new qqd(9, (byte) 0);
        kpa kpaVar = kpaVarArr[0];
        qqdVar.A(kpaVar.b, (String) kpaVar.a);
        return qqdVar.p();
    }

    public static /* synthetic */ int b(int i) {
        if (i == 1) {
            return HttpStatus.SC_BAD_REQUEST;
        }
        if (i == 2) {
            return 500;
        }
        if (i == 3) {
            return 600;
        }
        if (i == 4) {
            return 700;
        }
        throw null;
    }

    public static int c(float f, float f2, int i) {
        return tu0.G(f * f2) + i;
    }

    public static int d(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static int e(int i, String str) {
        return String.valueOf(str).length() + i;
    }

    public static int f(CharSequence charSequence, int i, int i2) {
        return (charSequence.hashCode() + i) * i2;
    }

    public static oi9 g(oec oecVar, Class cls, String str, String str2) {
        oecVar.getClass();
        return new oi9(cls, str, str2);
    }

    public static String h(String str, int i, int i2, String str2) {
        return str + i + str2 + i2;
    }

    public static String i(String str, a aVar, String str2) {
        return str + aVar + str2;
    }

    public static String j(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String k(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String l(StringBuilder sb, jqe jqeVar, String str) {
        sb.append(jqeVar);
        sb.append(str);
        return sb.toString();
    }

    public static String m(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder n(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder o(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static void p(float f, float f2, ImageView imageView) {
        int iG = tu0.G(f * f2);
        imageView.setPadding(iG, iG, iG, iG);
    }

    public static int q(float f, float f2, int i) {
        return i - tu0.G(f * f2);
    }

    public static /* synthetic */ String r(int i) {
        switch (i) {
            case 1:
                return "CONFIGURED";
            case 2:
                return "STARTED";
            case 3:
                return "PAUSED";
            case 4:
                return "STOPPING";
            case 5:
                return "PENDING_START";
            case 6:
                return "PENDING_START_PAUSED";
            case 7:
                return "PENDING_RELEASE";
            case 8:
                return "ERROR";
            case 9:
                return "RELEASED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String s(int i) {
        return i != 1 ? i != 2 ? "null" : "VIDEO" : "AUDIO";
    }
}
