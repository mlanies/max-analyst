package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zdb extends hu3 {
    public int X;
    public o69 Y;
    public final /* synthetic */ o69 Z;
    public /* synthetic */ Object o;
    public on5 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdb(o69 o69Var, Continuation continuation) {
        super(continuation);
        this.Z = o69Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Z.a(null, this);
    }
}
