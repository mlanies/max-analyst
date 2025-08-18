package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class x96 extends ffe implements a66 {
    public List X;
    public z96 Y;
    public Collection Z;
    public Iterator s0;
    public int t0;
    public final /* synthetic */ z96 u0;
    public final /* synthetic */ List v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x96(z96 z96Var, List list, Continuation continuation) {
        super(2, continuation);
        this.u0 = z96Var;
        this.v0 = list;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((x96) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new x96(this.u0, this.v0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a1 -> B:27:0x00a4). Please report as a decompilation issue!!! */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r9.t0
            r2 = 0
            r3 = 2
            r4 = 1
            z96 r5 = r9.u0
            if (r1 == 0) goto L28
            if (r1 == r4) goto L24
            if (r1 != r3) goto L1c
            java.util.Iterator r1 = r9.s0
            java.util.Collection r4 = r9.Z
            z96 r5 = r9.Y
            java.util.List r6 = r9.X
            defpackage.od2.a0(r10)
            goto La4
        L1c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L24:
            defpackage.od2.a0(r10)
            goto L59
        L28:
            defpackage.od2.a0(r10)
            d86 r10 = r5.b
            boolean r10 = r10.c
            if (r10 == 0) goto L5e
            q0e r10 = r5.O0
            java.lang.Object r10 = r10.getValue()
            o4d r1 = defpackage.o4d.a
            if (r10 != r1) goto L5e
            q0e r10 = r5.O0
            r9.t0 = r4
            t03 r1 = new t03
            r4 = 11
            r1.<init>(r10, r4)
            t03 r10 = new t03
            r4 = 14
            r10.<init>(r1, r4)
            java.lang.Object r10 = defpackage.od2.A(r10, r9)
            if (r10 != r0) goto L54
            goto L56
        L54:
            e5f r10 = defpackage.e5f.a
        L56:
            if (r10 != r0) goto L59
            return r0
        L59:
            q0e r10 = r5.O0
            r10.setValue(r2)
        L5e:
            p4d r10 = r5.F0
            r10.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.concurrent.CopyOnWriteArraySet r10 = r10.a
            r1.<init>(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.List r4 = r9.v0
            java.util.Iterator r4 = r4.iterator()
            r6 = r1
            r1 = r4
            r4 = r10
        L78:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto Lac
            java.lang.Object r10 = r1.next()
            zp7 r10 = (defpackage.zp7) r10
            r9.X = r6
            r9.Y = r5
            r9.Z = r4
            r9.s0 = r1
            r9.t0 = r3
            kke r7 = r5.s()
            w9a r7 = (defpackage.w9a) r7
            nx3 r7 = r7.e()
            w96 r8 = new w96
            r8.<init>(r5, r10, r6, r2)
            java.lang.Object r10 = defpackage.j47.t0(r7, r8, r9)
            if (r10 != r0) goto La4
            return r0
        La4:
            u86 r10 = (defpackage.u86) r10
            if (r10 == 0) goto L78
            r4.add(r10)
            goto L78
        Lac:
            java.util.List r4 = (java.util.List) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x96.o(java.lang.Object):java.lang.Object");
    }
}
