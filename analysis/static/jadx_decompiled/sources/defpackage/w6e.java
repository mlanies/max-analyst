package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class w6e extends pnf {
    public static final /* synthetic */ bc7[] B0 = {new oi9(w6e.class, "moveFinishJob", "getMoveFinishJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, w6e.class, "menuItemJob", "getMenuItemJob()Lkotlinx/coroutines/Job;"), new oi9(w6e.class, "deleteSetJob", "getDeleteSetJob()Lkotlinx/coroutines/Job;")};
    public final w4d A0;
    public final q0e X;
    public final w7c Y;
    public final s35 Z;
    public final Context b;
    public final kke c;
    public final je7 o;
    public final s35 s0;
    public volatile Long t0;
    public volatile int u0;
    public volatile Long v0;
    public final w4d w0;
    public Long x0;
    public Long y0;
    public final w4d z0;

    public w6e(Context context, kke kkeVar, je7 je7Var, je7 je7Var2, je7 je7Var3) {
        this.b = context;
        this.c = kkeVar;
        this.o = je7Var3;
        q0e q0eVarA = r0e.a(nz4.a);
        this.X = q0eVarA;
        this.Y = new w7c(q0eVarA);
        this.Z = new s35(0);
        this.s0 = new s35(0);
        this.u0 = -1;
        this.w0 = mqd.D();
        this.z0 = mqd.D();
        this.A0 = mqd.D();
        hm9.n(w6e.class.getName(), "loadSections");
        kq1 kq1VarC = c37.c(((o2e) je7Var.getValue()).a());
        kq1 kq1VarC2 = c37.c(((md5) je7Var2.getValue()).a());
        ml0 ml0Var = ((sc5) je7Var3.getValue()).s0;
        ml0Var.getClass();
        od2.L(od2.F(new zn5(od2.t(kq1VarC, kq1VarC2, c37.c(new e0a(new mz9(ml0Var, 0), new nc5(23), 3)), new zp3(4, (Continuation) null)), new shb(2, this, w6e.class, "processResult", "processResult(Lone/me/stickerssettings/StickersSettingsViewModel$CombinedResult;)V", 4, 16), 5), ((w9a) kkeVar).b()), this.a);
    }

    public final String q(List list) {
        int size = list != null ? list.size() : 0;
        return this.b.getResources().getQuantityString(uga.a, size, Integer.valueOf(size));
    }
}
