package defpackage;

import java.util.Collection;

/* loaded from: classes.dex */
public final class s1a extends w2 {
    public final /* synthetic */ int b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1a(r1a r1aVar, Object obj, int i) {
        super(r1aVar);
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.qy9
    public final void q(f2a f2aVar) {
        r1a r1aVar = this.a;
        Object obj = this.c;
        switch (this.b) {
            case 0:
                iq1 iq1Var = new iq1(f2aVar);
                f2aVar.c(iq1Var);
                ztc ztcVar = (ztc) obj;
                dm4.e(iq1Var, ztcVar.b(new i76((Object) this, (Object) iq1Var, false, 12)));
                return;
            case 1:
                r1aVar.a(new e2a(f2aVar, (f55) ((ztc) obj)));
                return;
            default:
                try {
                    Object obj2 = ((kde) obj).get();
                    if (obj2 == null) {
                        throw q45.b("The collectionSupplier returned a null Collection.");
                    }
                    p45 p45Var = q45.a;
                    r1aVar.a(new cb3(f2aVar, 4, (Collection) obj2));
                    return;
                } catch (Throwable th) {
                    c37.B(th);
                    iz4.b(th, f2aVar);
                    return;
                }
        }
    }
}
