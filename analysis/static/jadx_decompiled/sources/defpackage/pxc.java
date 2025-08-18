package defpackage;

import android.content.Context;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class pxc extends brd {
    public final /* synthetic */ int b;

    public /* synthetic */ pxc(int i) {
        this.b = i;
    }

    @Override // defpackage.brd
    public final Object b(v4 v4Var) {
        switch (this.b) {
            case 0:
                return new hq3(v4Var.d(el3.class), v4Var.d(ike.class), v4Var.d(pk.class), v4Var.d(av0.class));
            case 1:
                return ((OneMeRoomDatabase) v4Var.c(OneMeRoomDatabase.class)).G();
            case 2:
                return ((OneMeRoomDatabase) v4Var.c(OneMeRoomDatabase.class)).C();
            case 3:
                return ((OneMeRoomDatabase) v4Var.c(OneMeRoomDatabase.class)).D();
            case 4:
                y7d y7dVar = (y7d) v4Var.c(y7d.class);
                Object obj = kp.d;
                return new fqb(y7dVar, z7.g(new cyc(v4Var, 7)), z7.g(new cyc(v4Var, 8)));
            case 5:
                Object obj2 = kp.d;
                return new rx9(z7.g(new cyc(v4Var, 9)), z7.g(new cyc(v4Var, 10)));
            case 6:
                return ((OneMeRoomDatabase) v4Var.c(OneMeRoomDatabase.class)).I();
            case 7:
                return new cm2(v4Var.d(yo7.class), v4Var.d(he5.class), v4Var.d(le5.class), v4Var.d(m7b.class), v4Var.d(iy2.class), v4Var.d(ri4.class), v4Var.d(tda.class));
            case 8:
                return new yo7((Context) v4Var.c(Context.class), (m7b) v4Var.c(m7b.class), v4Var.d(p82.class), v4Var.d(el3.class), v4Var.d(au8.class), v4Var.d(tda.class), v4Var.d(aw9.class), v4Var.d(xv9.class), v4Var.d(kw9.class), v4Var.d(ge2.class));
            case 9:
                return new ome((mle) v4Var.c(mle.class));
            case 10:
                return new he5((Context) v4Var.c(Context.class), (m7b) v4Var.c(m7b.class), v4Var.d(ge2.class), v4Var.d(ew9.class), v4Var.d(le5.class), v4Var.d(kw9.class), v4Var.d(p82.class), v4Var.d(el3.class), v4Var.d(tda.class), v4Var.d(aw9.class), v4Var.d(au8.class), v4Var.d(ida.class), v4Var.d(are.class), (kke) v4Var.c(kke.class));
            case 11:
                return new aw9((Context) v4Var.c(Context.class), (xv9) v4Var.c(xv9.class));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ida idaVar = (ida) v4Var.c(ida.class);
                Object obj3 = kp.d;
                return new xv9(idaVar, z7.g(new cyc(v4Var, 11)), z7.g(new cyc(v4Var, 12)), z7.g(new cyc(v4Var, 13)));
            case 13:
                return new nd((Context) v4Var.c(Context.class), new khe(new ot2(v4Var, 21)));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new ak3(v4Var.d(ds3.class), v4Var.d(q33.class));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                khe kheVarD = v4Var.d(ak3.class);
                v4Var.d(m7b.class);
                return new are(kheVarD);
            case 16:
                return new av6(v4Var.d(zi5.class), v4Var.d(kke.class));
            case LangUtils.HASH_SEED /* 17 */:
                v4Var.d(p7c.class);
                v4Var.d(lx8.class);
                return new oz7();
            case 18:
                return new cc6(v4Var.d(pk.class), v4Var.d(jx8.class));
            case 19:
                v4Var.d(iba.class);
                v4Var.d(au8.class);
                v4Var.d(zu8.class);
                v4Var.d(rf5.class);
                v4Var.d(zi5.class);
                return new q50();
            case 20:
                return new cy7();
            case 21:
                ((jle) ((hle) v4Var.c(hle.class))).b();
                return new crd();
            case 22:
                return gn7.a;
            case 23:
                return new yx7((p82) v4Var.c(p82.class), (el3) v4Var.c(el3.class), (b0d) v4Var.c(b0d.class), (oq3) v4Var.c(oq3.class), ((jle) ((hle) v4Var.c(hle.class))).a(), ((jle) ((hle) v4Var.c(hle.class))).b(), (mle) v4Var.c(mle.class), (av0) v4Var.c(av0.class), (fme) v4Var.c(fme.class), false, (o45) v4Var.c(o45.class), (y7d) v4Var.c(y7d.class));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                new yx7((p82) v4Var.c(p82.class), (el3) v4Var.c(el3.class), (b0d) v4Var.c(b0d.class), (oq3) v4Var.c(oq3.class), ((jle) ((hle) v4Var.c(hle.class))).a(), ((jle) ((hle) v4Var.c(hle.class))).b(), (mle) v4Var.c(mle.class), (av0) v4Var.c(av0.class), (fme) v4Var.c(fme.class), true, (o45) v4Var.c(o45.class), (y7d) v4Var.c(y7d.class));
                return new qx7(0);
            case 25:
                return new yb9();
            case 26:
                return (qh5) ((lle) v4Var.c(lle.class)).i.getValue();
            case 27:
                ka4 ka4Var = (ka4) v4Var.c(ka4.class);
                ((jle) ((hle) v4Var.c(hle.class))).a();
                return new ga4(ka4Var);
            case 28:
                z7.g(new cyc(v4Var, 24));
                z7.g(new dyc(v4Var, 3));
                z7.g(new dyc(v4Var, 4));
                z7.g(new cyc(v4Var, 14));
                z7.g(new cyc(v4Var, 15));
                z7.g(new cyc(v4Var, 16));
                z7.g(new cyc(v4Var, 17));
                z7.g(new cyc(v4Var, 18));
                z7.g(new cyc(v4Var, 19));
                z7.g(new cyc(v4Var, 20));
                z7.g(new cyc(v4Var, 21));
                z7.g(new cyc(v4Var, 22));
                z7.g(new cyc(v4Var, 23));
                z7.g(new cyc(v4Var, 25));
                z7.g(new cyc(v4Var, 26));
                z7.g(new cyc(v4Var, 27));
                z7.g(new cyc(v4Var, 28));
                z7.g(new cyc(v4Var, 29));
                z7.g(new dyc(v4Var, 0));
                z7.g(new dyc(v4Var, 1));
                z7.g(new dyc(v4Var, 2));
                return new hx9();
            default:
                Object obj4 = kp.d;
                z7.g(new dyc(v4Var, 5));
                z7.g(new dyc(v4Var, 6));
                return new agc();
        }
    }
}
