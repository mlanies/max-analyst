package defpackage;

import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class nz3 implements Parcelable {
    public static final Parcelable.Creator<nz3> CREATOR = new f73(4);
    public final RectF a;
    public final float b;
    public final float[] c;

    public nz3(RectF rectF, float f, float[] fArr) {
        this.a = rectF;
        this.b = f;
        this.c = fArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nz3.class != obj.getClass()) {
            return false;
        }
        nz3 nz3Var = (nz3) obj;
        if (Float.compare(nz3Var.b, this.b) == 0 && this.a.equals(nz3Var.a)) {
            return Arrays.equals(this.c, nz3Var.c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        float f = this.b;
        return Arrays.hashCode(this.c) + ((iHashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeFloat(this.b);
        parcel.writeFloatArray(this.c);
    }

    public nz3(Parcel parcel) {
        this.a = (RectF) parcel.readParcelable(RectF.class.getClassLoader());
        this.b = parcel.readFloat();
        float[] fArr = new float[9];
        this.c = fArr;
        parcel.readFloatArray(fArr);
    }
}
