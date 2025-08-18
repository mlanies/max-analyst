package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class vh implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xlc b;
    public final /* synthetic */ wh c;

    public /* synthetic */ vh(wh whVar, xlc xlcVar, int i) {
        this.a = i;
        this.c = whVar;
        this.b = xlcVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Cursor cursorO;
        switch (this.a) {
            case 0:
                cursorO = this.c.a.o(this.b, null);
                try {
                    int iN = tfg.n(cursorO, "id");
                    int iN2 = tfg.n(cursorO, "update_time");
                    int iN3 = tfg.n(cursorO, "emoji");
                    int iN4 = tfg.n(cursorO, "lottie_url");
                    int iN5 = tfg.n(cursorO, "lottie_play_url");
                    int iN6 = tfg.n(cursorO, "set_id");
                    int iN7 = tfg.n(cursorO, "icon_url");
                    ArrayList arrayList = new ArrayList(cursorO.getCount());
                    while (cursorO.moveToNext()) {
                        arrayList.add(new ii(cursorO.getLong(iN), cursorO.getLong(iN2), cursorO.isNull(iN3) ? null : cursorO.getString(iN3), cursorO.isNull(iN4) ? null : cursorO.getString(iN4), cursorO.isNull(iN5) ? null : cursorO.getString(iN5), cursorO.isNull(iN6) ? null : Long.valueOf(cursorO.getLong(iN6)), cursorO.isNull(iN7) ? null : cursorO.getString(iN7)));
                    }
                    return arrayList;
                } finally {
                }
            case 1:
                cursorO = this.c.a.o(this.b, null);
                try {
                    int iN8 = tfg.n(cursorO, "id");
                    int iN9 = tfg.n(cursorO, "update_time");
                    int iN10 = tfg.n(cursorO, "emoji");
                    int iN11 = tfg.n(cursorO, "lottie_url");
                    int iN12 = tfg.n(cursorO, "lottie_play_url");
                    int iN13 = tfg.n(cursorO, "set_id");
                    int iN14 = tfg.n(cursorO, "icon_url");
                    ArrayList arrayList2 = new ArrayList(cursorO.getCount());
                    while (cursorO.moveToNext()) {
                        arrayList2.add(new ii(cursorO.getLong(iN8), cursorO.getLong(iN9), cursorO.isNull(iN10) ? null : cursorO.getString(iN10), cursorO.isNull(iN11) ? null : cursorO.getString(iN11), cursorO.isNull(iN12) ? null : cursorO.getString(iN12), cursorO.isNull(iN13) ? null : Long.valueOf(cursorO.getLong(iN13)), cursorO.isNull(iN14) ? null : cursorO.getString(iN14)));
                    }
                    return arrayList2;
                } finally {
                }
            default:
                Integer numValueOf = null;
                cursorO = this.c.a.o(this.b, null);
                try {
                    if (cursorO.moveToFirst() && !cursorO.isNull(0)) {
                        numValueOf = Integer.valueOf(cursorO.getInt(0));
                    }
                    return numValueOf;
                } finally {
                }
        }
    }
}
