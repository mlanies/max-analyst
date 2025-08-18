package defpackage;

import java.util.Collection;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class r79 {
    public final vlc a;
    public final je7 b;
    public final je7 c;

    public r79(vlc vlcVar, khe kheVar, je7 je7Var) {
        this.a = vlcVar;
        this.b = kheVar;
        this.c = je7Var;
    }

    public final Object a(long j, Continuation continuation) {
        vlc vlcVar = this.a;
        return j47.t0(((w9a) vlcVar.c()).b(), new qlc(vlcVar, j, null), continuation);
    }

    public final Object b(Collection collection, Continuation continuation) {
        vlc vlcVar = this.a;
        return j47.t0(((w9a) vlcVar.c()).b(), new rlc(vlcVar, collection, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r18, long r20, long r22, boolean r24, int r25, defpackage.mg4 r26, kotlin.coroutines.Continuation r27) throws java.lang.Throwable {
        /*
            r17 = this;
            r0 = r17
            r1 = r27
            boolean r2 = r1 instanceof defpackage.q79
            if (r2 == 0) goto L17
            r2 = r1
            q79 r2 = (defpackage.q79) r2
            int r3 = r2.Z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.Z = r3
            goto L1c
        L17:
            q79 r2 = new q79
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.X
            tx3 r3 = defpackage.tx3.a
            int r4 = r2.Z
            r5 = 1
            if (r4 == 0) goto L35
            if (r4 != r5) goto L2d
            boolean r0 = r2.o
            defpackage.od2.a0(r1)
            goto L6a
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L35:
            defpackage.od2.a0(r1)
            r1 = r24
            r2.o = r1
            r2.Z = r5
            vlc r6 = r0.a
            kke r0 = r6.c()
            w9a r0 = (defpackage.w9a) r0
            nx3 r0 = r0.b()
            tlc r15 = new tlc
            r16 = 0
            r4 = r15
            r5 = r26
            r7 = r18
            r9 = r20
            r11 = r22
            r13 = r25
            r14 = r24
            r1 = r15
            r15 = r16
            r4.<init>(r5, r6, r7, r9, r11, r13, r14, r15)
            java.lang.Object r1 = defpackage.j47.t0(r0, r1, r2)
            if (r1 != r3) goto L68
            return r3
        L68:
            r0 = r24
        L6a:
            r2 = r1
            java.util.List r2 = (java.util.List) r2
            if (r0 == 0) goto L72
            defpackage.x53.v0(r2)
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r79.c(long, long, long, boolean, int, mg4, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
