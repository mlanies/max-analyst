package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class i59 extends hu3 {
    public int X;
    public zq Y;
    public Object Z;
    public /* synthetic */ Object o;
    public final /* synthetic */ zq s0;
    public e52 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i59(zq zqVar, Continuation continuation) {
        super(continuation);
        this.s0 = zqVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.s0.a(null, this);
    }
}
