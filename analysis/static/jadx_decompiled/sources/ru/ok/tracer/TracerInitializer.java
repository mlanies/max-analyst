package ru.ok.tracer;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import defpackage.dp3;
import defpackage.gx3;
import defpackage.j47;
import defpackage.jye;
import defpackage.kbd;
import defpackage.kye;
import defpackage.l7b;
import defpackage.lye;
import defpackage.mz7;
import defpackage.nye;
import defpackage.ote;
import defpackage.ph4;
import defpackage.pje;
import defpackage.qi8;
import defpackage.ri6;
import defpackage.w07;
import defpackage.z53;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.tracer.utils.LoggerInitializer;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ok/tracer/TracerInitializer;", "Lw07;", "Lkye;", "<init>", "()V", "tracer-commons_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class TracerInitializer implements w07 {
    @Override // defpackage.w07
    public final List a() {
        return Collections.singletonList(LoggerInitializer.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w07
    public final Object b(Context context) {
        kye kyeVar = kye.a;
        if (kye.g.getAndSet(true)) {
            throw new IllegalStateException("Tracer already initialized!");
        }
        kye.d = context;
        if (context instanceof ri6) {
            try {
                List listD = kye.d((ri6) context);
                int iZ = mz7.Z(z53.S(listD, 10));
                if (iZ < 16) {
                    iZ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iZ);
                for (Object obj : listD) {
                    linkedHashMap.put(((nye) obj).a(), obj);
                }
                kye.j = linkedHashMap;
            } catch (Exception unused) {
            }
        }
        kye kyeVar2 = kye.a;
        Object obj2 = kye.c().get(ote.b);
        gx3 gx3Var = obj2 instanceof gx3 ? (gx3) obj2 : null;
        if (gx3Var == null) {
            gx3Var = new gx3(new ph4(14));
        }
        PackageInfo packageInfoU = ote.u(context.getPackageManager(), context.getPackageName());
        String str = packageInfoU.packageName;
        String str2 = packageInfoU.versionName;
        long longVersionCode = packageInfoU.getLongVersionCode();
        String strL = j47.L(context, "tracer_mapping_uuid");
        if (strL == null) {
            throw new IllegalStateException("Could not find build UUID. Is Tracer plugin configured properly?");
        }
        if (strL.equals("00000000-0000-0000-0000-000000000000")) {
            strL = null;
        }
        String strL2 = j47.L(context, "tracer_environment");
        qi8 qi8Var = new qi8();
        qi8Var.b = str;
        qi8Var.a = str2;
        qi8Var.o = longVersionCode;
        qi8Var.c = strL;
        qi8Var.X = strL2;
        kye.c = qi8Var;
        dp3.b = new l7b(new jye(context, 0));
        kye.e = new kbd(context);
        kye.f = new pje(context);
        Map map = gx3Var.a;
        if (true ^ map.isEmpty()) {
            pje pjeVar = kye.f;
            if (pjeVar == null) {
                pjeVar = null;
            }
            pjeVar.b(map);
        }
        Application application = (Application) context.getApplicationContext();
        kbd kbdVar = kye.e;
        application.registerActivityLifecycleCallbacks(new lye(kbdVar != null ? kbdVar : null));
        return kyeVar2;
    }
}
