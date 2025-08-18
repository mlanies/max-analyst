package defpackage;

import java.util.Collection;
import java.util.Objects;

/* loaded from: classes.dex */
public final class xy9 extends w2 {
    public final /* synthetic */ int b;
    public final Object c;
    public final Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xy9(r1a r1aVar, Object obj, Object obj2, int i) {
        super(r1aVar);
        this.b = i;
        this.c = obj;
        this.o = obj2;
    }

    @Override // defpackage.qy9
    public final void q(f2a f2aVar) {
        r1a r1aVar = this.a;
        Object obj = this.o;
        Object obj2 = this.c;
        switch (this.b) {
            case 0:
                try {
                    Object obj3 = ((kde) obj2).get();
                    Objects.requireNonNull(obj3, "The initialSupplier returned a null value");
                    r1aVar.a(new wy9(f2aVar, obj3, (ol0) obj, 0));
                    return;
                } catch (Throwable th) {
                    c37.B(th);
                    iz4.b(th, f2aVar);
                    return;
                }
            case 1:
                try {
                    Object obj4 = ((kde) obj2).get();
                    if (obj4 == null) {
                        throw q45.b("The collectionSupplier returned a null Collection.");
                    }
                    p45 p45Var = q45.a;
                    r1aVar.a(new kz9(f2aVar, (b66) obj, (Collection) obj4));
                    return;
                } catch (Throwable th2) {
                    c37.B(th2);
                    iz4.b(th2, f2aVar);
                    return;
                }
            default:
                r1aVar.a(new em4(f2aVar, (qj3) obj2, (f6) obj));
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy9(r1a r1aVar, b66 b66Var) {
        super(r1aVar);
        this.b = 1;
        s66 s66Var = s66.a;
        this.o = b66Var;
        this.c = s66Var;
    }
}
