package defpackage;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes.dex */
public final class b98 extends MediaController.Callback {
    public final WeakReference a;

    public b98(ba8 ba8Var) {
        this.a = new WeakReference(ba8Var);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        ba8 ba8Var = (ba8) this.a.get();
        if (ba8Var == null || playbackInfo == null) {
            return;
        }
        ba8Var.a(new f98(playbackInfo.getPlaybackType(), new j30(new i30(playbackInfo.getAudioAttributes())), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
    }

    @Override // android.media.session.MediaController.Callback
    public final void onExtrasChanged(Bundle bundle) {
        bi8.a(bundle);
        ba8 ba8Var = (ba8) this.a.get();
        if (ba8Var != null) {
            ba8Var.c(bundle);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        hd8 hd8VarCreateFromParcel;
        ba8 ba8Var = (ba8) this.a.get();
        if (ba8Var != null) {
            us usVar = hd8.c;
            if (mediaMetadata != null) {
                Parcel parcelObtain = Parcel.obtain();
                mediaMetadata.writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                hd8VarCreateFromParcel = hd8.CREATOR.createFromParcel(parcelObtain);
                parcelObtain.recycle();
                hd8VarCreateFromParcel.b = mediaMetadata;
            } else {
                hd8VarCreateFromParcel = null;
            }
            ba8Var.d(hd8VarCreateFromParcel);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        ba8 ba8Var = (ba8) this.a.get();
        if (ba8Var == null || ba8Var.c != null) {
            return;
        }
        ba8Var.e(i3b.a(playbackState));
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueChanged(List list) {
        ba8 ba8Var = (ba8) this.a.get();
        if (ba8Var != null) {
            ba8Var.f(yh8.a(list));
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueTitleChanged(CharSequence charSequence) {
        ba8 ba8Var = (ba8) this.a.get();
        if (ba8Var != null) {
            ba8Var.g(charSequence);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionDestroyed() {
        ba8 ba8Var = (ba8) this.a.get();
        if (ba8Var != null) {
            ba8Var.e.b.release();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionEvent(String str, Bundle bundle) {
        bi8.a(bundle);
        ba8 ba8Var = (ba8) this.a.get();
        if (ba8Var != null) {
            ba8Var.h(str, bundle);
        }
    }
}
