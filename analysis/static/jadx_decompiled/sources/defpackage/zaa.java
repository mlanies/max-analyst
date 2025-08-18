package defpackage;

import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class zaa {
    public final j0e a;
    public final WeakHashMap b = new WeakHashMap();

    public zaa(w7c w7cVar) {
        this.a = w7cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Context r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.yaa
            if (r0 == 0) goto L13
            r0 = r6
            yaa r0 = (defpackage.yaa) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            yaa r0 = new yaa
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            defpackage.od2.a0(r6)
            goto L53
        L2f:
            defpackage.od2.a0(r6)
            android.content.Context r5 = r5.getApplicationContext()
            android.app.Application r5 = (android.app.Application) r5
            ie5 r6 = new ie5
            r2 = 1
            r6.<init>(r2, r4)
            r5.registerActivityLifecycleCallbacks(r6)
            xw r5 = new xw
            r6 = 9
            r5.<init>(r6, r4)
            r0.Y = r3
            j0e r4 = r4.a
            java.lang.Object r4 = r4.d(r5, r0)
            if (r4 != r1) goto L53
            return
        L53:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zaa.a(android.content.Context, kotlin.coroutines.Continuation):void");
    }
}
