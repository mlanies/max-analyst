package defpackage;

import android.media.session.MediaController;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;

/* loaded from: classes.dex */
public abstract class g98 extends f46 {
    public final MediaController.TransportControls g;

    public g98(MediaController.TransportControls transportControls) {
        this.g = transportControls;
    }

    public final void i0(String str, Bundle bundle) {
        if (str != null && ((str.equals(MediaSessionCompat.ACTION_FOLLOW) || str.equals(MediaSessionCompat.ACTION_UNFOLLOW)) && (bundle == null || !bundle.containsKey(MediaSessionCompat.ARGUMENT_MEDIA_ATTRIBUTE)))) {
            throw new IllegalArgumentException(zr6.i("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action ", str, "."));
        }
        this.g.sendCustomAction(str, bundle);
    }
}
