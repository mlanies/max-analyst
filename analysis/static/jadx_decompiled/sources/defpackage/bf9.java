package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class bf9 extends ol implements lme {
    public final long X;
    public final List Y;
    public final String Z;
    public final long o;

    public bf9(long j, long j2, long j3, List list) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = list;
        this.Z = bf9.class.getName();
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) {
        Map map = ((cf9) gleVar).c;
        hm9.n(this.Z, zr6.h(map.keySet().size(), "reactions: onSuccess: reactionsCount = "));
        List list = this.Y;
        int iZ = mz7.Z(z53.S(list, 10));
        if (iZ < 16) {
            iZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iZ);
        for (Object obj : list) {
            linkedHashMap.put(obj, (fx8) map.get(Long.valueOf(((Number) obj).longValue())));
        }
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        ((lx8) plVar.I.getValue()).f(this.o, linkedHashMap);
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        hm9.r(this.Z, pkeVar.X, "reactions, onFail %s", pkeVar);
        l().c(new oi0(this.a, pkeVar));
    }

    @Override // defpackage.ol
    public final dle i() {
        List list = this.Y;
        if (!(!list.isEmpty())) {
            throw new IllegalArgumentException("messageIds is empty, MsgGetReactions requires at least one messageId".toString());
        }
        tq2 tq2Var = new tq2(sla.d1, 23);
        if (!(!list.isEmpty())) {
            throw new IllegalArgumentException("mesageIds can't be empty".toString());
        }
        tq2Var.i(this.X, ApiProtocol.PARAM_CHAT_ID);
        tq2Var.g("messageIds", list);
        return tq2Var;
    }
}
