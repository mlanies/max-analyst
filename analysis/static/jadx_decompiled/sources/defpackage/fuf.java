package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fuf extends hu3 {
    public hn0 X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ouf Z;
    public ouf o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fuf(ouf oufVar, Continuation continuation) {
        super(continuation);
        this.Z = oufVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.j(null, this);
    }
}
