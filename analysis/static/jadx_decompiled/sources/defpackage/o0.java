package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class o0 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ mqc Y;
    public int Z;
    public iqc o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(mqc mqcVar, Continuation continuation) {
        super(continuation);
        this.Y = mqcVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.d(null, this);
    }
}
