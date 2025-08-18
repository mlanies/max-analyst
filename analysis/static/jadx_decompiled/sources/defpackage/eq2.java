package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class eq2 extends hu3 {
    public int X;
    public on5 Y;
    public final /* synthetic */ y40 Z;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq2(y40 y40Var, Continuation continuation) {
        super(continuation);
        this.Z = y40Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Z.a(null, this);
    }
}
