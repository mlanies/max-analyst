package defpackage;

import android.os.Bundle;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes.dex */
public final class n92 implements b64 {
    public final je7 a;
    public final je7 b;
    public final p92 c = p92.b;

    public n92(je7 je7Var, je7 je7Var2) {
        this.a = je7Var2;
        this.b = je7Var;
    }

    @Override // defpackage.b64
    public final i64 a() {
        return this.c;
    }

    @Override // defpackage.b64
    public final l64 b(String str, e64 e64Var, Bundle bundle) {
        m92 m92Var;
        if (!this.c.a.contains(e64Var)) {
            return null;
        }
        if (e64Var.equals(p92.c)) {
            kpa kpaVar = new kpa("id", Long.valueOf(i24.D("id", bundle)));
            oz7 oz7Var = o92.b;
            String strF = i24.F("type", bundle);
            oz7Var.getClass();
            m92Var = new m92(dy7.g(kpaVar, new kpa("type", oz7.j(strF)), new kpa("load_mark", i24.v("load_mark", bundle)), new kpa("message_id", i24.v("message_id", bundle)), new kpa("highlights", bundle.containsKey("highlights") ? w9e.Q0(i24.F("highlights", bundle), new String[]{","}, true, 4) : null), new kpa("highlight_message", i24.u("highlight_message", bundle)), new kpa("from_forward", i24.u("from_forward", bundle)), new kpa("forward_msg_ids", i24.w("forward_msg_ids", bundle)), new kpa("forward_attach_id", i24.v("forward_attach_id", bundle)), new kpa("is_forward_attach", i24.u("is_forward_attach", bundle)), new kpa(ApiProtocol.PARAM_PAYLOAD, bundle.getString(ApiProtocol.PARAM_PAYLOAD))), 0);
        } else {
            if (!e64Var.equals(p92.d)) {
                throw new IllegalStateException(au1.f("invalid route ", e64Var));
            }
            e52 e52Var = (e52) ((zrc) this.a.getValue()).a.getValue();
            if (e52Var == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", e52Var.a);
            bundle2.putParcelable("type", o92.c);
            m92Var = new m92(bundle2, 1);
        }
        return new l64(str, e64Var, bundle, 0, ((se5) ((qe5) this.b.getValue())).u() ? new j64(new m52(4), new m52(5)) : new j64(), m92Var, 8);
    }
}
