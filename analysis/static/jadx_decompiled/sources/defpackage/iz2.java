package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class iz2 extends hu3 {
    public Set X;
    public long Y;
    public int Z;
    public jz2 o;
    public /* synthetic */ Object s0;
    public final /* synthetic */ jz2 t0;
    public int u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz2(jz2 jz2Var, Continuation continuation) {
        super(continuation);
        this.t0 = jz2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.s0 = obj;
        this.u0 |= Integer.MIN_VALUE;
        return this.t0.v(0L, null, 0, this);
    }
}
