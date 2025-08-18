package defpackage;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;

/* loaded from: classes.dex */
public abstract class e65 {
    public static void a(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) throws IllegalArgumentException {
        mediaMetadataRetriever.setDataSource(mediaDataSource);
    }
}
