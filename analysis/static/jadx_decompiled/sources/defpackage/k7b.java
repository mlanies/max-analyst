package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class k7b extends ffe implements a66 {
    public List X;
    public l7b Y;
    public Context Z;
    public Iterator s0;
    public Map.Entry t0;
    public int u0;
    public final /* synthetic */ Context v0;
    public final /* synthetic */ l7b w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7b(Context context, l7b l7bVar, Continuation continuation) {
        super(2, continuation);
        this.v0 = context;
        this.w0 = l7bVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((k7b) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new k7b(this.v0, this.w0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00b4 -> B:18:0x00b7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00ba -> B:20:0x00bb). Please report as a decompilation issue!!! */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r10.u0
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L21
            if (r1 != r3) goto L19
            java.util.Map$Entry r1 = r10.t0
            java.util.Iterator r4 = r10.s0
            android.content.Context r5 = r10.Z
            l7b r6 = r10.Y
            java.util.List r7 = r10.X
            defpackage.od2.a0(r11)
            goto Lb7
        L19:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L21:
            defpackage.od2.a0(r11)
            java.lang.String r11 = "Prefetch chat themes."
            java.lang.String r1 = "PrefetchThemeBackgroundUseCase"
            defpackage.hm9.n(r1, r11)
            pq9 r11 = defpackage.qp4.u0
            android.content.Context r1 = r10.v0
            qp4 r11 = r11.b(r1)
            sba r11 = r11.g()
            java.lang.String r11 = r11.a
            kl7 r4 = defpackage.j1e.l()
            ze0 r5 = new ze0
            java.lang.String r6 = "Light"
            java.lang.String r6 = defpackage.au1.g(r11, r6)
            r5.<init>(r6)
            r4.add(r5)
            ze0 r5 = new ze0
            java.lang.String r6 = "Dark"
            java.lang.String r11 = defpackage.au1.g(r11, r6)
            r5.<init>(r11)
            r4.add(r5)
            kl7 r11 = defpackage.j1e.d(r4)
            l7b r4 = r10.w0
            java.lang.Object r5 = r4.b
            khe r5 = (defpackage.khe) r5
            java.lang.Object r5 = r5.getValue()
            qe0 r5 = (defpackage.qe0) r5
            java.util.LinkedHashMap r5 = r5.c(r1, r2)
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
            r7 = r11
            r6 = r4
            r4 = r5
            r5 = r1
        L79:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto Ld6
            java.lang.Object r11 = r4.next()
            r1 = r11
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r11 = r1.getKey()
            boolean r11 = r7.contains(r11)
            if (r11 == 0) goto L79
            java.lang.Object r11 = r1.getValue()
            gbf r11 = (defpackage.gbf) r11
            fbf r11 = r11.a
            if (r11 == 0) goto Lba
            java.lang.Object r8 = r6.b
            khe r8 = (defpackage.khe) r8
            java.lang.Object r8 = r8.getValue()
            qe0 r8 = (defpackage.qe0) r8
            r10.X = r7
            r10.Y = r6
            r10.Z = r5
            r10.s0 = r4
            r10.t0 = r1
            r10.u0 = r3
            java.lang.Object r11 = r8.d(r5, r11, r10)
            if (r11 != r0) goto Lb7
            return r0
        Lb7:
            kge r11 = (defpackage.kge) r11
            goto Lbb
        Lba:
            r11 = r2
        Lbb:
            rre r8 = new rre
            java.lang.Object r9 = r1.getValue()
            gbf r9 = (defpackage.gbf) r9
            qre r11 = defpackage.od2.c0(r9, r11)
            r8.<init>(r11)
            android.util.LruCache r11 = defpackage.mre.a
            java.lang.Object r11 = r1.getKey()
            ze0 r11 = (defpackage.ze0) r11
            defpackage.mre.a(r11, r8)
            goto L79
        Ld6:
            e5f r10 = defpackage.e5f.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k7b.o(java.lang.Object):java.lang.Object");
    }
}
