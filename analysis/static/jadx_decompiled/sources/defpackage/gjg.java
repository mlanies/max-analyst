package defpackage;

/* loaded from: classes.dex */
public final class gjg extends sig {
    public final /* synthetic */ qne b;
    public final /* synthetic */ sig c;
    public final /* synthetic */ mkg o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjg(mkg mkgVar, qne qneVar, qne qneVar2, uhg uhgVar) {
        super(qneVar);
        this.b = qneVar2;
        this.c = uhgVar;
        this.o = mkgVar;
    }

    @Override // defpackage.sig
    public final void a() {
        synchronized (this.o.f) {
            try {
                mkg mkgVar = this.o;
                qne qneVar = this.b;
                mkgVar.e.add(qneVar);
                qneVar.a.i(new bdb(mkgVar, 16, qneVar));
                if (this.o.k.getAndIncrement() > 0) {
                    this.o.b.b("Already connected to the service.", new Object[0]);
                }
                mkg.b(this.o, this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
