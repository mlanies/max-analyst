package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class muf extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ouf Y;
    public int Z;
    public ln0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public muf(ouf oufVar, Continuation continuation) {
        super(continuation);
        this.Y = oufVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return ouf.d(this.Y, null, this);
    }
}
