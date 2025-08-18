package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class l83 extends hu3 {
    public gi9 X;
    public LinkedHashSet Y;
    public Iterator Z;
    public m83 o;
    public /* synthetic */ Object s0;
    public final /* synthetic */ m83 t0;
    public int u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l83(m83 m83Var, Continuation continuation) {
        super(continuation);
        this.t0 = m83Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.s0 = obj;
        this.u0 |= Integer.MIN_VALUE;
        return this.t0.c(null, this);
    }
}
