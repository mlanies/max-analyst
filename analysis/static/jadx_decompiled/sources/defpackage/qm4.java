package defpackage;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* loaded from: classes.dex */
public final class qm4 {
    public final String a;

    public qm4(String str, int i) {
        switch (i) {
            case 1:
                this.a = wg0.h("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat(str);
                break;
            default:
                this.a = str;
                break;
        }
    }

    public static qm4 a(yaf yafVar) {
        String str;
        yafVar.I(2);
        int iV = yafVar.v();
        int i = iV >> 1;
        int iV2 = ((yafVar.v() >> 3) & 31) | ((iV & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        String str2 = iV2 < 10 ? ".0" : ".";
        StringBuilder sb = new StringBuilder(str2.length() + str.length() + 24);
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(str2);
        sb.append(iV2);
        return new qm4(sb.toString(), 0);
    }

    public static String d(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(String.valueOf(str2));
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return rh4.j(str, " : ", str2);
    }

    public void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            d(this.a, str, objArr);
        }
    }

    public void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            d(this.a, str, objArr);
        }
    }
}
