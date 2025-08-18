package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rz8 extends hu3 {
    public int X;
    public on5 Y;
    public final /* synthetic */ sz8 Z;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz8(sz8 sz8Var, Continuation continuation) {
        super(continuation);
        this.Z = sz8Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Z.a(null, this);
    }
}
