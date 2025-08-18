package defpackage;

import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaMetadataCompat;

/* loaded from: classes.dex */
public final class hd8 implements Parcelable {
    public static final Parcelable.Creator<hd8> CREATOR;
    public static final us c;
    public static final String[] o;
    public final Bundle a;
    public MediaMetadata b;

    static {
        us usVar = new us();
        c = usVar;
        zr6.m(1, usVar, MediaMetadataCompat.METADATA_KEY_TITLE, 1, MediaMetadataCompat.METADATA_KEY_ARTIST);
        zr6.m(0, usVar, MediaMetadataCompat.METADATA_KEY_DURATION, 1, MediaMetadataCompat.METADATA_KEY_ALBUM);
        zr6.m(1, usVar, MediaMetadataCompat.METADATA_KEY_AUTHOR, 1, MediaMetadataCompat.METADATA_KEY_WRITER);
        zr6.m(1, usVar, MediaMetadataCompat.METADATA_KEY_COMPOSER, 1, MediaMetadataCompat.METADATA_KEY_COMPILATION);
        zr6.m(1, usVar, MediaMetadataCompat.METADATA_KEY_DATE, 0, MediaMetadataCompat.METADATA_KEY_YEAR);
        zr6.m(1, usVar, MediaMetadataCompat.METADATA_KEY_GENRE, 0, MediaMetadataCompat.METADATA_KEY_TRACK_NUMBER);
        zr6.m(0, usVar, MediaMetadataCompat.METADATA_KEY_NUM_TRACKS, 0, MediaMetadataCompat.METADATA_KEY_DISC_NUMBER);
        zr6.m(1, usVar, MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, 2, MediaMetadataCompat.METADATA_KEY_ART);
        zr6.m(1, usVar, MediaMetadataCompat.METADATA_KEY_ART_URI, 2, MediaMetadataCompat.METADATA_KEY_ALBUM_ART);
        zr6.m(1, usVar, MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI, 3, MediaMetadataCompat.METADATA_KEY_USER_RATING);
        zr6.m(3, usVar, MediaMetadataCompat.METADATA_KEY_RATING, 1, MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE);
        zr6.m(1, usVar, MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, 1, MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION);
        zr6.m(2, usVar, MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, 1, MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI);
        zr6.m(1, usVar, MediaMetadataCompat.METADATA_KEY_MEDIA_ID, 0, MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE);
        zr6.m(1, usVar, MediaMetadataCompat.METADATA_KEY_MEDIA_URI, 0, MediaMetadataCompat.METADATA_KEY_ADVERTISEMENT);
        usVar.put(MediaMetadataCompat.METADATA_KEY_DOWNLOAD_STATUS, 0);
        o = new String[]{MediaMetadataCompat.METADATA_KEY_TITLE, MediaMetadataCompat.METADATA_KEY_ARTIST, MediaMetadataCompat.METADATA_KEY_ALBUM, MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, MediaMetadataCompat.METADATA_KEY_WRITER, MediaMetadataCompat.METADATA_KEY_AUTHOR, MediaMetadataCompat.METADATA_KEY_COMPOSER};
        CREATOR = new uk7(11);
    }

    public hd8(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.a = bundle2;
        bi8.a(bundle2);
    }

    public final long a(String str) {
        return this.a.getLong(str, 0L);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    public hd8(Parcel parcel) {
        Bundle bundle = parcel.readBundle(bi8.class.getClassLoader());
        bundle.getClass();
        this.a = bundle;
    }
}
