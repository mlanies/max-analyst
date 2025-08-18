package defpackage;

import java.util.function.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class oo2 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ m56 b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ oo2(v8 v8Var, int i) {
        this.a = i;
        this.b = (m56) v8Var;
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.invoke(obj);
                break;
            default:
                this.b.invoke(obj);
                break;
        }
    }
}
