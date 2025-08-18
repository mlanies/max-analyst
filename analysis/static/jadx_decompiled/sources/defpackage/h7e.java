package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class h7e extends ffe implements a66 {
    public w3e X;
    public List Y;
    public int Z;
    public int s0;
    public int t0;
    public final /* synthetic */ i7e u0;
    public final /* synthetic */ w3e v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7e(i7e i7eVar, w3e w3eVar, Continuation continuation) {
        super(2, continuation);
        this.u0 = i7eVar;
        this.v0 = w3eVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((h7e) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new h7e(this.u0, this.v0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            r0 = 1
            tx3 r1 = defpackage.tx3.a
            int r2 = r13.t0
            e5f r3 = defpackage.e5f.a
            r4 = 0
            r5 = 0
            i7e r6 = r13.u0
            if (r2 == 0) goto L23
            if (r2 != r0) goto L1b
            int r1 = r13.s0
            int r2 = r13.Z
            java.util.List r7 = r13.Y
            w3e r13 = r13.X
            defpackage.od2.a0(r14)
            goto L76
        L1b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L23:
            defpackage.od2.a0(r14)
            q0e r14 = r6.v0
            java.lang.Object r14 = r14.getValue()
            xnd r14 = (defpackage.xnd) r14
            java.util.List r7 = r14.b
            int r14 = defpackage.y53.L(r7)
            if (r14 < 0) goto L4c
            r2 = r5
        L37:
            java.lang.Object r8 = r7.get(r2)
            w3e r8 = (defpackage.w3e) r8
            w3e r9 = r13.v0
            long r9 = r9.a
            long r11 = r8.a
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L48
            goto L4f
        L48:
            if (r2 == r14) goto L4c
            int r2 = r2 + r0
            goto L37
        L4c:
            r14 = -1
            r2 = r14
            r8 = r4
        L4f:
            if (r8 != 0) goto L52
            return r3
        L52:
            boolean r14 = r8.s0
            r14 = r14 ^ r0
            je7 r9 = r6.Y
            java.lang.Object r9 = r9.getValue()
            sc5 r9 = (defpackage.sc5) r9
            long r10 = r8.a
            db3 r9 = r9.d(r10, r14)
            r13.X = r8
            r13.Y = r7
            r13.Z = r2
            r13.s0 = r14
            r13.t0 = r0
            java.lang.Object r13 = defpackage.s36.e(r9, r13)
            if (r13 != r1) goto L74
            return r1
        L74:
            r1 = r14
            r13 = r8
        L76:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r7)
            if (r1 == 0) goto L7f
            r7 = r0
            goto L80
        L7f:
            r7 = r5
        L80:
            r8 = 127(0x7f, float:1.78E-43)
            w3e r13 = defpackage.w3e.k(r13, r4, r5, r7, r8)
            r14.set(r2, r13)
            q0e r13 = r6.v0
            java.lang.Object r2 = r13.getValue()
            xnd r2 = (defpackage.xnd) r2
            wnd r7 = r2.a
            xnd r8 = defpackage.xnd.c
            r2.getClass()
            xnd r2 = new xnd
            r2.<init>(r7, r14)
            r13.m(r4, r2)
            if (r1 == 0) goto La3
            goto La4
        La3:
            r0 = r5
        La4:
            vnd r13 = new vnd
            if (r0 == 0) goto Lab
            int r14 = defpackage.woc.n
            goto Lad
        Lab:
            int r14 = defpackage.woc.w
        Lad:
            if (r0 == 0) goto Lb2
            int r0 = defpackage.vga.c
            goto Lb4
        Lb2:
            int r0 = defpackage.vga.d
        Lb4:
            r13.<init>(r14, r0)
            s35 r14 = r6.t0
            defpackage.pnf.o(r14, r13)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h7e.o(java.lang.Object):java.lang.Object");
    }
}
