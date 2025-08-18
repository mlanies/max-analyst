package com.google.android.exoplayer2.source.dash;

import androidx.work.WorkRequest;
import defpackage.buc;
import defpackage.ey1;
import defpackage.mq9;
import defpackage.p24;
import defpackage.vj8;
import defpackage.y7g;

/* loaded from: classes.dex */
public final class DashMediaSource$Factory implements vj8 {
    public final ey1 a;
    public final p24 b;
    public final y7g c = new y7g(14);
    public final buc e = new buc();
    public final long f = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
    public final mq9 d = new mq9(9);

    public DashMediaSource$Factory(p24 p24Var) {
        this.a = new ey1(12, p24Var);
        this.b = p24Var;
    }
}
