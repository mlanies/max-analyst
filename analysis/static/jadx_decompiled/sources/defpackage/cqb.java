package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cqb extends hu3 {
    public final /* synthetic */ eqb X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqb(eqb eqbVar, Continuation continuation) {
        super(continuation);
        this.X = eqbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return eqb.b(this.X, null, null, this);
    }
}
