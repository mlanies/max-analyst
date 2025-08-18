package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class oqd extends iqd {
    public final /* synthetic */ int a;
    public final kde b;

    public /* synthetic */ oqd(kde kdeVar, int i) {
        this.a = i;
        this.b = kdeVar;
    }

    @Override // defpackage.iqd
    public final void l(erd erdVar) {
        Object obj;
        kde kdeVar = this.b;
        switch (this.a) {
            case 0:
                try {
                    Object obj2 = kdeVar.get();
                    Objects.requireNonNull(obj2, "The singleSupplier returned a null SingleSource");
                    ((iqd) obj2).k(erdVar);
                    return;
                } catch (Throwable th) {
                    c37.B(th);
                    iz4.c(th, erdVar);
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
                iz4.c(th, erdVar);
                return;
        }
    }
}
