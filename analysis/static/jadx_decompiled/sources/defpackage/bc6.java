package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bc6 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ cc6 Y;
    public int Z;
    public cc6 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc6(cc6 cc6Var, Continuation continuation) {
        super(continuation);
        this.Y = cc6Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.a(0L, 0L, null, null, null, this);
    }
}
