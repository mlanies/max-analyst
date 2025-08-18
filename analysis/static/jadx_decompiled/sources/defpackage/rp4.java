package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class rp4 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ rp4(Object obj, long j, String str, int i) {
        this.a = i;
        this.o = obj;
        this.b = j;
        this.c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ilc ilcVar;
        switch (this.a) {
            case 0:
                tp4 tp4Var = (tp4) this.o;
                th thVar = tp4Var.c;
                ilc ilcVar2 = tp4Var.a;
                q36 q36VarF = thVar.f();
                q36VarF.j(1, this.b);
                String str = (String) this.c;
                if (str == null) {
                    q36VarF.W(2);
                } else {
                    q36VarF.f(2, str);
                }
                try {
                    ilcVar2.c();
                    try {
                        q36VarF.n();
                        ilcVar2.r();
                        thVar.t(q36VarF);
                        return null;
                    } finally {
                        ilcVar2.l();
                    }
                } catch (Throwable th) {
                    thVar.t(q36VarF);
                    throw th;
                }
            case 1:
                StringBuilder sbL = au1.l("DELETE FROM messages WHERE chat_id = ? AND id in (");
                List<Long> list = (List) this.c;
                a14.c(sbL, list.size());
                sbL.append(")");
                String string = sbL.toString();
                t19 t19Var = (t19) this.o;
                q36 q36VarD = t19Var.a.d(string);
                q36VarD.j(1, this.b);
                int i = 2;
                for (Long l : list) {
                    if (l == null) {
                        q36VarD.W(i);
                    } else {
                        q36VarD.j(i, l.longValue());
                    }
                    i++;
                }
                ilc ilcVar3 = t19Var.a;
                ilcVar3.c();
                try {
                    q36VarD.n();
                    ilcVar3.r();
                    ilcVar3.l();
                    return e5f.a;
                } catch (Throwable th2) {
                    ilcVar3.l();
                    throw th2;
                }
            case 2:
                alc alcVar = (alc) this.o;
                zkc zkcVar = alcVar.f;
                ilcVar = alcVar.a;
                q36 q36VarF2 = zkcVar.f();
                q36VarF2.j(1, this.b);
                String str2 = (String) this.c;
                if (str2 == null) {
                    q36VarF2.W(2);
                } else {
                    q36VarF2.f(2, str2);
                }
                try {
                    ilcVar.c();
                    try {
                        q36VarF2.m();
                        ilcVar.r();
                        zkcVar.t(q36VarF2);
                        return e5f.a;
                    } finally {
                    }
                } catch (Throwable th3) {
                    zkcVar.t(q36VarF2);
                    throw th3;
                }
            default:
                StringBuilder sbL2 = au1.l("DELETE FROM folder_and_chats WHERE folderId IN (");
                Collection<String> collection = (Collection) this.c;
                int size = collection.size();
                a14.c(sbL2, size);
                sbL2.append(") AND chatId = ");
                sbL2.append("?");
                String string2 = sbL2.toString();
                alc alcVar2 = (alc) this.o;
                q36 q36VarD2 = alcVar2.a.d(string2);
                int i2 = 1;
                for (String str3 : collection) {
                    if (str3 == null) {
                        q36VarD2.W(i2);
                    } else {
                        q36VarD2.f(i2, str3);
                    }
                    i2++;
                }
                q36VarD2.j(size + 1, this.b);
                ilcVar = alcVar2.a;
                ilcVar.c();
                try {
                    q36VarD2.n();
                    ilcVar.r();
                    ilcVar.l();
                    return e5f.a;
                } finally {
                }
        }
    }

    public /* synthetic */ rp4(Object obj, Collection collection, long j, int i) {
        this.a = i;
        this.o = obj;
        this.c = collection;
        this.b = j;
    }
}
