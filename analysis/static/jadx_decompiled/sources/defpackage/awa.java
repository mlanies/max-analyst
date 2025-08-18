package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class awa implements Parcelable {
    public static final Parcelable.Creator<awa> CREATOR = new fn9(22);
    public final Uri X;
    public final Uri a;
    public final Uri b;
    public final nz3 c;
    public final ov4 o;

    public awa(Uri uri, Uri uri2, nz3 nz3Var, ov4 ov4Var, Uri uri3) {
        this.a = uri;
        this.b = uri2;
        this.c = nz3Var;
        this.o = ov4Var;
        this.X = uri3;
    }

    public static Uri a(awa awaVar, up7 up7Var) {
        if (awaVar == null) {
            return Uri.parse(up7Var.a());
        }
        Uri uri = awaVar.b;
        if (uri != null) {
            return uri;
        }
        Uri uri2 = awaVar.a;
        return uri2 != null ? uri2 : Uri.parse(up7Var.a());
    }

    public static boolean b(awa awaVar, up7 up7Var) {
        if (awaVar == null) {
            return false;
        }
        return (awaVar.o == null && awaVar.c == null && a(awaVar, up7Var).equals(Uri.parse(up7Var.a()))) ? false : true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || awa.class != obj.getClass()) {
            return false;
        }
        awa awaVar = (awa) obj;
        if (Objects.equals(this.a, awaVar.a) && Objects.equals(this.b, awaVar.b) && Objects.equals(this.c, awaVar.c) && Objects.equals(this.o, awaVar.o)) {
            return Objects.equals(this.X, awaVar.X);
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.a;
        int iHashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.b;
        int iHashCode2 = (iHashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        nz3 nz3Var = this.c;
        int iHashCode3 = (iHashCode2 + (nz3Var != null ? nz3Var.hashCode() : 0)) * 31;
        ov4 ov4Var = this.o;
        int iHashCode4 = (iHashCode3 + (ov4Var != null ? ov4Var.hashCode() : 0)) * 31;
        Uri uri3 = this.X;
        return iHashCode4 + (uri3 != null ? uri3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.o, i);
        parcel.writeParcelable(this.X, i);
    }
}
