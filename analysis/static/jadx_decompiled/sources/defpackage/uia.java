package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class uia implements Parcelable {
    public static final Parcelable.Creator<uia> CREATOR = new fn9(6);
    public static final uia Z = new uia(lia.a, "", null, ria.a, new eia(0, 0, 0, 7), gia.b);
    public final eia X;
    public final iia Y;
    public final oia a;
    public final CharSequence b;
    public final CharSequence c;
    public final tia o;

    public uia(oia oiaVar, CharSequence charSequence, CharSequence charSequence2, tia tiaVar, eia eiaVar, iia iiaVar) {
        this.a = oiaVar;
        this.b = charSequence;
        this.c = charSequence2;
        this.o = tiaVar;
        this.X = eiaVar;
        this.Y = iiaVar;
    }

    public static uia a(uia uiaVar, oia oiaVar, CharSequence charSequence, CharSequence charSequence2, tia tiaVar, eia eiaVar, iia iiaVar, int i) {
        if ((i & 1) != 0) {
            oiaVar = uiaVar.a;
        }
        oia oiaVar2 = oiaVar;
        if ((i & 2) != 0) {
            charSequence = uiaVar.b;
        }
        CharSequence charSequence3 = charSequence;
        if ((i & 4) != 0) {
            charSequence2 = uiaVar.c;
        }
        CharSequence charSequence4 = charSequence2;
        if ((i & 8) != 0) {
            tiaVar = uiaVar.o;
        }
        tia tiaVar2 = tiaVar;
        if ((i & 16) != 0) {
            eiaVar = uiaVar.X;
        }
        eia eiaVar2 = eiaVar;
        if ((i & 32) != 0) {
            iiaVar = uiaVar.Y;
        }
        uiaVar.getClass();
        return new uia(oiaVar2, charSequence3, charSequence4, tiaVar2, eiaVar2, iiaVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uia)) {
            return false;
        }
        uia uiaVar = (uia) obj;
        return tpa.f(this.a, uiaVar.a) && tpa.f(this.b, uiaVar.b) && tpa.f(this.c, uiaVar.c) && tpa.f(this.o, uiaVar.o) && tpa.f(this.X, uiaVar.X) && tpa.f(this.Y, uiaVar.Y);
    }

    public final int hashCode() {
        int iF = rh4.f(this.b, this.a.hashCode() * 31, 31);
        CharSequence charSequence = this.c;
        return this.Y.hashCode() + ((this.X.hashCode() + ((this.o.hashCode() + ((iF + (charSequence == null ? 0 : charSequence.hashCode())) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "OneMeSnackbarModel(left=" + this.a + ", title=" + ((Object) this.b) + ", caption=" + ((Object) this.c) + ", right=" + this.o + ", params=" + this.X + ", duration=" + this.Y + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        TextUtils.writeToParcel(this.b, parcel, i);
        TextUtils.writeToParcel(this.c, parcel, i);
        parcel.writeParcelable(this.o, i);
        this.X.writeToParcel(parcel, i);
        parcel.writeParcelable(this.Y, i);
    }

    public /* synthetic */ uia(oia oiaVar, String str, String str2, eia eiaVar) {
        this(oiaVar, str, str2, ria.a, eiaVar, gia.b);
    }
}
