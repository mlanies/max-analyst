package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dh9 extends hu3 {
    public cu8 X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ eh9 Z;
    public eh9 o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh9(eh9 eh9Var, Continuation continuation) {
        super(continuation);
        this.Z = eh9Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.a(this);
    }
}
