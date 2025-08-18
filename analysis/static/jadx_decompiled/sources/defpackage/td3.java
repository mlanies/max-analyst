package defpackage;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.Collections;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class td3 extends brd {
    public final /* synthetic */ int b;

    public /* synthetic */ td3(int i) {
        this.b = i;
    }

    @Override // defpackage.brd
    public final Object b(v4 v4Var) {
        switch (this.b) {
            case 0:
                return new buc();
            case 1:
                return new huc();
            case 2:
                hle hleVar = (hle) sd3.g.getValue();
                hleVar.getClass();
                return new euc(((jle) hleVar).a());
            case 3:
                return new fuc((ztc) ((jle) ((hle) sd3.g.getValue())).h.getValue());
            case 4:
                return new p67(((w9a) ((kke) sd3.i.getValue())).b());
            case 5:
                return new o67(((w9a) ((kke) sd3.i.getValue())).b());
            case 6:
                khe kheVarD = v4Var.d(kke.class);
                khe kheVarD2 = v4Var.d(ds3.class);
                khe kheVarD3 = v4Var.d(u7b.class);
                khe kheVarD4 = v4Var.d(w7b.class);
                rta rtaVar = (rta) v4Var.c(rta.class);
                Context context = (Context) v4Var.c(Context.class);
                khe kheVarD5 = v4Var.d(oq3.class);
                khe kheVarD6 = v4Var.d(xc4.class);
                tm3 tm3Var = (tm3) v4Var.c(tm3.class);
                return new yn3(kheVarD, kheVarD2, kheVarD6, kheVarD3, kheVarD4, kheVarD5, v4Var.d(blb.class), v4Var.d(q33.class), rtaVar, context, tm3Var);
            case 7:
                return new l67(v4Var.d(q33.class), v4Var.d(an9.class), v4Var.d(ad.class));
            case 8:
                return new a64(v4Var.a(b64.class));
            case 9:
                return new f64(v4Var.d(a64.class), new khe(new ot2(v4Var, 2)), v4Var.d(h64.class), v4Var.d(x54.class));
            case 10:
                return new d06(v4Var.d(q33.class), v4Var.d(ds3.class), v4Var.d(kz.class), v4Var.d(iy2.class), v4Var.d(cb6.class));
            case 11:
                return new vy5(v4Var);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                h7b h7bVar = new h7b(29, false);
                h7bVar.c = "legacy";
                h7bVar.b = new n5b(1048576, 2097152, new SparseIntArray(), -1);
                return new m5b(new bg7(h7bVar));
            case 13:
                return ((m5b) v4Var.c(m5b.class)).a();
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                jv6 jv6Var = (jv6) v4Var.c(jv6.class);
                jv6Var.getClass();
                return new kv6(jv6Var);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                Context context2 = (Context) v4Var.c(Context.class);
                khe kheVarD7 = v4Var.d(kk5.class);
                tk4 tk4Var = new tk4(context2);
                tk4Var.a = "fresco";
                tk4Var.b = new x24(2, kheVarD7);
                tk4Var.c = 314572800L;
                tk4Var.d = 104857600L;
                tk4Var.e = 52428800L;
                uk4 uk4Var = new uk4(tk4Var);
                jv6 jv6Var2 = new jv6(context2);
                jv6Var2.f = new ble(v4Var.d(u2a.class));
                jv6Var2.g = (m5b) v4Var.c(m5b.class);
                jv6Var2.e = uk4Var;
                jv6Var2.i = uk4Var;
                qz7 qz7Var = new qz7(22, false);
                qz7Var.o(kp.c, d46.a, new c46(v4Var.d(m5b.class), v4Var.d(s2b.class)));
                qz7Var.o(fp3.c, cp7.a, new dp7((Context) v4Var.c(Context.class), ((w9a) ((kke) v4Var.c(kke.class))).c()));
                jv6Var2.j = new va8(qz7Var);
                jv6Var2.c = bp4.a;
                jv6Var2.a = new cke(0);
                jv6Var2.h = Collections.singleton(new vhc());
                khe kheVarD8 = v4Var.d(iba.class);
                final die dieVar = new die();
                dieVar.a = kheVarD8;
                final int i = 0;
                dieVar.b = new khe(new k56() { // from class: v36
                    @Override // defpackage.k56
                    public final Object invoke() {
                        die dieVar2 = dieVar;
                        switch (i) {
                            case 0:
                                return ((iba) ((je7) dieVar2.a).getValue()).c();
                            case 1:
                                return ((iba) ((je7) dieVar2.a).getValue()).a();
                            case 2:
                                return ((iba) ((je7) dieVar2.a).getValue()).a();
                            default:
                                int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
                                iba ibaVar = (iba) ((je7) dieVar2.a).getValue();
                                bc7[] bc7VarArr = iba.p;
                                return ibaVar.h(ibaVar.f(iAvailableProcessors, "frsc-sch", iAvailableProcessors, 5), "frsc-sch");
                        }
                    }
                });
                final int i2 = 1;
                dieVar.c = new khe(new k56() { // from class: v36
                    @Override // defpackage.k56
                    public final Object invoke() {
                        die dieVar2 = dieVar;
                        switch (i2) {
                            case 0:
                                return ((iba) ((je7) dieVar2.a).getValue()).c();
                            case 1:
                                return ((iba) ((je7) dieVar2.a).getValue()).a();
                            case 2:
                                return ((iba) ((je7) dieVar2.a).getValue()).a();
                            default:
                                int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
                                iba ibaVar = (iba) ((je7) dieVar2.a).getValue();
                                bc7[] bc7VarArr = iba.p;
                                return ibaVar.h(ibaVar.f(iAvailableProcessors, "frsc-sch", iAvailableProcessors, 5), "frsc-sch");
                        }
                    }
                });
                final int i3 = 2;
                dieVar.o = new khe(new k56() { // from class: v36
                    @Override // defpackage.k56
                    public final Object invoke() {
                        die dieVar2 = dieVar;
                        switch (i3) {
                            case 0:
                                return ((iba) ((je7) dieVar2.a).getValue()).c();
                            case 1:
                                return ((iba) ((je7) dieVar2.a).getValue()).a();
                            case 2:
                                return ((iba) ((je7) dieVar2.a).getValue()).a();
                            default:
                                int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
                                iba ibaVar = (iba) ((je7) dieVar2.a).getValue();
                                bc7[] bc7VarArr = iba.p;
                                return ibaVar.h(ibaVar.f(iAvailableProcessors, "frsc-sch", iAvailableProcessors, 5), "frsc-sch");
                        }
                    }
                });
                final int i4 = 3;
                new khe(new k56() { // from class: v36
                    @Override // defpackage.k56
                    public final Object invoke() {
                        die dieVar2 = dieVar;
                        switch (i4) {
                            case 0:
                                return ((iba) ((je7) dieVar2.a).getValue()).c();
                            case 1:
                                return ((iba) ((je7) dieVar2.a).getValue()).a();
                            case 2:
                                return ((iba) ((je7) dieVar2.a).getValue()).a();
                            default:
                                int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
                                iba ibaVar = (iba) ((je7) dieVar2.a).getValue();
                                bc7[] bc7VarArr = iba.p;
                                return ibaVar.h(ibaVar.f(iAvailableProcessors, "frsc-sch", iAvailableProcessors, 5), "frsc-sch");
                        }
                    }
                });
                jv6Var2.d = dieVar;
                return jv6Var2;
            case 16:
                v4Var.c(b46.class);
                return lv6.g();
            case LangUtils.HASH_SEED /* 17 */:
                return ((lv6) v4Var.c(lv6.class)).f();
            case 18:
                return ((lv6) v4Var.c(lv6.class)).i();
            case 19:
                return ((lv6) v4Var.c(lv6.class)).h();
            case 20:
                return new xe6((Context) v4Var.c(Context.class), v4Var.d(iba.class), v4Var.d(y7d.class));
            case 21:
                return new ay6();
            case 22:
                return new xp((Context) v4Var.c(Context.class));
            case 23:
                return new cy6((Context) v4Var.c(Context.class));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return by6.a;
            case 25:
                return new eca(v4Var.d(zi5.class), v4Var.d(iv6.class), v4Var.d(m5b.class), v4Var.d(nob.class), v4Var.d(io0.class), v4Var.d(kke.class));
            case 26:
                return new j07(v4Var);
            case 27:
                return new nob((Context) v4Var.c(Context.class), v4Var.d(lv6.class), v4Var.d(io0.class));
            case 28:
                return new k67(v4Var.d(y7d.class), v4Var.d(q33.class), v4Var.d(l67.class));
            default:
                return new af7();
        }
    }
}
