package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class dp5 extends hu3 {
    public int X;
    public final /* synthetic */ zn5 Y;
    public zn5 Z;
    public /* synthetic */ Object o;
    public on5 s0;
    public iqc t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp5(zn5 zn5Var, Continuation continuation) {
        super(continuation);
        this.Y = zn5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.d(null, this);
    }
}
