package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ms8 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ns8 Y;
    public int Z;
    public ns8 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms8(ns8 ns8Var, Continuation continuation) {
        super(continuation);
        this.Y = ns8Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.e(null, this);
    }
}
