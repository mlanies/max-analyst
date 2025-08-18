package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class dud implements c99 {
    public static final Parcelable.Creator<dud> CREATOR = new etd(1);
    public final float a;
    public final int b;

    public dud(int i, float f) {
        this.a = f;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dud.class != obj.getClass()) {
            return false;
        }
        dud dudVar = (dud) obj;
        return this.a == dudVar.a && this.b == dudVar.b;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.a).hashCode() + 527) * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(73);
        sb.append("smta: captureFrameRate=");
        sb.append(this.a);
        sb.append(", svcTemporalLayerCount=");
        sb.append(this.b);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.a);
        parcel.writeInt(this.b);
    }

    public dud(Parcel parcel) {
        this.a = parcel.readFloat();
        this.b = parcel.readInt();
    }
}
