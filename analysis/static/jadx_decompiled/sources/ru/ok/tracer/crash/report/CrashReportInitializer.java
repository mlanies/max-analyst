package ru.ok.tracer.crash.report;

import android.content.Context;
import defpackage.aze;
import defpackage.hze;
import defpackage.ik;
import defpackage.ize;
import defpackage.kbd;
import defpackage.kye;
import defpackage.lbd;
import defpackage.m6d;
import defpackage.o84;
import defpackage.pje;
import defpackage.pye;
import defpackage.s36;
import defpackage.sp3;
import defpackage.sy3;
import defpackage.sy4;
import defpackage.ty2;
import defpackage.w07;
import defpackage.zs7;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import ru.ok.tracer.TracerInitializer;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ok/tracer/crash/report/CrashReportInitializer;", "Lw07;", "Lpye;", "<init>", "()V", "tracer-crash-report_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CrashReportInitializer implements w07 {
    @Override // defpackage.w07
    public final List a() {
        return Collections.singletonList(TracerInitializer.class);
    }

    @Override // defpackage.w07
    public final Object b(final Context context) {
        kye kyeVar = kye.a;
        Object obj = kye.c().get(m6d.a);
        sy3 sy3Var = obj instanceof sy3 ? (sy3) obj : null;
        final sy3 sy3Var2 = sy3Var == null ? new sy3(new sp3()) : sy3Var;
        if (sy3Var2.a) {
            aze.b(context);
        }
        kbd kbdVar = kye.e;
        final kbd kbdVar2 = kbdVar != null ? kbdVar : null;
        pje pjeVar = kye.f;
        final pje pjeVar2 = pjeVar != null ? pjeVar : null;
        final sy4 sy4Var = new sy4(1, context);
        final zs7 zs7Var = new zs7(context);
        final o84 o84Var = new o84(9);
        final lbd lbdVar = new lbd();
        final ik ikVar = new ik(context, sy3Var2.c);
        ty2 ty2Var = new ty2();
        ty2Var.a = sy4Var;
        ty2Var.b = kbdVar2;
        ty2Var.c = pjeVar2;
        ty2Var.o = zs7Var;
        ty2Var.X = lbdVar;
        ty2Var.Y = o84Var;
        ty2Var.Z = new AtomicInteger();
        pye.b = ty2Var;
        hze.b(new Runnable() { // from class: oye
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:115:0x0236  */
            /* JADX WARN: Removed duplicated region for block: B:188:0x03bf  */
            /* JADX WARN: Removed duplicated region for block: B:274:0x03bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:289:0x0269 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:56:0x00ec  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x0113 A[Catch: all -> 0x0176, TryCatch #5 {all -> 0x0176, blocks: (B:66:0x010b, B:68:0x0113, B:71:0x012f), top: B:262:0x010b }] */
            /* JADX WARN: Removed duplicated region for block: B:95:0x01aa  */
            /* JADX WARN: Removed duplicated region for block: B:96:0x01af  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() throws java.io.IOException {
                /*
                    Method dump skipped, instructions count: 1283
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.oye.run():void");
            }
        });
        s36.y(new ize());
        return pye.a;
    }
}
