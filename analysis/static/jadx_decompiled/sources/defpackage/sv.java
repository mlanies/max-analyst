package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class sv extends hu3 {
    public Object X;
    public fi9 Y;
    public Iterator Z;
    public bx o;
    public fi9 s0;
    public long t0;
    public /* synthetic */ Object u0;
    public final /* synthetic */ bx v0;
    public int w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv(bx bxVar, Continuation continuation) {
        super(continuation);
        this.v0 = bxVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.u0 = obj;
        this.w0 |= Integer.MIN_VALUE;
        return this.v0.n(null, this);
    }
}
