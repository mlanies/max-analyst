package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fz2 extends hu3 {
    public final /* synthetic */ jz2 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz2(jz2 jz2Var, Continuation continuation) {
        super(continuation);
        this.X = jz2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.o(null, this);
    }
}
