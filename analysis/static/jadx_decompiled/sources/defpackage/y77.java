package defpackage;

/* loaded from: classes.dex */
public class y77 extends z87 implements xa3 {
    public final boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y77(defpackage.x77 r5) {
        /*
            r4 = this;
            r0 = 1
            r4.<init>(r0)
            r4.initParentJob(r5)
            e03 r5 = r4.getParentHandle$kotlinx_coroutines_core()
            boolean r1 = r5 instanceof defpackage.f03
            r2 = 0
            if (r1 == 0) goto L13
            f03 r5 = (defpackage.f03) r5
            goto L14
        L13:
            r5 = r2
        L14:
            r1 = 0
            if (r5 == 0) goto L3d
            z87 r5 = r5.a
            if (r5 == 0) goto L1c
            goto L1d
        L1c:
            r5 = r2
        L1d:
            if (r5 != 0) goto L20
            goto L3d
        L20:
            boolean r3 = r5.getHandlesException$kotlinx_coroutines_core()
            if (r3 == 0) goto L27
            goto L3e
        L27:
            e03 r5 = r5.getParentHandle$kotlinx_coroutines_core()
            boolean r3 = r5 instanceof defpackage.f03
            if (r3 == 0) goto L32
            f03 r5 = (defpackage.f03) r5
            goto L33
        L32:
            r5 = r2
        L33:
            if (r5 == 0) goto L3d
            z87 r5 = r5.a
            if (r5 == 0) goto L3a
            goto L3b
        L3a:
            r5 = r2
        L3b:
            if (r5 != 0) goto L20
        L3d:
            r0 = r1
        L3e:
            r4.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y77.<init>(x77):void");
    }

    public final boolean H() {
        return makeCompleting$kotlinx_coroutines_core(e5f.a);
    }

    @Override // defpackage.z87
    public final boolean getHandlesException$kotlinx_coroutines_core() {
        return this.a;
    }

    @Override // defpackage.z87
    public final boolean getOnCancelComplete$kotlinx_coroutines_core() {
        return true;
    }
}
