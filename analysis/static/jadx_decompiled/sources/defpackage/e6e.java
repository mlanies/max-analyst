package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class e6e extends ffe implements a66 {
    public u4e X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ g6e s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6e(g6e g6eVar, Continuation continuation) {
        super(2, continuation);
        this.s0 = g6eVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((e6e) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        e6e e6eVar = new e6e(this.s0, continuation);
        e6eVar.Z = obj;
        return e6eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0094  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e6e.o(java.lang.Object):java.lang.Object");
    }
}
