package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes.dex */
public abstract class hh7 extends Service implements eh7 {
    public final vq7 a = new vq7(this);

    @Override // defpackage.eh7
    public final gh7 Q() {
        return (gh7) this.a.b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        this.a.r(eg7.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.a.r(eg7.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        eg7 eg7Var = eg7.ON_STOP;
        vq7 vq7Var = this.a;
        vq7Var.r(eg7Var);
        vq7Var.r(eg7.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.a.r(eg7.ON_START);
        super.onStart(intent, i);
    }
}
