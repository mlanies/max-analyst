package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class bya extends hu3 {
    public int X;
    public final /* synthetic */ zxa Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bya(zxa zxaVar, Continuation continuation) {
        super(continuation);
        this.Y = zxaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a(null, this);
    }
}
