package defpackage;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class ly4 extends ppd {
    public final /* synthetic */ int X = 0;
    public m56 Y;
    public final Object Z;

    public ly4(rx2 rx2Var, ExecutorService executorService) {
        super(executorService);
        this.Z = rx2Var;
    }

    @Override // defpackage.ppd
    /* renamed from: H */
    public /* bridge */ /* synthetic */ void r(hqd hqdVar, int i) {
        switch (this.X) {
            case 2:
                J((us2) hqdVar, i);
                break;
            default:
                super.r(hqdVar, i);
                break;
        }
    }

    public void J(us2 us2Var, int i) {
        nl2 nl2Var = (nl2) this.o.f.get(i);
        f fVar = new f(1, (rx2) this.Z, rx2.class, "onChatItemClick", "onChatItemClick(J)V", 0, 14);
        vw vwVar = new vw(2, (rx2) this.Z, rx2.class, "onChatItemLongTap", "onChatItemLongTap(JLandroid/view/View;)V", 0, 8);
        us2Var.A(nl2Var);
        m62 m62Var = (m62) us2Var.a;
        tu0.K(m62Var, 300L, new tb(fVar, 16, nl2Var));
        m62Var.setOnLongClickListener(new z52(vwVar, nl2Var, us2Var, 4));
    }

    @Override // defpackage.ppd, defpackage.hdc
    public /* bridge */ /* synthetic */ void r(dec decVar, int i) {
        switch (this.X) {
            case 2:
                J((us2) decVar, i);
                break;
            default:
                super.r(decVar, i);
                break;
        }
    }

    @Override // defpackage.hdc
    public final void s(dec decVar, int i, List list) {
        switch (this.X) {
            case 0:
                ky4 ky4Var = (ky4) decVar;
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next() instanceof v3e) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : list) {
                                if (obj instanceof c02) {
                                    arrayList.add(obj);
                                }
                            }
                            c02 c02Var = (c02) x53.q0(arrayList);
                            if (c02Var != null) {
                                ky4Var.E(c02Var.a);
                                return;
                            } else {
                                r(ky4Var, i);
                                return;
                            }
                        }
                    }
                }
                r(ky4Var, i);
                return;
            case 1:
                h4e h4eVar = (h4e) decVar;
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (it2.next() instanceof v3e) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : list) {
                                if (obj2 instanceof v3e) {
                                    arrayList2.add(obj2);
                                }
                            }
                            v3e v3eVar = (v3e) x53.i0(arrayList2);
                            if (v3eVar == null) {
                                r(h4eVar, i);
                                return;
                            } else if (v3eVar instanceof t3e) {
                                h4eVar.F(((t3e) v3eVar).a);
                                return;
                            } else {
                                if (!(v3eVar instanceof u3e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h4eVar.E(((u3e) v3eVar).a);
                                return;
                            }
                        }
                    }
                }
                r(h4eVar, i);
                return;
            default:
                us2 us2Var = (us2) decVar;
                m56 m56Var = this.Y;
                iv ivVar = this.o;
                if (m56Var != null) {
                    m56Var.invoke(Long.valueOf(((nl2) ivVar.f.get(i)).a));
                }
                if (!(!list.isEmpty())) {
                    J(us2Var, i);
                    return;
                }
                ll2 ll2Var = new ll2(7);
                for (Object obj3 : list) {
                    ll2 ll2Var2 = obj3 instanceof ll2 ? (ll2) obj3 : null;
                    if (ll2Var2 != null) {
                        ll2Var.M1(ll2Var2);
                    }
                }
                us2Var.B((nl2) ivVar.f.get(i), ll2Var);
                return;
        }
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        switch (this.X) {
            case 0:
                return new ky4(viewGroup.getContext(), (ShapeDrawable) this.Z, (jy2) this.Y);
            case 1:
                return new h4e(viewGroup.getContext(), (ShapeDrawable) this.Z, (jy2) this.Y);
            default:
                return new us2(new m62(viewGroup.getContext()));
        }
    }

    public ly4(ExecutorService executorService, jy2 jy2Var, byte b) {
        super(executorService);
        this.Y = jy2Var;
        this.Z = new ShapeDrawable(new OvalShape());
    }

    public ly4(ExecutorService executorService, jy2 jy2Var) {
        super(executorService);
        this.Y = jy2Var;
        this.Z = new ShapeDrawable(new OvalShape());
    }
}
