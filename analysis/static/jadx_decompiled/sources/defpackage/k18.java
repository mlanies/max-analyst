package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class k18 extends View.BaseSavedState {
    public static final Parcelable.Creator<k18> CREATOR = new uk7(6);
    public int a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i = this.a;
        return zr6.l(sb, i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked", "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.a));
    }
}
