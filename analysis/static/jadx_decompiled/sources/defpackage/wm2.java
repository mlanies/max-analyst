package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wm2 extends hu3 {
    public final /* synthetic */ cn2 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm2(cn2 cn2Var, Continuation continuation) {
        super(continuation);
        this.X = cn2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.t(this);
    }
}
