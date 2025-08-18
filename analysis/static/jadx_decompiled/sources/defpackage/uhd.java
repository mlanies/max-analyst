package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class uhd extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ cid Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uhd(cid cidVar, Continuation continuation) {
        super(2, continuation);
        this.Z = cidVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((uhd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        uhd uhdVar = new uhd(this.Z, continuation);
        uhdVar.Y = obj;
        return uhdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r5.X
            cid r2 = r5.Z
            r3 = 1
            if (r1 == 0) goto L1f
            if (r1 != r3) goto L17
            java.lang.Object r5 = r5.Y
            sx3 r5 = (defpackage.sx3) r5
            defpackage.od2.a0(r6)     // Catch: java.lang.Throwable -> L13 ru.ok.tamtam.errors.TamErrorException -> L15
            goto L5b
        L13:
            r6 = move-exception
            goto L3e
        L15:
            r5 = move-exception
            goto L50
        L17:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L1f:
            defpackage.od2.a0(r6)
            java.lang.Object r6 = r5.Y
            sx3 r6 = (defpackage.sx3) r6
            je7 r1 = r2.v0     // Catch: ru.ok.tamtam.errors.TamErrorException -> L15 java.lang.Throwable -> L3a
            java.lang.Object r1 = r1.getValue()     // Catch: ru.ok.tamtam.errors.TamErrorException -> L15 java.lang.Throwable -> L3a
            q6f r1 = (defpackage.q6f) r1     // Catch: ru.ok.tamtam.errors.TamErrorException -> L15 java.lang.Throwable -> L3a
            r5.Y = r6     // Catch: ru.ok.tamtam.errors.TamErrorException -> L15 java.lang.Throwable -> L3a
            r5.X = r3     // Catch: ru.ok.tamtam.errors.TamErrorException -> L15 java.lang.Throwable -> L3a
            r3 = 0
            java.lang.Object r5 = r1.a(r3, r5)     // Catch: ru.ok.tamtam.errors.TamErrorException -> L15 java.lang.Throwable -> L3a
            if (r5 != r0) goto L5b
            return r0
        L3a:
            r5 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L3e:
            boolean r0 = r6 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L5b
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.String r0 = "fail to disable SAFE_MODE"
            defpackage.hm9.p(r5, r0, r6)
            goto L5b
        L50:
            java.lang.String r5 = r5.getLocalizedMessage()
            if (r5 == 0) goto L5b
            s35 r6 = r2.N0
            defpackage.pnf.o(r6, r5)
        L5b:
            e5f r5 = defpackage.e5f.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uhd.o(java.lang.Object):java.lang.Object");
    }
}
