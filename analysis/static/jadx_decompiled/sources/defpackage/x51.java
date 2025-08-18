package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class x51 extends hqd {
    public final /* synthetic */ int F0 = 2;
    public final Object G0;

    public x51(v51 v51Var) {
        super(v51Var);
        this.G0 = v51Var;
    }

    @Override // defpackage.hqd
    public final void A(ol7 ol7Var) {
        List list;
        switch (this.F0) {
            case 0:
                ((v51) this.G0).setLabel(((u51) ol7Var).b);
                break;
            case 1:
                View view = this.a;
                kv5 kv5Var = view instanceof kv5 ? (kv5) view : null;
                if (kv5Var != null) {
                    kv5Var.setIcon(woc.A0);
                    kv5Var.setTitle(new eqe(j0c.chats_list_empty_state_title));
                    kv5Var.x(kv5Var.getContext().getString(j0c.chats_list_empty_state_action), new c5(29, this));
                    break;
                }
                break;
            default:
                qv5 qv5Var = (qv5) ol7Var;
                View view2 = this.a;
                uv5 uv5Var = view2 instanceof uv5 ? (uv5) view2 : null;
                if (uv5Var != null) {
                    wv5 wv5Var = qv5Var instanceof wv5 ? (wv5) qv5Var : null;
                    if (wv5Var != null && (list = wv5Var.a) != null) {
                        uv5Var.setVisibility(list.isEmpty() ^ true ? 0 : 8);
                        uv5Var.V1.E(list);
                        uv5Var.setListener((sv5) this.G0);
                        break;
                    }
                }
                break;
        }
    }

    public x51(Context context, ExecutorService executorService, v02 v02Var) {
        super(new uv5(context, executorService));
        this.G0 = v02Var;
    }

    public x51(Context context, ox2 ox2Var) {
        kv5 kv5Var = new kv5(context, null);
        kv5Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        super(kv5Var);
        this.G0 = ox2Var;
    }
}
