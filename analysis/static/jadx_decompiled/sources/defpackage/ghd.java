package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class ghd implements b64 {
    public static final ghd a = new ghd();
    public static final hhd b = hhd.b;

    @Override // defpackage.b64
    public final i64 a() {
        return b;
    }

    @Override // defpackage.b64
    public final l64 b(String str, e64 e64Var, Bundle bundle) {
        k64 k41Var;
        k64 k64Var;
        if (!b.a.contains(e64Var)) {
            return null;
        }
        hhd.b.getClass();
        if (e64Var.equals(hhd.c)) {
            k64Var = fhd.b;
        } else if (e64Var.equals(hhd.d)) {
            k64Var = fhd.c;
        } else if (e64Var.equals(hhd.e)) {
            k64Var = fhd.o;
        } else {
            if (!e64Var.equals(hhd.f)) {
                hm9.p(ghd.class.getName(), "invalid route " + e64Var, new IllegalArgumentException("invalid route " + e64Var));
                return null;
            }
            String strF = i24.F("mode", bundle);
            if (!strF.equals("setup")) {
                if (!strF.equals("confirm")) {
                    throw new IllegalStateException("illegal mode".toString());
                }
                k41Var = new k41(i24.F("hash", bundle), 1);
                return new l64(str, e64Var, bundle, 0, null, k41Var, 24);
            }
            k64Var = fhd.X;
        }
        k41Var = k64Var;
        return new l64(str, e64Var, bundle, 0, null, k41Var, 24);
    }
}
