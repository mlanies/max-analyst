package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zz2 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ a03 Y;
    public int Z;
    public a03 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zz2(a03 a03Var, Continuation continuation) {
        super(continuation);
        this.Y = a03Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.a(null, 0, this);
    }
}
