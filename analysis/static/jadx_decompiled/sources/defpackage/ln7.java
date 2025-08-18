package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ln7 extends ffe implements a66 {
    public nn7 X;
    public Context Y;
    public Map Z;
    public Iterator s0;
    public Map t0;
    public ze0 u0;
    public int v0;
    public final /* synthetic */ boolean w0;
    public final /* synthetic */ nn7 x0;
    public final /* synthetic */ Context y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln7(boolean z, nn7 nn7Var, Context context, Continuation continuation) {
        super(2, continuation);
        this.w0 = z;
        this.x0 = nn7Var;
        this.y0 = context;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ln7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ln7(this.w0, this.x0, this.y0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0093 -> B:26:0x0094). Please report as a decompilation issue!!! */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r8.v0
            r2 = 1
            if (r1 == 0) goto L22
            if (r1 != r2) goto L1a
            ze0 r1 = r8.u0
            java.util.Map r3 = r8.t0
            java.util.Iterator r4 = r8.s0
            java.util.Map r5 = r8.Z
            android.content.Context r6 = r8.Y
            nn7 r7 = r8.X
            defpackage.od2.a0(r9)
            goto L94
        L1a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L22:
            defpackage.od2.a0(r9)
            boolean r9 = r8.w0
            if (r9 == 0) goto L2c
            java.util.List r9 = defpackage.ze0.c
            goto L2e
        L2c:
            java.util.List r9 = defpackage.ze0.b
        L2e:
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r4 = defpackage.z53.S(r9, r3)
            r1.<init>(r4)
            java.util.Iterator r9 = r9.iterator()
        L3d:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L52
            java.lang.Object r4 = r9.next()
            java.lang.String r4 = (java.lang.String) r4
            ze0 r5 = new ze0
            r5.<init>(r4)
            r1.add(r5)
            goto L3d
        L52:
            int r9 = defpackage.z53.S(r1, r3)
            int r9 = defpackage.mz7.Z(r9)
            r3 = 16
            if (r9 >= r3) goto L5f
            r9 = r3
        L5f:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r9)
            java.util.Iterator r9 = r1.iterator()
            nn7 r1 = r8.x0
            android.content.Context r4 = r8.y0
            r7 = r1
            r6 = r4
            r4 = r9
        L6f:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L9b
            java.lang.Object r9 = r4.next()
            r1 = r9
            ze0 r1 = (defpackage.ze0) r1
            ao7 r9 = r7.b
            r8.X = r7
            r8.Y = r6
            r8.Z = r3
            r8.s0 = r4
            r8.t0 = r3
            r8.u0 = r1
            r8.v0 = r2
            java.lang.Object r9 = defpackage.ao7.a(r9, r6, r1, r8)
            if (r9 != r0) goto L93
            return r0
        L93:
            r5 = r3
        L94:
            android.graphics.drawable.Drawable r9 = (android.graphics.drawable.Drawable) r9
            r3.put(r1, r9)
            r3 = r5
            goto L6f
        L9b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ln7.o(java.lang.Object):java.lang.Object");
    }
}
