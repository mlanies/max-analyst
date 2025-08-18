package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class hkg implements ServiceConnection {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hkg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        switch (this.a) {
            case 0:
                mkg mkgVar = (mkg) this.b;
                mkgVar.b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                mkgVar.a().post(new uhg(this, iBinder));
                break;
            default:
                ykg ykgVar = (ykg) this.b;
                ykgVar.b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                ykgVar.a().post(new lkg(this, iBinder));
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.a) {
            case 0:
                mkg mkgVar = (mkg) this.b;
                mkgVar.b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                mkgVar.a().post(new ljg(1, this));
                break;
            default:
                ykg ykgVar = (ykg) this.b;
                ykgVar.b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                ykgVar.a().post(new gkg(1, this));
                break;
        }
    }
}
