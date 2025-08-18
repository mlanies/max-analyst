package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class g7e extends hu3 {
    public Collection X;
    public Iterator Y;
    public m3e Z;
    public i7e o;
    public Collection s0;
    public /* synthetic */ Object t0;
    public final /* synthetic */ i7e u0;
    public int v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7e(i7e i7eVar, Continuation continuation) {
        super(continuation);
        this.u0 = i7eVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.t0 = obj;
        this.v0 |= Integer.MIN_VALUE;
        return this.u0.t(null, this);
    }
}
