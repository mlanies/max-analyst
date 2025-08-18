package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* loaded from: classes2.dex */
public final class t43 extends CharacterStyle implements UpdateAppearance, Parcelable, yz7 {
    public static final Parcelable.Creator<t43> CREATOR = new d6(27);
    public final int a;
    public final int b;

    public /* synthetic */ t43() {
        this(-65536);
    }

    @Override // defpackage.uw3
    public final uw3 copy() {
        return new t43();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.yz7
    public final int getType() {
        return this.b;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }

    public t43(int i) {
        this.a = i;
        this.b = 9;
    }

    public t43(Parcel parcel) {
        this(parcel.readInt());
    }
}
