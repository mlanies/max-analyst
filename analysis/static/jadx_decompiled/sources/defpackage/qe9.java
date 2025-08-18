package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class qe9 extends gle {
    public final long c;
    public final Set o;

    public qe9(long j, LinkedHashSet linkedHashSet) {
        this.c = j;
        this.o = linkedHashSet;
    }

    public static final qe9 c(gy8 gy8Var) {
        int iN;
        if (!gy8Var.m() || (iN = lz7.N(gy8Var)) == 0) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        long jM = 0;
        for (int i = 0; i < iN; i++) {
            String strP = lz7.P(gy8Var);
            if (strP != null) {
                if (strP.equals(ApiProtocol.PARAM_CHAT_ID)) {
                    jM = lz7.M(gy8Var, 0L);
                } else if (strP.equals("messageIds")) {
                    int iG = lz7.G(gy8Var);
                    for (int i2 = 0; i2 < iG; i2++) {
                        linkedHashSet.add(Long.valueOf(gy8Var.w0()));
                    }
                } else {
                    gy8Var.z();
                }
            }
        }
        return new qe9(jM, linkedHashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe9)) {
            return false;
        }
        qe9 qe9Var = (qe9) obj;
        return this.c == qe9Var.c && tpa.f(this.o, qe9Var.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + (Long.hashCode(this.c) * 31);
    }

    @Override // defpackage.zje
    public final String toString() {
        return "Response(chatId=" + this.c + ", messageIds=" + this.o + ")";
    }
}
