package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* loaded from: classes.dex */
public final class cr4 implements Comparator, Parcelable {
    public static final Parcelable.Creator<cr4> CREATOR = new f73(12);
    public final ar4[] a;
    public int b;
    public final String c;
    public final int o;

    public cr4(String str, ArrayList arrayList) {
        this(str, false, (ar4[]) arrayList.toArray(new ar4[0]));
    }

    public final cr4 a(String str) {
        return maf.a(this.c, str) ? this : new cr4(str, false, this.a);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ar4 ar4Var = (ar4) obj;
        ar4 ar4Var2 = (ar4) obj2;
        UUID uuid = bw0.a;
        return uuid.equals(ar4Var.b) ? uuid.equals(ar4Var2.b) ? 0 : 1 : ar4Var.b.compareTo(ar4Var2.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cr4.class != obj.getClass()) {
            return false;
        }
        cr4 cr4Var = (cr4) obj;
        return maf.a(this.c, cr4Var.c) && Arrays.equals(this.a, cr4Var.a);
    }

    public final int hashCode() {
        if (this.b == 0) {
            String str = this.c;
            this.b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.a);
        }
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeTypedArray(this.a, 0);
    }

    public cr4(String str, boolean z, ar4... ar4VarArr) {
        this.c = str;
        ar4VarArr = z ? (ar4[]) ar4VarArr.clone() : ar4VarArr;
        this.a = ar4VarArr;
        this.o = ar4VarArr.length;
        Arrays.sort(ar4VarArr, this);
    }

    public cr4(Parcel parcel) {
        this.c = parcel.readString();
        ar4[] ar4VarArr = (ar4[]) parcel.createTypedArray(ar4.CREATOR);
        int i = maf.a;
        this.a = ar4VarArr;
        this.o = ar4VarArr.length;
    }
}
