package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class iz9 extends qy9 {
    public final /* synthetic */ int a;
    public final kde b;

    public /* synthetic */ iz9(kde kdeVar, int i) {
        this.a = i;
        this.b = kdeVar;
    }

    @Override // defpackage.qy9
    public final void q(f2a f2aVar) {
        Object obj;
        kde kdeVar = this.b;
        switch (this.a) {
            case 0:
                try {
                    Object obj2 = kdeVar.get();
                    Objects.requireNonNull(obj2, "The supplier returned a null ObservableSource");
                    ((r1a) obj2).a(f2aVar);
                    return;
                } catch (Throwable th) {
                    c37.B(th);
                    iz4.b(th, f2aVar);
                    return;
                }
            default:
                try {
                    obj = kdeVar.get();
                } catch (Throwable th2) {
                    th = th2;
                    c37.B(th);
                }
                if (obj == null) {
                    throw q45.b("Supplier returned a null Throwable.");
                }
                p45 p45Var = q45.a;
                th = (Throwable) obj;
                iz4.b(th, f2aVar);
                return;
        }
    }
}
