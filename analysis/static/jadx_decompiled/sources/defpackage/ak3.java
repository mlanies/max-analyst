package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class ak3 {
    public final je7 a;
    public final je7 b;

    public ak3(je7 je7Var, je7 je7Var2) {
        this.a = je7Var;
        this.b = je7Var2;
    }

    public final String a(uj3 uj3Var, n10 n10Var) {
        if (uj3Var != null) {
            return uj3Var.q(((hyc) ((q33) this.b.getValue())).q(), kk0.c);
        }
        if (n10Var.d.length() > 0) {
            String str = n10Var.g;
            int length = str.length();
            String str2 = n10Var.h;
            if (length > 0 || str2.length() > 0) {
                if (str2.length() != 0) {
                    str = str2;
                }
                return j47.O(str);
            }
        }
        return null;
    }

    public final uj3 b(n10 n10Var) {
        long j = n10Var.b;
        if (j == 0) {
            return null;
        }
        el3 el3Var = ((ds3) this.a.getValue()).a;
        uj3 uj3VarI = (uj3) el3Var.a.get(Long.valueOf(j));
        if (uj3VarI == null) {
            uj3VarI = el3Var.i(j, false);
        }
        if (uj3VarI == null || uj3VarI.w() || uj3VarI.k() != 0) {
            return null;
        }
        return uj3VarI;
    }

    public final CharSequence c(n10 n10Var) {
        uj3 uj3VarB = b(n10Var);
        if (uj3VarB != null && ((String) uj3VarB.m()).length() > 0) {
            return uj3VarB.m();
        }
        String str = n10Var.d;
        if (str.length() <= 0) {
            return fca.b("Unknown", null);
        }
        Pattern pattern = fca.a;
        return fca.b(str, n10Var.e);
    }
}
