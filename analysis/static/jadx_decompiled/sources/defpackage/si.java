package defpackage;

import java.util.ArrayList;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class si extends hu3 {
    public ArrayList X;
    public ArrayList Y;
    public Map Z;
    public gj o;
    public /* synthetic */ Object s0;
    public final /* synthetic */ gj t0;
    public int u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si(gj gjVar, Continuation continuation) {
        super(continuation);
        this.t0 = gjVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.s0 = obj;
        this.u0 |= Integer.MIN_VALUE;
        return gj.b(this.t0, null, this);
    }
}
