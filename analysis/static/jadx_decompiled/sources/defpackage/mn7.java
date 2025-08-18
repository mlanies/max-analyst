package defpackage;

import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mn7 extends ffe implements a66 {
    public nn7 X;
    public Map Y;
    public Iterator Z;
    public Map s0;
    public String t0;
    public boolean u0;
    public int v0;
    public final /* synthetic */ nn7 w0;
    public final /* synthetic */ boolean x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn7(nn7 nn7Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.w0 = nn7Var;
        this.x0 = z;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((mn7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new mn7(this.w0, this.x0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ae A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00a6 -> B:22:0x00a7). Please report as a decompilation issue!!! */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r10.v0
            r2 = 1
            if (r1 == 0) goto L22
            if (r1 != r2) goto L1a
            boolean r1 = r10.u0
            java.lang.String r3 = r10.t0
            java.util.Map r4 = r10.s0
            java.util.Iterator r5 = r10.Z
            java.util.Map r6 = r10.Y
            nn7 r7 = r10.X
            defpackage.od2.a0(r11)
            goto La7
        L1a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L22:
            defpackage.od2.a0(r11)
            pq9 r11 = defpackage.qp4.u0
            nn7 r1 = r10.w0
            android.content.Context r3 = r1.a
            qp4 r11 = r11.b(r3)
            java.lang.Object r11 = r11.X
            adb r11 = (defpackage.adb) r11
            java.lang.Object r11 = r11.c
            je7 r11 = (defpackage.je7) r11
            java.lang.Object r11 = r11.getValue()
            java.util.concurrent.ConcurrentHashMap r11 = (java.util.concurrent.ConcurrentHashMap) r11
            java.util.Collection r11 = r11.values()
            java.util.List r11 = defpackage.x53.e0(r11)
            r3 = 10
            int r3 = defpackage.z53.S(r11, r3)
            int r3 = defpackage.mz7.Z(r3)
            r4 = 16
            if (r3 >= r4) goto L54
            r3 = r4
        L54:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r3)
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            java.util.Iterator r11 = r11.iterator()
            boolean r3 = r10.x0
            r5 = r11
            r7 = r1
            r1 = r3
        L64:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto Lae
            java.lang.Object r11 = r5.next()
            sba r11 = (defpackage.sba) r11
            java.lang.String r3 = r11.a
            ao7 r6 = r7.b
            java.lang.String r11 = r11.a
            if (r1 == 0) goto L84
            ze0 r8 = new ze0
            java.lang.String r9 = "Dark"
            java.lang.String r11 = defpackage.au1.g(r11, r9)
            r8.<init>(r11)
            goto L8f
        L84:
            ze0 r8 = new ze0
            java.lang.String r9 = "Light"
            java.lang.String r11 = defpackage.au1.g(r11, r9)
            r8.<init>(r11)
        L8f:
            r10.X = r7
            r10.Y = r4
            r10.Z = r5
            r10.s0 = r4
            r10.t0 = r3
            r10.u0 = r1
            r10.v0 = r2
            android.content.Context r11 = r7.a
            java.lang.Object r11 = defpackage.ao7.a(r6, r11, r8, r10)
            if (r11 != r0) goto La6
            return r0
        La6:
            r6 = r4
        La7:
            android.graphics.drawable.Drawable r11 = (android.graphics.drawable.Drawable) r11
            r4.put(r3, r11)
            r4 = r6
            goto L64
        Lae:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mn7.o(java.lang.Object):java.lang.Object");
    }
}
