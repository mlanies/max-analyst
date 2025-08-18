package defpackage;

import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class wwc implements j0e {
    public final /* synthetic */ int a;
    public final Object b;

    public wwc(ate ateVar) {
        this.a = 1;
        this.b = ateVar;
    }

    public static void j(wwc wwcVar, long j, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        wwcVar.getClass();
        ((ti9) wwcVar.b).setValue(new twc(j, true, true, z, false, -1));
    }

    @Override // defpackage.gld
    public final List b() {
        switch (this.a) {
            case 0:
                return ((ti9) this.b).b();
            default:
                return nz4.a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (defpackage.j47.x(ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader.UPLOAD_NEXT_INTERVAL, r0) != r1) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006e -> B:15:0x0032). Please report as a decompilation issue!!! */
    @Override // defpackage.mn5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.on5 r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            int r0 = r8.a
            switch(r0) {
                case 0: goto L71;
                default: goto L5;
            }
        L5:
            boolean r0 = r10 instanceof defpackage.yse
            if (r0 == 0) goto L18
            r0 = r10
            yse r0 = (defpackage.yse) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.s0 = r1
            goto L1d
        L18:
            yse r0 = new yse
            r0.<init>(r8, r10)
        L1d:
            java.lang.Object r10 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            on5 r8 = r0.X
            wwc r9 = r0.o
            defpackage.od2.a0(r10)
        L32:
            r7 = r9
            r9 = r8
            r8 = r7
            goto L49
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            on5 r8 = r0.X
            wwc r9 = r0.o
            defpackage.od2.a0(r10)
            goto L62
        L46:
            defpackage.od2.a0(r10)
        L49:
            lx3 r10 = r0.b
            defpackage.pag.j(r10)
            java.util.List r10 = r8.h()
            r0.o = r8
            r0.X = r9
            r0.s0 = r4
            java.lang.Object r10 = r9.a(r10, r0)
            if (r10 != r1) goto L5f
            goto L70
        L5f:
            r7 = r9
            r9 = r8
            r8 = r7
        L62:
            r0.o = r9
            r0.X = r8
            r0.s0 = r3
            r5 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r10 = defpackage.j47.x(r5, r0)
            if (r10 != r1) goto L32
        L70:
            return r1
        L71:
            java.lang.Object r8 = r8.b
            ti9 r8 = (defpackage.ti9) r8
            java.lang.Object r8 = r8.d(r9, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wwc.d(on5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.j0e
    public final Object getValue() {
        switch (this.a) {
            case 0:
                return (twc) ((ti9) this.b).getValue();
            default:
                return h();
        }
    }

    public List h() {
        int iIntValue;
        ate ateVar = (ate) this.b;
        ateVar.getClass();
        ArrayList arrayListN = y53.N(new b54(ateVar.a, new eqe(m0c.oneme_settings_dump_threads), woc.r, null, y44.e, 8));
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        Map mapH = kp.h(allStackTraces);
        Iterator it = xse.a.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            iIntValue = 0;
            if (!u1Var.hasNext()) {
                break;
            }
            Thread.State state = (Thread.State) u1Var.next();
            long j = ((ei4) ateVar.e.computeIfAbsent(state, new di(20, new w8c(20)))).a;
            int i = m0c.oneme_settings_thread_state_count;
            String strName = state.name();
            Integer num = (Integer) mapH.get(state);
            if (num != null) {
                iIntValue = num.intValue();
            }
            arrayListN.add(new b54(j, new gqe(i, ys.m0(new Object[]{strName, Integer.valueOf(iIntValue)})), woc.c1, null, null, 24));
        }
        int i2 = m0c.oneme_settings_thread_state_count;
        Iterator it2 = mapH.values().iterator();
        int iIntValue2 = 0;
        while (it2.hasNext()) {
            iIntValue2 += ((Number) it2.next()).intValue();
        }
        arrayListN.add(new b54(ateVar.b, new gqe(i2, ys.m0(new Object[]{"Total", Integer.valueOf(iIntValue2)})), woc.c1, null, null, 24));
        if (!allStackTraces.isEmpty()) {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it3 = allStackTraces.entrySet().iterator();
            int i3 = 0;
            while (it3.hasNext()) {
                if (eae.o0(it3.next().getKey().getName(), "tracer-", false)) {
                    i3++;
                }
            }
            iIntValue = i3;
        }
        arrayListN.add(new b54(ateVar.c, new gqe(m0c.oneme_settings_thread_tracer, ys.m0(new Object[]{Integer.valueOf(iIntValue)})), woc.V0, null, null, 24));
        arrayListN.add(new b54(ateVar.d, new gqe(m0c.oneme_settings_thread_viewer_state, ys.m0(new Object[]{Integer.valueOf(iIntValue)})), woc.U1, null, null, 24));
        return arrayListN;
    }

    public wwc() {
        this.a = 0;
        this.b = r0e.a(null);
    }
}
