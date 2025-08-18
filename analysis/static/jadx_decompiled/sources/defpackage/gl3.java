package defpackage;

import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class gl3 implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ gl3(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((jl3) obj).c;
            case 1:
                return ((op3) obj).b;
            case 2:
                return Long.valueOf(((wm3) obj).a);
            case 3:
                return Long.valueOf(((kzc) obj).o.a);
            case 4:
                return Long.valueOf(((kzc) obj).X.n());
            case 5:
                return ((jl3) obj).a();
            case 6:
                return Long.valueOf(((kzc) obj).o.b.a);
            default:
                return Long.valueOf(((kzc) obj).X.n());
        }
    }
}
