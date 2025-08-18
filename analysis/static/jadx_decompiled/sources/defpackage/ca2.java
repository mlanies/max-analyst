package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ca2 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ka2 Y;
    public int Z;
    public AtomicLong o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca2(ka2 ka2Var, Continuation continuation) {
        super(continuation);
        this.Y = ka2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.h(null, null, this);
    }
}
