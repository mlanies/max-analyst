package defpackage;

import java.util.function.BiConsumer;
import one.me.android.OneMeApplication;

/* loaded from: classes2.dex */
public final /* synthetic */ class a29 implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ a66 b;

    public /* synthetic */ a29(a66 a66Var, int i) {
        this.a = i;
        this.b = a66Var;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        a66 a66Var = this.b;
        switch (this.a) {
            case 0:
                a66Var.invoke(obj, obj2);
                break;
            default:
                int i = OneMeApplication.s0;
                a66Var.invoke(obj, obj2);
                break;
        }
    }
}
