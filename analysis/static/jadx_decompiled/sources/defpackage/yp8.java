package defpackage;

import java.io.Serializable;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class yp8 extends hu3 {
    public Object X;
    public Serializable Y;
    public int Z;
    public Object o;
    public /* synthetic */ Object s0;
    public final /* synthetic */ jq8 t0;
    public int u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp8(jq8 jq8Var, Continuation continuation) {
        super(continuation);
        this.t0 = jq8Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.s0 = obj;
        this.u0 |= Integer.MIN_VALUE;
        return this.t0.u(null, null, false, this);
    }
}
