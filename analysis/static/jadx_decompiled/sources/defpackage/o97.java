package defpackage;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public final class o97 {
    public final /* synthetic */ int a;
    public final String b;

    public o97(String str, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = str;
                break;
            case 2:
                this.b = wg0.h("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat(str);
                break;
            default:
                str.getClass();
                this.b = str;
                break;
        }
    }

    public static String c(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(str2);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return rh4.j(str, " : ", str2);
    }

    public void a(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) this.b);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            c(this.b, str, objArr);
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "TracerFeature::" + this.b;
            default:
                return super.toString();
        }
    }
}
