package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class oq5 extends hu3 {
    public int X;
    public final /* synthetic */ j31 Y;
    public j31 Z;
    public /* synthetic */ Object o;
    public on5 s0;
    public mec t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq5(j31 j31Var, Continuation continuation) {
        super(continuation);
        this.Y = j31Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.d(null, this);
    }
}
