package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* loaded from: classes.dex */
public final class dr4 implements Comparator, Parcelable {
    public static final Parcelable.Creator<dr4> CREATOR = new f73(13);
    public final br4[] a;
    public int b;
    public final String c;
    public final int o;

    public dr4(String str, ArrayList arrayList) {
        this(str, false, (br4[]) arrayList.toArray(new br4[0]));
    }

    public final dr4 a(String str) {
        return oaf.a(this.c, str) ? this : new dr4(str, false, this.a);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        br4 br4Var = (br4) obj;
        br4 br4Var2 = (br4) obj2;
        UUID uuid = ew0.a;
        return uuid.equals(br4Var.b) ? uuid.equals(br4Var2.b) ? 0 : 1 : br4Var.b.compareTo(br4Var2.b);
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
        if (obj == null || dr4.class != obj.getClass()) {
            return false;
        }
        dr4 dr4Var = (dr4) obj;
        return oaf.a(this.c, dr4Var.c) && Arrays.equals(this.a, dr4Var.a);
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

    public dr4(String str, boolean z, br4... br4VarArr) {
        this.c = str;
        br4VarArr = z ? (br4[]) br4VarArr.clone() : br4VarArr;
        this.a = br4VarArr;
        this.o = br4VarArr.length;
        Arrays.sort(br4VarArr, this);
    }

    public dr4(Parcel parcel) {
        this.c = parcel.readString();
        br4[] br4VarArr = (br4[]) parcel.createTypedArray(br4.CREATOR);
        int i = oaf.a;
        this.a = br4VarArr;
        this.o = br4VarArr.length;
    }
}
