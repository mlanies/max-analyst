package defpackage;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class oef implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oef(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                qef qefVar = (qef) this.b;
                ilc ilcVar = qefVar.a;
                ilcVar.c();
                try {
                    qefVar.b.C((nef) this.c);
                    ilcVar.r();
                    ilcVar.l();
                    return null;
                } catch (Throwable th) {
                    ilcVar.l();
                    throw th;
                }
            case 1:
                nef nefVar = null;
                Cursor cursorO = ((qef) this.b).a.o((xlc) this.c, null);
                try {
                    int iN = tfg.n(cursorO, "finished");
                    int iN2 = tfg.n(cursorO, "prepared_path");
                    int iN3 = tfg.n(cursorO, "result_path");
                    int iN4 = tfg.n(cursorO, "source_uri");
                    int iN5 = tfg.n(cursorO, "quality");
                    int iN6 = tfg.n(cursorO, "start_trim_position");
                    int iN7 = tfg.n(cursorO, "end_trim_position");
                    int iN8 = tfg.n(cursorO, "mute");
                    if (cursorO.moveToFirst()) {
                        mef mefVar = new mef();
                        if (cursorO.isNull(iN4)) {
                            mefVar.a = null;
                        } else {
                            mefVar.a = cursorO.getString(iN4);
                        }
                        mefVar.b = mqb.values()[(cursorO.isNull(iN5) ? null : Integer.valueOf(cursorO.getInt(iN5))).intValue()];
                        mefVar.c = cursorO.getFloat(iN6);
                        mefVar.d = cursorO.getFloat(iN7);
                        mefVar.e = cursorO.getInt(iN8) != 0;
                        nef nefVar2 = new nef();
                        nefVar2.b = cursorO.getInt(iN) != 0;
                        if (cursorO.isNull(iN2)) {
                            nefVar2.c = null;
                        } else {
                            nefVar2.c = cursorO.getString(iN2);
                        }
                        if (cursorO.isNull(iN3)) {
                            nefVar2.d = null;
                        } else {
                            nefVar2.d = cursorO.getString(iN3);
                        }
                        nefVar2.a = mefVar;
                        nefVar = nefVar2;
                    }
                    cursorO.close();
                    return nefVar;
                } finally {
                    cursorO.close();
                }
            default:
                i8g i8gVar = (i8g) this.b;
                ilc ilcVar2 = (ilc) i8gVar.a;
                ilcVar2.c();
                try {
                    Cursor cursorO2 = ilcVar2.o((xlc) this.c, null);
                    if (cursorO2 instanceof AbstractWindowedCursor) {
                        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorO2;
                        int count = abstractWindowedCursor.getCount();
                        if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                            try {
                                MatrixCursor matrixCursor = new MatrixCursor(cursorO2.getColumnNames(), cursorO2.getCount());
                                while (cursorO2.moveToNext()) {
                                    Object[] objArr = new Object[cursorO2.getColumnCount()];
                                    int columnCount = cursorO2.getColumnCount();
                                    for (int i = 0; i < columnCount; i++) {
                                        int type = cursorO2.getType(i);
                                        if (type == 0) {
                                            objArr[i] = null;
                                        } else if (type == 1) {
                                            objArr[i] = Long.valueOf(cursorO2.getLong(i));
                                        } else if (type == 2) {
                                            objArr[i] = Double.valueOf(cursorO2.getDouble(i));
                                        } else if (type == 3) {
                                            objArr[i] = cursorO2.getString(i);
                                        } else {
                                            if (type != 4) {
                                                throw new IllegalStateException();
                                            }
                                            objArr[i] = cursorO2.getBlob(i);
                                        }
                                    }
                                    matrixCursor.addRow(objArr);
                                }
                                v3c.i(cursorO2, null);
                                cursorO2 = matrixCursor;
                            } finally {
                            }
                        }
                    }
                    try {
                        us usVar = new us(0);
                        us usVar2 = new us(0);
                        while (cursorO2.moveToNext()) {
                            String string = cursorO2.getString(0);
                            if (((ArrayList) usVar.get(string)) == null) {
                                usVar.put(string, new ArrayList());
                            }
                            String string2 = cursorO2.getString(0);
                            if (((ArrayList) usVar2.get(string2)) == null) {
                                usVar2.put(string2, new ArrayList());
                            }
                        }
                        cursorO2.moveToPosition(-1);
                        i8gVar.b(usVar);
                        i8gVar.a(usVar2);
                        ArrayList arrayList = new ArrayList(cursorO2.getCount());
                        while (cursorO2.moveToNext()) {
                            String string3 = cursorO2.isNull(0) ? null : cursorO2.getString(0);
                            m7g m7gVarV = nu0.v(cursorO2.getInt(1));
                            d24 d24VarA = d24.a(cursorO2.isNull(2) ? null : cursorO2.getBlob(2));
                            int i2 = cursorO2.getInt(3);
                            int i3 = cursorO2.getInt(4);
                            ArrayList arrayList2 = (ArrayList) usVar.get(cursorO2.getString(0));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            ArrayList arrayList3 = arrayList2;
                            ArrayList arrayList4 = (ArrayList) usVar2.get(cursorO2.getString(0));
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList.add(new g8g(string3, m7gVarV, d24VarA, i2, i3, arrayList3, arrayList4));
                        }
                        ilcVar2.r();
                        cursorO2.close();
                        return arrayList;
                    } finally {
                        cursorO2.close();
                    }
                } finally {
                    ilcVar2.l();
                }
        }
    }

    public void finalize() throws Throwable {
        switch (this.a) {
            case 1:
                ((xlc) this.c).n();
                break;
            case 2:
                ((xlc) this.c).n();
                break;
            default:
                super.finalize();
                break;
        }
    }
}
