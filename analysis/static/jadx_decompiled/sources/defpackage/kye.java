package defpackage;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class kye {
    public static volatile boolean b;
    public static qi8 c;
    public static Context d;
    public static kbd e;
    public static pje f;
    public static final kye a = new kye();
    public static final AtomicBoolean g = new AtomicBoolean();
    public static final khe h = new khe(h8.X);
    public static final khe i = new khe(h8.o);
    public static volatile Map j = oz4.a;

    public static String a() {
        if (b) {
            return null;
        }
        Object obj = c().get(ote.b);
        if ((obj instanceof gx3 ? (gx3) obj : null) == null) {
            new ph4(14).f();
        }
        Context context = d;
        if (context == null) {
            context = null;
        }
        String strL = j47.L(context, "tracer_app_token");
        if (strL == null) {
            throw new IllegalStateException("Could not find Tracer's appToken. Is Tracer plugin configured properly?");
        }
        if (strL.equals("0000000000000000000000000000000000000000000")) {
            return null;
        }
        return strL;
    }

    public static js4 b() {
        return (js4) i.getValue();
    }

    public static Map c() {
        if (g.get()) {
            return j;
        }
        throw new IllegalStateException("Tracer is not initialized");
    }

    public static List d(ri6 ri6Var) {
        ph4 ph4Var = new ph4(14);
        ph4Var.b = 2147482647;
        gx3 gx3Var = new gx3(ph4Var);
        sy3 sy3Var = new sy3(new sp3());
        qqd qqdVar = new qqd(8, (byte) 0);
        Boolean bool = Boolean.TRUE;
        qqdVar.b = bool;
        ry3 ry3Var = new ry3(qqdVar);
        y8 y8Var = new y8();
        y8Var.a = bool;
        fj6 fj6Var = new fj6(y8Var);
        sy4 sy4Var = new sy4(13, false);
        sy4Var.b = bool;
        fl4 fl4Var = new fl4(sy4Var);
        irc ircVar = new irc();
        sh0 sh0Var = new sh0(14, (byte) 0);
        sh0Var.c = bool;
        sh0Var.b = 1000;
        return y53.M(gx3Var, sy3Var, ry3Var, fj6Var, fl4Var, ircVar, new hta(sh0Var));
    }
}
