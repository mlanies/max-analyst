package defpackage;

import java.util.Collections;
import java.util.Iterator;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.exception.UserNotFoundException;

/* loaded from: classes2.dex */
public final /* synthetic */ class b82 implements lde {
    public final /* synthetic */ int a;
    public final /* synthetic */ p82 b;

    public /* synthetic */ b82(p82 p82Var, int i) {
        this.a = i;
        this.b = p82Var;
    }

    @Override // defpackage.lde
    public final Object get() throws Throwable {
        Long l;
        switch (this.a) {
            case 0:
                p82 p82Var = this.b;
                e52 e52Var = p82Var.a;
                if (e52Var != null) {
                    return e52Var;
                }
                if (((p7b) p82Var.n).a.t() == -1) {
                    throw new UserNotFoundException("no user id");
                }
                long jK = p82Var.K();
                rm4 rm4Var = p82Var.l;
                elc elcVar = ((k24) ((c34) rm4Var.get())).b;
                elcVar.getClass();
                l92 l92Var = (l92) ((OneMeRoomDatabase) elcVar.a.m()).p(new dlc(0, new clc(elcVar, jK, 0)));
                cu8 cu8VarB = null;
                if (l92Var == null) {
                    k92 k92VarT = p82.t(0L, 0L, 2, jK, Collections.singletonMap(Long.valueOf(jK), 0L), 0L, 3, 0L, 0L, null);
                    l92Var = new l92(((k24) ((c34) rm4Var.get())).b.e(k92VarT), k92VarT);
                } else {
                    vlc vlcVar = ((k24) ((c34) rm4Var.get())).c;
                    ru8 ru8VarC = vlcVar.d().c(l92Var.c.j);
                    if (ru8VarC != null) {
                        cu8VarB = vlcVar.b(ru8VarC);
                    }
                }
                cu8 cu8Var = cu8VarB;
                p82Var.d.put(Long.valueOf(l92Var.b), l92Var);
                e52 e52VarG = p82Var.g(l92Var, cu8Var);
                p82Var.a = e52VarG;
                return e52VarG;
            case 1:
                try {
                    Iterator it = this.b.E(p82.I).iterator();
                    if (it.hasNext()) {
                        Long lValueOf = Long.valueOf(((e52) it.next()).b.k);
                        while (it.hasNext()) {
                            Long lValueOf2 = Long.valueOf(((e52) it.next()).b.k);
                            if (lValueOf.compareTo(lValueOf2) > 0) {
                                lValueOf = lValueOf2;
                            }
                        }
                        l = lValueOf;
                    } else {
                        l = null;
                    }
                    return Long.valueOf(l != null ? l.longValue() : 0L);
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            default:
                return this.b.a;
        }
    }
}
