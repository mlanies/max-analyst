package defpackage;

import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class y74 {
    public final AudioTrack a;
    public final x30 b;
    public x74 c = new AudioRouting.OnRoutingChangedListener() { // from class: x74
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final void onRoutingChanged(AudioRouting audioRouting) {
            this.a.b(audioRouting);
        }
    };

    /* JADX WARN: Type inference failed for: r3v1, types: [x74] */
    public y74(AudioTrack audioTrack, x30 x30Var) {
        this.a = audioTrack;
        this.b = x30Var;
        audioTrack.addOnRoutingChangedListener(this.c, new Handler(Looper.myLooper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(AudioRouting audioRouting) {
        if (this.c == null || audioRouting.getRoutedDevice() == null) {
            return;
        }
        this.b.f(audioRouting.getRoutedDevice());
    }

    public void c() {
        x74 x74Var = this.c;
        x74Var.getClass();
        this.a.removeOnRoutingChangedListener(x74Var);
        this.c = null;
    }
}
