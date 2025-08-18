package defpackage;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class we9 extends gle {
    public final fs8 c;

    public we9(fs8 fs8Var) {
        this.c = fs8Var;
    }

    public static final we9 c(gy8 gy8Var) {
        String strP;
        if (!gy8Var.m()) {
            return null;
        }
        int iX0 = gy8Var.x0();
        fs8 fs8VarZ = null;
        for (int i = 0; i < iX0; i++) {
            try {
                strP = lz7.P(gy8Var);
            } catch (Throwable th) {
                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                Iterator it = u7d.a.iterator();
                while (it.hasNext()) {
                    ((r4a) it.next()).getClass();
                    r4a.a(th);
                }
                int iS = au1.s(k7d.a);
                if (iS != 0) {
                    if (iS != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th;
                }
                strP = null;
            }
            if (strP != null) {
                if (strP.equals("message")) {
                    fs8VarZ = tpa.z(gy8Var);
                } else {
                    gy8Var.z();
                }
            }
        }
        return new we9(fs8VarZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof we9) && tpa.f(this.c, ((we9) obj).c);
    }

    public final int hashCode() {
        fs8 fs8Var = this.c;
        if (fs8Var == null) {
            return 0;
        }
        return fs8Var.hashCode();
    }

    @Override // defpackage.zje
    public final String toString() {
        return "Response(message=" + this.c + ")";
    }
}
