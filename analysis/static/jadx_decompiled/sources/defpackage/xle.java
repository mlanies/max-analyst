package defpackage;

import java.util.function.UnaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class xle implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ yle b;

    public /* synthetic */ xle(yle yleVar, int i) {
        this.a = i;
        this.b = yleVar;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                x9d x9dVar = (x9d) obj;
                if (x9dVar != null) {
                    x9dVar.f(false);
                }
                return this.b.g();
            default:
                return yle.d(this.b, (x9d) obj);
        }
    }
}
