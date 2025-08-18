package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.util.HashMap;

/* loaded from: classes.dex */
public class qh8 {
    public static final Object b = new Object();
    public static final HashMap c = new HashMap();
    public final ii8 a;

    public qh8(Context context, u75 u75Var, ffc ffcVar, oz7 oz7Var, Bundle bundle, Bundle bundle2, imc imcVar) {
        synchronized (b) {
            HashMap map = c;
            if (map.containsKey("")) {
                throw new IllegalStateException("Session ID must be unique. ID=");
            }
            map.put("", this);
        }
        this.a = new ii8(this, context, u75Var, ffcVar, oz7Var, bundle, bundle2, imcVar);
    }

    public final ao0 a() {
        return this.a.m;
    }

    public final ii8 b() {
        return this.a;
    }

    public final q3b c() {
        return this.a.s.a;
    }

    public final PendingIntent d() {
        return this.a.t;
    }

    public final boolean e() {
        return this.a.p;
    }
}
