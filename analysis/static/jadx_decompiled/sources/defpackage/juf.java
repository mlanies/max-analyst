package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class juf extends hu3 {
    public ln0 X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ouf Z;
    public Object o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public juf(ouf oufVar, Continuation continuation) {
        super(continuation);
        this.Z = oufVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.l(null, this);
    }
}
