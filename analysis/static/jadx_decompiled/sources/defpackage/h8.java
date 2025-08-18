package defpackage;

import android.content.Context;
import android.net.Uri;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class h8 extends rd7 implements k56 {
    public final /* synthetic */ int a;
    public static final h8 b = new h8(0, 0);
    public static final h8 c = new h8(0, 1);
    public static final h8 o = new h8(0, 2);
    public static final h8 X = new h8(0, 3);
    public static final h8 Y = new h8(0, 4);
    public static final h8 Z = new h8(0, 5);
    public static final h8 s0 = new h8(0, 6);
    public static final h8 t0 = new h8(0, 7);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h8(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        String str;
        boolean z = false;
        switch (this.a) {
            case 0:
                n4c.a.getClass();
                return Integer.valueOf(n4c.b.g(2147418112) + 65536);
            case 1:
                kye kyeVar = kye.a;
                Object obj = kye.c().get(oag.a);
                fl4 fl4Var = obj instanceof fl4 ? (fl4) obj : null;
                return fl4Var == null ? new fl4(new sy4(13, z)) : fl4Var;
            case 2:
                Context context = kye.d;
                Context context2 = context != null ? context : null;
                String strQ = c37.q();
                if (strQ.equals(context2.getPackageName())) {
                    str = "tracer";
                } else {
                    str = "tracer-" + Uri.encode(strQ.replace(':', '-'));
                }
                return new js4(lk5.J(new File(context2.getCacheDir(), str), "drops.json"));
            case 3:
                Context context3 = kye.d;
                if (context3 == null) {
                    context3 = null;
                }
                kye kyeVar2 = kye.a;
                Object obj2 = kye.c().get(ote.b);
                gx3 gx3Var = obj2 instanceof gx3 ? (gx3) obj2 : null;
                if (gx3Var == null) {
                    gx3Var = new gx3(new ph4(14));
                }
                StringBuilder sbM = au1.m("TracerSDK/1.1.1 App/", context3.getPackageName(), " ");
                String property = System.getProperty("http.agent");
                if (property == null) {
                    property = "Dalvik/Unknown (Linux; U; Android Unknown; Device Unknown Build/Unknown)";
                }
                sbM.append(property);
                return new wq6(gx3Var.b, context3, sbM.toString());
            case 4:
                kye kyeVar3 = kye.a;
                Object obj3 = kye.c().get(ote.b);
                if ((obj3 instanceof gx3 ? (gx3) obj3 : null) == null) {
                    new ph4(14).f();
                }
                return Executors.newSingleThreadExecutor(new ig(1));
            case 5:
                kye kyeVar4 = kye.a;
                Object obj4 = kye.c().get(ote.b);
                if ((obj4 instanceof gx3 ? (gx3) obj4 : null) == null) {
                    new ph4(14).f();
                }
                return Executors.newCachedThreadPool(new pd3(4, new AtomicInteger(0)));
            case 6:
                return Long.valueOf(Os.sysconf(OsConstants._SC_CLK_TCK));
            default:
                return Long.valueOf(Os.sysconf(OsConstants._SC_NPROCESSORS_CONF));
        }
    }
}
