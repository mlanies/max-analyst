package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ResultReceiver;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class c98 extends ResultReceiver {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c98(int i, Handler handler, Object obj) {
        super(handler);
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        pr6 pr6Var = null;
        switch (this.a) {
            case 0:
                e98 e98Var = (e98) ((WeakReference) this.b).get();
                if (e98Var == null || bundle == null) {
                    return;
                }
                synchronized (e98Var.b) {
                    ai8 ai8Var = e98Var.e;
                    IBinder binder = bundle.getBinder(MediaSessionCompat.KEY_EXTRA_BINDER);
                    int i2 = uh8.d;
                    if (binder != null) {
                        IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface(IMediaSession.DESCRIPTOR);
                        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof pr6)) {
                            nr6 nr6Var = new nr6();
                            nr6Var.c = binder;
                            pr6Var = nr6Var;
                        } else {
                            pr6Var = (pr6) iInterfaceQueryLocalInterface;
                        }
                    }
                    synchronized (ai8Var.a) {
                        ai8Var.c = pr6Var;
                    }
                    ai8 ai8Var2 = e98Var.e;
                    lcf lcfVarW = tpa.w(bundle);
                    synchronized (ai8Var2.a) {
                        ai8Var2.o = lcfVarW;
                    }
                    e98Var.a();
                }
                return;
            case 1:
                if (bundle == null) {
                    bundle = Bundle.EMPTY;
                }
                ((ccd) this.b).l(new sad(i, bundle));
                return;
            default:
                ((qne) this.b).d(null);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c98(Handler handler) {
        super(handler);
        this.a = 0;
    }
}
