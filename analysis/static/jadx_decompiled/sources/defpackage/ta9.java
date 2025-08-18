package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ta9 extends hu3 {
    public int X;
    public on5 Y;
    public final /* synthetic */ ra9 Z;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta9(ra9 ra9Var, Continuation continuation) {
        super(continuation);
        this.Z = ra9Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Z.a(null, this);
    }
}
