package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class oja extends hu3 {
    public Object X;
    public Iterator Y;
    public /* synthetic */ Object Z;
    public sja o;
    public final /* synthetic */ sja s0;
    public int t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oja(sja sjaVar, Continuation continuation) {
        super(continuation);
        this.s0 = sjaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Z = obj;
        this.t0 |= Integer.MIN_VALUE;
        return this.s0.g(null, 0L, null, null, null, null, false, this);
    }
}
