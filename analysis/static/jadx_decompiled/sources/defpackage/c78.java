package defpackage;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class c78 implements b78 {
    public final Messenger a;

    public c78(Messenger messenger) {
        this.a = messenger;
    }

    public final void a(int i, Bundle bundle) throws RemoteException {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = 2;
        if (bundle != null) {
            messageObtain.setData(bundle);
        }
        this.a.send(messageObtain);
    }
}
