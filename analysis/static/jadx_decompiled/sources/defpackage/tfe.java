package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class tfe extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ cge Z;
    public final /* synthetic */ v6f s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfe(cge cgeVar, v6f v6fVar, Continuation continuation) {
        super(2, continuation);
        this.Z = cgeVar;
        this.s0 = v6fVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((tfe) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        tfe tfeVar = new tfe(this.Z, this.s0, continuation);
        tfeVar.Y = obj;
        return tfeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d9 A[RETURN] */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tfe.o(java.lang.Object):java.lang.Object");
    }
}
