package defpackage;

import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes.dex */
public final class m40 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ int a;
    public final Handler b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m40(int i, Handler handler, Object obj) {
        this.a = i;
        this.c = obj;
        this.b = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        switch (this.a) {
            case 0:
                this.b.post(new l40(i, 0, this));
                break;
            default:
                this.b.post(new l40(i, 1, this));
                break;
        }
    }
}
