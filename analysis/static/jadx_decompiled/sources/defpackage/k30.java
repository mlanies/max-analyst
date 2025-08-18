package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* loaded from: classes.dex */
public final class k30 extends BroadcastReceiver implements Runnable {
    public final /* synthetic */ int a;
    public final Handler b;
    public final Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ k30(Object obj, Handler handler, Object obj2, int i) {
        this.a = i;
        this.o = obj;
        this.b = handler;
        this.c = obj2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.a) {
            case 0:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    this.b.post(this);
                    break;
                }
                break;
            default:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    this.b.post(this);
                    break;
                }
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                if (((td) this.o).b) {
                    ((n75) this.c).a.p2(-1, 3, false);
                    break;
                }
                break;
            default:
                if (((td) this.o).b) {
                    ((o75) this.c).a.s2(-1, 3, false);
                    break;
                }
                break;
        }
    }
}
