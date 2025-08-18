package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.LockFreeLinkedListHead;

/* loaded from: classes.dex */
public final class v87 extends ijc implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ z87 Z;
    public LockFreeLinkedListHead c;
    public f03 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v87(z87 z87Var, Continuation continuation) {
        super(2, continuation);
        this.Z = z87Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((v87) n((f6d) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        v87 v87Var = new v87(this.Z, continuation);
        v87Var.Y = obj;
        return v87Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005d -> B:25:0x0072). Please report as a decompilation issue!!! */
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
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            f03 r1 = r6.o
            kotlinx.coroutines.internal.LockFreeLinkedListHead r3 = r6.c
            java.lang.Object r4 = r6.Y
            f6d r4 = (defpackage.f6d) r4
            defpackage.od2.a0(r7)
            goto L72
        L18:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L20:
            defpackage.od2.a0(r7)
            goto L77
        L24:
            defpackage.od2.a0(r7)
            java.lang.Object r7 = r6.Y
            f6d r7 = (defpackage.f6d) r7
            z87 r1 = r6.Z
            java.lang.Object r1 = r1.getState$kotlinx_coroutines_core()
            boolean r4 = r1 instanceof defpackage.f03
            if (r4 == 0) goto L3f
            f03 r1 = (defpackage.f03) r1
            h03 r1 = r1.b
            r6.X = r3
            r7.c(r1, r6)
            return r0
        L3f:
            boolean r3 = r1 instanceof defpackage.nz6
            if (r3 == 0) goto L77
            nz6 r1 = (defpackage.nz6) r1
            tq9 r1 = r1.b()
            if (r1 == 0) goto L77
            java.lang.Object r3 = r1.getNext()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            r4 = r7
            r5 = r3
            r3 = r1
            r1 = r5
        L55:
            boolean r7 = defpackage.tpa.f(r1, r3)
            if (r7 != 0) goto L77
            boolean r7 = r1 instanceof defpackage.f03
            if (r7 == 0) goto L72
            r7 = r1
            f03 r7 = (defpackage.f03) r7
            h03 r7 = r7.b
            r6.Y = r4
            r6.c = r3
            f03 r1 = (defpackage.f03) r1
            r6.o = r1
            r6.X = r2
            r4.c(r7, r6)
            return r0
        L72:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r1.getNextNode()
            goto L55
        L77:
            e5f r6 = defpackage.e5f.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v87.o(java.lang.Object):java.lang.Object");
    }
}
