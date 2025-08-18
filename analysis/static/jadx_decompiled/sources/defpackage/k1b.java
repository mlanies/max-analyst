package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes2.dex */
public final class k1b extends BroadcastReceiver {
    public final Context a;
    public final o1b b;
    public final IntentFilter c;
    public boolean d;

    public k1b(Context context, o1b o1bVar) {
        this.a = context;
        this.b = o1bVar;
        IntentFilter intentFilter = new IntentFilter();
        this.c = intentFilter;
        intentFilter.addAction("ru.ok.video.ACTION_VIDEO_PLAY");
        intentFilter.addAction("ru.ok.video.ACTION_VIDEO_PAUSE");
        intentFilter.addAction("ru.ok.video.ACTION_VIDEO_STOP");
        this.d = false;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        o1b o1bVar;
        String action = intent.getAction();
        if (action == null || !this.c.hasAction(action)) {
            return;
        }
        o1bVar = this.b;
        switch (action) {
            case "ru.ok.video.ACTION_VIDEO_PLAY":
                o1bVar.b(1);
                break;
            case "ru.ok.video.ACTION_VIDEO_STOP":
                o1bVar.b(3);
                break;
            case "ru.ok.video.ACTION_VIDEO_PAUSE":
                o1bVar.b(2);
                break;
        }
    }
}
