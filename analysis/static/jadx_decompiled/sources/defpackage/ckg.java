package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzt;

/* loaded from: classes.dex */
public final class ckg {
    public final int a;
    public final qne b = new qne();
    public final int c;
    public final Bundle d;
    public final /* synthetic */ int e;

    public ckg(int i, int i2, Bundle bundle, int i3) {
        this.e = i3;
        this.a = i;
        this.c = i2;
        this.d = bundle;
    }

    public final void a(Bundle bundle) {
        switch (this.e) {
            case 0:
                if (!bundle.getBoolean("ack", false)) {
                    c(new zzt("Invalid response to one way request", null));
                    break;
                } else {
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        toString();
                    }
                    this.b.b(null);
                    break;
                }
            default:
                Bundle bundle2 = bundle.getBundle("data");
                if (bundle2 == null) {
                    bundle2 = Bundle.EMPTY;
                }
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    toString();
                    String.valueOf(bundle2);
                }
                this.b.b(bundle2);
                break;
        }
    }

    public final boolean b() {
        switch (this.e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void c(zzt zztVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            toString();
            zztVar.toString();
        }
        this.b.a(zztVar);
    }

    public final String toString() {
        return "Request { what=" + this.c + " id=" + this.a + " oneWay=" + b() + "}";
    }
}
