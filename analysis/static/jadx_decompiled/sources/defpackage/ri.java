package defpackage;

import java.util.ArrayList;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ri extends hu3 {
    public Map X;
    public ArrayList Y;
    public /* synthetic */ Object Z;
    public gj o;
    public final /* synthetic */ gj s0;
    public int t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri(gj gjVar, Continuation continuation) {
        super(continuation);
        this.s0 = gjVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Z = obj;
        this.t0 |= Integer.MIN_VALUE;
        return gj.a(this.s0, null, this);
    }
}
