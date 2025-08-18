package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class x82 {
    public static final x82 f = new x82(null, 0, 0, 0, Collections.emptyList());
    public static final x82 g = new x82(null, 0, 0, 0, Collections.emptyList());
    public final d92 a;
    public final int b;
    public final long c;
    public final long d;
    public final List e;

    public x82(d92 d92Var, int i, long j, long j2, List list) {
        this.a = d92Var;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = list;
    }

    public final w82 a() {
        w82 w82Var = new w82();
        w82Var.o = this.a;
        w82Var.a = this.b;
        w82Var.b = this.c;
        w82Var.c = this.d;
        w82Var.X = this.e;
        return w82Var;
    }
}
