package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class f99 implements Parcelable {
    public static final Parcelable.Creator<f99> CREATOR = new uk7(21);
    public final d99[] a;
    public final long b;

    public f99(d99... d99VarArr) {
        this(-9223372036854775807L, d99VarArr);
    }

    public final f99 a(d99... d99VarArr) {
        if (d99VarArr.length == 0) {
            return this;
        }
        int i = oaf.a;
        d99[] d99VarArr2 = this.a;
        Object[] objArrCopyOf = Arrays.copyOf(d99VarArr2, d99VarArr2.length + d99VarArr.length);
        System.arraycopy(d99VarArr, 0, objArrCopyOf, d99VarArr2.length, d99VarArr.length);
        return new f99(this.b, (d99[]) objArrCopyOf);
    }

    public final f99 b(f99 f99Var) {
        return f99Var == null ? this : a(f99Var.a);
    }

    public final d99 c(int i) {
        return this.a[i];
    }

    public final int d() {
        return this.a.length;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f99.class != obj.getClass()) {
            return false;
        }
        f99 f99Var = (f99) obj;
        return Arrays.equals(this.a, f99Var.a) && this.b == f99Var.b;
    }

    public final int hashCode() {
        return pag.p(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.a));
        long j = this.b;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        d99[] d99VarArr = this.a;
        parcel.writeInt(d99VarArr.length);
        for (d99 d99Var : d99VarArr) {
            parcel.writeParcelable(d99Var, 0);
        }
        parcel.writeLong(this.b);
    }

    public f99(long j, d99... d99VarArr) {
        this.b = j;
        this.a = d99VarArr;
    }

    public f99(List list) {
        this((d99[]) list.toArray(new d99[0]));
    }

    public f99(Parcel parcel) {
        this.a = new d99[parcel.readInt()];
        int i = 0;
        while (true) {
            d99[] d99VarArr = this.a;
            if (i < d99VarArr.length) {
                d99VarArr[i] = (d99) parcel.readParcelable(d99.class.getClassLoader());
                i++;
            } else {
                this.b = parcel.readLong();
                return;
            }
        }
    }
}
