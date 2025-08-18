package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xve extends hu3 {
    public Object X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ zve Z;
    public Object o;
    public int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xve(zve zveVar, Continuation continuation) {
        super(continuation);
        this.Z = zveVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.a(null, this);
    }
}
