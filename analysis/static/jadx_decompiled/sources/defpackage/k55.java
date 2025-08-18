package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class k55 implements Callable {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;
    public final Object o;

    public k55(Callable callable, g55 g55Var, h55 h55Var) {
        this.b = callable;
        this.c = g55Var;
        this.o = h55Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                h55 h55Var = (h55) this.o;
                long jA = ((g55) this.c).a();
                try {
                    return ((Callable) this.b).call();
                } finally {
                    h55Var.a(jA);
                }
            default:
                StringBuilder sbL = au1.l("DELETE FROM folder_and_chats WHERE folderId = ? AND chatId IN (");
                List<Long> list = (List) this.b;
                a14.c(sbL, list.size());
                sbL.append(")");
                String string = sbL.toString();
                alc alcVar = (alc) this.o;
                q36 q36VarD = alcVar.a.d(string);
                String str = (String) this.c;
                if (str == null) {
                    q36VarD.W(1);
                } else {
                    q36VarD.f(1, str);
                }
                int i = 2;
                for (Long l : list) {
                    if (l == null) {
                        q36VarD.W(i);
                    } else {
                        q36VarD.j(i, l.longValue());
                    }
                    i++;
                }
                ilc ilcVar = alcVar.a;
                ilcVar.c();
                try {
                    q36VarD.n();
                    ilcVar.r();
                    ilcVar.l();
                    return e5f.a;
                } catch (Throwable th) {
                    ilcVar.l();
                    throw th;
                }
        }
    }

    public k55(alc alcVar, List list, String str) {
        this.o = alcVar;
        this.b = list;
        this.c = str;
    }
}
