package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cz2 extends hu3 {
    public long X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ jz2 Z;
    public jz2 o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz2(jz2 jz2Var, Continuation continuation) {
        super(continuation);
        this.Z = jz2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.j(0L, this);
    }
}
