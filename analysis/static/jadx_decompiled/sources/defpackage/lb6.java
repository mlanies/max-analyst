package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lb6 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ mb6 Y;
    public int Z;
    public mb6 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb6(mb6 mb6Var, Continuation continuation) {
        super(continuation);
        this.Y = mb6Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.d(this);
    }
}
