package defpackage;

import java.util.Collection;
import java.util.Objects;

/* loaded from: classes.dex */
public final class yr5 extends p0 {
    public final /* synthetic */ int c;
    public final Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yr5(wq5 wq5Var, Object obj, int i) {
        super(wq5Var);
        this.c = i;
        this.o = obj;
    }

    @Override // defpackage.wq5
    public final void g(vae vaeVar) {
        wq5 wq5Var = this.b;
        Object obj = this.o;
        switch (this.c) {
            case 0:
                c7d c7dVar = new c7d(vaeVar);
                hm9.j0(8, "capacityHint");
                z6d z6dVar = new z6d(new c5f());
                try {
                    Object objMo131apply = ((b66) obj).mo131apply(z6dVar);
                    Objects.requireNonNull(objMo131apply, "handler returned a null Publisher");
                    ypb ypbVar = (ypb) objMo131apply;
                    wr5 wr5Var = new wr5(wq5Var);
                    xr5 xr5Var = new xr5(c7dVar, z6dVar, wr5Var);
                    wr5Var.o = xr5Var;
                    vaeVar.f(xr5Var);
                    ((wq5) ypbVar).d(wr5Var);
                    wr5Var.e(0);
                    return;
                } catch (Throwable th) {
                    c37.B(th);
                    b05.b(th, vaeVar);
                    return;
                }
            default:
                try {
                    Object obj2 = ((kde) obj).get();
                    if (obj2 == null) {
                        throw q45.b("The collectionSupplier returned a null Collection.");
                    }
                    p45 p45Var = q45.a;
                    Collection collection = (Collection) obj2;
                    js5 js5Var = new js5(vaeVar);
                    js5Var.b = collection;
                    wq5Var.c(js5Var);
                    return;
                } catch (Throwable th2) {
                    c37.B(th2);
                    b05.b(th2, vaeVar);
                    return;
                }
        }
    }
}
