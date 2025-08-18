package defpackage;

import java.util.LinkedHashSet;
import java.util.function.UnaryOperator;

/* loaded from: classes.dex */
public final /* synthetic */ class oe2 implements UnaryOperator {
    public final /* synthetic */ int a;

    public /* synthetic */ oe2(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                ne2 ne2Var = (ne2) obj;
                if (ne2Var == null) {
                    return null;
                }
                return new ne2(ne2Var.a, ne2Var.b, ne2Var.c, ne2Var.d, true);
            case 2:
                return new LinkedHashSet();
            case 3:
                return new LinkedHashSet();
            case 4:
                return vv7.a();
            case 5:
                return new LinkedHashSet();
            case 6:
                return vv7.a();
            case 7:
                bc7[] bc7VarArr = l89.p;
                return null;
            case 8:
                return null;
            case 9:
                return String.valueOf(System.currentTimeMillis());
            case 10:
                return wz4.a;
            case 11:
                return new l5e((String) null, 3);
            default:
                x9d x9dVar = (x9d) obj;
                if (x9dVar != null) {
                    x9dVar.f(true);
                }
                return null;
        }
    }
}
