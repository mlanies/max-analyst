package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class uf3 extends ffe implements a66 {
    public long X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ wf3 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf3(wf3 wf3Var, Continuation continuation) {
        super(2, continuation);
        this.s0 = wf3Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((uf3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        uf3 uf3Var = new uf3(this.s0, continuation);
        uf3Var.Z = obj;
        return uf3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uf3.o(java.lang.Object):java.lang.Object");
    }
}
