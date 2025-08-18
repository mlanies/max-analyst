package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vs0 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs0(long j, Continuation continuation) {
        super(2, continuation);
        this.Z = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((vs0) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        vs0 vs0Var = new vs0(this.Z, continuation);
        vs0Var.Y = obj;
        return vs0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004c -> B:7:0x0013). Please report as a decompilation issue!!! */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r6.X
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L25
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r1 = r6.Y
            on5 r1 = (defpackage.on5) r1
            defpackage.od2.a0(r7)
        L13:
            r7 = r1
            goto L2c
        L15:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L1d:
            java.lang.Object r1 = r6.Y
            on5 r1 = (defpackage.on5) r1
            defpackage.od2.a0(r7)
            goto L42
        L25:
            defpackage.od2.a0(r7)
            java.lang.Object r7 = r6.Y
            on5 r7 = (defpackage.on5) r7
        L2c:
            lx3 r1 = r6.b
            boolean r1 = defpackage.pag.r(r1)
            if (r1 == 0) goto L4f
            r6.Y = r7
            r6.X = r3
            long r4 = r6.Z
            java.lang.Object r1 = defpackage.j47.y(r4, r6)
            if (r1 != r0) goto L41
            return r0
        L41:
            r1 = r7
        L42:
            os5 r7 = defpackage.os5.a
            r6.Y = r1
            r6.X = r2
            java.lang.Object r7 = r1.a(r7, r6)
            if (r7 != r0) goto L13
            return r0
        L4f:
            e5f r6 = defpackage.e5f.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vs0.o(java.lang.Object):java.lang.Object");
    }
}
