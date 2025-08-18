package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class hqe implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        return tpa.f(charSequence, "") ? jqe.a : new iqe(charSequence);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new iqe[i];
    }
}
