package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mff extends hu3 {
    public k20 X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ rff Z;
    public rff o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mff(rff rffVar, Continuation continuation) {
        super(continuation);
        this.Z = rffVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.b(null, 0L, 0L, this);
    }
}
