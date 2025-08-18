package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class lac {
    public volatile vxd a;
    public long b;
    public long c;
    public final q0e d;
    public final w7c e;

    public lac() {
        q0e q0eVarA = r0e.a(null);
        this.d = q0eVarA;
        this.e = new w7c(q0eVarA);
    }

    public final void a() {
        vxd vxdVar = this.a;
        if (vxdVar != null) {
            vxdVar.cancel((CancellationException) null);
        }
        this.a = null;
        Long l = (Long) this.d.getValue();
        this.b = l != null ? l.longValue() : 0L;
    }
}
