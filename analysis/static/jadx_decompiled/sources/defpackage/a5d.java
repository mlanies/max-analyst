package defpackage;

import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class a5d extends ffe implements a66 {
    public Set X;
    public x3c Y;
    public Iterator Z;
    public int s0;
    public final /* synthetic */ x3c t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5d(x3c x3cVar, Continuation continuation) {
        super(2, continuation);
        this.t0 = x3cVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((a5d) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new a5d(this.t0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
    
        r5 = new java.lang.Long(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007d -> B:21:0x0080). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x008e -> B:27:0x0099). Please report as a decompilation issue!!! */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r9.s0
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.util.Iterator r1 = r9.Z
            x3c r3 = r9.Y
            java.util.Set r4 = r9.X
            defpackage.od2.a0(r10)
            goto L80
        L13:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L1b:
            defpackage.od2.a0(r10)
            x3c r10 = r9.t0
            java.lang.Object r1 = r10.Y
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1
            java.lang.Object r1 = r1.get()
            java.util.Set r1 = (java.util.Set) r1
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
            r4 = r3
            r3 = r10
        L35:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto La8
            java.lang.Object r10 = r1.next()
            gza r10 = (defpackage.gza) r10
            fza r5 = r10.b
            fza r6 = defpackage.fza.a
            long r7 = r10.a
            if (r5 == r6) goto L94
            java.lang.Object r10 = r3.b
            je7 r10 = (defpackage.je7) r10
            if (r10 != 0) goto L50
            goto L94
        L50:
            fza r10 = defpackage.fza.b
            if (r5 != r10) goto L8e
            java.lang.Object r10 = r3.o
            je7 r10 = (defpackage.je7) r10
            java.lang.Object r10 = r10.getValue()
            q33 r10 = (defpackage.q33) r10
            hyc r10 = (defpackage.hyc) r10
            long r5 = r10.t()
            long r5 = r5 ^ r7
            java.lang.Object r10 = r3.b
            je7 r10 = (defpackage.je7) r10
            java.lang.Object r10 = r10.getValue()
            iy2 r10 = (defpackage.iy2) r10
            r9.X = r4
            r9.Y = r3
            r9.Z = r1
            r9.s0 = r2
            jz2 r10 = (defpackage.jz2) r10
            java.lang.Object r10 = r10.u(r5, r9)
            if (r10 != r0) goto L80
            return r0
        L80:
            e52 r10 = (defpackage.e52) r10
            if (r10 == 0) goto L8c
            java.lang.Long r5 = new java.lang.Long
            long r6 = r10.a
            r5.<init>(r6)
            goto L99
        L8c:
            r5 = 0
            goto L99
        L8e:
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r7)
            goto L99
        L94:
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r7)
        L99:
            if (r5 == 0) goto L35
            long r5 = r5.longValue()
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r5)
            r4.add(r10)
            goto L35
        La8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a5d.o(java.lang.Object):java.lang.Object");
    }
}
