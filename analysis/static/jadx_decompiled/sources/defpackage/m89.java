package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import one.me.messages.list.loader.MessageModel;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final class m89 {
    public final RecyclerView a;
    public final v69 b;
    public final wwc c;
    public final m29 d;
    public final g39 e;
    public final String f = m89.class.getName();

    public m89(EndlessRecyclerView2 endlessRecyclerView2, v69 v69Var, wwc wwcVar, m29 m29Var, g39 g39Var) {
        this.a = endlessRecyclerView2;
        this.b = v69Var;
        this.c = wwcVar;
        this.d = m29Var;
        this.e = g39Var;
    }

    public final boolean a(long j) {
        MessageModel messageModelL;
        LinearLayoutManager linearLayoutManagerT = z7.t(this.a);
        if (linearLayoutManagerT == null) {
            throw new IllegalStateException("Only linear layout is supported".toString());
        }
        int iT0 = linearLayoutManagerT.T0();
        m29 m29Var = this.d;
        MessageModel messageModelL2 = m29Var.L(iT0);
        return messageModelL2 != null && (messageModelL = m29Var.L(linearLayoutManagerT.X0())) != null && messageModelL2.c <= j && j <= messageModelL.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00aa, code lost:
    
        if ((r11 != null ? r11.f : -1) > 0) goto L110;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m89.b():boolean");
    }
}
