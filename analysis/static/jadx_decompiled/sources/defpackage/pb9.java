package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pb9 extends ffe implements a66 {
    public Object X;
    public Object Y;
    public xb9 Z;
    public int s0;
    public /* synthetic */ Object t0;
    public final /* synthetic */ List u0;
    public final /* synthetic */ xb9 v0;
    public final /* synthetic */ long w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb9(List list, xb9 xb9Var, long j, Continuation continuation) {
        super(2, continuation);
        this.u0 = list;
        this.v0 = xb9Var;
        this.w0 = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((pb9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        pb9 pb9Var = new pb9(this.u0, this.v0, this.w0, continuation);
        pb9Var.t0 = obj;
        return pb9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0119  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pb9.o(java.lang.Object):java.lang.Object");
    }
}
