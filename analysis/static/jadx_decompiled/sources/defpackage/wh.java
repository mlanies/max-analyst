package defpackage;

import android.os.CancellationSignal;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class wh {
    public final ilc a;
    public final sh b;
    public final th c;

    public wh(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 0);
        this.c = new th(oneMeRoomDatabase, 0);
    }

    public final Object a(Collection collection, Continuation continuation) {
        StringBuilder sbL = au1.l("SELECT * FROM animoji WHERE id IN (");
        int size = collection.size();
        a14.c(sbL, size);
        sbL.append(")");
        xlc xlcVarA = xlc.a(size, sbL.toString());
        Iterator it = collection.iterator();
        int i = 1;
        while (it.hasNext()) {
            Long l = (Long) it.next();
            if (l == null) {
                xlcVarA.W(i);
            } else {
                xlcVarA.j(i, l.longValue());
            }
            i++;
        }
        return ote.i(this.a, new CancellationSignal(), new vh(this, xlcVarA, 1), continuation);
    }
}
