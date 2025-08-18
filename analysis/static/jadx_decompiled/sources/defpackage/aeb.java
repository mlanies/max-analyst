package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class aeb extends hu3 {
    public int X;
    public beb Y;
    public Object Z;
    public /* synthetic */ Object o;
    public final /* synthetic */ beb s0;
    public Object t0;
    public uj3 u0;
    public q0e v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeb(beb bebVar, Continuation continuation) {
        super(continuation);
        this.s0 = bebVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.s0.a(null, this);
    }
}
