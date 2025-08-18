package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zn7 extends ffe implements a66 {
    public ao7 X;
    public ze0 Y;
    public gbf Z;
    public boolean s0;
    public int t0;
    public final /* synthetic */ ao7 u0;
    public final /* synthetic */ ze0 v0;
    public final /* synthetic */ Context w0;
    public final /* synthetic */ boolean x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn7(ao7 ao7Var, ze0 ze0Var, Context context, boolean z, Continuation continuation) {
        super(2, continuation);
        this.u0 = ao7Var;
        this.v0 = ze0Var;
        this.w0 = context;
        this.x0 = z;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((zn7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new zn7(this.u0, this.v0, this.w0, this.x0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r10.t0
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            boolean r0 = r10.s0
            gbf r1 = r10.Z
            ze0 r2 = r10.Y
            ao7 r10 = r10.X
            defpackage.od2.a0(r11)
            goto L72
        L15:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L1d:
            defpackage.od2.a0(r11)
            ao7 r11 = r10.u0
            r11.getClass()
            android.util.LruCache r1 = defpackage.mre.a
            r1 = 0
            ze0 r3 = r10.v0
            if (r3 != 0) goto L2e
            r4 = r1
            goto L36
        L2e:
            android.util.LruCache r4 = defpackage.mre.a
            java.lang.Object r4 = r4.get(r3)
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4
        L36:
            if (r4 == 0) goto L39
            return r4
        L39:
            je7 r4 = r11.b
            java.lang.Object r5 = r4.getValue()
            qe0 r5 = (defpackage.qe0) r5
            android.content.Context r6 = r10.w0
            java.util.LinkedHashMap r5 = r5.c(r6, r3)
            java.lang.Object r5 = r5.get(r3)
            gbf r5 = (defpackage.gbf) r5
            if (r5 == 0) goto L8d
            boolean r7 = r10.x0
            fbf r8 = r5.a
            if (r8 == 0) goto L79
            java.lang.Object r1 = r4.getValue()
            qe0 r1 = (defpackage.qe0) r1
            r10.X = r11
            r10.Y = r3
            r10.Z = r5
            r10.s0 = r7
            r10.t0 = r2
            java.lang.Object r10 = r1.d(r6, r8, r10)
            if (r10 != r0) goto L6c
            return r0
        L6c:
            r2 = r3
            r1 = r5
            r0 = r7
            r9 = r11
            r11 = r10
            r10 = r9
        L72:
            kge r11 = (defpackage.kge) r11
            r7 = r0
            r5 = r1
            r3 = r2
            r1 = r11
            r11 = r10
        L79:
            rre r10 = new rre
            qre r0 = defpackage.od2.c0(r5, r1)
            r10.<init>(r0)
            if (r7 == 0) goto L8c
            r11.getClass()
            android.util.LruCache r11 = defpackage.mre.a
            defpackage.mre.a(r3, r10)
        L8c:
            r1 = r10
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zn7.o(java.lang.Object):java.lang.Object");
    }
}
