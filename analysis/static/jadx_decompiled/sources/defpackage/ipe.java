package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ipe extends ct6 {
    public static final Parcelable.Creator<ipe> CREATOR = new etd(15);
    public final String b;
    public final String c;

    public ipe(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ipe.class != obj.getClass()) {
            return false;
        }
        ipe ipeVar = (ipe) obj;
        return maf.a(this.a, ipeVar.a) && maf.a(this.b, ipeVar.b) && maf.a(this.c, ipeVar.c);
    }

    public final int hashCode() {
        int iD = rh4.d(527, 31, this.a);
        String str = this.b;
        int iHashCode = (iD + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0014  */
    @Override // defpackage.c99
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(defpackage.dd8 r9) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ipe.p(dd8):void");
    }

    @Override // defpackage.ct6
    public final String toString() {
        String str = this.a;
        int iE = rh4.e(22, str);
        String str2 = this.b;
        int iE2 = rh4.e(iE, str2);
        String str3 = this.c;
        StringBuilder sb = new StringBuilder(rh4.e(iE2, str3));
        sb.append(str);
        sb.append(": description=");
        sb.append(str2);
        sb.append(": value=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ipe(Parcel parcel) {
        String string = parcel.readString();
        int i = maf.a;
        super(string);
        this.b = parcel.readString();
        this.c = parcel.readString();
    }
}
