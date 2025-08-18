package defpackage;

import java.util.function.UnaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class o5e implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ o5e(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return new l5e(this.b, 2);
            default:
                return new c6e(this.b, 1);
        }
    }
}
