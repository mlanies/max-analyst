package defpackage;

import java.util.Collection;

/* loaded from: classes.dex */
public final class vy9 extends iqd implements x66 {
    public final /* synthetic */ int a;
    public final r1a b;
    public final Object c;

    public vy9(r1a r1aVar) {
        this.a = 1;
        this.b = r1aVar;
        this.c = new q66();
    }

    @Override // defpackage.x66
    public final qy9 d() {
        switch (this.a) {
            case 0:
                return new ty9(this.b, (b7b) this.c, 0);
            default:
                return new s1a(this.b, (q66) this.c, 2);
        }
    }

    @Override // defpackage.iqd
    public final void l(erd erdVar) {
        r1a r1aVar = this.b;
        Object obj = this.c;
        switch (this.a) {
            case 0:
                r1aVar.a(new uy9(erdVar, (b7b) obj));
                break;
            default:
                try {
                    Object obj2 = ((q66) obj).get();
                    p45 p45Var = q45.a;
                    r1aVar.a(new cb3(erdVar, 5, (Collection) obj2));
                    break;
                } catch (Throwable th) {
                    c37.B(th);
                    iz4.c(th, erdVar);
                    return;
                }
        }
    }

    public vy9(r1a r1aVar, b7b b7bVar) {
        this.a = 0;
        this.b = r1aVar;
        this.c = b7bVar;
    }
}
