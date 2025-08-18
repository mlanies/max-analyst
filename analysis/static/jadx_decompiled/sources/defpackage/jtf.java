package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class jtf implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xlc b;
    public final /* synthetic */ mtf c;

    public /* synthetic */ jtf(mtf mtfVar, xlc xlcVar, int i) {
        this.a = i;
        this.c = mtfVar;
        this.b = xlcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Cursor cursorO;
        switch (this.a) {
            case 0:
                cursorO = this.c.a.o(this.b, null);
                try {
                    int iN = tfg.n(cursorO, "id");
                    int iN2 = tfg.n(cursorO, "user_id");
                    int iN3 = tfg.n(cursorO, "bot_id");
                    int iN4 = tfg.n(cursorO, ApiProtocol.KEY_TOKEN);
                    int iN5 = tfg.n(cursorO, "access_requested");
                    int iN6 = tfg.n(cursorO, "access_granted");
                    ArrayList arrayList = new ArrayList(cursorO.getCount());
                    while (cursorO.moveToNext()) {
                        arrayList.add(new puf(cursorO.getLong(iN), cursorO.getLong(iN2), cursorO.getLong(iN3), cursorO.isNull(iN4) ? null : cursorO.getString(iN4), cursorO.getInt(iN5) != 0, cursorO.getInt(iN6) != 0));
                    }
                    return arrayList;
                } finally {
                }
            case 1:
                cursorO = this.c.a.o(this.b, null);
                try {
                    int iN7 = tfg.n(cursorO, "id");
                    int iN8 = tfg.n(cursorO, "user_id");
                    int iN9 = tfg.n(cursorO, "bot_id");
                    int iN10 = tfg.n(cursorO, ApiProtocol.KEY_TOKEN);
                    int iN11 = tfg.n(cursorO, "access_requested");
                    int iN12 = tfg.n(cursorO, "access_granted");
                    if (cursorO.moveToFirst()) {
                        pufVar = new puf(cursorO.getLong(iN7), cursorO.getLong(iN8), cursorO.getLong(iN9), cursorO.isNull(iN10) ? null : cursorO.getString(iN10), cursorO.getInt(iN11) != 0, cursorO.getInt(iN12) != 0);
                    }
                    return pufVar;
                } finally {
                }
            default:
                String string = null;
                cursorO = this.c.a.o(this.b, null);
                try {
                    if (cursorO.moveToFirst() && !cursorO.isNull(0)) {
                        string = cursorO.getString(0);
                    }
                    return string;
                } finally {
                }
        }
    }
}
