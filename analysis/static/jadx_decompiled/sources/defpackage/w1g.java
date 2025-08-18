package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class w1g extends hu3 {
    public i1g X;
    public v1g Y;
    public m8e Z;
    public f2g o;
    public /* synthetic */ Object s0;
    public final /* synthetic */ f2g t0;
    public int u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1g(f2g f2gVar, Continuation continuation) {
        super(continuation);
        this.t0 = f2gVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.s0 = obj;
        this.u0 |= Integer.MIN_VALUE;
        return this.t0.h(null, false, this);
    }
}
