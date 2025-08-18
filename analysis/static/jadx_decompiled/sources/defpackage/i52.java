package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class i52 extends hu3 {
    public Comparable X;
    public Object Y;
    public List Z;
    public j52 o;
    public kl7 s0;
    public boolean t0;
    public /* synthetic */ Object u0;
    public final /* synthetic */ j52 v0;
    public int w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i52(j52 j52Var, Continuation continuation) {
        super(continuation);
        this.v0 = j52Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.u0 = obj;
        this.w0 |= Integer.MIN_VALUE;
        return this.v0.a(0L, null, this);
    }
}
