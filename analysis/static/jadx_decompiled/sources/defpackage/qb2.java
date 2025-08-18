package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qb2 extends hu3 {
    public Comparator X;
    public Collection Y;
    public Iterator Z;
    public zb2 o;
    public /* synthetic */ Object s0;
    public final /* synthetic */ zb2 t0;
    public int u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb2(zb2 zb2Var, Continuation continuation) {
        super(continuation);
        this.t0 = zb2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.s0 = obj;
        this.u0 |= Integer.MIN_VALUE;
        return zb2.b(this.t0, null, false, this);
    }
}
