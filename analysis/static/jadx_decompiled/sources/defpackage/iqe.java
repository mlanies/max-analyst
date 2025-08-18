package defpackage;

import android.os.Parcel;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class iqe extends jqe {
    public static final hqe CREATOR = new hqe();
    public final CharSequence b;

    public iqe(CharSequence charSequence) {
        this.b = charSequence;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iqe) && tpa.f(this.b, ((iqe) obj).b);
    }

    public final int hashCode() {
        CharSequence charSequence = this.b;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    public final String toString() {
        return "SimpleText(text=" + ((Object) this.b) + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TextUtils.writeToParcel(this.b, parcel, i);
    }
}
