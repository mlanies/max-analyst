package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zjf extends gle {
    public long X;
    public Map c;
    public boolean o;

    public zjf(gy8 gy8Var) {
        super(gy8Var);
        if (this.c == null) {
            this.c = Collections.emptyMap();
        }
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        str.getClass();
        if (str.equals("startTime")) {
            this.X = lz7.M(gy8Var, 0L);
            return;
        }
        if (str.equals("live")) {
            this.o = lz7.H(gy8Var);
            return;
        }
        String strP = lz7.P(gy8Var);
        if (oag.t(strP)) {
            return;
        }
        if (this.c == null) {
            this.c = new HashMap();
        }
        this.c.put(str, strP);
    }

    @Override // defpackage.zje
    public final String toString() {
        int iS = s5c.S(this.c);
        boolean z = this.o;
        long j = this.X;
        StringBuilder sb = new StringBuilder("{urls=");
        sb.append(iS);
        sb.append(", live=");
        sb.append(z);
        sb.append(", startTime=");
        return zr6.k(sb, j, "}");
    }
}
