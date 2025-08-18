package defpackage;

import android.content.Context;
import android.media.AudioManager;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes2.dex */
public final /* synthetic */ class dp implements lde, wde {
    public final /* synthetic */ Context a;

    @Override // defpackage.wde
    public xde a(ana anaVar) {
        l0f l0fVar = (l0f) anaVar.X;
        if (l0fVar == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.".toString());
        }
        String str = (String) anaVar.o;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
        }
        return new o36(this.a, str, l0fVar, true, true);
    }

    @Override // defpackage.lde
    public Object get() {
        return (AudioManager) this.a.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
    }
}
