package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class tv extends hu3 {
    public Object X;
    public ua3 Y;
    public long Z;
    public bx o;
    public /* synthetic */ Object s0;
    public final /* synthetic */ bx t0;
    public int u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv(bx bxVar, Continuation continuation) {
        super(continuation);
        this.t0 = bxVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.s0 = obj;
        this.u0 |= Integer.MIN_VALUE;
        return this.t0.s(0L, this);
    }
}
