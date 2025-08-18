package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.OneMeApplication;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public final class t4a extends ffe implements a66 {
    public int X;
    public final /* synthetic */ OneMeApplication Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4a(OneMeApplication oneMeApplication, Continuation continuation) {
        super(2, continuation);
        this.Y = oneMeApplication;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((t4a) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new t4a(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            je7 je7Var = iyc.a;
            khe kheVarD = jyc.a.getAccessor().d(q33.class);
            je7 je7VarA = iyc.a();
            ggc ggcVar = new ggc(kheVarD, je7VarA);
            this.X = 1;
            se5 se5Var = (se5) ((qe5) ((khe) je7VarA).getValue());
            se5Var.getClass();
            if (se5Var.n(PmsKey.f6appearancemultithemescreenenabled, false)) {
                hm9.n("SavedBackgroundThemeMigration", "Chat theme use new multithemes, migration not needed");
            } else {
                String strL = tfg.l(ggcVar.a(), true);
                String strL2 = tfg.l(ggcVar.a(), false);
                ((t33) ggcVar.a()).j("app.chat.background.migrated", ze0.c.contains(strL) && ze0.b.contains(strL2));
                if (((t33) ggcVar.a()).g.getBoolean("app.chat.background.migrated", false)) {
                    hm9.n("SavedBackgroundThemeMigration", "Chat theme background already migrated.");
                } else {
                    ggcVar.b(true);
                    ggcVar.b(false);
                    ((t33) ggcVar.a()).j("app.chat.background.migrated", true);
                }
            }
            if (e5fVar == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    od2.a0(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        l7b l7bVar = new l7b(iyc.a());
        this.X = 2;
        Object objT0 = j47.t0(((w9a) ((kke) ((je7) l7bVar.c).getValue())).b(), new k7b(this.Y, l7bVar, null), this);
        if (objT0 != tx3Var) {
            objT0 = e5fVar;
        }
        return objT0 == tx3Var ? tx3Var : e5fVar;
    }
}
