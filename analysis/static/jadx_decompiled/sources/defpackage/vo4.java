package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class vo4 implements Parcelable {
    public static final Parcelable.Creator<vo4> CREATOR = new f73(10);
    public final byte[] X;
    public final String Y;
    public final byte[] Z;
    public final String a;
    public final Uri b;
    public final String c;
    public final List o;

    public vo4(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2) {
        int iJ = oaf.J(uri, str2);
        if (iJ == 0 || iJ == 2 || iJ == 1) {
            fm9.e("customCacheKey must be null for type: " + iJ, str3 == null);
        }
        this.a = str;
        this.b = uri;
        this.c = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.o = Collections.unmodifiableList(arrayList);
        this.X = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.Y = str3;
        this.Z = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : oaf.f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vo4)) {
            return false;
        }
        vo4 vo4Var = (vo4) obj;
        return this.a.equals(vo4Var.a) && this.b.equals(vo4Var.b) && oaf.a(this.c, vo4Var.c) && this.o.equals(vo4Var.o) && Arrays.equals(this.X, vo4Var.X) && oaf.a(this.Y, vo4Var.Y) && Arrays.equals(this.Z, vo4Var.Z);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 961)) * 31;
        String str = this.c;
        int iHashCode2 = (Arrays.hashCode(this.X) + ((this.o.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.Y;
        return Arrays.hashCode(this.Z) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return this.c + ":" + this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.toString());
        parcel.writeString(this.c);
        List list = this.o;
        parcel.writeInt(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            parcel.writeParcelable((Parcelable) list.get(i2), 0);
        }
        parcel.writeByteArray(this.X);
        parcel.writeString(this.Y);
        parcel.writeByteArray(this.Z);
    }

    public vo4(Parcel parcel) {
        String string = parcel.readString();
        int i = oaf.a;
        this.a = string;
        this.b = Uri.parse(parcel.readString());
        this.c = parcel.readString();
        int i2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add((x8e) parcel.readParcelable(x8e.class.getClassLoader()));
        }
        this.o = Collections.unmodifiableList(arrayList);
        this.X = parcel.createByteArray();
        this.Y = parcel.readString();
        this.Z = parcel.createByteArray();
    }
}
