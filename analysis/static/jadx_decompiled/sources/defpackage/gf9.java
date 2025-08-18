package defpackage;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class gf9 extends gle {
    public final fx8 c;
    public final String o;

    public gf9(fx8 fx8Var, String str) {
        this.c = fx8Var;
        this.o = str;
    }

    public static final gf9 c(gy8 gy8Var) {
        int iN;
        String strP;
        if (!gy8Var.m()) {
            return null;
        }
        try {
            iN = lz7.N(gy8Var);
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
            iN = 0;
        }
        fx8 fx8VarF = null;
        String strP2 = null;
        for (int i = 0; i < iN; i++) {
            try {
                strP = lz7.P(gy8Var);
            } catch (Throwable th2) {
                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                Iterator it2 = u7d.a.iterator();
                while (it2.hasNext()) {
                    ((r4a) it2.next()).getClass();
                    r4a.a(th2);
                }
                int iS2 = au1.s(k7d.a);
                if (iS2 != 0) {
                    if (iS2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th2;
                }
                strP = null;
            }
            if (strP != null) {
                if (strP.equals("reactionInfo")) {
                    fx8VarF = ote.F(gy8Var);
                } else if (strP.equals("error")) {
                    try {
                        strP2 = lz7.P(gy8Var);
                    } catch (Throwable th3) {
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                        Iterator it3 = u7d.a.iterator();
                        while (it3.hasNext()) {
                            ((r4a) it3.next()).getClass();
                            r4a.a(th3);
                        }
                        int iS3 = au1.s(k7d.a);
                        if (iS3 != 0) {
                            if (iS3 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th3;
                        }
                        strP2 = null;
                    }
                } else {
                    try {
                        gy8Var.z();
                    } catch (Throwable th4) {
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                        Iterator it4 = u7d.a.iterator();
                        while (it4.hasNext()) {
                            ((r4a) it4.next()).getClass();
                            r4a.a(th4);
                        }
                        int iS4 = au1.s(k7d.a);
                        if (iS4 != 0) {
                            if (iS4 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th4;
                        }
                    }
                }
            }
        }
        return new gf9(fx8VarF, strP2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf9)) {
            return false;
        }
        gf9 gf9Var = (gf9) obj;
        return tpa.f(this.c, gf9Var.c) && tpa.f(this.o, gf9Var.o);
    }

    public final int hashCode() {
        fx8 fx8Var = this.c;
        int iHashCode = (fx8Var == null ? 0 : fx8Var.hashCode()) * 31;
        String str = this.o;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.zje
    public final String toString() {
        return "Response(reactionInfo=" + this.c + ", error=" + this.o + ")";
    }
}
