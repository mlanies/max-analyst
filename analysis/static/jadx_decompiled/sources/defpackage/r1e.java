package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class r1e implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xlc b;
    public final /* synthetic */ s1e c;

    public /* synthetic */ r1e(s1e s1eVar, xlc xlcVar, int i) {
        this.a = i;
        this.c = s1eVar;
        this.b = xlcVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        switch (this.a) {
            case 0:
                Long lValueOf = null;
                Cursor cursorO = this.c.a.o(this.b, null);
                try {
                    if (cursorO.moveToFirst() && !cursorO.isNull(0)) {
                        lValueOf = Long.valueOf(cursorO.getLong(0));
                    }
                    return lValueOf;
                } finally {
                }
            case 1:
                c0e c0eVar = null;
                byte[] blob = null;
                Cursor cursorO2 = this.c.a.o(this.b, null);
                try {
                    int iN = tfg.n(cursorO2, "id");
                    int iN2 = tfg.n(cursorO2, "status");
                    int iN3 = tfg.n(cursorO2, "entry");
                    int iN4 = tfg.n(cursorO2, "isCritical");
                    if (cursorO2.moveToFirst()) {
                        long j = cursorO2.getLong(iN);
                        int i2 = cursorO2.getInt(iN2);
                        if (i2 == 0) {
                            i = 1;
                        } else {
                            if (i2 != 10) {
                                throw new IllegalArgumentException("No such value " + i2 + " for LogEntryStatus");
                            }
                            i = 2;
                        }
                        if (!cursorO2.isNull(iN3)) {
                            blob = cursorO2.getBlob(iN3);
                        }
                        c0eVar = new c0e(i, j, z1e.a(blob), cursorO2.getInt(iN4) != 0);
                    }
                    return c0eVar;
                } finally {
                }
            case 2:
                Cursor cursorO3 = this.c.a.o(this.b, null);
                try {
                    ArrayList arrayList = new ArrayList(cursorO3.getCount());
                    while (cursorO3.moveToNext()) {
                        arrayList.add(cursorO3.isNull(0) ? null : Long.valueOf(cursorO3.getLong(0)));
                    }
                    return arrayList;
                } finally {
                }
            default:
                Cursor cursorO4 = this.c.a.o(this.b, null);
                try {
                    ArrayList arrayList2 = new ArrayList(cursorO4.getCount());
                    while (cursorO4.moveToNext()) {
                        arrayList2.add(cursorO4.isNull(0) ? null : Long.valueOf(cursorO4.getLong(0)));
                    }
                    return arrayList2;
                } finally {
                }
        }
    }
}
