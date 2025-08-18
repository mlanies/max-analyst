package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qe8 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ te8 Y;
    public int Z;
    public te8 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe8(te8 te8Var, Continuation continuation) {
        super(continuation);
        this.Y = te8Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return te8.q(this.Y, null, null, this);
    }
}
