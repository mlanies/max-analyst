package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wi extends ffe implements a66 {
    public ArrayList X;
    public int Y;
    public final /* synthetic */ gj Z;
    public final /* synthetic */ gi9 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi(gj gjVar, gi9 gi9Var, Continuation continuation) {
        super(2, continuation);
        this.Z = gjVar;
        this.s0 = gi9Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((wi) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new wi(this.Z, this.s0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f6 A[LOOP:0: B:37:0x00f0->B:39:0x00f6, LOOP_END] */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wi.o(java.lang.Object):java.lang.Object");
    }
}
