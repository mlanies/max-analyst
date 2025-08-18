package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class udf extends gle {
    public long X;
    public boolean Y;
    public List c;
    public long o;

    public udf(gy8 gy8Var) {
        super(gy8Var);
        if (this.c == null) {
            this.c = Collections.emptyList();
        }
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        str.getClass();
        switch (str) {
            case "forwardMarker":
                this.o = lz7.M(gy8Var, 0L);
                break;
            case "hasMore":
                this.Y = lz7.H(gy8Var);
                break;
            case "history":
                this.c = lz7.W(gy8Var, new lq9());
                break;
            case "backwardMarker":
                this.X = lz7.M(gy8Var, 0L);
                break;
            default:
                gy8Var.z();
                break;
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        int iO = s5c.o(this.c);
        long j = this.o;
        long j2 = this.X;
        boolean z = this.Y;
        StringBuilder sb = new StringBuilder("{calls=");
        sb.append(iO);
        sb.append(", forwardMarker=");
        sb.append(j);
        au1.q(j2, ", backwardMarker=", ", hasMore=", sb);
        return au1.j(sb, z, "}");
    }
}
