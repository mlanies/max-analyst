package defpackage;

import android.content.Context;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.chats.a;
import ru.ok.tamtam.login.b;
import ru.ok.tamtam.logout.c;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class qxc extends brd {
    public final /* synthetic */ int b;

    public /* synthetic */ qxc(int i) {
        this.b = i;
    }

    @Override // defpackage.brd
    public final Object b(v4 v4Var) {
        switch (this.b) {
            case 0:
                Context context = (Context) v4Var.c(Context.class);
                z7.g(new dyc(v4Var, 8));
                return new mh5(context, z7.g(new dyc(v4Var, 9)), z7.g(new dyc(v4Var, 10)), z7.g(new dyc(v4Var, 7)));
            case 1:
                return (av0) v4Var.c(cy7.class);
            case 2:
                return new k4a(v4Var.d(ome.class), v4Var.d(m7b.class), v4Var.d(f5a.class), v4Var.d(s8g.class), new khe(new ot2(v4Var, 22)));
            case 3:
                c7f c7fVar = (c7f) v4Var.c(c7f.class);
                q2e q2eVar = (q2e) v4Var.c(q2e.class);
                hle hleVar = (hle) v4Var.c(hle.class);
                hleVar.getClass();
                ztc ztcVarA = ((jle) hleVar).a();
                Object obj = kp.d;
                return new g8f(c7fVar, q2eVar, ztcVarA, z7.g(new dyc(v4Var, 11)));
            case 4:
                Object obj2 = kp.d;
                return new oz(z7.g(new dyc(v4Var, 17)), z7.g(new dyc(v4Var, 18)), z7.g(new dyc(v4Var, 19)), z7.g(new dyc(v4Var, 12)), z7.g(new dyc(v4Var, 13)), z7.g(new dyc(v4Var, 14)), z7.g(new dyc(v4Var, 15)), z7.g(new dyc(v4Var, 16)));
            case 5:
                return new mc6(v4Var.d(pk.class), v4Var.d(y7d.class), v4Var.d(el3.class), v4Var.d(w7b.class), v4Var.d(r47.class), v4Var.d(av0.class));
            case 6:
                ad adVar = (ad) v4Var.c(ad.class);
                return new nkd(adVar, (av0) v4Var.c(av0.class), new lq9(), (o45) v4Var.c(o45.class), (s8g) v4Var.c(s8g.class));
            case 7:
                return new k9c((p82) v4Var.c(p82.class), (el3) v4Var.c(el3.class), ((jle) ((hle) v4Var.c(hle.class))).a());
            case 8:
                return new ec6(v4Var.d(pk.class), v4Var.d(y7d.class), (wxc) v4Var.c(wxc.class));
            case 9:
                return new r5d(v4Var.d(pk.class), v4Var.d(y7d.class), v4Var.d(lx8.class), v4Var.d(o45.class), v4Var.d(jx8.class));
            case 10:
                Object obj3 = kp.d;
                return new ky1(z7.g(new dyc(v4Var, 21)), z7.g(new dyc(v4Var, 22)), z7.g(new dyc(v4Var, 23)), z7.g(new dyc(v4Var, 20)));
            case 11:
                return new rr3((o45) v4Var.c(o45.class), (av0) v4Var.c(av0.class), ((jle) ((hle) v4Var.c(hle.class))).b(), ((jle) ((hle) v4Var.c(hle.class))).a(), (el3) v4Var.c(el3.class), (oq3) v4Var.c(oq3.class), (b0d) v4Var.c(b0d.class));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new ks1((pk) v4Var.c(pk.class), (au8) v4Var.c(au8.class), (p82) v4Var.c(p82.class), ((jle) ((hle) v4Var.c(hle.class))).b(), (zi5) v4Var.c(zi5.class), (av0) v4Var.c(av0.class), (m7b) v4Var.c(m7b.class), (iba) v4Var.c(iba.class), (tp7) v4Var.c(tp7.class), (zu8) v4Var.c(zu8.class));
            case 13:
                return new s8g(v4Var.d(eoe.class), v4Var.d(o45.class), v4Var.d(iba.class), v4Var.d(mle.class), v4Var.d(gh3.class), v4Var.d(e8d.class), v4Var.d(pl.class));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new c32(0, (byte) 0);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ztc ztcVarB = ((jle) ((hle) v4Var.c(hle.class))).b();
                hle hleVar2 = (hle) v4Var.c(hle.class);
                hleVar2.getClass();
                return new xf2(ztcVarB, ((jle) hleVar2).a(), ((jle) ((hle) v4Var.c(hle.class))).a(), (av0) v4Var.c(av0.class), (p82) v4Var.c(p82.class), (au8) v4Var.c(au8.class), (ge2) v4Var.c(ge2.class), (t6b) v4Var.c(t6b.class), (zu8) v4Var.c(zu8.class));
            case 16:
                return new zm8((y7d) v4Var.c(y7d.class));
            case LangUtils.HASH_SEED /* 17 */:
                ((jle) ((hle) v4Var.c(hle.class))).a();
                return new sp3();
            case 18:
                return new q2e((pk) v4Var.c(pk.class), (o2e) v4Var.c(o2e.class), ((jle) ((hle) v4Var.c(hle.class))).a(), (fme) v4Var.c(fme.class));
            case 19:
                return new kw3(v4Var.d(hp.class), v4Var.d(wef.class), v4Var.d(af8.class));
            case 20:
                return new tp7(v4Var.d(au8.class), v4Var.d(zu8.class));
            case 21:
                m7b m7bVar = (m7b) v4Var.c(m7b.class);
                Object obj4 = kp.d;
                return new m9b(m7bVar, z7.g(new dyc(v4Var, 24)), z7.g(new dyc(v4Var, 25)));
            case 22:
                return new gc2((av0) v4Var.c(av0.class), (kke) v4Var.c(kke.class));
            case 23:
                return new ki7((av0) v4Var.c(av0.class), (kke) v4Var.c(kke.class));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new v04();
            case 25:
                return new sc2((av0) v4Var.c(av0.class), (kke) v4Var.c(kke.class));
            case 26:
                return new fe7((kke) v4Var.c(kke.class), (o45) v4Var.c(o45.class));
            case 27:
                return b.a((av0) v4Var.c(av0.class), (kke) v4Var.c(kke.class));
            case 28:
                return c.a((av0) v4Var.c(av0.class), (kke) v4Var.c(kke.class));
            default:
                return a.a((av0) v4Var.c(av0.class), (kke) v4Var.c(kke.class));
        }
    }
}
