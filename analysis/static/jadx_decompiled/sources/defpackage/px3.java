package defpackage;

import java.util.function.BinaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class px3 implements BinaryOperator {
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        x77 x77Var = (x77) obj;
        x77 x77Var2 = (x77) obj2;
        if (x77Var != null) {
            x77Var.cancel(null);
        }
        return x77Var2;
    }
}
