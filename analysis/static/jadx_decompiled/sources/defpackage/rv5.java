package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class rv5 extends ppd {
    public final /* synthetic */ int X = 0;
    public final Object Y;
    public final Object Z;
    public final f66 s0;

    public rv5(ExecutorService executorService, v02 v02Var, ox2 ox2Var) {
        super(executorService);
        this.Y = executorService;
        this.Z = v02Var;
        this.s0 = ox2Var;
    }

    @Override // defpackage.hdc
    public void s(dec decVar, int i, List list) {
        switch (this.X) {
            case 1:
                hqd hqdVar = (hqd) decVar;
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next() instanceof in8) {
                            hqdVar.B((ol7) this.o.f.get(i), x53.p0(list));
                            break;
                        }
                    }
                }
                r(hqdVar, i);
                break;
            default:
                super.s(decVar, i, list);
                break;
        }
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        switch (this.X) {
            case 0:
                if (i == uvb.oneme_folder_widget_section_view_type) {
                    return new x51(viewGroup.getContext(), (ExecutorService) ((Executor) this.Y), (v02) ((sv5) this.Z));
                }
                if (i == uvb.oneme_folder_widget_section_empty_view_type) {
                    return new x51(viewGroup.getContext(), (ox2) ((k56) this.s0));
                }
                throw new IllegalStateException(("Not supported viewType " + i + " for " + rv5.class.getName()).toString());
            default:
                if (i != mda.D) {
                    return new vt3(viewGroup.getContext(), (om8) ((m56) this.Z));
                }
                return new vt3(viewGroup.getContext(), (xxc) this.Y, (pt8) ((m56) this.s0));
        }
    }

    public rv5(ExecutorService executorService, xxc xxcVar, om8 om8Var, pt8 pt8Var) {
        super(executorService);
        this.Y = xxcVar;
        this.Z = om8Var;
        this.s0 = pt8Var;
    }
}
