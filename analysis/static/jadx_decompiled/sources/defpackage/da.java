package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class da extends hu3 {
    public ea X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ea Z;
    public ea o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(ea eaVar, Continuation continuation) {
        super(continuation);
        this.Z = eaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.a(0, 0L, 0L, this);
    }
}
