package defpackage;

import java.util.Collection;
import java.util.Objects;

/* loaded from: classes.dex */
public final class yq5 extends p0 {
    public final Object X;
    public final /* synthetic */ int c;
    public final kde o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yq5(wq5 wq5Var, kde kdeVar, Object obj, int i) {
        super(wq5Var);
        this.c = i;
        this.o = kdeVar;
        this.X = obj;
    }

    @Override // defpackage.wq5
    public final void g(vae vaeVar) {
        wq5 wq5Var = this.b;
        Object obj = this.X;
        kde kdeVar = this.o;
        switch (this.c) {
            case 0:
                try {
                    Object obj2 = kdeVar.get();
                    Objects.requireNonNull(obj2, "The initial value supplied is null");
                    wq5Var.c(new xq5(vaeVar, obj2, (ol0) obj));
                    return;
                } catch (Throwable th) {
                    c37.B(th);
                    b05.b(th, vaeVar);
                    return;
                }
            case 1:
                try {
                    Object obj3 = kdeVar.get();
                    if (obj3 == null) {
                        throw q45.b("The collectionSupplier returned a null Collection.");
                    }
                    p45 p45Var = q45.a;
                    wq5Var.c(new er5(vaeVar, (b66) obj, (Collection) obj3));
                    return;
                } catch (Throwable th2) {
                    c37.B(th2);
                    b05.b(th2, vaeVar);
                    return;
                }
            default:
                try {
                    Object obj4 = kdeVar.get();
                    Objects.requireNonNull(obj4, "The seed supplied is null");
                    wq5Var.c(new as5(vaeVar, (pl0) obj, obj4, wq5.a));
                    return;
                } catch (Throwable th3) {
                    c37.B(th3);
                    b05.b(th3, vaeVar);
                    return;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq5(nr5 nr5Var, jj9 jj9Var) {
        super(nr5Var);
        this.c = 1;
        s66 s66Var = s66.a;
        this.X = jj9Var;
        this.o = s66Var;
    }
}
