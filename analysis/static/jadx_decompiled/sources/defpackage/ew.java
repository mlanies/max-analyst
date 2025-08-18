package defpackage;

import java.util.Collection;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ew extends hu3 {
    public Collection X;
    public long Y;
    public /* synthetic */ Object Z;
    public bx o;
    public final /* synthetic */ bx s0;
    public int t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew(bx bxVar, Continuation continuation) {
        super(continuation);
        this.s0 = bxVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Z = obj;
        this.t0 |= Integer.MIN_VALUE;
        return this.s0.v(0L, this);
    }
}
