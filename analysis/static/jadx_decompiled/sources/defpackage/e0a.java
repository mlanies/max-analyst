package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class e0a extends w2 {
    public final /* synthetic */ int b;
    public final b66 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0a(r1a r1aVar, b66 b66Var, int i) {
        super(r1aVar);
        this.b = i;
        this.c = b66Var;
    }

    @Override // defpackage.qy9
    public final void q(f2a f2aVar) {
        switch (this.b) {
            case 0:
                this.a.a(new d0a(f2aVar, this.c, 0));
                break;
            case 1:
                this.a.a(new d0a(f2aVar, this.c, 1));
                break;
            case 2:
                this.a.a(new f0a(f2aVar, this.c, 0));
                break;
            case 3:
                this.a.a(new wz9(f2aVar, this.c, 1));
                break;
            case 4:
                ana anaVar = new ana(f2aVar, (pc5) this.c);
                f2aVar.c((uy1) anaVar.X);
                this.a.a(anaVar);
                break;
            case 5:
                this.a.a(new f0a(f2aVar, this.c, 1));
                break;
            default:
                b7d b7dVar = new b7d(new xpb());
                try {
                    Object objMo131apply = this.c.mo131apply(b7dVar);
                    Objects.requireNonNull(objMo131apply, "The handler returned a null ObservableSource");
                    r1a r1aVar = (r1a) objMo131apply;
                    k1a k1aVar = new k1a(f2aVar, b7dVar, this.a);
                    f2aVar.c(k1aVar);
                    r1aVar.a(k1aVar.X);
                    k1aVar.a();
                    break;
                } catch (Throwable th) {
                    c37.B(th);
                    iz4.b(th, f2aVar);
                }
        }
    }
}
