package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class yq4 implements Parcelable {
    public static final Parcelable.Creator<yq4> CREATOR = new f73(11);
    public final int a;
    public final float[] b;

    public yq4(int i, float[] fArr) {
        this.a = i;
        this.b = fArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yq4.class != obj.getClass()) {
            return false;
        }
        yq4 yq4Var = (yq4) obj;
        if (this.a != yq4Var.a) {
            return false;
        }
        return Arrays.equals(this.b, yq4Var.b);
    }

    public final int hashCode() {
        int i = this.a;
        return Arrays.hashCode(this.b) + ((i != 0 ? au1.s(i) : 0) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeFloatArray(this.b);
        int i2 = this.a;
        if (i2 == 1) {
            str = "LINE";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "CUBIC_BEZIER";
        }
        parcel.writeString(str);
    }

    public yq4(Parcel parcel) {
        int i;
        this.b = parcel.createFloatArray();
        String string = parcel.readString();
        if (string == null) {
            throw new NullPointerException("Name is null");
        }
        if (string.equals("LINE")) {
            i = 1;
        } else {
            if (!string.equals("CUBIC_BEZIER")) {
                throw new IllegalArgumentException("No enum constant ru.ok.tamtam.photoeditor.state.DrawingPrimitive.Type.".concat(string));
            }
            i = 2;
        }
        this.a = i;
    }
}
