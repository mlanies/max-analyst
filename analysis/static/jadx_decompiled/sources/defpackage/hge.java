package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hge extends hu3 {
    public int X;
    public on5 Y;
    public final /* synthetic */ ege Z;
    public /* synthetic */ Object o;
    public v6f s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hge(ege egeVar, Continuation continuation) {
        super(continuation);
        this.Z = egeVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Z.a(null, this);
    }
}
