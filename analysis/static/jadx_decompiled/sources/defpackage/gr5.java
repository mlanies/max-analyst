package defpackage;

/* loaded from: classes.dex */
public final class gr5 extends wq5 {
    public final /* synthetic */ int b;
    public final Object c;

    public /* synthetic */ gr5(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.wq5
    public final void g(vae vaeVar) {
        Object obj;
        Object obj2 = this.c;
        switch (this.b) {
            case 0:
                try {
                    obj = ((kde) obj2).get();
                } catch (Throwable th) {
                    th = th;
                    c37.B(th);
                }
                if (obj == null) {
                    throw q45.b("Callable returned a null Throwable.");
                }
                p45 p45Var = q45.a;
                th = (Throwable) obj;
                b05.b(th, vaeVar);
                return;
            case 1:
                vaeVar.f(new or5(vaeVar, (Object[]) obj2));
                return;
            case 2:
                ((r1a) obj2).a(new qr5(vaeVar));
                return;
            default:
                ((iqd) obj2).k(new asd(vaeVar));
                return;
        }
    }
}
