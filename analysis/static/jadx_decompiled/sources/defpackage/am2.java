package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class am2 extends hu3 {
    public sl2 X;
    public Iterator Y;
    public /* synthetic */ Object Z;
    public cm2 o;
    public final /* synthetic */ cm2 s0;
    public int t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am2(cm2 cm2Var, Continuation continuation) {
        super(continuation);
        this.s0 = cm2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Z = obj;
        this.t0 |= Integer.MIN_VALUE;
        return this.s0.g(null, this);
    }
}
