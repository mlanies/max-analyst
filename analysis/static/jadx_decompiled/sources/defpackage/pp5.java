package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class pp5 extends hu3 {
    public /* synthetic */ Object X;
    public int Y;
    public final /* synthetic */ yn5 Z;
    public yn5 o;
    public Object s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp5(yn5 yn5Var, Continuation continuation) {
        super(continuation);
        this.Z = yn5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.Z.a(null, this);
    }
}
