package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class yac extends hu3 {
    public bac X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ cbc Z;
    public cbc o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yac(cbc cbcVar, Continuation continuation) {
        super(continuation);
        this.Z = cbcVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return cbc.r(this.Z, null, 0L, null, this);
    }
}
