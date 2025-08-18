package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class xmd extends ffe implements a66 {
    public ArrayList X;
    public Iterator Y;
    public int Z;
    public /* synthetic */ Object s0;
    public final /* synthetic */ and t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xmd(and andVar, Continuation continuation) {
        super(2, continuation);
        this.t0 = andVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((xmd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        xmd xmdVar = new xmd(this.t0, continuation);
        xmdVar.s0 = obj;
        return xmdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009b -> B:22:0x009e). Please report as a decompilation issue!!! */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r9.Z
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2c
            if (r1 == r4) goto L22
            if (r1 != r3) goto L1a
            java.util.Iterator r1 = r9.Y
            java.util.ArrayList r4 = r9.X
            java.lang.Object r5 = r9.s0
            sx3 r5 = (defpackage.sx3) r5
            defpackage.od2.a0(r10)
            goto L9e
        L1a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L22:
            java.util.ArrayList r1 = r9.X
            java.lang.Object r4 = r9.s0
            sx3 r4 = (defpackage.sx3) r4
            defpackage.od2.a0(r10)
            goto L65
        L2c:
            defpackage.od2.a0(r10)
            java.lang.Object r10 = r9.s0
            sx3 r10 = (defpackage.sx3) r10
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            and r5 = r9.t0
            khe r5 = r5.t0
            java.lang.Object r5 = r5.getValue()
            umd r5 = (defpackage.umd) r5
            r1.add(r5)
            and r5 = r9.t0
            je7 r5 = r5.c
            java.lang.Object r5 = r5.getValue()
            iy2 r5 = (defpackage.iy2) r5
            r9.s0 = r10
            r9.X = r1
            r9.Z = r4
            jz2 r5 = (defpackage.jz2) r5
            p82 r4 = r5.l()
            java.util.ArrayList r4 = r4.x(r2)
            if (r4 != r0) goto L62
            return r0
        L62:
            r8 = r4
            r4 = r10
            r10 = r8
        L65:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            v00 r5 = defpackage.p82.I
            java.util.List r10 = defpackage.x53.x0(r10, r5)
            defpackage.j1e.o(r4)
            java.util.Iterator r10 = r10.iterator()
            r5 = r4
            r4 = r1
            r1 = r10
        L77:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto La6
            java.lang.Object r10 = r1.next()
            e52 r10 = (defpackage.e52) r10
            int r6 = r4.size()
            r7 = 5
            if (r6 >= r7) goto La6
            defpackage.j1e.o(r5)
            and r6 = r9.t0
            r9.s0 = r5
            r9.X = r4
            r9.Y = r1
            r9.Z = r3
            java.lang.Object r10 = defpackage.and.b(r6, r10, r9)
            if (r10 != r0) goto L9e
            return r0
        L9e:
            umd r10 = (defpackage.umd) r10
            if (r10 == 0) goto L77
            r4.add(r10)
            goto L77
        La6:
            and r9 = r9.t0
            java.lang.String r9 = r9.u0
            ir6 r10 = defpackage.hm9.m
            if (r10 != 0) goto Laf
            goto Lc4
        Laf:
            boolean r0 = r10.c()
            if (r0 == 0) goto Lc4
            us7 r0 = defpackage.us7.X
            int r1 = r4.size()
            java.lang.String r3 = "buildShortcuts: result size: "
            java.lang.String r1 = defpackage.zr6.h(r1, r3)
            r10.d(r0, r9, r1, r2)
        Lc4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xmd.o(java.lang.Object):java.lang.Object");
    }
}
