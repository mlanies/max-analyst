package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ku0 extends hu3 {
    public CharSequence X;
    public Set Y;
    public /* synthetic */ Object Z;
    public Long o;
    public final /* synthetic */ lu0 s0;
    public int t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku0(lu0 lu0Var, Continuation continuation) {
        super(continuation);
        this.s0 = lu0Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Z = obj;
        this.t0 |= Integer.MIN_VALUE;
        return this.s0.a(null, null, null, null, this);
    }
}
