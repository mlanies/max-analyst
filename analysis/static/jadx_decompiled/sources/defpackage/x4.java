package defpackage;

import android.app.Application;
import android.content.Context;
import one.me.calls.impl.service.CallServiceImpl;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class x4 extends brd {
    public final /* synthetic */ int b;

    public /* synthetic */ x4(int i) {
        this.b = i;
    }

    @Override // defpackage.brd
    public final Object b(v4 v4Var) {
        switch (this.b) {
            case 0:
                return new f5a(v4Var.d(m7b.class), v4Var.d(b5.class), (z4) v4Var.c(z4.class), v4Var.d(s8g.class));
            case 1:
                Context context = (Context) v4Var.c(Context.class);
                z4 z4Var = (z4) v4Var.c(z4.class);
                v4Var.d(o45.class);
                return new b5(context, z4Var);
            case 2:
                return new o80((Context) v4Var.c(Context.class), (z4) v4Var.c(z4.class), v4Var.d(b5.class), v4Var.d(f5a.class), v4Var.d(s8g.class));
            case 3:
                return new e5a(v4Var.d(ome.class), v4Var.d(q33.class), v4Var.d(y7d.class), v4Var.d(ri4.class));
            case 4:
                return new w7a(v4Var.d(ome.class), v4Var.d(q33.class), v4Var.d(f5a.class));
            case 5:
                return new b9a(v4Var.d(ome.class));
            case 6:
                return new qea(v4Var.d(ome.class));
            case 7:
                return new kda(v4Var.d(ome.class));
            case 8:
                return new k29((kke) v4Var.c(kke.class), (oe3) v4Var.c(oe3.class), v4Var.d(os0.class), v4Var.d(mqe.class), v4Var.d(fe7.class), (Context) v4Var.c(Context.class));
            case 9:
                return new fwa((Context) v4Var.c(Context.class), v4Var.d(ti4.class));
            case 10:
                return new uva(v4Var.d(q33.class), v4Var.d(ge2.class), v4Var.d(zi5.class), v4Var.d(ti4.class), v4Var.d(t00.class), (fwa) v4Var.c(fwa.class));
            case 11:
                return new xcf((Context) v4Var.c(Context.class), v4Var.d(ti4.class), v4Var.d(t00.class), (fwa) v4Var.c(fwa.class));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                khe kheVarD = v4Var.d(zi5.class);
                khe kheVarD2 = v4Var.d(rf5.class);
                khe kheVarD3 = v4Var.d(rke.class);
                Context context2 = (Context) v4Var.c(Context.class);
                khe kheVarD4 = v4Var.d(ak3.class);
                khe kheVarD5 = v4Var.d(z3b.class);
                khe kheVarD6 = v4Var.d(ikf.class);
                khe kheVarD7 = v4Var.d(dz.class);
                khe kheVarD8 = v4Var.d(i00.class);
                v4Var.d(rff.class);
                return new vz(kheVarD, kheVarD5, kheVarD2, kheVarD3, kheVarD4, kheVarD6, v4Var.d(w80.class), kheVarD7, kheVarD8, v4Var.d(nif.class), v4Var.d(dt8.class), v4Var.d(qe5.class), v4Var.d(uva.class), v4Var.d(xcf.class), context2);
            case 13:
                return new dt8(v4Var.d(fe7.class), v4Var.d(os0.class), v4Var.d(ida.class), v4Var.d(tpe.class), (Context) v4Var.c(Context.class));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                khe kheVarD9 = v4Var.d(ida.class);
                khe kheVarD10 = v4Var.d(zu8.class);
                khe kheVarD11 = v4Var.d(k29.class);
                khe kheVarD12 = v4Var.d(ds3.class);
                khe kheVarD13 = v4Var.d(ak3.class);
                khe kheVarD14 = v4Var.d(t6b.class);
                Context context3 = (Context) v4Var.c(Context.class);
                vz vzVar = (vz) v4Var.c(vz.class);
                dt8 dt8Var = (dt8) v4Var.c(dt8.class);
                khe kheVarD15 = v4Var.d(hp.class);
                khe kheVarD16 = v4Var.d(are.class);
                khe kheVarD17 = v4Var.d(q33.class);
                khe kheVarD18 = v4Var.d(kke.class);
                khe kheVarD19 = v4Var.d(Context.class);
                khe kheVarD20 = v4Var.d(zu8.class);
                v4Var.d(iy2.class);
                return new u9a(kheVarD9, kheVarD10, kheVarD11, kheVarD12, kheVarD13, kheVarD14, context3, vzVar, dt8Var, new kz(kheVarD15, kheVarD16, kheVarD17, kheVarD18, kheVarD19, kheVarD20, v4Var.d(ak3.class), v4Var.d(ida.class)), v4Var.d(xb9.class), v4Var.d(t00.class), v4Var.d(iy2.class), v4Var.d(pb6.class));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new jh0(v4Var.d(eua.class), v4Var.d(ds3.class), v4Var.d(xc4.class), v4Var.d(kke.class));
            case 16:
                return new ft1((jr1) v4Var.c(jr1.class), v4Var.d(q33.class), v4Var.d(w7a.class), v4Var.d(x6a.class));
            case LangUtils.HASH_SEED /* 17 */:
                p31 p31Var = new p31(v4Var.d(q33.class), v4Var.d(y7d.class), v4Var.d(ct1.class), 0);
                khe kheVarD21 = v4Var.d(Context.class);
                khe kheVarD22 = v4Var.d(xs1.class);
                khe kheVarD23 = v4Var.d(x6a.class);
                khe kheVarD24 = v4Var.d(q33.class);
                khe kheVarD25 = v4Var.d(y7d.class);
                m6b m6bVar = new m6b(4);
                khe kheVarD26 = v4Var.d(ri4.class);
                khe kheVarD27 = v4Var.d(x6a.class);
                khe kheVarD28 = v4Var.d(y7d.class);
                n01 n01Var = new n01();
                fc3 fc3Var = new fc3(4);
                fc3Var.X = p31Var;
                fc3Var.Z = p31Var;
                fc3Var.Y = p31Var;
                fc3Var.c = new m01(0, kheVarD26);
                ((x6a) kheVarD27.getValue()).getClass();
                qyc qycVar = (qyc) ((y7d) kheVarD28.getValue());
                qycVar.getClass();
                if (((int) qycVar.q(PmsKey.f27debugmode, 0)) == 3) {
                    fc3Var.o = n01Var;
                }
                m6bVar.w0 = fc3Var.g().a();
                return new s61(kheVarD21, kheVarD22, kheVarD23, new wc4(m6bVar), kheVarD24, kheVarD25, v4Var.d(qe5.class));
            case 18:
                a41 a41Var = new a41((ds1) v4Var.c(ds1.class), v4Var.d(os1.class), v4Var.d(so1.class));
                khe kheVarD29 = v4Var.d(Application.class);
                khe kheVarD30 = v4Var.d(hl1.class);
                khe kheVarD31 = v4Var.d(os1.class);
                khe kheVarD32 = v4Var.d(fw3.class);
                v4Var.d(r21.class);
                ds1 ds1Var = (ds1) v4Var.c(ds1.class);
                khe kheVarD33 = v4Var.d(jt4.class);
                khe kheVarD34 = v4Var.d(lkc.class);
                khe kheVarD35 = v4Var.d(z01.class);
                khe kheVarD36 = v4Var.d(vs1.class);
                khe kheVarD37 = v4Var.d(lvc.class);
                khe kheVarD38 = v4Var.d(oqa.class);
                khe kheVarD39 = v4Var.d(era.class);
                khe kheVarD40 = v4Var.d(qs1.class);
                khe kheVarD41 = v4Var.d(yl4.class);
                khe kheVarD42 = v4Var.d(b31.class);
                jr1 jr1Var = (jr1) v4Var.c(jr1.class);
                khe kheVarD43 = v4Var.d(cs1.class);
                khe kheVarD44 = v4Var.d(kke.class);
                khe kheVarD45 = v4Var.d(x6a.class);
                khe kheVarD46 = v4Var.d(ty3.class);
                v4Var.d(q33.class);
                return new wr1(kheVarD29, kheVarD30, kheVarD31, kheVarD32, kheVarD33, kheVarD35, kheVarD34, kheVarD41, kheVarD39, kheVarD42, kheVarD36, kheVarD38, kheVarD37, v4Var.d(xuc.class), kheVarD40, kheVarD43, kheVarD44, kheVarD45, kheVarD46, v4Var.d(hp.class), v4Var.d(y7d.class), v4Var.d(qe5.class), v4Var.d(bt1.class), v4Var.d(eua.class), v4Var.d(ez0.class), jr1Var, a41Var, ds1Var, v4Var.d(xb9.class), v4Var.d(el3.class));
            case 19:
                return new yz0(v4Var.d(fw3.class), v4Var.d(r21.class), v4Var.d(z01.class), v4Var.d(xuc.class), (jr1) v4Var.c(jr1.class), v4Var.d(tm3.class), (so1) v4Var.c(so1.class), v4Var.d(bt1.class));
            case 20:
                so1 so1Var = new so1(v4Var.d(kke.class), v4Var.d(ds3.class), v4Var.d(q33.class), v4Var.d(xb9.class), v4Var.d(blb.class));
                return new cra(v4Var.d(fw3.class), v4Var.d(xuc.class), (jr1) v4Var.c(jr1.class), so1Var, new ld1(v4Var.d(xuc.class)), v4Var.d(os1.class), v4Var.d(tm3.class));
            case 21:
                return new os1();
            case 22:
                return new fw3();
            case 23:
                return new jt4((jr1) v4Var.c(jr1.class));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new r21(v4Var.d(fw3.class));
            case 25:
                return new a11(v4Var.d(fw3.class), new uq1(v4Var.d(Context.class), v4Var.d(r21.class), new kpb(v4Var.d(jpb.class)), v4Var.d(x6a.class), v4Var.d(y7d.class)));
            case 26:
                return CallServiceImpl.s0;
            case 27:
                return new fra(v4Var.d(fw3.class), v4Var.d(oqa.class), v4Var.d(r21.class));
            case 28:
                return new yl4(v4Var.d(era.class), (jr1) v4Var.c(jr1.class));
            default:
                return new cs1(v4Var.d(av0.class), v4Var.d(kke.class));
        }
    }
}
