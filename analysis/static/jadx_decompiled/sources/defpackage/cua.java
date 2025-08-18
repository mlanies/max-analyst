package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cua extends hu3 {
    public final /* synthetic */ dua X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cua(dua duaVar, Continuation continuation) {
        super(continuation);
        this.X = duaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        this.X.d(null, this);
        return tx3.a;
    }
}
