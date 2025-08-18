package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class q4d implements Parcelable {
    public static final Parcelable.Creator<q4d> CREATOR = new e9b(19);
    public final String X;
    public final RectF Y;
    public final Rect Z;
    public final zp7 a;
    public final boolean b;
    public final Uri c;
    public final Uri o;
    public final Uri s0;

    public q4d(zp7 zp7Var, boolean z, Uri uri, Uri uri2, String str, RectF rectF, Rect rect, Uri uri3) {
        this.a = zp7Var;
        this.b = z;
        this.c = uri;
        this.o = uri2;
        this.X = str;
        this.Y = rectF;
        this.Z = rect;
        this.s0 = uri3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4d)) {
            return false;
        }
        q4d q4dVar = (q4d) obj;
        return tpa.f(this.a, q4dVar.a) && this.b == q4dVar.b && tpa.f(this.c, q4dVar.c) && tpa.f(this.o, q4dVar.o) && tpa.f(this.X, q4dVar.X) && tpa.f(this.Y, q4dVar.Y) && tpa.f(this.Z, q4dVar.Z) && tpa.f(this.s0, q4dVar.s0);
    }

    public final int hashCode() {
        int iHashCode = (this.o.hashCode() + ((this.c.hashCode() + ms2.d(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        String str = this.X;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        RectF rectF = this.Y;
        int iHashCode3 = (iHashCode2 + (rectF == null ? 0 : rectF.hashCode())) * 31;
        Rect rect = this.Z;
        int iHashCode4 = (iHashCode3 + (rect == null ? 0 : rect.hashCode())) * 31;
        Uri uri = this.s0;
        return iHashCode4 + (uri != null ? uri.hashCode() : 0);
    }

    public final String toString() {
        return "SelectedLocalMediaItem(localMediaItem=" + this.a + ", isFile=" + this.b + ", photoEditorUri=" + this.c + ", thumbnail=" + this.o + ", photoEditorFilePath=" + this.X + ", relativeCrop=" + this.Y + ", absoluteCrop=" + this.Z + ", overlay=" + this.s0 + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.o, i);
        parcel.writeString(this.X);
        parcel.writeParcelable(this.Y, i);
        parcel.writeParcelable(this.Z, i);
        parcel.writeParcelable(this.s0, i);
    }
}
