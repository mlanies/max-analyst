package defpackage;

import android.os.CancellationSignal;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class kw9 implements qu7 {
    public final ilc a;
    public final sh b;
    public final p19 c;

    public kw9(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 13);
        this.c = new p19(oneMeRoomDatabase, 16);
    }

    @Override // defpackage.qu7
    public final void a() throws Throwable {
        j47.f0(hz4.a, new jw9(this, null));
    }

    public final Object b(List list, Continuation continuation) {
        StringBuilder sbL = au1.l("SELECT * FROM notifications_read_marks WHERE chat_id IN (");
        int size = list.size();
        a14.c(sbL, size);
        sbL.append(")");
        xlc xlcVarA = xlc.a(size, sbL.toString());
        Iterator it = list.iterator();
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
        return ote.i(this.a, new CancellationSignal(), new uh(this, 16, xlcVarA), continuation);
    }
}
