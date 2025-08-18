package defpackage;

import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class hf8 extends tg8 {
    public final String a;
    public final gf8 b;

    public hf8(String str, gf8 gf8Var) {
        this.a = str;
        this.b = gf8Var;
    }

    @Override // defpackage.tg8
    public final void f(int i) throws RemoteException {
        gf8 gf8Var;
        MediaRouter2.RoutingController routingController;
        Messenger messenger;
        String str = this.a;
        if (str == null || (gf8Var = this.b) == null || (routingController = gf8Var.g) == null || routingController.isReleased() || (messenger = gf8Var.h) == null) {
            return;
        }
        int andIncrement = gf8Var.l.getAndIncrement();
        Message messageObtain = Message.obtain();
        messageObtain.what = 7;
        messageObtain.arg1 = andIncrement;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i);
        bundle.putString("routeId", str);
        messageObtain.setData(bundle);
        messageObtain.replyTo = gf8Var.i;
        try {
            messenger.send(messageObtain);
        } catch (DeadObjectException | RemoteException unused) {
        }
    }

    @Override // defpackage.tg8
    public final void i(int i) throws RemoteException {
        gf8 gf8Var;
        MediaRouter2.RoutingController routingController;
        Messenger messenger;
        String str = this.a;
        if (str == null || (gf8Var = this.b) == null || (routingController = gf8Var.g) == null || routingController.isReleased() || (messenger = gf8Var.h) == null) {
            return;
        }
        int andIncrement = gf8Var.l.getAndIncrement();
        Message messageObtain = Message.obtain();
        messageObtain.what = 8;
        messageObtain.arg1 = andIncrement;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i);
        bundle.putString("routeId", str);
        messageObtain.setData(bundle);
        messageObtain.replyTo = gf8Var.i;
        try {
            messenger.send(messageObtain);
        } catch (DeadObjectException | RemoteException unused) {
        }
    }
}
