package defpackage;

import java.util.function.UnaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class y5e implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ u4e b;

    public /* synthetic */ y5e(u4e u4eVar, int i) {
        this.a = i;
        this.b = u4eVar;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                break;
        }
        return new c6e(this.b.b, ((c6e) obj).b);
    }
}
