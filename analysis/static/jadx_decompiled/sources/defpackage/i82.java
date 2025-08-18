package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final /* synthetic */ class i82 implements f6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i82(hd5 hd5Var) {
        this.a = 3;
        this.c = hd5Var;
        this.b = 0L;
    }

    @Override // defpackage.f6
    public final void run() {
        long j = this.b;
        Object obj = this.c;
        switch (this.a) {
            case 0:
                p82 p82Var = (p82) obj;
                p82Var.e();
                p82Var.f0("localRemoveChat", new r60(p82Var, j, 3));
                elc elcVar = ((k24) ((c34) p82Var.l.get())).b;
                elcVar.getClass();
                ((OneMeRoomDatabase) elcVar.a.m()).p(new dlc(0, new clc(elcVar, j, 1)));
                au8 au8Var = (au8) p82Var.s.get();
                au8Var.getClass();
                hm9.n("au8", "deleteMessages %d, all!");
                ((k24) au8Var.a).c.d().e(j);
                break;
            case 1:
                el3 el3Var = (el3) obj;
                el3Var.c(j, new c10(((p7b) el3Var.h).a.n(), 11));
                break;
            case 2:
                ((k4a) ((dd5) obj).a).g(5, j);
                break;
            default:
                ((k4a) ((hd5) obj).a).g(4, j);
                break;
        }
    }

    public /* synthetic */ i82(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}
