package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class wp2 extends ffe implements a66 {
    public Serializable X;
    public Serializable Y;
    public int Z;
    public final /* synthetic */ rq2 s0;
    public final /* synthetic */ long t0;
    public final /* synthetic */ Long u0;
    public final /* synthetic */ List v0;
    public final /* synthetic */ List w0;
    public final /* synthetic */ cz5 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp2(rq2 rq2Var, long j, Long l, ArrayList arrayList, ArrayList arrayList2, cz5 cz5Var, Continuation continuation) {
        super(2, continuation);
        this.s0 = rq2Var;
        this.t0 = j;
        this.u0 = l;
        this.v0 = arrayList;
        this.w0 = arrayList2;
        this.x0 = cz5Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((wp2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new wp2(this.s0, this.t0, this.u0, (ArrayList) this.v0, (ArrayList) this.w0, this.x0, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0171 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.Queue] */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wp2.o(java.lang.Object):java.lang.Object");
    }
}
