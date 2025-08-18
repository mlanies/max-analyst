package defpackage;

import android.os.SystemClock;
import android.os.Trace;
import android.util.Printer;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class hx7 implements Printer {
    public long a;
    public long b;
    public long c;
    public final LinkedList d = new LinkedList();

    public static String a(String str) {
        int iA0;
        String strK0 = w9e.K0(w9e.K0(str, ">>>>> Dispatching to "), "<<<<< Finished to ");
        int iF0 = w9e.F0(": ", strK0, 6);
        int iA02 = w9e.A0(strK0, "} ", 0, false, 6);
        String strSubstring = strK0.substring(0, iA02 + 1);
        if (iF0 <= 0 && iA02 <= 0) {
            return strK0;
        }
        int iA03 = w9e.A0(strK0, "DispatchedContinuation[Dispatchers.Main", 0, false, 6);
        if (iA03 >= 0) {
            int i = iA03 + 39;
            int iA04 = w9e.A0(strK0, ".immediate", i, false, 4);
            iA0 = iA04 >= 0 ? w9e.A0(strK0, ", Continuation at ", iA04 + 10, false, 4) : w9e.A0(strK0, ", Continuation at ", i, false, 4);
            if (iA0 >= 0) {
                iA0 += 18;
            }
        } else {
            iA0 = iA02 + 2;
        }
        int iE0 = w9e.E0(strK0, ']', 0, 6);
        Integer numValueOf = Integer.valueOf(iE0);
        if (iE0 <= iA0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : strK0.length();
        int iE02 = w9e.E0(strK0, '@', 0, 6);
        Integer numValueOf2 = iE02 > iA0 ? Integer.valueOf(iE02) : null;
        String strSubstring2 = strK0.substring(iA0, Math.min(numValueOf2 != null ? numValueOf2.intValue() : strK0.length(), iIntValue));
        return !strSubstring2.equals("null") ? strSubstring2 : rh4.j(strSubstring, " ", strK0.substring(iF0 + 2));
    }

    @Override // android.util.Printer
    public final void println(String str) {
        if (str != null) {
            if (eae.o0(str, ">>>>> Dispatching to ", false)) {
                String strA = a(str);
                if (Trace.isEnabled()) {
                    Trace.beginSection(strA);
                }
                this.a = SystemClock.uptimeMillis();
                this.c++;
                return;
            }
            if (eae.o0(str, "<<<<< Finished to ", false)) {
                if (Trace.isEnabled()) {
                    Trace.endSection();
                }
                this.c--;
                this.b = System.currentTimeMillis();
                this.d.add(new gx7(a(str), this.a, this.b, this.c));
                this.a = 0L;
                this.b = 0L;
            }
        }
    }
}
