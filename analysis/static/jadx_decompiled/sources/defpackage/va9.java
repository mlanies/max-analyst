package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class va9 extends hu3 {
    public List X;
    public Collection Y;
    public Iterator Z;
    public wa9 o;
    public nl2 s0;
    public /* synthetic */ Object t0;
    public final /* synthetic */ wa9 u0;
    public int v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va9(wa9 wa9Var, Continuation continuation) {
        super(continuation);
        this.u0 = wa9Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.t0 = obj;
        this.v0 |= Integer.MIN_VALUE;
        return wa9.a(this.u0, null, this);
    }
}
