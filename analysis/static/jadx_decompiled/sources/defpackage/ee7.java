package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class ee7 implements Parcelable {
    public static final Parcelable.Creator<ee7> CREATOR = new dj6(12);
    public final List X;
    public final int a;
    public final int b;
    public final int c;
    public final float o;

    public ee7(int i, int i2, float f, ArrayList arrayList) {
        this.a = i;
        this.b = 1;
        this.c = i2;
        this.o = f;
        this.X = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ee7.class != obj.getClass()) {
            return false;
        }
        ee7 ee7Var = (ee7) obj;
        if (this.a != ee7Var.a || this.c != ee7Var.c || Float.compare(ee7Var.o, this.o) != 0 || this.b != ee7Var.b) {
            return false;
        }
        List list = ee7Var.X;
        List list2 = this.X;
        return list2 != null ? list2.equals(list) : list == null;
    }

    public final int hashCode() {
        int i = this.a * 31;
        int i2 = this.b;
        int iS = (((i + (i2 != 0 ? au1.s(i2) : 0)) * 31) + this.c) * 31;
        float f = this.o;
        int iFloatToIntBits = (iS + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        List list = this.X;
        return iFloatToIntBits + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.b != 1) {
            throw null;
        }
        parcel.writeString("DRAWING");
        parcel.writeInt(this.a);
        parcel.writeInt(this.c);
        parcel.writeFloat(this.o);
        parcel.writeTypedList(this.X);
    }

    public ee7(Parcel parcel) {
        String string = parcel.readString();
        if (string == null) {
            throw new NullPointerException("Name is null");
        }
        if (string.equals("DRAWING")) {
            this.b = 1;
            this.a = parcel.readInt();
            this.c = parcel.readInt();
            this.o = parcel.readFloat();
            this.X = parcel.createTypedArrayList(yq4.CREATOR);
            return;
        }
        throw new IllegalArgumentException("No enum constant ru.ok.tamtam.photoeditor.state.LayerState.Type.".concat(string));
    }
}
