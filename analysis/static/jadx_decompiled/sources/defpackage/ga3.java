package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ga3 extends hu3 {
    public int X;
    public final /* synthetic */ y40 Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga3(y40 y40Var, Continuation continuation) {
        super(continuation);
        this.Y = y40Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a(null, this);
    }
}
