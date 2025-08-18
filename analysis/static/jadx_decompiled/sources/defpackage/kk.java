package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class kk extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ bkb Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk(bkb bkbVar, Continuation continuation) {
        super(2, continuation);
        this.Z = bkbVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((kk) n((on5) obj, (Continuation) obj2)).o(e5f.a);
        return tx3.a;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        kk kkVar = new kk(this.Z, continuation);
        kkVar.Y = obj;
        return kkVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0032, code lost:
    
        if (r10 == null) goto L22;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0091 -> B:13:0x0032). Please report as a decompilation issue!!! */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r9.X
            r2 = 3
            r3 = 2
            r4 = 1
            bkb r5 = r9.Z
            if (r1 == 0) goto L2a
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            goto L22
        L12:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L1a:
            java.lang.Object r1 = r9.Y
            on5 r1 = (defpackage.on5) r1
            defpackage.od2.a0(r10)
            goto L72
        L22:
            java.lang.Object r1 = r9.Y
            on5 r1 = (defpackage.on5) r1
            defpackage.od2.a0(r10)
            goto L32
        L2a:
            defpackage.od2.a0(r10)
            java.lang.Object r10 = r9.Y
            on5 r10 = (defpackage.on5) r10
            r1 = r10
        L32:
            java.lang.Object r10 = r5.c
            k56 r10 = (defpackage.k56) r10
            java.lang.Object r10 = r10.invoke()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L57
            int r10 = defpackage.ft4.o
            r10 = 10
            kt4 r6 = defpackage.kt4.SECONDS
            long r6 = defpackage.z7.R(r10, r6)
            r9.Y = r1
            r9.X = r4
            java.lang.Object r10 = defpackage.j47.y(r6, r9)
            if (r10 != r0) goto L32
            return r0
        L57:
            java.lang.Object r10 = r5.a
            fk r10 = (defpackage.fk) r10
            long r6 = r10.a
            jk r10 = new jk
            r8 = 0
            r10.<init>(r5, r8)
            r9.Y = r1
            r9.X = r3
            long r6 = defpackage.j47.p0(r6)
            java.lang.Object r10 = defpackage.fp3.I(r6, r10, r9)
            if (r10 != r0) goto L72
            return r0
        L72:
            if (r10 != 0) goto L32
            gk r10 = new gk
            java.lang.Object r6 = r5.a
            fk r6 = (defpackage.fk) r6
            long r6 = r6.a
            java.lang.String r6 = defpackage.ft4.j(r6)
            java.lang.String r7 = "Application Not Responding for at least "
            java.lang.String r6 = r7.concat(r6)
            r10.<init>(r6)
            r9.Y = r1
            r9.X = r2
            java.lang.Object r10 = r1.a(r10, r9)
            if (r10 != r0) goto L32
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kk.o(java.lang.Object):java.lang.Object");
    }
}
