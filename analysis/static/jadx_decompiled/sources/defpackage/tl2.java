package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class tl2 extends hu3 {
    public final /* synthetic */ cm2 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl2(cm2 cm2Var, Continuation continuation) {
        super(continuation);
        this.X = cm2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.a(0L, this);
    }
}
