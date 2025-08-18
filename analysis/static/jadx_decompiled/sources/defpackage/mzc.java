package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class mzc extends hu3 {
    public kzc X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ nzc Z;
    public nzc o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzc(nzc nzcVar, Continuation continuation) {
        super(continuation);
        this.Z = nzcVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.a(null, this);
    }
}
