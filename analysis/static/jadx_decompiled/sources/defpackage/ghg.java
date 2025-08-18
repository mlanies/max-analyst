package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ghg extends n3 {
    public static final Parcelable.Creator<ghg> CREATOR = new ufg(10);
    public final rhg X;
    public final ghg Y;
    public final int a;
    public final String b;
    public final String c;
    public final String o;

    static {
        Process.myUid();
        Process.myPid();
    }

    public ghg(int i, String str, String str2, String str3, ArrayList arrayList, ghg ghgVar) {
        if (ghgVar != null && ghgVar.Y != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.a = i;
        this.b = str;
        this.c = str2;
        this.o = str3 == null ? ghgVar != null ? ghgVar.o : null : str3;
        AbstractCollection abstractCollection = arrayList;
        if (arrayList == null) {
            AbstractCollection abstractCollection2 = ghgVar != null ? ghgVar.X : null;
            abstractCollection = abstractCollection2;
            if (abstractCollection2 == null) {
                phg phgVar = rhg.b;
                abstractCollection = shg.X;
            }
        }
        phg phgVar2 = rhg.b;
        Object[] array = abstractCollection.toArray();
        int length = array.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (array[i2] == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 9);
                sb.append("at index ");
                sb.append(i2);
                throw new NullPointerException(sb.toString());
            }
        }
        this.X = length == 0 ? shg.X : new shg(length, array);
        this.Y = ghgVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ghg) {
            ghg ghgVar = (ghg) obj;
            if (this.a == ghgVar.a && tpa.f(this.b, ghgVar.b) && tpa.f(this.c, ghgVar.c) && tpa.f(this.o, ghgVar.o) && tpa.f(this.Y, ghgVar.Y) && tpa.f(this.X, ghgVar.X)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.o, this.Y});
    }

    public final String toString() {
        String str = this.b;
        int length = str.length() + 18;
        String str2 = this.c;
        StringBuilder sb = new StringBuilder(length + (str2 != null ? str2.length() : 0));
        sb.append(this.a);
        sb.append("/");
        sb.append(str);
        if (str2 != null) {
            sb.append("[");
            if (eae.o0(str2, str, false)) {
                sb.append((CharSequence) str2, str.length(), str2.length());
            } else {
                sb.append(str2);
            }
            sb.append("]");
        }
        String str3 = this.o;
        if (str3 != null) {
            sb.append("/");
            sb.append(Integer.toHexString(str3.hashCode()));
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        ay7.X(parcel, 1, 4);
        parcel.writeInt(this.a);
        ay7.Q(parcel, 3, this.b);
        ay7.Q(parcel, 4, this.c);
        ay7.Q(parcel, 6, this.o);
        ay7.P(parcel, 7, this.Y, i);
        ay7.S(parcel, this.X, 8);
        ay7.W(parcel, iT);
    }
}
