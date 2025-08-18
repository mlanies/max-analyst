package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class jpe extends dt6 {
    public static final Parcelable.Creator<jpe> CREATOR = new etd(16);
    public final String b;
    public final zw6 c;

    public jpe(String str, String str2, ffc ffcVar) {
        super(str);
        fm9.f(!ffcVar.isEmpty());
        this.b = str2;
        zw6 zw6VarJ = zw6.j(ffcVar);
        this.c = zw6VarJ;
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
        if (obj == null || jpe.class != obj.getClass()) {
            return false;
        }
        jpe jpeVar = (jpe) obj;
        return oaf.a(this.a, jpeVar.a) && oaf.a(this.b, jpeVar.b) && this.c.equals(jpeVar.c);
    }

    public final int hashCode() {
        int iD = rh4.d(527, 31, this.a);
        String str = this.b;
        return this.c.hashCode() + ((iD + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.dt6
    public final String toString() {
        return this.a + ": description=" + this.b + ": values=" + this.c;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.d99
    public final void w(ed8 ed8Var) throws NumberFormatException {
        String str = this.a;
        str.getClass();
        zw6 zw6Var = this.c;
        char c = 65535;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 0;
                    break;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 1;
                    break;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = 2;
                    break;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 3;
                    break;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 5;
                    break;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = 6;
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 7;
                    break;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = '\b';
                    break;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\t';
                    break;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = '\n';
                    break;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 11;
                    break;
                }
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c = '\f';
                    break;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = '\r';
                    break;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = 14;
                    break;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 15;
                    break;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 16;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 17;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 18;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 19;
                    break;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 20;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = 21;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 22;
                    break;
                }
                break;
        }
        try {
            switch (c) {
                case 0:
                case '\n':
                    ed8Var.d((CharSequence) zw6Var.get(0));
                    break;
                case 1:
                case 11:
                    ed8Var.g((CharSequence) zw6Var.get(0));
                    break;
                case 2:
                case '\r':
                    String str2 = (String) zw6Var.get(0);
                    int i = Integer.parseInt(str2.substring(2, 4));
                    int i2 = Integer.parseInt(str2.substring(0, 2));
                    ed8Var.l(Integer.valueOf(i));
                    ed8Var.k(Integer.valueOf(i2));
                    break;
                case 3:
                case 18:
                    ed8Var.e((CharSequence) zw6Var.get(0));
                    break;
                case 4:
                case 19:
                    ed8Var.c((CharSequence) zw6Var.get(0));
                    break;
                case 5:
                case 20:
                    ed8Var.h((CharSequence) zw6Var.get(0));
                    break;
                case 6:
                case 21:
                    String[] strArrD0 = oaf.d0((String) zw6Var.get(0));
                    int i3 = Integer.parseInt(strArrD0[0]);
                    Integer numValueOf = strArrD0.length > 1 ? Integer.valueOf(Integer.parseInt(strArrD0[1])) : null;
                    ed8Var.s(Integer.valueOf(i3));
                    ed8Var.r(numValueOf);
                    break;
                case 7:
                case LangUtils.HASH_SEED /* 17 */:
                    ed8Var.q((CharSequence) zw6Var.get(0));
                    break;
                case '\b':
                case 16:
                    ed8Var.t((CharSequence) zw6Var.get(0));
                    break;
                case '\t':
                case 22:
                    ed8Var.m(Integer.valueOf(Integer.parseInt((String) zw6Var.get(0))));
                    break;
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    Integer numF0 = s5c.f0((String) zw6Var.get(0));
                    if (numF0 != null) {
                        String strA = et6.a(numF0.intValue());
                        if (strA != null) {
                            ed8Var.j(strA);
                            break;
                        }
                    } else {
                        ed8Var.j((CharSequence) zw6Var.get(0));
                        break;
                    }
                    break;
                case Protos.Attaches.Attach.LOCATION /* 14 */:
                    ArrayList arrayListA = a((String) zw6Var.get(0));
                    int size = arrayListA.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                ed8Var.k((Integer) arrayListA.get(2));
                            }
                        }
                        ed8Var.l((Integer) arrayListA.get(1));
                    }
                    ed8Var.m((Integer) arrayListA.get(0));
                    break;
                case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                    ArrayList arrayListA2 = a((String) zw6Var.get(0));
                    int size2 = arrayListA2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                ed8Var.n((Integer) arrayListA2.get(2));
                            }
                        }
                        ed8Var.o((Integer) arrayListA2.get(1));
                    }
                    ed8Var.p((Integer) arrayListA2.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeStringArray((String[]) this.c.toArray(new String[0]));
    }
}
