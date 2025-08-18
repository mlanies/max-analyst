package defpackage;

import java.util.function.UnaryOperator;

/* loaded from: classes.dex */
public final class ak2 implements UnaryOperator {
    public final /* synthetic */ l29 a;

    public ak2(l29 l29Var) {
        this.a = l29Var;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        l29 l29Var = this.a;
        return new bj2(l29Var.c, l29Var.b);
    }
}
