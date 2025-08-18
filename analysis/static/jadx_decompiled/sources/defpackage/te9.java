package defpackage;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class te9 extends gle {
    public final f52 c;

    public te9(f52 f52Var) {
        this.c = f52Var;
    }

    public static final te9 c(gy8 gy8Var) {
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
        if (iN == 0) {
            return null;
        }
        f52 f52VarA = null;
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
                if (strP.equals("chat")) {
                    f52VarA = f52.a(gy8Var);
                } else {
                    try {
                        gy8Var.z();
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
                    }
                }
            }
        }
        return new te9(f52VarA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof te9) && tpa.f(this.c, ((te9) obj).c);
    }

    public final int hashCode() {
        f52 f52Var = this.c;
        if (f52Var == null) {
            return 0;
        }
        return f52Var.hashCode();
    }

    @Override // defpackage.zje
    public final String toString() {
        return "Response(chat=" + this.c + ")";
    }
}
