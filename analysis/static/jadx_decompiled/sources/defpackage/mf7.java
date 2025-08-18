package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaDescriptionCompat;

/* loaded from: classes.dex */
public abstract class mf7 {
    public static Parcelable a(Parcelable parcelable, Parcelable.Creator creator) {
        if (parcelable == null) {
            return null;
        }
        Parcelable parcelable2 = (Parcelable) b(parcelable);
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable2.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            return (Parcelable) b((Parcelable) creator.createFromParcel(parcelObtain));
        } finally {
            parcelObtain.recycle();
        }
    }

    public static Object b(Object obj) {
        int i = oaf.a;
        if (i < 21 || i >= 23) {
            return obj;
        }
        if (!(obj instanceof MediaBrowserCompat.MediaItem)) {
            return obj instanceof MediaDescriptionCompat ? c((MediaDescriptionCompat) obj) : obj;
        }
        MediaBrowserCompat.MediaItem mediaItem = (MediaBrowserCompat.MediaItem) obj;
        return new MediaBrowserCompat.MediaItem(c(mediaItem.getDescription()), mediaItem.getFlags());
    }

    public static MediaDescriptionCompat c(MediaDescriptionCompat mediaDescriptionCompat) {
        return new MediaDescriptionCompat.Builder().setMediaId(mediaDescriptionCompat.getMediaId()).setTitle(mediaDescriptionCompat.getTitle()).setSubtitle(mediaDescriptionCompat.getSubtitle()).setDescription(mediaDescriptionCompat.getDescription()).setIconBitmap(mediaDescriptionCompat.getIconBitmap()).setIconUri(mediaDescriptionCompat.getIconUri()).setExtras(mediaDescriptionCompat.getExtras()).setMediaUri(mediaDescriptionCompat.getMediaUri()).build();
    }
}
