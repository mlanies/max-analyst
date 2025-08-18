package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import java.util.concurrent.TimeUnit;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes2.dex */
public final class vm1 {
    public final qz7 a;
    public final xje b;
    public final crd c;
    public final fd7 d;
    public final imc e;
    public final a8g f;
    public final die g;
    public final sm1 h;
    public final ax i;
    public final n61 j;
    public volatile boolean k;
    public final c11 l;
    public final q7 m;

    public vm1(Context context, qz7 qz7Var, wte wteVar, ConnectivityManager connectivityManager, TelephonyManager telephonyManager, a4c a4cVar, vx0 vx0Var, hw3 hw3Var) {
        this.a = qz7Var;
        xje xjeVar = new xje(1, vx0Var);
        this.b = xjeVar;
        crd crdVar = new crd();
        this.c = crdVar;
        fd7 fd7Var = new fd7(hw3Var);
        this.d = fd7Var;
        imc imcVar = new imc(connectivityManager, telephonyManager, false, 27);
        this.e = imcVar;
        this.f = new a8g(qz7Var, connectivityManager, telephonyManager, a4cVar);
        die dieVar = new die();
        dieVar.a = qz7Var;
        dieVar.b = connectivityManager;
        dieVar.c = telephonyManager;
        dieVar.o = new ece();
        this.g = dieVar;
        this.h = new sm1(qz7Var, a4cVar, xjeVar, crdVar, fd7Var, imcVar, wteVar);
        ax axVar = new ax();
        this.i = axVar;
        CallAnalyticsSender callAnalyticsSender = (CallAnalyticsSender) qz7Var.c;
        n61 n61Var = new n61(callAnalyticsSender, wteVar);
        this.j = n61Var;
        this.l = new c11(callAnalyticsSender, new o23(context, a4cVar, wteVar), wteVar);
        this.m = new q7(n61Var, wteVar);
        sd7 sd7Var = (sd7) axVar.c;
        if (sd7Var != null) {
            dm4.a(sd7Var);
        }
        axVar.c = qy9.k(MultiFileUploader.UPLOAD_NEXT_INTERVAL, MultiFileUploader.UPLOAD_NEXT_INTERVAL, TimeUnit.MILLISECONDS, muc.b()).p(new y7f(2, axVar));
    }
}
