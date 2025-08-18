package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lo5 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ mo5 Y;
    public int Z;
    public mo5 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo5(mo5 mo5Var, Continuation continuation) {
        super(continuation);
        this.Y = mo5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.a(null, this);
    }
}
