package defpackage;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;

/* loaded from: classes.dex */
public final class ja8 implements Parcelable {
    public static final Parcelable.Creator<ja8> CREATOR = new uk7(10);
    public final Bitmap X;
    public final Uri Y;
    public final Bundle Z;
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence o;
    public final Uri s0;
    public MediaDescription t0;

    public ja8(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.o = charSequence3;
        this.X = bitmap;
        this.Y = uri;
        this.Z = bundle;
        this.s0 = uri2;
    }

    public static ja8 a(Object obj) {
        Bundle bundle;
        Uri uriA = null;
        if (obj == null) {
            return null;
        }
        MediaDescription mediaDescription = (MediaDescription) obj;
        String strG = ha8.g(mediaDescription);
        CharSequence charSequenceI = ha8.i(mediaDescription);
        CharSequence charSequenceH = ha8.h(mediaDescription);
        CharSequence charSequenceC = ha8.c(mediaDescription);
        Bitmap bitmapE = ha8.e(mediaDescription);
        Uri uriF = ha8.f(mediaDescription);
        Bundle bundleD = ha8.d(mediaDescription);
        if (bundleD == null) {
            bundleD = null;
        } else {
            bi8.a(bundleD);
            try {
                bundleD.isEmpty();
            } catch (BadParcelableException unused) {
            }
        }
        if (bundleD != null) {
            bundleD = new Bundle(bundleD);
        }
        if (bundleD != null) {
            Uri uri = (Uri) bundleD.getParcelable(MediaDescriptionCompat.DESCRIPTION_KEY_MEDIA_URI);
            if (uri == null) {
                bundle = bundleD;
                uriA = uri;
            } else if (bundleD.containsKey(MediaDescriptionCompat.DESCRIPTION_KEY_NULL_BUNDLE_FLAG) && bundleD.size() == 2) {
                bundle = null;
                uriA = uri;
            } else {
                bundleD.remove(MediaDescriptionCompat.DESCRIPTION_KEY_MEDIA_URI);
                bundleD.remove(MediaDescriptionCompat.DESCRIPTION_KEY_NULL_BUNDLE_FLAG);
                bundle = bundleD;
                uriA = uri;
            }
        } else {
            bundle = bundleD;
        }
        if (uriA == null) {
            uriA = ia8.a(mediaDescription);
        }
        ja8 ja8Var = new ja8(strG, charSequenceI, charSequenceH, charSequenceC, bitmapE, uriF, bundle, uriA);
        ja8Var.t0 = mediaDescription;
        return ja8Var;
    }

    public final MediaDescription b() {
        MediaDescription mediaDescription = this.t0;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builderB = ha8.b();
        ha8.n(builderB, this.a);
        ha8.p(builderB, this.b);
        ha8.o(builderB, this.c);
        ha8.j(builderB, this.o);
        ha8.l(builderB, this.X);
        ha8.m(builderB, this.Y);
        ha8.k(builderB, this.Z);
        ia8.b(builderB, this.s0);
        MediaDescription mediaDescriptionA = ha8.a(builderB);
        this.t0 = mediaDescriptionA;
        return mediaDescriptionA;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.b) + ", " + ((Object) this.c) + ", " + ((Object) this.o);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        b().writeToParcel(parcel, i);
    }
}
