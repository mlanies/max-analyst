package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class e99 implements Parcelable {
    public static final Parcelable.Creator<e99> CREATOR = new uk7(20);
    public final c99[] a;

    public e99(c99... c99VarArr) {
        this.a = c99VarArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e99.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((e99) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        String strValueOf = String.valueOf(Arrays.toString(this.a));
        return strValueOf.length() != 0 ? "entries=".concat(strValueOf) : new String("entries=");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        c99[] c99VarArr = this.a;
        parcel.writeInt(c99VarArr.length);
        for (c99 c99Var : c99VarArr) {
            parcel.writeParcelable(c99Var, 0);
        }
    }

    public e99(List list) {
        this.a = (c99[]) list.toArray(new c99[0]);
    }

    public e99(Parcel parcel) {
        this.a = new c99[parcel.readInt()];
        int i = 0;
        while (true) {
            c99[] c99VarArr = this.a;
            if (i >= c99VarArr.length) {
                return;
            }
            c99VarArr[i] = (c99) parcel.readParcelable(c99.class.getClassLoader());
            i++;
        }
    }
}
