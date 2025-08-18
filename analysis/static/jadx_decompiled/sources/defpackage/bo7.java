package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bo7 extends ffe implements a66 {
    public ze0 X;
    public gbf Y;
    public int Z;
    public final /* synthetic */ o23 s0;
    public final /* synthetic */ Context t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo7(o23 o23Var, Context context, Continuation continuation) {
        super(2, continuation);
        this.s0 = o23Var;
        this.t0 = context;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((bo7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new bo7(this.s0, this.t0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bo7.o(java.lang.Object):java.lang.Object");
    }
}
