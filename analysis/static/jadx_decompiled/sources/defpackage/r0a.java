package defpackage;

/* loaded from: classes.dex */
public final class r0a extends w2 {
    public final ztc b;
    public final int c;

    public r0a(r1a r1aVar, ztc ztcVar, int i) {
        super(r1aVar);
        this.b = ztcVar;
        this.c = i;
    }

    @Override // defpackage.qy9
    public final void q(f2a f2aVar) {
        ztc ztcVar = this.b;
        boolean z = ztcVar instanceof u0f;
        r1a r1aVar = this.a;
        if (z) {
            r1aVar.a(f2aVar);
        } else {
            r1aVar.a(new q0a(f2aVar, ztcVar.a(), this.c));
        }
    }
}
