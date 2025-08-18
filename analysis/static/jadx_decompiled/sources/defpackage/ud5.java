package defpackage;

import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class ud5 implements qu7 {
    public final th X;
    public final ilc a;
    public final sh b;
    public final th c;
    public final th o;

    public ud5(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 9);
        this.c = new th(oneMeRoomDatabase, 20);
        this.o = new th(oneMeRoomDatabase, 21);
        this.X = new th(oneMeRoomDatabase, 22);
    }

    @Override // defpackage.qu7
    public final void a() throws Throwable {
        j47.f0(hz4.a, new rd5(this, null));
    }

    public final Object b(List list, ix9 ix9Var) {
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ux9 ux9Var = (ux9) it.next();
            arrayList.add(ux9Var.a + "_" + ux9Var.b);
        }
        StringBuilder sbL = au1.l("SELECT * FROM fcm_notifications_analytics WHERE chat_id||'_'||msg_id IN (");
        int size = arrayList.size();
        a14.c(sbL, size);
        sbL.append(") AND analytics_status = (");
        sbL.append("?");
        sbL.append(")");
        int i = 1;
        int i2 = size + 1;
        xlc xlcVarA = xlc.a(i2, sbL.toString());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (str == null) {
                xlcVarA.W(i);
            } else {
                xlcVarA.f(i, str);
            }
            i++;
        }
        xlcVarA.j(i2, au1.s(2));
        return ote.i(this.a, new CancellationSignal(), new uh(this, 9, xlcVarA), ix9Var);
    }
}
