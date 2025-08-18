package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ls8 extends hu3 {
    public long X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ns8 Z;
    public ns8 o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls8(ns8 ns8Var, Continuation continuation) {
        super(continuation);
        this.Z = ns8Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.d(0L, this);
    }
}
