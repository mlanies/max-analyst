package defpackage;

import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ku5 extends hu3 {
    public at5 X;
    public Set Y;
    public gi9 Z;
    public nu5 o;
    public xs s0;
    public Iterator t0;
    public /* synthetic */ Object u0;
    public final /* synthetic */ nu5 v0;
    public int w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku5(nu5 nu5Var, Continuation continuation) {
        super(continuation);
        this.v0 = nu5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.u0 = obj;
        this.w0 |= Integer.MIN_VALUE;
        return nu5.q(this.v0, null, this);
    }
}
