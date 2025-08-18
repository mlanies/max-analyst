package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class s79 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ u79 Y;
    public int Z;
    public u79 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s79(u79 u79Var, Continuation continuation) {
        super(continuation);
        this.Y = u79Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.a(null, this);
    }
}
