package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class bte extends ffe implements a66 {
    public final /* synthetic */ cte X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bte(cte cteVar, Continuation continuation) {
        super(2, continuation);
        this.X = cteVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        bte bteVar = (bte) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        bteVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new bte(this.X, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bte.o(java.lang.Object):java.lang.Object");
    }
}
