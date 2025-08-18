package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes2.dex */
public final class u8f implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xlc b;
    public final /* synthetic */ w8f c;

    public /* synthetic */ u8f(w8f w8fVar, xlc xlcVar, int i) {
        this.a = i;
        this.c = w8fVar;
        this.b = xlcVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        o8f o8fVar;
        q8f q8fVar;
        ArrayList arrayList;
        o8f o8fVar2;
        int i;
        q8f q8fVar2;
        switch (this.a) {
            case 0:
                Integer numValueOf = null;
                Cursor cursorO = this.c.a.o(this.b, null);
                try {
                    int iN = tfg.n(cursorO, "attach_local_id");
                    int iN2 = tfg.n(cursorO, "prepared_path");
                    int iN3 = tfg.n(cursorO, "file_name");
                    int iN4 = tfg.n(cursorO, "upload_url");
                    int iN5 = tfg.n(cursorO, "upload_progress");
                    int iN6 = tfg.n(cursorO, "total_bytes");
                    int iN7 = tfg.n(cursorO, "upload_status");
                    int iN8 = tfg.n(cursorO, "created_time");
                    int iN9 = tfg.n(cursorO, ClientCookie.PATH_ATTR);
                    int iN10 = tfg.n(cursorO, "last_modified");
                    int iN11 = tfg.n(cursorO, "upload_type");
                    int iN12 = tfg.n(cursorO, "photo_token");
                    int iN13 = tfg.n(cursorO, "attach_id");
                    if (cursorO.moveToFirst()) {
                        mx1 mx1Var = new mx1();
                        if (cursorO.isNull(iN9)) {
                            mx1Var.c = null;
                        } else {
                            mx1Var.c = cursorO.getString(iN9);
                        }
                        mx1Var.b = cursorO.getLong(iN10);
                        mx1Var.a = ngg.x(cursorO.isNull(iN11) ? null : Integer.valueOf(cursorO.getInt(iN11)));
                        if (cursorO.isNull(iN12) && cursorO.isNull(iN13)) {
                            o8fVar = null;
                        } else {
                            o8fVar = new o8f();
                            if (cursorO.isNull(iN12)) {
                                o8fVar.a = null;
                            } else {
                                o8fVar.a = cursorO.getString(iN12);
                            }
                            o8fVar.b = cursorO.getLong(iN13);
                        }
                        e7f e7fVar = new e7f();
                        if (cursorO.isNull(iN)) {
                            e7fVar.b = null;
                        } else {
                            e7fVar.b = cursorO.getString(iN);
                        }
                        if (cursorO.isNull(iN2)) {
                            e7fVar.c = null;
                        } else {
                            e7fVar.c = cursorO.getString(iN2);
                        }
                        if (cursorO.isNull(iN3)) {
                            e7fVar.d = null;
                        } else {
                            e7fVar.d = cursorO.getString(iN3);
                        }
                        if (cursorO.isNull(iN4)) {
                            e7fVar.e = null;
                        } else {
                            e7fVar.e = cursorO.getString(iN4);
                        }
                        e7fVar.f = cursorO.getFloat(iN5);
                        e7fVar.g = cursorO.getLong(iN6);
                        if (!cursorO.isNull(iN7)) {
                            numValueOf = Integer.valueOf(cursorO.getInt(iN7));
                        }
                        int iIntValue = numValueOf.intValue();
                        q8f[] q8fVarArr = q8f.X;
                        int length = q8fVarArr.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                q8fVar = q8fVarArr[i2];
                                if (q8fVar.a != iIntValue) {
                                    i2++;
                                }
                            } else {
                                q8fVar = q8f.UNKNOWN;
                            }
                        }
                        e7fVar.h = q8fVar;
                        e7fVar.j = cursorO.getLong(iN8);
                        e7fVar.a = mx1Var;
                        e7fVar.i = o8fVar;
                        numValueOf = e7fVar;
                    }
                    cursorO.close();
                    return numValueOf;
                } catch (Throwable th) {
                    cursorO.close();
                    throw th;
                }
            default:
                Cursor cursorO2 = this.c.a.o(this.b, null);
                try {
                    int iN14 = tfg.n(cursorO2, "attach_local_id");
                    int iN15 = tfg.n(cursorO2, "prepared_path");
                    int iN16 = tfg.n(cursorO2, "file_name");
                    int iN17 = tfg.n(cursorO2, "upload_url");
                    int iN18 = tfg.n(cursorO2, "upload_progress");
                    int iN19 = tfg.n(cursorO2, "total_bytes");
                    int iN20 = tfg.n(cursorO2, "upload_status");
                    int iN21 = tfg.n(cursorO2, "created_time");
                    int iN22 = tfg.n(cursorO2, ClientCookie.PATH_ATTR);
                    int iN23 = tfg.n(cursorO2, "last_modified");
                    int iN24 = tfg.n(cursorO2, "upload_type");
                    int iN25 = tfg.n(cursorO2, "photo_token");
                    int iN26 = tfg.n(cursorO2, "attach_id");
                    ArrayList arrayList2 = new ArrayList(cursorO2.getCount());
                    while (cursorO2.moveToNext()) {
                        mx1 mx1Var2 = new mx1();
                        if (cursorO2.isNull(iN22)) {
                            arrayList = arrayList2;
                            mx1Var2.c = null;
                        } else {
                            arrayList = arrayList2;
                            mx1Var2.c = cursorO2.getString(iN22);
                        }
                        int i3 = iN21;
                        int i4 = iN22;
                        mx1Var2.b = cursorO2.getLong(iN23);
                        mx1Var2.a = ngg.x(cursorO2.isNull(iN24) ? null : Integer.valueOf(cursorO2.getInt(iN24)));
                        if (cursorO2.isNull(iN25) && cursorO2.isNull(iN26)) {
                            i = iN23;
                            o8fVar2 = null;
                        } else {
                            o8fVar2 = new o8f();
                            if (cursorO2.isNull(iN25)) {
                                o8fVar2.a = null;
                            } else {
                                o8fVar2.a = cursorO2.getString(iN25);
                            }
                            i = iN23;
                            o8fVar2.b = cursorO2.getLong(iN26);
                        }
                        e7f e7fVar2 = new e7f();
                        if (cursorO2.isNull(iN14)) {
                            e7fVar2.b = null;
                        } else {
                            e7fVar2.b = cursorO2.getString(iN14);
                        }
                        if (cursorO2.isNull(iN15)) {
                            e7fVar2.c = null;
                        } else {
                            e7fVar2.c = cursorO2.getString(iN15);
                        }
                        if (cursorO2.isNull(iN16)) {
                            e7fVar2.d = null;
                        } else {
                            e7fVar2.d = cursorO2.getString(iN16);
                        }
                        if (cursorO2.isNull(iN17)) {
                            e7fVar2.e = null;
                        } else {
                            e7fVar2.e = cursorO2.getString(iN17);
                        }
                        e7fVar2.f = cursorO2.getFloat(iN18);
                        int i5 = iN15;
                        int i6 = iN16;
                        e7fVar2.g = cursorO2.getLong(iN19);
                        int iIntValue2 = (cursorO2.isNull(iN20) ? null : Integer.valueOf(cursorO2.getInt(iN20))).intValue();
                        q8f[] q8fVarArr2 = q8f.X;
                        int i7 = iN14;
                        int length2 = q8fVarArr2.length;
                        int i8 = iN17;
                        int i9 = 0;
                        while (true) {
                            if (i9 < length2) {
                                int i10 = length2;
                                q8fVar2 = q8fVarArr2[i9];
                                q8f[] q8fVarArr3 = q8fVarArr2;
                                if (q8fVar2.a != iIntValue2) {
                                    i9++;
                                    length2 = i10;
                                    q8fVarArr2 = q8fVarArr3;
                                }
                            } else {
                                q8fVar2 = q8f.UNKNOWN;
                            }
                        }
                        e7fVar2.h = q8fVar2;
                        e7fVar2.j = cursorO2.getLong(i3);
                        e7fVar2.a = mx1Var2;
                        e7fVar2.i = o8fVar2;
                        ArrayList arrayList3 = arrayList;
                        arrayList3.add(e7fVar2);
                        iN21 = i3;
                        arrayList2 = arrayList3;
                        iN15 = i5;
                        iN22 = i4;
                        iN23 = i;
                        iN16 = i6;
                        iN14 = i7;
                        iN17 = i8;
                    }
                    ArrayList arrayList4 = arrayList2;
                    cursorO2.close();
                    return arrayList4;
                } catch (Throwable th2) {
                    cursorO2.close();
                    throw th2;
                }
        }
    }

    public final void finalize() {
        switch (this.a) {
            case 0:
                this.b.n();
                break;
            default:
                this.b.n();
                break;
        }
    }
}
