package defpackage;

import java.util.function.UnaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class m5e implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ t4e b;

    public /* synthetic */ m5e(t4e t4eVar, int i) {
        this.a = i;
        this.b = t4eVar;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        l5e l5eVar = (l5e) obj;
        switch (this.a) {
            case 0:
                return new l5e(l5eVar.a, this.b.b);
            default:
                return new l5e(l5eVar.a, this.b.b);
        }
    }
}
