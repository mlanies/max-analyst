package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ekf extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ dkf Z;
    public final /* synthetic */ long s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekf(dkf dkfVar, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = dkfVar;
        this.s0 = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((ekf) n((on5) obj, (Continuation) obj2)).o(e5f.a);
        return tx3.a;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ekf ekfVar = new ekf(this.Z, this.s0, continuation);
        ekfVar.Y = obj;
        return ekfVar;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0058 -> B:11:0x002c). Please report as a decompilation issue!!! */
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
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            java.lang.Object r1 = r6.Y
            on5 r1 = (defpackage.on5) r1
            defpackage.od2.a0(r7)
            goto L2c
        L14:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L1c:
            java.lang.Object r1 = r6.Y
            on5 r1 = (defpackage.on5) r1
            defpackage.od2.a0(r7)
            goto L4e
        L24:
            defpackage.od2.a0(r7)
            java.lang.Object r7 = r6.Y
            on5 r7 = (defpackage.on5) r7
            r1 = r7
        L2c:
            dkf r7 = r6.Z
            boolean r4 = r7.b()
            if (r4 == 0) goto L4e
            long r4 = r7.F0()
            kt4 r7 = defpackage.kt4.MILLISECONDS
            long r4 = defpackage.z7.S(r4, r7)
            ft4 r7 = new ft4
            r7.<init>(r4)
            r6.Y = r1
            r6.X = r3
            java.lang.Object r7 = r1.a(r7, r6)
            if (r7 != r0) goto L4e
            return r0
        L4e:
            r6.Y = r1
            r6.X = r2
            long r4 = r6.s0
            java.lang.Object r7 = defpackage.j47.y(r4, r6)
            if (r7 != r0) goto L2c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekf.o(java.lang.Object):java.lang.Object");
    }
}
