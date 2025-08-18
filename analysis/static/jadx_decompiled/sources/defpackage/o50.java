package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import one.me.sdk.arch.Widget;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class o50 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o50(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }

    private final void f(View view) {
    }

    private final void g(View view) {
    }

    private final void h(View view) {
    }

    private final void i(View view) {
    }

    private final void j(View view) {
    }

    private final void k(View view) {
    }

    private final void l(View view) {
    }

    private final void m(View view) {
    }

    private final void n(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        yd4 yd4Var;
        Object obj = this.c;
        switch (this.a) {
            case 0:
                p50 p50Var = (p50) this.b;
                x77 x77Var = p50Var.T0;
                k50 k50Var = (k50) obj;
                if (x77Var == null || !x77Var.isActive()) {
                    p50Var.T0 = od2.L(new zn5(k50Var.k, new m50(p50Var, null), 5), lnf.b(view));
                }
                x77 x77Var2 = p50Var.S0;
                if (x77Var2 == null || !x77Var2.isActive()) {
                    p50Var.S0 = od2.L(new zn5(k50Var.l, new n50(p50Var, null), 5), lnf.b(view));
                    break;
                }
                break;
            case 1:
                td2 td2Var = (td2) this.b;
                x77 x77Var3 = td2Var.L0;
                if (x77Var3 == null || !x77Var3.isActive()) {
                    td2Var.L0 = od2.L(new zn5((j0e) obj, new sd2(td2Var, null), 5), lnf.b(view));
                    break;
                }
                break;
            case 2:
                gi5 gi5Var = (gi5) this.b;
                x77 x77Var4 = gi5Var.F0;
                if (x77Var4 == null || !x77Var4.isActive()) {
                    gi5Var.F0 = od2.L(new zn5(((zf5) obj).n, new fi5(gi5Var, null), 5), lnf.b(view));
                    break;
                }
                break;
            case 3:
                e eVar = (e) this.b;
                a aVar = eVar.c;
                eVar.k();
                ViewGroup viewGroup = (ViewGroup) aVar.U0.getParent();
                ((b16) obj).a.K();
                Object tag = viewGroup.getTag(pxb.special_effects_controller_view_tag);
                if (tag instanceof yd4) {
                    yd4Var = (yd4) tag;
                } else {
                    yd4Var = new yd4(viewGroup);
                    viewGroup.setTag(pxb.special_effects_controller_view_tag, yd4Var);
                }
                yd4Var.h();
                break;
            case 4:
                ((View) this.b).removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = zmf.a;
                mmf.c((View) obj);
                break;
            case 5:
                ((View) this.b).removeOnAttachStateChangeListener(this);
                tl8 tl8Var = (tl8) obj;
                tl8Var.setPadding(tl8Var.getPaddingLeft(), tl8Var.getPaddingTop(), tl8Var.getPaddingRight(), tu0.G((x6g.f(null, tl8Var.getRootWindowInsets()).a.f(2).d > 0 ? 2 : 8) * fk4.d().getDisplayMetrics().density));
                break;
            case 6:
                ((View) this.b).removeOnAttachStateChangeListener(this);
                ((uge) obj).requestApplyInsets();
                break;
            case 8:
                esd esdVar = (esd) this.b;
                x77 x77Var5 = esdVar.F0;
                if (x77Var5 == null || !x77Var5.isActive()) {
                    esdVar.F0 = od2.L(new zn5(((bsd) obj).d, new dsd(esdVar, null), 5), lnf.b(view));
                    break;
                }
                break;
            case 9:
                gsd gsdVar = (gsd) this.b;
                x77 x77Var6 = gsdVar.N0;
                if (x77Var6 == null || !x77Var6.isActive()) {
                    gsdVar.N0 = od2.L(new zn5(((bsd) obj).d, new fsd(gsdVar, null), 5), lnf.b(view));
                    break;
                }
                break;
            case 10:
                zwe zweVar = (zwe) this.b;
                if (zweVar != null) {
                    zweVar.B((RecyclerView) view);
                }
                this.b = z7.m((RecyclerView) obj);
                break;
            case 11:
                jd4 jd4Var = ql4.a;
                ContextScope contextScopeA = j1e.a(MainDispatcherLoader.dispatcher);
                this.b = contextScopeA;
                od2.L(new zn5(new zn5(new t03(sme.d0, 11), new ume(view, null)), new vme((wme) obj, view, null), 5), contextScopeA);
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                rg7 rg7VarB = lnf.b(view);
                dif difVar = (dif) this.b;
                vxd vxdVar = difVar.I0;
                wgf wgfVar = (wgf) obj;
                if (vxdVar == null || !vxdVar.isActive()) {
                    difVar.I0 = od2.L(new zn5(wgfVar.f, new bif(difVar, null), 5), rg7VarB);
                }
                rg7 rg7VarB2 = lnf.b(view);
                vxd vxdVar2 = difVar.H0;
                if (vxdVar2 == null || !vxdVar2.isActive()) {
                    difVar.H0 = od2.L(new zn5(wgfVar.d, new aif(difVar, null), 5), rg7VarB2);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                break;
            case 7:
                ((View) this.b).removeOnAttachStateChangeListener(this);
                gh7 gh7Var = ((loa) this.c).a;
                if (gh7Var == null) {
                    gh7Var = null;
                }
                gh7Var.d(eg7.ON_DESTROY);
                break;
            case 8:
            case 9:
                break;
            case 10:
                zwe zweVar = (zwe) this.b;
                if (zweVar != null) {
                    zweVar.B((RecyclerView) view);
                }
                this.b = null;
                break;
            case 11:
                try {
                    ContextScope contextScope = (ContextScope) this.b;
                    if (contextScope != null) {
                        j1e.i(contextScope, null);
                    }
                    this.b = null;
                    break;
                } catch (Throwable unused) {
                    return;
                }
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((View) this.b).removeOnAttachStateChangeListener(this);
                zef zefVar = (zef) this.c;
                amf amfVar = (amf) zefVar.Q();
                if (amfVar.b != null && amfVar.getChildCount() > 0) {
                    zefVar.u();
                    break;
                }
                break;
            case 13:
                ((View) this.b).removeOnAttachStateChangeListener(this);
                ohf ohfVar = (ohf) this.c;
                if (ohfVar.L0.a()) {
                    ohfVar.getBitmapPool().e(ohfVar.L0.getValue());
                    break;
                }
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                break;
            default:
                hm9.n(v3c.w((Widget) this.b), "lifecycle: postCreateView invoke onViewDetachedFromWindow");
                view.removeOnAttachStateChangeListener(this);
                ((i5g) this.c).a = true;
                break;
        }
    }

    public /* synthetic */ o50(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public o50(b16 b16Var, e eVar) {
        this.a = 3;
        this.c = b16Var;
        this.b = eVar;
    }
}
