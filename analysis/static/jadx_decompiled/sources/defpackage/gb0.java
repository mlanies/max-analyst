package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class gb0 {
    public Object a;
    public int b;
    public Object c;
    public Object d;
    public Object e = oaf.p(null);
    public Object f;
    public Object g;

    public gb0(Context context, q64 q64Var, zhc zhcVar) {
        this.a = context.getApplicationContext();
        this.c = q64Var;
        this.d = zhcVar;
    }

    public hb0 a() {
        String strG = this.b == 0 ? " registrationStatus" : "";
        if (((Long) this.f) == null) {
            strG = strG.concat(" expiresInSecs");
        }
        if (((Long) this.g) == null) {
            strG = au1.g(strG, " tokenCreationEpochInSecs");
        }
        if (!strG.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strG));
        }
        return new hb0(this.b, ((Long) this.f).longValue(), ((Long) this.g).longValue(), (String) this.a, (String) this.c, (String) this.d, (String) this.e);
    }

    public void b() {
        int iA = ((zhc) this.d).a((Context) this.a);
        if (this.b != iA) {
            this.b = iA;
            ((so4) ((q64) this.c).b).b(this, iA);
        }
    }

    public boolean c() {
        return (this.b < ((List) this.a).size()) || (((ArrayList) this.d).isEmpty() ^ true);
    }

    public int d() {
        zhc zhcVar = (zhc) this.d;
        Context context = (Context) this.a;
        this.b = zhcVar.a(context);
        IntentFilter intentFilter = new IntentFilter();
        int i = zhcVar.a;
        if ((i & 1) != 0) {
            if (oaf.a >= 24) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                connectivityManager.getClass();
                bic bicVar = new bic(this);
                this.g = bicVar;
                connectivityManager.registerDefaultNetworkCallback(bicVar);
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if ((i & 8) != 0) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if ((i & 4) != 0) {
            if (oaf.a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        if ((i & 16) != 0) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        an anVar = new an(11, this);
        this.f = anVar;
        context.registerReceiver(anVar, intentFilter, null, (Handler) this.e);
        return this.b;
    }
}
