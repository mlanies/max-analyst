package defpackage;

import android.content.Context;
import android.os.PowerManager;
import android.provider.Settings;
import java.lang.ref.WeakReference;
import java.util.UUID;

/* loaded from: classes2.dex */
public abstract class ri4 {
    public static volatile vi4 f;
    public final Context a;
    public final m7b b;
    public final je7 c;
    public PowerManager d;
    public final fic e = new fic(new es3(7, this));

    public ri4(Context context, m7b m7bVar, je7 je7Var) {
        this.a = context;
        this.b = m7bVar;
        WeakReference weakReference = new WeakReference(this);
        z7d z7dVar = ((p7b) m7bVar).b;
        z7dVar.l.add(new qi4(this, 0, weakReference));
        this.c = je7Var;
    }

    public final String a() {
        p7b p7bVar = (p7b) this.b;
        String strF = null;
        String string = p7bVar.a.g.getString("device.id", null);
        if (oag.t(string)) {
            hm9.n("ri4", "New device id generated");
            try {
                string = Settings.Secure.getString(this.a.getContentResolver(), "android_id");
            } catch (Exception e) {
                hm9.p("ri4", "Can't get hardware device id", e);
                string = null;
            }
            if (oag.t(string)) {
                xie xieVar = (xie) ((ti4) this).i.getValue();
                xieVar.getClass();
                try {
                    strF = xieVar.f();
                } catch (Exception e2) {
                    hm9.p(xieVar.a, "error while get instance id", e2);
                }
                string = !oag.t(strF) ? strF : UUID.randomUUID().toString();
            }
            p7bVar.a.m("device.id", string);
        }
        return string;
    }

    public final vi4 b() {
        if (f == null) {
            f = lz7.q(this.a);
        }
        return f;
    }

    public abstract boolean c();

    public final boolean d() {
        return ((lqf) ((zp) this.c.getValue())).c();
    }

    public abstract void e();

    public abstract void f(String str);

    public abstract void g(String str);

    public abstract t9f h();
}
