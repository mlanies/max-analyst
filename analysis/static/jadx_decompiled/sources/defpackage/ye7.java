package defpackage;

import android.app.Application;
import android.content.Context;
import android.util.TypedValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.messages.a;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class ye7 extends brd {
    public final /* synthetic */ int b;

    public /* synthetic */ ye7(int i) {
        this.b = i;
    }

    @Override // defpackage.brd
    public final Object b(v4 v4Var) {
        switch (this.b) {
            case 0:
                return (lle) v4Var.c(ep.class);
            case 1:
                Context context = (Context) v4Var.c(Context.class);
                khe kheVarD = v4Var.d(p7b.class);
                khe kheVarD2 = v4Var.d(ex4.class);
                v7g v7gVar = (v7g) v4Var.c(v7g.class);
                v4Var.d(d64.class);
                return new ep(context, kheVarD, kheVarD2, v7gVar, (p84) v4Var.c(p84.class), v4Var.d(lt9.class), v4Var.d(bea.class), v4Var.d(tda.class), v4Var.d(cea.class), v4Var.d(c79.class), v4Var.d(wke.class), v4Var.d(p82.class));
            case 2:
                return new b6d((Context) v4Var.c(Context.class));
            case 3:
                Context context2 = (Context) v4Var.c(Context.class);
                o45 o45Var = (o45) v4Var.c(o45.class);
                p7b p7bVar = (p7b) v4Var.c(p7b.class);
                uh9 uh9Var = (uh9) v4Var.c(uh9.class);
                f40 f40Var = (f40) v4Var.c(f40.class);
                gh3 gh3Var = (gh3) v4Var.c(gh3.class);
                ef7 ef7Var = (ef7) v4Var.c(ef7.class);
                ti4 ti4Var = (ti4) v4Var.c(ti4.class);
                tg tgVar = (tg) v4Var.c(tg.class);
                au8 au8Var = (au8) v4Var.c(au8.class);
                dlf dlfVar = (dlf) v4Var.c(dlf.class);
                hle hleVar = (hle) v4Var.c(hle.class);
                o20 o20Var = (o20) v4Var.c(o20.class);
                ep epVar = (ep) v4Var.c(ep.class);
                av0 av0Var = (av0) v4Var.c(av0.class);
                p82 p82Var = (p82) v4Var.c(p82.class);
                m65 m65Var = (m65) v4Var.c(m65.class);
                return new ye8(context2, o45Var, p7bVar, uh9Var, f40Var, gh3Var, ef7Var, ti4Var, tgVar, au8Var, dlfVar, hleVar, o20Var, epVar, av0Var, p82Var, m65Var);
            case 4:
                return new w6a((oe3) v4Var.c(oe3.class), (Context) v4Var.c(Context.class), v4Var.d(zaa.class));
            case 5:
                return new eka(v4Var.d(os0.class), (Context) v4Var.c(Context.class), (p7b) v4Var.c(p7b.class), v4Var.d(zaa.class));
            case 6:
                return new xp7((av0) v4Var.c(av0.class), (ox3) v4Var.c(ox3.class), (m7b) v4Var.c(p7b.class), (hq7) v4Var.c(hq7.class), (kke) v4Var.c(kke.class), ((Context) v4Var.c(Context.class)).getContentResolver(), (zi5) v4Var.c(zi5.class));
            case 7:
                return ((xp7) v4Var.c(xp7.class)).f;
            case 8:
                return new dlf((Context) v4Var.c(Context.class), (gh3) v4Var.c(gh3.class), (ef7) v4Var.c(ef7.class), (hle) v4Var.c(hle.class), (p7b) v4Var.c(p7b.class), (pk) v4Var.c(pk.class), (fme) v4Var.c(fme.class), (ch3) v4Var.c(ch3.class), (av0) v4Var.c(av0.class), (zi5) v4Var.c(zi5.class));
            case 9:
                return vl.b();
            case 10:
                Context context3 = (Context) v4Var.c(Context.class);
                y7d y7dVar = (y7d) v4Var.c(y7d.class);
                kke kkeVar = (kke) v4Var.c(kke.class);
                kk5 kk5Var = (kk5) v4Var.c(kk5.class);
                au8 au8Var2 = (au8) v4Var.c(au8.class);
                q33 q33Var = (q33) v4Var.c(q33.class);
                av0 av0Var2 = (av0) v4Var.c(av0.class);
                zp zpVar = (zp) v4Var.c(zp.class);
                taa taaVar = (taa) v4Var.c(taa.class);
                ox3 ox3Var = (ox3) v4Var.c(ox3.class);
                return new uh9(context3, y7dVar, kkeVar, kk5Var, au8Var2, q33Var, av0Var2, zpVar, taaVar, ox3Var, v4Var.d(kda.class), v4Var.d(iy2.class));
            case 11:
                return new zke((o45) v4Var.c(o45.class), v4Var.d(ale.class), v4Var.d(ad.class), v4Var.d(bd4.class), v4Var.d(q33.class), v4Var.d(f5a.class), v4Var.d(pk.class), (kke) v4Var.c(kke.class), v4Var.d(n6a.class));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new cu6((Context) v4Var.c(Context.class));
            case 13:
                return new q7g((a) v4Var.c(a.class), (v7g) v4Var.c(v7g.class), v4Var.d(iba.class));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                khe kheVarD3 = v4Var.d(ad.class);
                khe kheVarD4 = v4Var.d(ep.class);
                khe kheVarD5 = v4Var.d(gh3.class);
                khe kheVarD6 = v4Var.d(ti4.class);
                khe kheVarD7 = v4Var.d(u8e.class);
                khe kheVarD8 = v4Var.d(m7b.class);
                khe kheVarD9 = v4Var.d(eoe.class);
                khe kheVarD10 = v4Var.d(s8g.class);
                khe kheVarD11 = v4Var.d(qj6.class);
                khe kheVarD12 = v4Var.d(t6b.class);
                khe kheVarD13 = v4Var.d(p82.class);
                khe kheVarD14 = v4Var.d(cy7.class);
                khe kheVarD15 = v4Var.d(tme.class);
                khe kheVarD16 = v4Var.d(cn7.class);
                v4Var.d(ty3.class);
                return new a(kheVarD3, kheVarD4, kheVarD5, kheVarD6, kheVarD7, kheVarD8, kheVarD9, kheVarD10, kheVarD11, kheVarD12, kheVarD13, kheVarD14, kheVarD15, kheVarD16, v4Var.d(hle.class), v4Var.d(aua.class), v4Var.d(k24.class));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new o20((Context) v4Var.c(Application.class), (y00) v4Var.c(y00.class), (vxc) v4Var.c(vxc.class));
            case 16:
                return (t00) v4Var.c(o20.class);
            case LangUtils.HASH_SEED /* 17 */:
                return new y00((zi5) v4Var.c(zi5.class), (hle) v4Var.c(hle.class), (o45) v4Var.c(o45.class));
            case 18:
                hle hleVar2 = (hle) v4Var.c(hle.class);
                ikf ikfVar = new ikf();
                Collections.newSetFromMap(new ConcurrentHashMap());
                ((jle) hleVar2).a();
                return ikfVar;
            case 19:
                return new vy7((xke) v4Var.c(xke.class), new qx7(7));
            case 20:
                khe kheVar = new khe(bv3.s0);
                if (jke.b != null) {
                    hm9.k0("TamContextAndroid", null, "TamContext is already initialized", Arrays.copyOf(new Object[0], 0));
                } else {
                    jke.b = new jke(kheVar);
                    jke.c.countDown();
                }
                return jke.a();
            case 21:
                return new xke((Context) v4Var.c(Context.class), v4Var.d(pd0.class), v4Var.d(ida.class), v4Var.d(p82.class), v4Var.d(el3.class), v4Var.d(q33.class), new khe(new ot2(v4Var, 3)));
            case 22:
                return new q26((jv6) v4Var.c(jv6.class), v4Var.d(hle.class), v4Var.d(o45.class), v4Var.d(ti4.class));
            case 23:
                return new fz6((Context) v4Var.c(Context.class), (ox3) v4Var.c(ox3.class), (kke) v4Var.c(kke.class), v4Var.d(eua.class));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new gme(v4Var.d(ad.class));
            case 25:
                v4Var.d(hle.class);
                Context context4 = (Context) v4Var.c(Context.class);
                if (tu0.G(80 * fk4.d().getDisplayMetrics().density) <= 0) {
                    TypedValue.applyDimension(1, 80.0f, context4.getResources().getDisplayMetrics());
                }
                if (l4e.b == null) {
                    synchronized (l4e.a) {
                        try {
                            if (l4e.b == null) {
                                l4e.b = new l4e();
                            }
                        } finally {
                        }
                    }
                }
                return l4e.b;
            case 26:
                return new ale(v4Var.d(d64.class), v4Var.d(ad.class), v4Var.d(eqb.class), v4Var.d(pk.class), v4Var.d(cn7.class), v4Var.d(kr1.class));
            case 27:
                return new ike((Context) v4Var.c(Context.class), new r61(v4Var.d(el3.class)), (ztc) ((jle) ((hle) v4Var.c(hle.class))).d.getValue(), (f5a) v4Var.c(f5a.class), (f6a) v4Var.c(f6a.class), (c34) v4Var.c(c34.class), (m7b) v4Var.c(m7b.class), (o45) v4Var.c(o45.class));
            case 28:
                return new t7();
            default:
                return new lpb(v4Var.d(tke.class), v4Var.d(ty3.class));
        }
    }
}
