package defpackage;

import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;

/* loaded from: classes.dex */
public final class jg8 extends MediaControllerCompat.Callback {
    public final /* synthetic */ pg8 a;

    public jg8(pg8 pg8Var) {
        this.a = pg8Var;
    }

    @Override // android.support.v4.media.session.MediaControllerCompat.Callback
    public final void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
        MediaDescriptionCompat description = mediaMetadataCompat == null ? null : mediaMetadataCompat.getDescription();
        pg8 pg8Var = this.a;
        pg8Var.W0 = description;
        pg8Var.h();
        pg8Var.l();
    }

    @Override // android.support.v4.media.session.MediaControllerCompat.Callback
    public final void onSessionDestroyed() {
        pg8 pg8Var = this.a;
        MediaControllerCompat mediaControllerCompat = pg8Var.U0;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.unregisterCallback(pg8Var.V0);
            pg8Var.U0 = null;
        }
    }
}
