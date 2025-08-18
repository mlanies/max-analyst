package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class o32 extends hu3 {
    public mn5 X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ p32 Z;
    public p32 o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o32(p32 p32Var, Continuation continuation) {
        super(continuation);
        this.Z = p32Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.b(null, this);
    }
}
