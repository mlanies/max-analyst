package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class e97 extends hu3 {
    public int X;
    public final /* synthetic */ ix2 Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e97(ix2 ix2Var, Continuation continuation) {
        super(continuation);
        this.Y = ix2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a(null, this);
    }
}
