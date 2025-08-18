package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vm2 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ cn2 Y;
    public int Z;
    public AtomicLong o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm2(cn2 cn2Var, Continuation continuation) {
        super(continuation);
        this.Y = cn2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.c(null, null, this);
    }
}
