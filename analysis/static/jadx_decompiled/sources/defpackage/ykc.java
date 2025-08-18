package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.Callable;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class ykc implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xlc b;
    public final /* synthetic */ alc c;

    public /* synthetic */ ykc(alc alcVar, xlc xlcVar, int i) {
        this.a = i;
        this.c = alcVar;
        this.b = xlcVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        int i;
        List listA;
        xlc xlcVar;
        int iN;
        int iN2;
        int iN3;
        int iN4;
        int iN5;
        int iN6;
        int iN7;
        int iN8;
        int iN9;
        int iN10;
        int iN11;
        int iN12;
        int iN13;
        int i2;
        List listA2;
        xlc xlcVar2;
        int iN14;
        int iN15;
        int iN16;
        int iN17;
        int iN18;
        int iN19;
        int iN20;
        int iN21;
        int iN22;
        int iN23;
        int iN24;
        int iN25;
        int iN26;
        int i3;
        List listA3;
        Cursor cursorO;
        List list = nz4.a;
        xlc xlcVar3 = this.b;
        alc alcVar = this.c;
        switch (this.a) {
            case 0:
                Cursor cursorO2 = alcVar.a.o(xlcVar3, null);
                try {
                    int iN27 = tfg.n(cursorO2, "id");
                    int iN28 = tfg.n(cursorO2, "title");
                    int iN29 = tfg.n(cursorO2, "emoji");
                    int iN30 = tfg.n(cursorO2, "order");
                    int iN31 = tfg.n(cursorO2, "filters");
                    int iN32 = tfg.n(cursorO2, "isHiddenForAllFolder");
                    int iN33 = tfg.n(cursorO2, "hideIfEmpty");
                    int iN34 = tfg.n(cursorO2, "elements");
                    int iN35 = tfg.n(cursorO2, "creatorId");
                    int iN36 = tfg.n(cursorO2, "filterSubjects");
                    int iN37 = tfg.n(cursorO2, "widgets");
                    int iN38 = tfg.n(cursorO2, "options");
                    int iN39 = tfg.n(cursorO2, "isRemoved");
                    ArrayList arrayList = new ArrayList(cursorO2.getCount());
                    while (cursorO2.moveToNext()) {
                        String string = cursorO2.isNull(iN27) ? null : cursorO2.getString(iN27);
                        String string2 = cursorO2.isNull(iN28) ? null : cursorO2.getString(iN28);
                        String string3 = cursorO2.isNull(iN29) ? null : cursorO2.getString(iN29);
                        int i4 = cursorO2.getInt(iN30);
                        EnumSet enumSetI = dy7.I(cursorO2.isNull(iN31) ? null : cursorO2.getString(iN31));
                        boolean z = cursorO2.getInt(iN32) != 0;
                        boolean z2 = cursorO2.getInt(iN33) != 0;
                        byte[] blob = cursorO2.isNull(iN34) ? null : cursorO2.getBlob(iN34);
                        if (blob != null) {
                            i = iN27;
                            Protos.MessageElements messageElements = new Protos.MessageElements();
                            qw8.mergeFrom(messageElements, blob);
                            listA = ou8.a(messageElements.elements);
                        } else {
                            i = iN27;
                            listA = list;
                        }
                        arrayList.add(new nkc(string, string2, string3, i4, enumSetI, z, z2, listA, cursorO2.isNull(iN35) ? null : Long.valueOf(cursorO2.getLong(iN35)), dy7.q(cursorO2.isNull(iN36) ? null : cursorO2.getBlob(iN36)), dy7.s(cursorO2.isNull(iN37) ? null : cursorO2.getBlob(iN37)), dy7.r(cursorO2.isNull(iN38) ? null : cursorO2.getBlob(iN38)), cursorO2.getInt(iN39) != 0));
                        iN27 = i;
                    }
                    return arrayList;
                } finally {
                    cursorO2.close();
                }
            case 1:
                Cursor cursorO3 = alcVar.a.o(xlcVar3, null);
                try {
                    iN = tfg.n(cursorO3, "id");
                    iN2 = tfg.n(cursorO3, "title");
                    iN3 = tfg.n(cursorO3, "emoji");
                    iN4 = tfg.n(cursorO3, "order");
                    iN5 = tfg.n(cursorO3, "filters");
                    iN6 = tfg.n(cursorO3, "isHiddenForAllFolder");
                    iN7 = tfg.n(cursorO3, "hideIfEmpty");
                    iN8 = tfg.n(cursorO3, "elements");
                    iN9 = tfg.n(cursorO3, "creatorId");
                    iN10 = tfg.n(cursorO3, "filterSubjects");
                    iN11 = tfg.n(cursorO3, "widgets");
                    iN12 = tfg.n(cursorO3, "options");
                    iN13 = tfg.n(cursorO3, "isRemoved");
                    xlcVar = xlcVar3;
                } catch (Throwable th) {
                    th = th;
                    xlcVar = xlcVar3;
                }
                try {
                    ArrayList arrayList2 = new ArrayList(cursorO3.getCount());
                    while (cursorO3.moveToNext()) {
                        String string4 = cursorO3.isNull(iN) ? null : cursorO3.getString(iN);
                        String string5 = cursorO3.isNull(iN2) ? null : cursorO3.getString(iN2);
                        String string6 = cursorO3.isNull(iN3) ? null : cursorO3.getString(iN3);
                        int i5 = cursorO3.getInt(iN4);
                        EnumSet enumSetI2 = dy7.I(cursorO3.isNull(iN5) ? null : cursorO3.getString(iN5));
                        boolean z3 = cursorO3.getInt(iN6) != 0;
                        boolean z4 = cursorO3.getInt(iN7) != 0;
                        byte[] blob2 = cursorO3.isNull(iN8) ? null : cursorO3.getBlob(iN8);
                        if (blob2 != null) {
                            i2 = iN;
                            Protos.MessageElements messageElements2 = new Protos.MessageElements();
                            qw8.mergeFrom(messageElements2, blob2);
                            listA2 = ou8.a(messageElements2.elements);
                        } else {
                            i2 = iN;
                            listA2 = list;
                        }
                        arrayList2.add(new nkc(string4, string5, string6, i5, enumSetI2, z3, z4, listA2, cursorO3.isNull(iN9) ? null : Long.valueOf(cursorO3.getLong(iN9)), dy7.q(cursorO3.isNull(iN10) ? null : cursorO3.getBlob(iN10)), dy7.s(cursorO3.isNull(iN11) ? null : cursorO3.getBlob(iN11)), dy7.r(cursorO3.isNull(iN12) ? null : cursorO3.getBlob(iN12)), cursorO3.getInt(iN13) != 0));
                        iN = i2;
                    }
                    cursorO3.close();
                    xlcVar.n();
                    return arrayList2;
                } catch (Throwable th2) {
                    th = th2;
                    cursorO3.close();
                    xlcVar.n();
                    throw th;
                }
            case 2:
                Cursor cursorO4 = alcVar.a.o(xlcVar3, null);
                try {
                    iN14 = tfg.n(cursorO4, "id");
                    iN15 = tfg.n(cursorO4, "title");
                    iN16 = tfg.n(cursorO4, "emoji");
                    iN17 = tfg.n(cursorO4, "order");
                    iN18 = tfg.n(cursorO4, "filters");
                    iN19 = tfg.n(cursorO4, "isHiddenForAllFolder");
                    iN20 = tfg.n(cursorO4, "hideIfEmpty");
                    iN21 = tfg.n(cursorO4, "elements");
                    iN22 = tfg.n(cursorO4, "creatorId");
                    iN23 = tfg.n(cursorO4, "filterSubjects");
                    iN24 = tfg.n(cursorO4, "widgets");
                    iN25 = tfg.n(cursorO4, "options");
                    iN26 = tfg.n(cursorO4, "isRemoved");
                    xlcVar2 = xlcVar3;
                } catch (Throwable th3) {
                    th = th3;
                    xlcVar2 = xlcVar3;
                }
                try {
                    ArrayList arrayList3 = new ArrayList(cursorO4.getCount());
                    while (cursorO4.moveToNext()) {
                        String string7 = cursorO4.isNull(iN14) ? null : cursorO4.getString(iN14);
                        String string8 = cursorO4.isNull(iN15) ? null : cursorO4.getString(iN15);
                        String string9 = cursorO4.isNull(iN16) ? null : cursorO4.getString(iN16);
                        int i6 = cursorO4.getInt(iN17);
                        EnumSet enumSetI3 = dy7.I(cursorO4.isNull(iN18) ? null : cursorO4.getString(iN18));
                        boolean z5 = cursorO4.getInt(iN19) != 0;
                        boolean z6 = cursorO4.getInt(iN20) != 0;
                        byte[] blob3 = cursorO4.isNull(iN21) ? null : cursorO4.getBlob(iN21);
                        if (blob3 != null) {
                            i3 = iN14;
                            Protos.MessageElements messageElements3 = new Protos.MessageElements();
                            qw8.mergeFrom(messageElements3, blob3);
                            listA3 = ou8.a(messageElements3.elements);
                        } else {
                            i3 = iN14;
                            listA3 = list;
                        }
                        arrayList3.add(new nkc(string7, string8, string9, i6, enumSetI3, z5, z6, listA3, cursorO4.isNull(iN22) ? null : Long.valueOf(cursorO4.getLong(iN22)), dy7.q(cursorO4.isNull(iN23) ? null : cursorO4.getBlob(iN23)), dy7.s(cursorO4.isNull(iN24) ? null : cursorO4.getBlob(iN24)), dy7.r(cursorO4.isNull(iN25) ? null : cursorO4.getBlob(iN25)), cursorO4.getInt(iN26) != 0));
                        iN14 = i3;
                    }
                    cursorO4.close();
                    xlcVar2.n();
                    return arrayList3;
                } catch (Throwable th4) {
                    th = th4;
                    cursorO4.close();
                    xlcVar2.n();
                    throw th;
                }
            case 3:
                cursorO = alcVar.a.o(xlcVar3, null);
                try {
                    return (!cursorO.moveToFirst() || cursorO.isNull(0)) ? null : Long.valueOf(cursorO.getLong(0));
                } finally {
                }
            default:
                cursorO = alcVar.a.o(xlcVar3, null);
                try {
                    return (!cursorO.moveToFirst() || cursorO.isNull(0)) ? null : cursorO.getBlob(0);
                } finally {
                }
        }
    }

    public void finalize() throws Throwable {
        switch (this.a) {
            case 0:
                this.b.n();
                break;
            default:
                super.finalize();
                break;
        }
    }
}
