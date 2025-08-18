package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ui extends ffe implements a66 {
    public ArrayList X;
    public int Y;
    public final /* synthetic */ gi9 Z;
    public final /* synthetic */ gj s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui(gj gjVar, gi9 gi9Var, Continuation continuation) {
        super(2, continuation);
        this.Z = gi9Var;
        this.s0 = gjVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ui) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ui(this.s0, this.Z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0137 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0138 A[RETURN] */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ui.o(java.lang.Object):java.lang.Object");
    }
}
