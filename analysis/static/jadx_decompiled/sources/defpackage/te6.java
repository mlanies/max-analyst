package defpackage;

import java.io.Serializable;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class te6 extends hu3 {
    public String X;
    public Serializable Y;
    public /* synthetic */ Object Z;
    public we6 o;
    public final /* synthetic */ we6 s0;
    public int t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te6(we6 we6Var, Continuation continuation) {
        super(continuation);
        this.s0 = we6Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Z = obj;
        this.t0 |= Integer.MIN_VALUE;
        return we6.a(this.s0, null, this);
    }
}
