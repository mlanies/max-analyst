package defpackage;

import android.os.Handler;
import android.os.Message;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes2.dex */
public final class mcg implements Runnable {
    public final /* synthetic */ roa X;
    public final String a;
    public final Runnable b;
    public volatile boolean c = false;
    public int o = 0;

    public mcg(roa roaVar, String str, Runnable runnable) {
        this.X = roaVar;
        this.a = str;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = this.X.b;
        if (handler != null) {
            Message messageObtainMessage = handler.obtainMessage();
            messageObtainMessage.obj = this;
            this.X.b.sendMessageDelayed(messageObtainMessage, MultiFileUploader.UPLOAD_NEXT_INTERVAL);
        }
        this.b.run();
        this.c = true;
    }
}
