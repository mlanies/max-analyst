package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;

/* loaded from: classes2.dex */
public final class ozc implements Parcelable {
    public static final Parcelable.Creator<ozc> CREATOR = new e9b(18);
    public final ForegroundColorSpan a;
    public final BackgroundColorSpan b;

    public ozc(ForegroundColorSpan foregroundColorSpan, BackgroundColorSpan backgroundColorSpan) {
        this.a = foregroundColorSpan;
        this.b = backgroundColorSpan;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}
