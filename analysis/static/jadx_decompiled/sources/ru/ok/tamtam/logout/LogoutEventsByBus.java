package ru.ok.tamtam.logout;

import androidx.annotation.Keep;
import defpackage.av0;
import defpackage.j1e;
import defpackage.j47;
import defpackage.kke;
import defpackage.kld;
import defpackage.lld;
import defpackage.nu7;
import defpackage.uae;
import defpackage.w9a;
import kotlin.Metadata;
import kotlinx.coroutines.internal.ContextScope;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ok/tamtam/logout/LogoutEventsByBus;", "Lru/ok/tamtam/logout/a;", "Lnu7;", "event", "Le5f;", "onEvent", "(Lnu7;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class LogoutEventsByBus implements a {
    public final av0 a;
    public final kld b = lld.b(0, 0, 0, 7);
    public final ContextScope c;

    public LogoutEventsByBus(av0 av0Var, kke kkeVar) {
        this.a = av0Var;
        this.c = j1e.a(((w9a) kkeVar).c());
        av0Var.d(this);
    }

    @Override // ru.ok.tamtam.logout.a
    public final void b() {
        this.a.c(new nu7());
    }

    @Keep
    @uae
    public final void onEvent(nu7 event) {
        j47.T(this.c, null, null, new b(this, event, null), 3);
    }
}
