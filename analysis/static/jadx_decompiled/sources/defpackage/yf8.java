package defpackage;

import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.mediarouter.app.d;

/* loaded from: classes.dex */
public final class yf8 extends MediaControllerCompat.Callback {
    public final /* synthetic */ d a;

    public yf8(d dVar) {
        this.a = dVar;
    }

    @Override // android.support.v4.media.session.MediaControllerCompat.Callback
    public final void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
        MediaDescriptionCompat description = mediaMetadataCompat == null ? null : mediaMetadataCompat.getDescription();
        d dVar = this.a;
        dVar.f1 = description;
        dVar.r();
        dVar.q(false);
    }

    @Override // android.support.v4.media.session.MediaControllerCompat.Callback
    public final void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
        d dVar = this.a;
        dVar.e1 = playbackStateCompat;
        dVar.q(false);
    }

    @Override // android.support.v4.media.session.MediaControllerCompat.Callback
    public final void onSessionDestroyed() {
        d dVar = this.a;
        MediaControllerCompat mediaControllerCompat = dVar.c1;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.unregisterCallback(dVar.d1);
            dVar.c1 = null;
        }
    }
}
